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
import com.buschmais.jqassistant.core.shared.xml.JAXBUnmarshaller;
import com.buschmais.jqassistant.core.store.api.Store;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import com.buschmais.jqassistant.plugin.xml.api.scanner.AbstractXmlFileScannerPlugin;
import com.buschmais.jqassistant.plugin.xml.api.scanner.XMLFileFilter;
import it.larus.jqassistant.plugin.nmap.domain.FileNetworkDescriptor;
import it.larus.jqassistant.plugin.nmap.scanner.XmlNetwork2GraphImpl;
import it.larus.jqassistant.plugin.nmap.xml.Nmaprun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Scan the XML output file of nmap command
 */
@Requires({FileDescriptor.class})
public class NMapFileScannerPlugin extends AbstractXmlFileScannerPlugin<FileNetworkDescriptor> {

    private static Logger LOGGER = LoggerFactory.getLogger(NMapFileScannerPlugin.class);

    private static XMLInputFactory factory;

    static {
        factory = XMLInputFactory.newInstance();
        factory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
    }

    private JAXBUnmarshaller<Nmaprun> jaxbUnmarshaller;

    @Override
    public void initialize() {
        jaxbUnmarshaller = new JAXBUnmarshaller<>(Nmaprun.class);
    }

    @Override
    public boolean accepts(FileResource fileResource, String path, Scope scope) throws IOException {
        return path.toLowerCase().endsWith(".xml") && rootElementMatches(fileResource, path, "nmaprun");
    }

    @Override
    public FileNetworkDescriptor scan(FileResource fileResource, FileNetworkDescriptor fileNetworkDescriptor, String s, Scope scope, Scanner scanner) throws IOException {
        final ScannerContext context = scanner.getContext();
        final Store store = context.getStore();
        try (InputStream stream = fileResource.createStream()) {
            return new XmlNetwork2GraphImpl(store).createGraph(jaxbUnmarshaller.unmarshal(stream), fileNetworkDescriptor);
        }
    }

    /**
     * Verifies if an XML document has the expected root element.
     * <p>
     * NOTE: This method is a copy of {@link XMLFileFilter#rootElementMatches(FileResource, String, String)} which currently does not handle correctly comments before root elements.
     *
     * @param fileResource        The {@link FileResource}
     * @param path                The path of the file.
     * @param expectedRootElement The name of the expected root element.
     * @return <code>true</code> if the XML documents has the expected root element.
     * @throws IOException If an unrecoverable problem occurs.
     */
    private static boolean rootElementMatches(FileResource fileResource, String path, String expectedRootElement) throws IOException {
        try (InputStream stream = fileResource.createStream()) {
            XMLStreamReader reader = factory.createXMLStreamReader(stream);
            while (reader.hasNext()) {
                int event = reader.next();
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        return expectedRootElement.equals(reader.getLocalName());
                }
            }
        } catch (XMLStreamException e) {
            LOGGER.warn("Cannot parse XML file '{}'.", path);
        }
        return false;
    }
}
