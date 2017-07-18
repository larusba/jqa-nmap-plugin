//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.07.17 alle 10:47:34 AM CEST 
//


package it.larus.jqassistant.plugin.nmap.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "uptime")
public class Uptime {

    @XmlAttribute(name = "seconds", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String seconds;
    @XmlAttribute(name = "lastboot")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lastboot;

    /**
     * Recupera il valore della proprietà seconds.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeconds() {
        return seconds;
    }

    /**
     * Imposta il valore della proprietà seconds.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeconds(String value) {
        this.seconds = value;
    }

    /**
     * Recupera il valore della proprietà lastboot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastboot() {
        return lastboot;
    }

    /**
     * Imposta il valore della proprietà lastboot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastboot(String value) {
        this.lastboot = value;
    }

}
