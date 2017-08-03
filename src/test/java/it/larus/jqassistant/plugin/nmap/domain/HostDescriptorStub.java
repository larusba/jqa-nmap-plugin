package it.larus.jqassistant.plugin.nmap.domain;

import java.util.List;

/**
 * Created by omar on 18/07/17.
 */
public class HostDescriptorStub extends DescriptorStub implements HostDescriptor {

    String state;
    String address;
    String hostname;
    List<NetworkServiceDescriptor> services;
    List<NetworkPortDescriptor> ports;
    List<NetworkScriptDescriptor> scripts;

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
    public List<NetworkScriptDescriptor> getScripts() {
        return scripts;
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

    @Override
    public void setScripts(List<NetworkScriptDescriptor> scripts) {
        this.scripts = scripts;
    }
}
