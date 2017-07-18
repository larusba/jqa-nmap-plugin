package it.larus.jqassistant.plugin.nmap.scanner;

import it.larus.jqassistant.plugin.nmap.domain.FileNetworkDescriptor;
import it.larus.jqassistant.plugin.nmap.domain.HostDescriptor;
import it.larus.jqassistant.plugin.nmap.domain.NetworkPortDescriptor;
import it.larus.jqassistant.plugin.nmap.domain.NetworkServiceInstanceDescriptor;
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

}
