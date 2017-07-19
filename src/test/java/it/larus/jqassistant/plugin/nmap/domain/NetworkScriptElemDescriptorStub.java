package it.larus.jqassistant.plugin.nmap.domain;

/**
 * Created by omar on 19/07/17.
 */
public class NetworkScriptElemDescriptorStub implements NetworkScriptElemDescriptor {

    String key;
    String value;

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
