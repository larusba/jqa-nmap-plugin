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
@XmlRootElement(name = "state")
public class State {

    @XmlAttribute(name = "state", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String state;
    @XmlAttribute(name = "reason", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reason;
    @XmlAttribute(name = "reason_ttl", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reasonTtl;
    @XmlAttribute(name = "reason_ip")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reasonIp;

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
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà reasonTtl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonTtl() {
        return reasonTtl;
    }

    /**
     * Imposta il valore della proprietà reasonTtl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonTtl(String value) {
        this.reasonTtl = value;
    }

    /**
     * Recupera il valore della proprietà reasonIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonIp() {
        return reasonIp;
    }

    /**
     * Imposta il valore della proprietà reasonIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonIp(String value) {
        this.reasonIp = value;
    }

}
