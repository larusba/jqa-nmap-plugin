//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.07.17 alle 10:47:34 AM CEST 
//


package it.larus.jqassistant.plugin.nmap.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "portused",
    "osmatch",
    "osfingerprint"
})
@XmlRootElement(name = "os")
public class Os {

    protected List<Portused> portused;
    protected List<Osmatch> osmatch;
    protected List<Osfingerprint> osfingerprint;

    /**
     * Gets the value of the portused property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portused property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortused().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Portused }
     * 
     * 
     */
    public List<Portused> getPortused() {
        if (portused == null) {
            portused = new ArrayList<Portused>();
        }
        return this.portused;
    }

    /**
     * Gets the value of the osmatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osmatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOsmatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Osmatch }
     * 
     * 
     */
    public List<Osmatch> getOsmatch() {
        if (osmatch == null) {
            osmatch = new ArrayList<Osmatch>();
        }
        return this.osmatch;
    }

    /**
     * Gets the value of the osfingerprint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osfingerprint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOsfingerprint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Osfingerprint }
     * 
     * 
     */
    public List<Osfingerprint> getOsfingerprint() {
        if (osfingerprint == null) {
            osfingerprint = new ArrayList<Osfingerprint>();
        }
        return this.osfingerprint;
    }

}
