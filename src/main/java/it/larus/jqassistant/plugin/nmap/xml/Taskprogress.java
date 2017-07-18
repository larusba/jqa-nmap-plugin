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
@XmlRootElement(name = "taskprogress")
public class Taskprogress {

    @XmlAttribute(name = "task", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String task;
    @XmlAttribute(name = "time", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String time;
    @XmlAttribute(name = "percent", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String percent;
    @XmlAttribute(name = "remaining", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String remaining;
    @XmlAttribute(name = "etc", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String etc;

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
     * Recupera il valore della proprietà percent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Imposta il valore della proprietà percent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Recupera il valore della proprietà remaining.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemaining() {
        return remaining;
    }

    /**
     * Imposta il valore della proprietà remaining.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemaining(String value) {
        this.remaining = value;
    }

    /**
     * Recupera il valore della proprietà etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtc() {
        return etc;
    }

    /**
     * Imposta il valore della proprietà etc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtc(String value) {
        this.etc = value;
    }

}
