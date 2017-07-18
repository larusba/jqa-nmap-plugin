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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cpe"
})
@XmlRootElement(name = "osclass")
public class Osclass {

    @XmlAttribute(name = "vendor", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vendor;
    @XmlAttribute(name = "osgen")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String osgen;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "accuracy", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accuracy;
    @XmlAttribute(name = "osfamily", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String osfamily;
    protected List<Cpe> cpe;

    /**
     * Recupera il valore della proprietà vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Imposta il valore della proprietà vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Recupera il valore della proprietà osgen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsgen() {
        return osgen;
    }

    /**
     * Imposta il valore della proprietà osgen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsgen(String value) {
        this.osgen = value;
    }

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
     * Recupera il valore della proprietà accuracy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracy() {
        return accuracy;
    }

    /**
     * Imposta il valore della proprietà accuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracy(String value) {
        this.accuracy = value;
    }

    /**
     * Recupera il valore della proprietà osfamily.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsfamily() {
        return osfamily;
    }

    /**
     * Imposta il valore della proprietà osfamily.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsfamily(String value) {
        this.osfamily = value;
    }

    /**
     * Gets the value of the cpe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cpe }
     * 
     * 
     */
    public List<Cpe> getCpe() {
        if (cpe == null) {
            cpe = new ArrayList<Cpe>();
        }
        return this.cpe;
    }

}
