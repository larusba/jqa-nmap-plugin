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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "scaninfo")
public class Scaninfo {

    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "scanflags")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scanflags;
    @XmlAttribute(name = "protocol", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String protocol;
    @XmlAttribute(name = "numservices", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String numservices;
    @XmlAttribute(name = "services", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String services;

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà scanflags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanflags() {
        return scanflags;
    }

    /**
     * Imposta il valore della proprietà scanflags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanflags(String value) {
        this.scanflags = value;
    }

    /**
     * Recupera il valore della proprietà protocol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Imposta il valore della proprietà protocol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Recupera il valore della proprietà numservices.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumservices() {
        return numservices;
    }

    /**
     * Imposta il valore della proprietà numservices.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumservices(String value) {
        this.numservices = value;
    }

    /**
     * Recupera il valore della proprietà services.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Imposta il valore della proprietà services.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

}
