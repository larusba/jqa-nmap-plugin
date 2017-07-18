package it.larus.jqassistant.plugin.nmap.scanner;

import com.buschmais.jqassistant.core.store.api.Store;
import it.larus.jqassistant.plugin.nmap.api.XmlNetwork2Graph;
import it.larus.jqassistant.plugin.nmap.domain.FileNetworkDescriptor;
import it.larus.jqassistant.plugin.nmap.domain.HostDescriptor;
import it.larus.jqassistant.plugin.nmap.domain.NetworkPortDescriptor;
import it.larus.jqassistant.plugin.nmap.domain.NetworkServiceInstanceDescriptor;
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
    public FileNetworkDescriptor createGraph(Nmaprun nmap) {
        FileNetworkDescriptor networkDescriptor = store.create(FileNetworkDescriptor.class);
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

        if(nmapPort.getService() != null){
            NetworkServiceInstanceDescriptor serviceDescriptor = store.create(NetworkServiceInstanceDescriptor.class);
            serviceDescriptor.setName(nmapPort.getService().getName());
            portDescriptor.setServiceInstance(serviceDescriptor);
        }

    }
}
