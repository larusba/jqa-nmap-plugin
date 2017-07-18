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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scaninfo",
    "verbose",
    "debugging",
    "targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput",
    "runstats"
})
@XmlRootElement(name = "nmaprun")
public class Nmaprun {

    @XmlAttribute(name = "scanner", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scanner;
    @XmlAttribute(name = "args")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String args;
    @XmlAttribute(name = "start")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String start;
    @XmlAttribute(name = "startstr")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String startstr;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "profile_name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String profileName;
    @XmlAttribute(name = "xmloutputversion", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmloutputversion;
    protected List<Scaninfo> scaninfo;
    @XmlElement(required = true)
    protected Verbose verbose;
    @XmlElement(required = true)
    protected Debugging debugging;
    @XmlElements({
        @XmlElement(name = "target", type = Target.class),
        @XmlElement(name = "taskbegin", type = Taskbegin.class),
        @XmlElement(name = "taskprogress", type = Taskprogress.class),
        @XmlElement(name = "taskend", type = Taskend.class),
        @XmlElement(name = "prescript", type = Prescript.class),
        @XmlElement(name = "postscript", type = Postscript.class),
        @XmlElement(name = "host", type = Host.class),
        @XmlElement(name = "output", type = Output.class)
    })
    protected List<Object> targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput;
    @XmlElement(required = true)
    protected Runstats runstats;

    /**
     * Recupera il valore della proprietà scanner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanner() {
        return scanner;
    }

    /**
     * Imposta il valore della proprietà scanner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanner(String value) {
        this.scanner = value;
    }

    /**
     * Recupera il valore della proprietà args.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgs() {
        return args;
    }

    /**
     * Imposta il valore della proprietà args.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgs(String value) {
        this.args = value;
    }

    /**
     * Recupera il valore della proprietà start.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Imposta il valore della proprietà start.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Recupera il valore della proprietà startstr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartstr() {
        return startstr;
    }

    /**
     * Imposta il valore della proprietà startstr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartstr(String value) {
        this.startstr = value;
    }

    /**
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Recupera il valore della proprietà profileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Imposta il valore della proprietà profileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Recupera il valore della proprietà xmloutputversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmloutputversion() {
        return xmloutputversion;
    }

    /**
     * Imposta il valore della proprietà xmloutputversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmloutputversion(String value) {
        this.xmloutputversion = value;
    }

    /**
     * Gets the value of the scaninfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scaninfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScaninfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scaninfo }
     * 
     * 
     */
    public List<Scaninfo> getScaninfo() {
        if (scaninfo == null) {
            scaninfo = new ArrayList<Scaninfo>();
        }
        return this.scaninfo;
    }

    /**
     * Recupera il valore della proprietà verbose.
     * 
     * @return
     *     possible object is
     *     {@link Verbose }
     *     
     */
    public Verbose getVerbose() {
        return verbose;
    }

    /**
     * Imposta il valore della proprietà verbose.
     * 
     * @param value
     *     allowed object is
     *     {@link Verbose }
     *     
     */
    public void setVerbose(Verbose value) {
        this.verbose = value;
    }

    /**
     * Recupera il valore della proprietà debugging.
     * 
     * @return
     *     possible object is
     *     {@link Debugging }
     *     
     */
    public Debugging getDebugging() {
        return debugging;
    }

    /**
     * Imposta il valore della proprietà debugging.
     * 
     * @param value
     *     allowed object is
     *     {@link Debugging }
     *     
     */
    public void setDebugging(Debugging value) {
        this.debugging = value;
    }

    /**
     * Gets the value of the targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Target }
     * {@link Taskbegin }
     * {@link Taskprogress }
     * {@link Taskend }
     * {@link Prescript }
     * {@link Postscript }
     * {@link Host }
     * {@link Output }
     * 
     * 
     */
    public List<Object> getTargetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput() {
        if (targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput == null) {
            targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput = new ArrayList<Object>();
        }
        return this.targetOrTaskbeginOrTaskprogressOrTaskendOrPrescriptOrPostscriptOrHostOrOutput;
    }

    /**
     * Recupera il valore della proprietà runstats.
     * 
     * @return
     *     possible object is
     *     {@link Runstats }
     *     
     */
    public Runstats getRunstats() {
        return runstats;
    }

    /**
     * Imposta il valore della proprietà runstats.
     * 
     * @param value
     *     allowed object is
     *     {@link Runstats }
     *     
     */
    public void setRunstats(Runstats value) {
        this.runstats = value;
    }

}
