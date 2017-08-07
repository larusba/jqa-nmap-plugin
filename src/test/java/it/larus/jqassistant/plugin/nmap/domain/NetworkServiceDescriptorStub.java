package it.larus.jqassistant.plugin.nmap.domain;

import java.util.List;

/**
 * Created by omar on 18/07/17.
 */
public class NetworkServiceDescriptorStub extends DescriptorStub implements NetworkServiceDescriptor {

    List<NetworkServiceInstanceDescriptor> serviceInstances;
    String name;

    @Override
    public List<NetworkServiceInstanceDescriptor> getInstances() {
        return serviceInstances;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
