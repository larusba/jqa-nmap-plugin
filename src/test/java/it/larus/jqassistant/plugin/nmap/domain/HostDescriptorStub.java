package it.larus.jqassistant.plugin.nmap.domain;

import java.util.List;

/**
 * Created by omar on 18/07/17.
 */
public class HostDescriptorStub implements HostDescriptor {

    String state;
    String address;
    String hostname;
    List<NetworkServiceDescriptor> services;
    List<NetworkPortDescriptor> ports;


    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getHostname() {
        return hostname;
    }

    @Override
    public List<NetworkPortDescriptor> getPorts() {
        return ports;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public void setPorts(List<NetworkPortDescriptor> ports) {
        this.ports = ports;
    }
}