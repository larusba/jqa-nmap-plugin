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
@XmlRootElement(name = "taskbegin")
public class Taskbegin {

    @XmlAttribute(name = "task", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String task;
    @XmlAttribute(name = "time", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String time;
    @XmlAttribute(name = "extrainfo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String extrainfo;

    /**
     * Recupera il valore della proprietà task.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Imposta il valore della proprietà task.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

    /**
     * Recupera il valore della proprietà time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Imposta il valore della proprietà time.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Recupera il valore della proprietà extrainfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrainfo() {
        return extrainfo;
    }

    /**
     * Imposta il valore della proprietà extrainfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrainfo(String value) {
        this.extrainfo = value;
    }

}
