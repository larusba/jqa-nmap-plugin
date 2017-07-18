package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;

/**
 * An IP over the network
 */
@Label("Host")
public interface HostDescriptor extends Descriptor {

    String getState();
    String getAddress();
    String getHostname();

    @Relation("HAS_PORT")
    List<NetworkPortDescriptor> getPorts();


    void setState(String state);
    void setAddress(String address);
    void setHostname(String hostname);

    void setPorts(List<NetworkPortDescriptor> ports);
}
