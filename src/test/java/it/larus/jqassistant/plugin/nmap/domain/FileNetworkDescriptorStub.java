package it.larus.jqassistant.plugin.nmap.domain;

import com.buschmais.jqassistant.plugin.xml.api.model.XmlElementDescriptor;

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

    @Override
    public XmlElementDescriptor getRootElement() {
        return null;
    }

    @Override
    public void setRootElement(XmlElementDescriptor xmlElementDescriptor) {
    }

    @Override
    public String getXmlVersion() {
        return null;
    }

    @Override
    public void setXmlVersion(String s) {
    }

    @Override
    public String getCharacterEncodingScheme() {
        return null;
    }

    @Override
    public void setCharacterEncodingScheme(String s) {
    }

    @Override
    public boolean isStandalone() {
        return false;
    }

    @Override
    public void setStandalone(boolean b) {
    }

    @Override
    public boolean isXmlWellFormed() {
        return false;
    }

    @Override
    public void setXmlWellFormed(boolean b) {
    }
}
