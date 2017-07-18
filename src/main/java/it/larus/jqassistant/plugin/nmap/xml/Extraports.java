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
    "extrareasons"
})
@XmlRootElement(name = "extraports")
public class Extraports {

    @XmlAttribute(name = "state", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String state;
    @XmlAttribute(name = "count", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String count;
    protected List<Extrareasons> extrareasons;

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
     * Recupera il valore della proprietà count.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Imposta il valore della proprietà count.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Gets the value of the extrareasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrareasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrareasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrareasons }
     * 
     * 
     */
    public List<Extrareasons> getExtrareasons() {
        if (extrareasons == null) {
            extrareasons = new ArrayList<Extrareasons>();
        }
        return this.extrareasons;
    }

}
