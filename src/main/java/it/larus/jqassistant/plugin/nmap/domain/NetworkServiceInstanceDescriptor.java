package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;

/**
 * An instance of a service on an host
 */
@Label("NetworkServiceInstance")
public interface NetworkServiceInstanceDescriptor extends Descriptor{

    String getName();
    String getProduct();
    String getVersion();
    String getDeviceType();
    String getExtraInfo();

    void setName(String name);
    void setProduct(String product);
    void setVersion(String version);
    void setDeviceType(String deviceType);
    void setExtraInfo(String extraInfo);
}
