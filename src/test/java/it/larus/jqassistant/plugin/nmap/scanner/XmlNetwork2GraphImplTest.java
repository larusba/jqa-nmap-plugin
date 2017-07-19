package it.larus.jqassistant.plugin.nmap.scanner;

import it.larus.jqassistant.plugin.nmap.domain.*;
import it.larus.jqassistant.plugin.nmap.xml.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 */
public class XmlNetwork2GraphImplTest {

    private XmlNetwork2GraphImpl service;
    private StoreStub store;

    @Before
    public void setUp() throws Exception {
        this.store = new StoreStub();
        this.service = new XmlNetwork2GraphImpl(store);
    }

    @Test
    public void testCreateRoot(){
        Nmaprun nmaprun = new Nmaprun();
        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        assertNotNull(graph);
        assertTrue(store.instances.get(FileNetworkDescriptor.class).contains(graph));
    }

    @Test
    public void testCreateHosts(){
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();
        Address host1Address = new Address();
        host1Address.setAddr("192.168.1.1");
        Status host1Status = new Status();
        host1Status.setState("up");

        host1Content.add(host1Address);
        host1Content.add(host1Status);

        hostList.add(host1);

        Host host2 = new Host();
        List<Object> host2Content = host2.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();
        Address host2Address = new Address();
        host2Address.setAddr("192.168.1.2");
        Status host2Status = new Status();
        host2Status.setState("up");

        host2Content.add(host2Address);
        host2Content.add(host2Status);

        hostList.add(host2);

        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        assertNotNull(graph);
        assertNotNull(graph.getHosts());
        assertEquals(2, graph.getHosts().size());
        HostDescriptor host1Descriptor = graph.getHosts().get(0);
        assertEquals("192.168.1.1",host1Descriptor.getAddress());
        assertEquals("up",host1Descriptor.getState());

        HostDescriptor host2Descriptor = graph.getHosts().get(1);
        assertEquals("192.168.1.2",host2Descriptor.getAddress());
        assertEquals("up",host2Descriptor.getState());

        assertTrue(store.instances.get(FileNetworkDescriptor.class).contains(graph));
        assertTrue(store.instances.get(HostDescriptor.class).contains(host1Descriptor));
        assertTrue(store.instances.get(HostDescriptor.class).contains(host2Descriptor));
    }

    @Test
    public void testCreatePorts() {
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();

        Port port1 = new Port();
        port1.setPortid("22");
        port1.setProtocol("tcp");

        Port port2 = new Port();
        port2.setPortid("80");
        port2.setProtocol("http");

        Ports ports = new Ports();
        ports.getPort().add(port1);
        ports.getPort().add(port2);

        host1Content.add(ports);
        hostList.add(host1);

        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        assertNotNull(graph.getHosts().get(0).getPorts());
        assertEquals(2,graph.getHosts().get(0).getPorts().size());
        assertEquals(22,graph.getHosts().get(0).getPorts().get(0).getPort());
        assertEquals("tcp",graph.getHosts().get(0).getPorts().get(0).getProtocol());
        assertEquals(80,graph.getHosts().get(0).getPorts().get(1).getPort());
        assertEquals("http",graph.getHosts().get(0).getPorts().get(1).getProtocol());

        assertTrue(store.instances.get(NetworkPortDescriptor.class).contains(graph.getHosts().get(0).getPorts().get(0)));
        assertTrue(store.instances.get(NetworkPortDescriptor.class).contains(graph.getHosts().get(0).getPorts().get(1)));
    }

