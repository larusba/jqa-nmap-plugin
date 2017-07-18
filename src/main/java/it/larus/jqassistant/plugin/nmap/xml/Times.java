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
@XmlRootElement(name = "times")
public class Times {

    @XmlAttribute(name = "srtt", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String srtt;
    @XmlAttribute(name = "rttvar", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rttvar;
    @XmlAttribute(name = "to", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String to;

    /**
     * Recupera il valore della proprietà srtt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrtt() {
        return srtt;
    }

    /**
     * Imposta il valore della proprietà srtt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrtt(String value) {
        this.srtt = value;
    }

    /**
     * Recupera il valore della proprietà rttvar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRttvar() {
        return rttvar;
    }

    /**
     * Imposta il valore della proprietà rttvar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRttvar(String value) {
        this.rttvar = value;
    }

    /**
     * Recupera il valore della proprietà to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Imposta il valore della proprietà to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

}
