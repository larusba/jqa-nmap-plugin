package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;

/**
 * A service on a network
 * CURRENTLY NOT IN USE
 */
@Label("NetworkService")
public interface NetworkServiceDescriptor extends Descriptor{

    @Relation("HAS_INSTANCE")
    List<NetworkServiceInstanceDescriptor> getInstances();

    String getName();

    void setName(String name);
}
