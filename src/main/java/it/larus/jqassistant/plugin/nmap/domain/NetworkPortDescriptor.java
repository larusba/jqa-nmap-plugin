package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * A port on a host
 */
@Label("NetworkPort")
public interface NetworkPortDescriptor extends Descriptor {
    long getPort();
    String getState();
    String getProtocol();

    @Relation("ON_PORT")
    @Relation.Incoming
    NetworkServiceInstanceDescriptor getServiceInstance();

    void setServiceInstance(NetworkServiceInstanceDescriptor instance);
    void setPort(long port);
    void setState(String state);
    void setProtocol(String protocol);
}
