package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;

/**
 * Container of element
 */
@Label("NetworkScriptTable")
public interface NetworkScriptTableDescriptor extends Descriptor {

    String getKey();
    @Relation("HAS_ELEM")
    List<NetworkScriptElemDescriptor> getElems();

    @Relation("HAS_TABLE_ELEM")
    List<NetworkScriptTableDescriptor> getTables();

    void setElems(List<NetworkScriptElemDescriptor> elems);
    void setTables(List<NetworkScriptTableDescriptor> tables);
    void setKey(String key);
}
