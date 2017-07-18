package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;

/**
 * Defines the label which is shared by all nodes representing NMap output
 */
@Label("Network")
public interface NetworkDescriptor extends Descriptor {

    String getNetworkName();
    void setNetworkName(String name);

    @Relation("HAS_HOST")
    List<HostDescriptor> getHosts();

    void setHosts(List<HostDescriptor> hosts);
}
