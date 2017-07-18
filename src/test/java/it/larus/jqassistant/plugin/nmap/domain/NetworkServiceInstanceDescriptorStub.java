package it.larus.jqassistant.plugin.nmap.domain;

/**
 * Created by omar on 18/07/17.
 */
public class NetworkServiceInstanceDescriptorStub implements NetworkServiceInstanceDescriptor {
//    private List<NetworkPortDescriptor> ports;
    private String name;

//    @Override
//    public List<NetworkPortDescriptor> getPorts() {
//        return ports;
//    }

    @Override
    public String getName() {
        return name;
    }

//    @Override
//    public void setPorts(List<NetworkPortDescriptor> ports) {
//        this.ports = ports;
//    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