    @Test
    public void testCreateServices() {
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();

        Port port1 = new Port();
        port1.setPortid("22");
        port1.setProtocol("tcp");
        Service service1 = new Service();
        service1.setName("openssh");
        port1.setService(service1);

        Port port2 = new Port();
        port2.setPortid("80");
        port2.setProtocol("http");
        Service service2 = new Service();
        service2.setName("httpd");
        port2.setService(service2);

        Ports ports = new Ports();
        ports.getPort().add(port1);
        ports.getPort().add(port2);

        host1Content.add(ports);
        hostList.add(host1);

        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        HostDescriptor hostDescriptor = graph.getHosts().get(0);

        assertNotNull(hostDescriptor.getPorts().get(0).getServiceInstance());
        assertNotNull(hostDescriptor.getPorts().get(1).getServiceInstance());

        assertEquals("openssh", hostDescriptor.getPorts().get(0).getServiceInstance().getName());
        assertEquals("httpd", hostDescriptor.getPorts().get(1).getServiceInstance().getName());

        assertTrue(store.instances.get(NetworkServiceInstanceDescriptor.class).contains(hostDescriptor.getPorts().get(0).getServiceInstance()));
        assertTrue(store.instances.get(NetworkServiceInstanceDescriptor.class).contains(hostDescriptor.getPorts().get(1).getServiceInstance()));

        //assertEquals(hostDescriptor.getPorts().get(0), hostDescriptor.getPorts().get(0).getServiceInstance().getPorts().get(0));
        //assertEquals(hostDescriptor.getPorts().get(1), hostDescriptor.getPorts().get(1).getServiceInstance().getPorts().get(0));
    }

    @Test
    public void testCreateServicesWithData() {
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();

        Port port1 = new Port();
        port1.setPortid("5432");
        port1.setProtocol("tcp");
        Service service1 = new Service();
        service1.setName("postgresql");
        service1.setProduct("PostgreSQL DB");
        service1.setVersion("9.6.0 or later");
        service1.setDevicetype("broadband router");
        service1.setExtrainfo("workgroup: WORKGROUP");
        port1.setService(service1);

        Ports ports = new Ports();
        ports.getPort().add(port1);

        host1Content.add(ports);
        hostList.add(host1);

        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        HostDescriptor hostDescriptor = graph.getHosts().get(0);

        NetworkServiceInstanceDescriptor serviceInstance = hostDescriptor.getPorts().get(0).getServiceInstance();
        assertEquals("postgresql", serviceInstance.getName());
        assertEquals("PostgreSQL DB", serviceInstance.getProduct());
        assertEquals("9.6.0 or later", serviceInstance.getVersion());
        assertEquals("broadband router", serviceInstance.getDeviceType());
        assertEquals("workgroup: WORKGROUP", serviceInstance.getExtraInfo());

    }

    @Test
    public void testCreateScript() {
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();

        Port port1 = new Port();
        port1.setPortid("443");
        port1.setProtocol("tcp");

        Script script = new Script();
        script.setId("ssl-cert");
        script.setOutput("output");
        port1.getScript().add(script);

        Ports ports = new Ports();
        ports.getPort().add(port1);

        host1Content.add(ports);
        hostList.add(host1);

        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        HostDescriptor hostDescriptor = graph.getHosts().get(0);
        NetworkScriptDescriptor networkScriptDescriptor = hostDescriptor.getPorts().get(0).getScripts().get(0);
        assertNotNull(networkScriptDescriptor);
        assertEquals("ssl-cert", networkScriptDescriptor.getId());
        assertEquals("output", networkScriptDescriptor.getOutput());
        assertTrue(store.instances.get(NetworkScriptDescriptor.class).contains(networkScriptDescriptor));
    }

    @Test
    public void testCreateScriptElem() {
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();

        Port port1 = new Port();
        port1.setPortid("443");
        port1.setProtocol("tcp");

        Script script = new Script();
        script.setId("ssl-cert");
        Elem elem = new Elem();
        elem.setKey("sig_algo");
        elem.setvalue("sha256WithRSAEncryption");
        script.getTableOrElem().add(elem);
        port1.getScript().add(script);

        Ports ports = new Ports();
        ports.getPort().add(port1);

        host1Content.add(ports);
        hostList.add(host1);

        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        HostDescriptor hostDescriptor = graph.getHosts().get(0);
        NetworkScriptDescriptor networkScriptDescriptor = hostDescriptor.getPorts().get(0).getScripts().get(0);
        NetworkScriptElemDescriptor elemDescriptor = networkScriptDescriptor.getElems().get(0);
        assertNotNull(elemDescriptor);
        assertEquals("sig_algo", elemDescriptor.getKey());
        assertEquals("sha256WithRSAEncryption", elemDescriptor.getValue());

        assertTrue(store.instances.get(NetworkScriptElemDescriptor.class).contains(elemDescriptor));
    }

