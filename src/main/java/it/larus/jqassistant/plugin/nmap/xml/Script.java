//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.07.17 alle 10:47:34 AM CEST 
//


package it.larus.jqassistant.plugin.nmap.xml;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * MODIFIED
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableOrElem"
})
@XmlRootElement(name = "script")
public class Script {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "output", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String output;

    @XmlElements({
            @XmlElement(name = "table", type = Table.class),
            @XmlElement(name = "elem", type = Elem.class)
    })
    protected List<Object> tableOrElem;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà output.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutput() {
        return output;
    }

    /**
     * Imposta il valore della proprietà output.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutput(String value) {
        this.output = value;
    }

    /**
     * Gets the value of the tableOrElem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableOrElem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableOrElem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Table }
     * {@link Elem }
     *
     *
     */
    public List<Object> getTableOrElem() {
        if (tableOrElem == null) {
            tableOrElem = new ArrayList<Object>();
        }
        return this.tableOrElem;
    }
}
