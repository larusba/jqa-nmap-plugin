//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.07.17 alle 10:47:34 AM CEST 
//


package it.larus.jqassistant.plugin.nmap.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "finished",
    "hosts"
})
@XmlRootElement(name = "runstats")
public class Runstats {

    @XmlElement(required = true)
    protected Finished finished;
    @XmlElement(required = true)
    protected Hosts hosts;

    /**
     * Recupera il valore della proprietà finished.
     * 
     * @return
     *     possible object is
     *     {@link Finished }
     *     
     */
    public Finished getFinished() {
        return finished;
    }

    /**
     * Imposta il valore della proprietà finished.
     * 
     * @param value
     *     allowed object is
     *     {@link Finished }
     *     
     */
    public void setFinished(Finished value) {
        this.finished = value;
    }

    /**
     * Recupera il valore della proprietà hosts.
     * 
     * @return
     *     possible object is
     *     {@link Hosts }
     *     
     */
    public Hosts getHosts() {
        return hosts;
    }

    /**
     * Imposta il valore della proprietà hosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Hosts }
     *     
     */
    public void setHosts(Hosts value) {
        this.hosts = value;
    }

}
