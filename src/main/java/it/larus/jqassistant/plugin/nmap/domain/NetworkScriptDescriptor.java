package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;

/**
 * Result of execution of a script
 */
@Label("NetworkScript")
public interface NetworkScriptDescriptor extends Descriptor {

    String getId();
    String getOutput();

    @Relation("HAS_ELEM")
    List<NetworkScriptElemDescriptor> getElems();

    @Relation("HAS_TABLE_ELEM")
    List<NetworkScriptTableDescriptor> getTables();

    void setElems(List<NetworkScriptElemDescriptor> elems);
    void setTables(List<NetworkScriptTableDescriptor> tables);
    void setId(String id);
    void setOutput(String output);
}
