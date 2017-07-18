package it.larus.jqassistant.plugin.nmap.api;

import com.buschmais.jqassistant.core.store.api.Store;
import it.larus.jqassistant.plugin.nmap.domain.FileNetworkDescriptor;
import it.larus.jqassistant.plugin.nmap.xml.Nmaprun;

/**
 * From JAXB tree to node of the graph
 */
public interface XmlNetwork2Graph {

    void setStore(Store store);

    /**
     * Transformation logic
     * @param nmap root element of the nmap output
     * @return
     */
    FileNetworkDescriptor createGraph(Nmaprun nmap);
}
