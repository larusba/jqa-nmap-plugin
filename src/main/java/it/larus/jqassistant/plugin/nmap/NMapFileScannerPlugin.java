/*
 * Copyright (c) 2017 Larus Business Automation
 *
 * This file is part of "JQAssistant Nmap plugin".
 *
 * "JQAssistant Nmap plugin" is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 *
 * "JQAssistant Nmap plugin" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.larus.jqassistant.plugin.nmap;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.buschmais.jqassistant.core.scanner.api.ScannerPlugin.Requires;
import com.buschmais.jqassistant.core.scanner.api.Scope;
import com.buschmais.jqassistant.core.store.api.Store;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import com.buschmais.jqassistant.plugin.xml.api.scanner.AbstractXmlFileScannerPlugin;
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
@Requires({FileDescriptor.class})
public class NMapFileScannerPlugin extends AbstractXmlFileScannerPlugin<FileNetworkDescriptor> {

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
    public FileNetworkDescriptor scan(FileResource fileResource, FileNetworkDescriptor fileNetworkDescriptor, String s, Scope scope, Scanner scanner) throws IOException {
        final ScannerContext context = scanner.getContext();
        final Store store = context.getStore();

        try (InputStream stream = fileResource.createStream()) {
            Nmaprun nmap = unmarshalStream(stream);
            return new XmlNetwork2GraphImpl(store).createGraph(nmap, fileNetworkDescriptor);
        }catch (JAXBException e) {
            LOGGER.error("Error during unmarshalling: "+e.getMessage(),e);
            throw new IOException(e);
        }

    }
}
