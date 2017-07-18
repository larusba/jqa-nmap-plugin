package it.larus.jqassistant.plugin.nmap.domain;

/**
 * Created by omar on 18/07/17.
 */
public class FileNetworkDescriptorStub extends NetworkDescriptorStub implements FileNetworkDescriptor {

    String filename;

    @Override
    public String getFileName() {
        return filename;
    }

    @Override
    public void setFileName(String s) {
        filename = s;
    }
}
