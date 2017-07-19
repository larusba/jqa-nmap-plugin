package it.larus.jqassistant.plugin.nmap;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.buschmais.jqassistant.core.scanner.api.Scope;
import com.buschmais.jqassistant.core.store.api.Store;
import com.buschmais.jqassistant.plugin.common.api.scanner.AbstractScannerPlugin;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import it.larus.jqassistant.plugin.nmap.domain.FileNetworkDescriptor;
import it.larus.jqassistant.plugin.nmap.scanner.XmlNetwork2GraphImpl;
import it.larus.jqassistant.plugin.nmap.xml.Nmaprun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;

/**
 * Scan the XML output file of nmap command
 */
public class NMapFileScannerPlugin extends AbstractScannerPlugin<FileResource, FileNetworkDescriptor> {

    private static final Logger LOGGER = LoggerFactory.getLogger(NMapFileScannerPlugin.class);

    @Override
    public boolean accepts(FileResource fileResource, String s, Scope scope) throws IOException {
        if(s.toLowerCase().endsWith(".xml")){
            try (InputStream stream = fileResource.createStream()) {
                unmarshalStream(stream);

                return true;
            }catch (JAXBException e) {
                /*
                String verbose = System.getProperty("nmap.verbose", "false");
                if(Boolean.parseBoolean(verbose)){
                    LOGGER.warn(s+" is not a nmap output file",e);
                }else {
                }
                */
                LOGGER.debug(s+" is not a nmap output file");
                return false;
            }

        }
        return false;
    }

    private Nmaprun unmarshalStream(InputStream stream) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance( "it.larus.jqassistant.plugin.nmap.xml" );
        Unmarshaller u = jc.createUnmarshaller();
        Nmaprun nmap = (Nmaprun) u.unmarshal(stream);
        return nmap;
    }

    @Override
    public FileNetworkDescriptor scan(FileResource item, String path, Scope scope, Scanner scanner) throws IOException {
        final ScannerContext context = scanner.getContext();
        final Store store = context.getStore();
        FileNetworkDescriptor networkDescriptor;

        try (InputStream stream = item.createStream()) {
            Nmaprun nmap = unmarshalStream(stream);

            networkDescriptor = new XmlNetwork2GraphImpl(store).createGraph(nmap);
        }catch (JAXBException e) {
            LOGGER.error("Error during unmarshalling: "+e.getMessage(),e);
            throw new IOException(e);
        }


        return networkDescriptor;
    }
}
