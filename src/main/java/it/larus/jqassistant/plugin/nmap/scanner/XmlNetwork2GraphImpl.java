/*
 * Copyright (c) 2017 Larus Business Automation
 *
 * This file is part of "JQAssistant Nmap plugin".
 *
 * "JQAssistant Nmap plugin" is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 *
 * "JQAssistant Nmap plugin" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.larus.jqassistant.plugin.nmap.scanner;

import com.buschmais.jqassistant.core.store.api.Store;
import it.larus.jqassistant.plugin.nmap.api.XmlNetwork2Graph;
import it.larus.jqassistant.plugin.nmap.domain.*;
import it.larus.jqassistant.plugin.nmap.xml.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation without checking existing nodes in the graph
 */
public class XmlNetwork2GraphImpl implements XmlNetwork2Graph {

    private Store store;

    public XmlNetwork2GraphImpl(Store store) {
        this.store = store;
    }

    @Override
    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public FileNetworkDescriptor createGraph(Nmaprun nmap, FileNetworkDescriptor networkDescriptor) {
        networkDescriptor.setNetworkName(nmap.getArgs());
        networkDescriptor.setHosts(buildHosts(nmap));
        return networkDescriptor;
    }

    /**
     * Extracts the Hosts from nmaprun element
     * @param nmap
     * @return
     */
    private List<HostDescriptor> buildHosts(Nmaprun nmap) {
        List<Object> nmapHosts = nmap.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        List<HostDescriptor> hosts = new ArrayList<>(nmapHosts.size());

        for (Object hostObj : nmapHosts){
            Host nmapHost = (Host) hostObj;
            hosts.add(buildHostDescriptor(nmapHost));
        }

        return hosts;
    }

    /**
     * Extracts the Host from host element
     * @param nmapHost
     * @return
     */
    private HostDescriptor buildHostDescriptor(Host nmapHost){
        HostDescriptor hostDescriptor = store.create(HostDescriptor.class);

        List<Object> list = nmapHost.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();
        for(Object o: list){
            if(o instanceof Status){
                Status state = (Status) o;
                hostDescriptor.setState(state.getState());
            }
            if(o instanceof Address){
                Address address = (Address)o;
                hostDescriptor.setAddress(address.getAddr());
            }
            if(o instanceof Hostnames){
                Hostnames hostnames = (Hostnames)o;
                //TODO manage the multiple hostnames
                if(hostnames.getHostname().size() > 0){
                    hostDescriptor.setHostname(hostnames.getHostname().get(0).getName());
                }

            }
            if(o instanceof Ports){
                Ports ps = (Ports) o;
                List<NetworkPortDescriptor> portsDesc = new ArrayList<>();
                hostDescriptor.setPorts(portsDesc);
                for (Port ports : ps.getPort()){
                    buildPortAndService(ports, hostDescriptor);
                }
            }
            if(o instanceof Hostscript){
                List<Script> scriptList = ((Hostscript) o).getScript();
                List<NetworkScriptDescriptor> scriptDescriptors = new ArrayList<>();
                for (Script script : scriptList){
                    scriptDescriptors.add(buildScript(script));
                }
                hostDescriptor.setScripts(scriptDescriptors);
            }
        }
        return hostDescriptor;
    }

    /**
     * Extracts port and service information from port element, putting them into hostDescription (in input)
     * @param nmapPort
     * @param hostDescriptor
     */
    private void buildPortAndService(Port nmapPort, HostDescriptor hostDescriptor){


        NetworkPortDescriptor portDescriptor = store.create(NetworkPortDescriptor.class);
        hostDescriptor.getPorts().add(portDescriptor);

        portDescriptor.setPort(Long.parseLong(nmapPort.getPortid()));

        if(nmapPort.getState() != null){
            portDescriptor.setState(nmapPort.getState().getState());
        }

        if(nmapPort.getProtocol() != null){
            portDescriptor.setProtocol(nmapPort.getProtocol());
        }

        Service service = nmapPort.getService();
        if(service != null){
            NetworkServiceInstanceDescriptor serviceDescriptor = store.create(NetworkServiceInstanceDescriptor.class);
            serviceDescriptor.setName(service.getName());
            serviceDescriptor.setProduct(service.getProduct());
            serviceDescriptor.setVersion(service.getVersion());
            serviceDescriptor.setDeviceType(service.getDevicetype());
            serviceDescriptor.setExtraInfo(service.getExtrainfo());

            portDescriptor.setServiceInstance(serviceDescriptor);
        }

        List<NetworkScriptDescriptor> scripts = new ArrayList<>();
        portDescriptor.setScripts(scripts);
        List<Script> nmapScripts = nmapPort.getScript();
        for (Script nmapScript : nmapScripts){
            portDescriptor.getScripts().add(buildScript(nmapScript));
        }
    }

    /**
     * Extract infomation from script element
     * @param nmapScript
     * @return
     */
    private NetworkScriptDescriptor buildScript(Script nmapScript) {
        NetworkScriptDescriptor script = store.create(NetworkScriptDescriptor.class);
        script.setId(nmapScript.getId());
        script.setOutput(nmapScript.getOutput());

        List<Object> nmapTableOrElem = nmapScript.getTableOrElem();

        List<NetworkScriptElemDescriptor> elems = new ArrayList<>();
        List<NetworkScriptTableDescriptor> tables = new ArrayList<>();

        fillTableElems(nmapTableOrElem, elems, tables);

        //put here so the framework correctly links the nodes
        script.setElems(elems);
        script.setTables(tables);

        return script;
    }

    /**
     * Recursive method for fill the table and elem lists
     * @param nmapTableOrElem
     * @param elems
     * @param tables
     */
    private void fillTableElems(List<Object> nmapTableOrElem, List<NetworkScriptElemDescriptor> elems, List<NetworkScriptTableDescriptor> tables) {
        for (Object toe : nmapTableOrElem){
            if( toe instanceof Table){
                Table nmapTable = (Table) toe;
                NetworkScriptTableDescriptor tableDescriptor = store.create(NetworkScriptTableDescriptor.class);
                tableDescriptor.setKey(nmapTable.getKey());
                tables.add(tableDescriptor);

                List<Object> internalTableOrElem = nmapTable.getTableOrElem();
                if(! internalTableOrElem.isEmpty()){
                    List<NetworkScriptElemDescriptor> internalElems = new ArrayList<>();
                    List<NetworkScriptTableDescriptor> internalTables = new ArrayList<>();
                    fillTableElems(internalTableOrElem, internalElems, internalTables);

                    tableDescriptor.setElems(internalElems);
                    tableDescriptor.setTables(internalTables);
                }
            }
            if( toe instanceof Elem){
                Elem nmapElem = (Elem) toe;

                NetworkScriptElemDescriptor elem = store.create(NetworkScriptElemDescriptor.class);
                elem.setKey(nmapElem.getKey());
                elem.setValue(nmapElem.getvalue());

                elems.add(elem);
            }
        }
    }
}
