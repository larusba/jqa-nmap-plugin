package it.larus.jqassistant.plugin.nmap.domain;

import java.util.List;

/**
 * Created by omar on 19/07/17.
 */
public class NetworkScriptTableDescriptorStub implements NetworkScriptTableDescriptor {

    String key;

    List<NetworkScriptElemDescriptor> elems;
    List<NetworkScriptTableDescriptor> tables;


    @Override
    public String getKey() {
        return key;
    }

    @Override
    public List<NetworkScriptElemDescriptor> getElems() {
        return elems;
    }

    @Override
    public List<NetworkScriptTableDescriptor> getTables() {
        return tables;
    }

    @Override
    public void setElems(List<NetworkScriptElemDescriptor> elems) {
        this.elems = elems;
    }

    @Override
    public void setTables(List<NetworkScriptTableDescriptor> tables) {
        this.tables = tables;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }
}
