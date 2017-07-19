package it.larus.jqassistant.plugin.nmap.domain;

/**
 * Created by omar on 18/07/17.
 */
public class NetworkServiceInstanceDescriptorStub implements NetworkServiceInstanceDescriptor {
    private String name;
    private String product;
    private String version;
    private String deviceType;
    private String extraInfo;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String getDeviceType() {
        return deviceType;
    }

    @Override
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String getExtraInfo() {
        return extraInfo;
    }

    @Override
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
