package it.larus.jqassistant.plugin.nmap.domain;

import java.util.List;

/**
 * Created by omar on 19/07/17.
 */
public class NetworkScriptDescriptorStub implements NetworkScriptDescriptor {

    String id;
    List<NetworkScriptElemDescriptor> elems;
    private List<NetworkScriptTableDescriptor> tables;
    String output;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getOutput() {
        return output;
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
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setOutput(String output) {
        this.output = output;
    }
}
