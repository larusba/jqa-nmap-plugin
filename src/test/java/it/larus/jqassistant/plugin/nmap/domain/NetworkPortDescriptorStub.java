package it.larus.jqassistant.plugin.nmap.domain;

/**
 * Created by omar on 18/07/17.
 */
public class NetworkPortDescriptorStub implements NetworkPortDescriptor {
    long port;
    String state;
    String protocol;
    NetworkServiceInstanceDescriptor instanceService;

    @Override
    public long getPort() {
        return port;
    }

    @Override
    public void setPort(long port) {
        this.port = port;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getProtocol() {
        return protocol;
    }

    @Override
    public NetworkServiceInstanceDescriptor getServiceInstance() {
        return instanceService;
    }

    @Override
    public void setServiceInstance(NetworkServiceInstanceDescriptor instance) {
        this.instanceService = instance;
    }

    @Override
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
