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
@XmlRootElement(name = "hosts")
public class Hosts {

    @XmlAttribute(name = "up")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String up;
    @XmlAttribute(name = "down")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String down;
    @XmlAttribute(name = "total", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String total;

    /**
     * Recupera il valore della proprietà up.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUp() {
        if (up == null) {
            return "0";
        } else {
            return up;
        }
    }

    /**
     * Imposta il valore della proprietà up.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUp(String value) {
        this.up = value;
    }

    /**
     * Recupera il valore della proprietà down.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDown() {
        if (down == null) {
            return "0";
        } else {
            return down;
        }
    }

    /**
     * Imposta il valore della proprietà down.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDown(String value) {
        this.down = value;
    }

    /**
     * Recupera il valore della proprietà total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Imposta il valore della proprietà total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

}
