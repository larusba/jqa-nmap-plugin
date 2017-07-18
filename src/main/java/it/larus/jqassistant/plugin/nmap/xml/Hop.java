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
@XmlRootElement(name = "hop")
public class Hop {

    @XmlAttribute(name = "ttl", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ttl;
    @XmlAttribute(name = "rtt")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rtt;
    @XmlAttribute(name = "ipaddr")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ipaddr;
    @XmlAttribute(name = "host")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String host;

    /**
     * Recupera il valore della proprietà ttl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtl() {
        return ttl;
    }

    /**
     * Imposta il valore della proprietà ttl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtl(String value) {
        this.ttl = value;
    }

    /**
     * Recupera il valore della proprietà rtt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtt() {
        return rtt;
    }

    /**
     * Imposta il valore della proprietà rtt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtt(String value) {
        this.rtt = value;
    }

    /**
     * Recupera il valore della proprietà ipaddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpaddr() {
        return ipaddr;
    }

    /**
     * Imposta il valore della proprietà ipaddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpaddr(String value) {
        this.ipaddr = value;
    }

    /**
     * Recupera il valore della proprietà host.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Imposta il valore della proprietà host.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

}