    @Test
    public void testCreateScriptTables() {
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();

        Port port1 = new Port();
        port1.setPortid("443");
        port1.setProtocol("tcp");

        Script script = new Script();
        script.setId("ssl-cert");
        Table table = new Table();
        table.setKey("extensions");

        Table internalTable = new Table();

        Elem elemName = new Elem();
        elemName.setKey("name");
        elemName.setvalue("X509v3 Subject Alternative Name");

        Elem elemValue = new Elem();
        elemValue.setKey("value");
        elemValue.setvalue("DNS:www.myfritz.box");

        Elem elemCritical = new Elem();
        elemCritical.setKey("critical");
        elemCritical.setvalue("true");

        internalTable.getTableOrElem().add(elemName);
        internalTable.getTableOrElem().add(elemValue);
        internalTable.getTableOrElem().add(elemCritical);
        table.getTableOrElem().add(internalTable);
        script.getTableOrElem().add(table);
        port1.getScript().add(script);

        Ports ports = new Ports();
        ports.getPort().add(port1);

        host1Content.add(ports);
        hostList.add(host1);

        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        HostDescriptor hostDescriptor = graph.getHosts().get(0);
        NetworkScriptDescriptor networkScriptDescriptor = hostDescriptor.getPorts().get(0).getScripts().get(0);
        NetworkScriptTableDescriptor tableDescriptor = networkScriptDescriptor.getTables().get(0);

        assertNotNull(tableDescriptor);
        assertEquals("extensions",tableDescriptor.getKey());
        assertNotNull(tableDescriptor.getTables());
        assertNotNull(tableDescriptor.getTables().get(0).getElems());
        assertEquals(3, tableDescriptor.getTables().get(0).getElems().size());

        assertEquals("name", tableDescriptor.getTables().get(0).getElems().get(0).getKey());
        assertEquals("X509v3 Subject Alternative Name", tableDescriptor.getTables().get(0).getElems().get(0).getValue());

        assertEquals("value", tableDescriptor.getTables().get(0).getElems().get(1).getKey());
        assertEquals("DNS:www.myfritz.box", tableDescriptor.getTables().get(0).getElems().get(1).getValue());

        assertEquals("critical", tableDescriptor.getTables().get(0).getElems().get(2).getKey());
        assertEquals("true", tableDescriptor.getTables().get(0).getElems().get(2).getValue());

        assertTrue(store.instances.get(NetworkScriptTableDescriptor.class).contains(tableDescriptor));
    }

    @Test
    public void testHostscript() throws Exception {
        Nmaprun nmaprun = new Nmaprun();
        List<Object> hostList = nmaprun.getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput();
        Host host1 = new Host();
        List<Object> host1Content = host1.getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes();

        Hostscript nmapHostscript = new Hostscript();

        Script script = new Script();
        script.setId("nbstat");
        Elem elem = new Elem();
        elem.setKey("server_name");
        elem.setvalue("FRITZ");
        script.getTableOrElem().add(elem);
        nmapHostscript.getScript().add(script);

        host1Content.add(nmapHostscript);
        hostList.add(host1);


        FileNetworkDescriptor graph = this.service.createGraph(nmaprun);
        HostDescriptor hostDescriptor = graph.getHosts().get(0);

        assertNotNull(hostDescriptor.getScripts());
        assertEquals("nbstat",hostDescriptor.getScripts().get(0).getId());
        assertEquals("server_name",hostDescriptor.getScripts().get(0).getElems().get(0).getKey());
        assertEquals("FRITZ",hostDescriptor.getScripts().get(0).getElems().get(0).getValue());

        assertTrue(store.instances.get(NetworkScriptDescriptor.class).contains(hostDescriptor.getScripts().get(0)));
    }
}
