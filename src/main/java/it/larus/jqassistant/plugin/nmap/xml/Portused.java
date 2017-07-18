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
@XmlRootElement(name = "portused")
public class Portused {

    @XmlAttribute(name = "state", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String state;
    @XmlAttribute(name = "proto", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String proto;
    @XmlAttribute(name = "portid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String portid;

    /**
     * Recupera il valore della proprietà state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Imposta il valore della proprietà state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Recupera il valore della proprietà proto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProto() {
        return proto;
    }

    /**
     * Imposta il valore della proprietà proto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProto(String value) {
        this.proto = value;
    }

    /**
     * Recupera il valore della proprietà portid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortid() {
        return portid;
    }

    /**
     * Imposta il valore della proprietà portid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortid(String value) {
        this.portid = value;
    }

}
