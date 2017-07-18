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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes"
})
@XmlRootElement(name = "host")
public class Host {

    @XmlAttribute(name = "starttime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String starttime;
    @XmlAttribute(name = "endtime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String endtime;
    @XmlAttribute(name = "comment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String comment;
    @XmlElements({
        @XmlElement(name = "status", type = Status.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "hostnames", type = Hostnames.class),
        @XmlElement(name = "smurf", type = Smurf.class),
        @XmlElement(name = "ports", type = Ports.class),
        @XmlElement(name = "os", type = Os.class),
        @XmlElement(name = "distance", type = Distance.class),
        @XmlElement(name = "uptime", type = Uptime.class),
        @XmlElement(name = "tcpsequence", type = Tcpsequence.class),
        @XmlElement(name = "ipidsequence", type = Ipidsequence.class),
        @XmlElement(name = "tcptssequence", type = Tcptssequence.class),
        @XmlElement(name = "hostscript", type = Hostscript.class),
        @XmlElement(name = "trace", type = Trace.class),
        @XmlElement(name = "times", type = Times.class)
    })
    protected List<Object> statusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes;

    /**
     * Recupera il valore della proprietà starttime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * Imposta il valore della proprietà starttime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarttime(String value) {
        this.starttime = value;
    }

    /**
     * Recupera il valore della proprietà endtime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * Imposta il valore della proprietà endtime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndtime(String value) {
        this.endtime = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the statusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Status }
     * {@link Address }
     * {@link Hostnames }
     * {@link Smurf }
     * {@link Ports }
     * {@link Os }
     * {@link Distance }
     * {@link Uptime }
     * {@link Tcpsequence }
     * {@link Ipidsequence }
     * {@link Tcptssequence }
     * {@link Hostscript }
     * {@link Trace }
     * {@link Times }
     * 
     * 
     */
    public List<Object> getStatusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes() {
        if (statusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes == null) {
            statusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes = new ArrayList<Object>();
        }
        return this.statusOrAddressOrHostnamesOrSmurfOrPortsOrOsOrDistanceOrUptimeOrTcpsequenceOrIpidsequenceOrTcptssequenceOrHostscriptOrTraceOrTimes;
    }

}
