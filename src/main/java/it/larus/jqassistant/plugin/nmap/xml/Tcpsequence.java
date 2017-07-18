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
@XmlRootElement(name = "tcpsequence")
public class Tcpsequence {

    @XmlAttribute(name = "index", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String index;
    @XmlAttribute(name = "difficulty", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String difficulty;
    @XmlAttribute(name = "values", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String values;

    /**
     * Recupera il valore della proprietà index.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Imposta il valore della proprietà index.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Recupera il valore della proprietà difficulty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * Imposta il valore della proprietà difficulty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficulty(String value) {
        this.difficulty = value;
    }

    /**
     * Recupera il valore della proprietà values.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValues() {
        return values;
    }

    /**
     * Imposta il valore della proprietà values.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValues(String value) {
        this.values = value;
    }

}
