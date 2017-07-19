package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;

/**
 * A element of a script's result
 */
@Label("NetworkScriptElem")
public interface NetworkScriptElemDescriptor extends Descriptor {

    String getKey();
    String getValue();

    void setKey(String key);
    void setValue(String value);
}
