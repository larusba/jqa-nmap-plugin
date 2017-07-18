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
@XmlRootElement(name = "finished")
public class Finished {

    @XmlAttribute(name = "time", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String time;
    @XmlAttribute(name = "timestr")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String timestr;
    @XmlAttribute(name = "elapsed", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String elapsed;
    @XmlAttribute(name = "summary")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String summary;
    @XmlAttribute(name = "exit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String exit;
    @XmlAttribute(name = "errormsg")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String errormsg;

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
     * Recupera il valore della proprietà timestr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestr() {
        return timestr;
    }

    /**
     * Imposta il valore della proprietà timestr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestr(String value) {
        this.timestr = value;
    }

    /**
     * Recupera il valore della proprietà elapsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElapsed() {
        return elapsed;
    }

    /**
     * Imposta il valore della proprietà elapsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElapsed(String value) {
        this.elapsed = value;
    }

    /**
     * Recupera il valore della proprietà summary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Imposta il valore della proprietà summary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Recupera il valore della proprietà exit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExit() {
        return exit;
    }

    /**
     * Imposta il valore della proprietà exit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExit(String value) {
        this.exit = value;
    }

    /**
     * Recupera il valore della proprietà errormsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
     * Imposta il valore della proprietà errormsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrormsg(String value) {
        this.errormsg = value;
    }

}
