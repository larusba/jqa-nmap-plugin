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
    "extraports",
    "port"
})
@XmlRootElement(name = "ports")
public class Ports {

    protected List<Extraports> extraports;
    protected List<Port> port;

    /**
     * Gets the value of the extraports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extraports }
     * 
     * 
     */
    public List<Extraports> getExtraports() {
        if (extraports == null) {
            extraports = new ArrayList<Extraports>();
        }
        return this.extraports;
    }

    /**
     * Gets the value of the port property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the port property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Port }
     * 
     * 
     */
    public List<Port> getPort() {
        if (port == null) {
            port = new ArrayList<Port>();
        }
        return this.port;
    }

}
