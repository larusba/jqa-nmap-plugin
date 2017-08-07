package it.larus.jqassistant.plugin.nmap.domain;

import java.util.List;

/**
 * Created by omar on 18/07/17.
 */
public class NetworkDescriptorStub extends DescriptorStub implements NetworkDescriptor{

    private String networkName;
    private List<HostDescriptor> hosts;

    @Override
    public String getNetworkName() {
        return networkName;
    }

    @Override
    public void setNetworkName(String name) {
        this.networkName = name;
    }

    @Override
    public List<HostDescriptor> getHosts() {
        return hosts;
    }

    @Override
    public void setHosts(List<HostDescriptor> hosts) {
        this.hosts = hosts;
    }

}
