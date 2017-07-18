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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cpe"
})
@XmlRootElement(name = "service")
public class Service {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "conf", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conf;
    @XmlAttribute(name = "method", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String method;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "product")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String product;
    @XmlAttribute(name = "extrainfo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String extrainfo;
    @XmlAttribute(name = "tunnel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tunnel;
    @XmlAttribute(name = "proto")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String proto;
    @XmlAttribute(name = "rpcnum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rpcnum;
    @XmlAttribute(name = "lowver")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lowver;
    @XmlAttribute(name = "highver")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String highver;
    @XmlAttribute(name = "hostname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hostname;
    @XmlAttribute(name = "ostype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ostype;
    @XmlAttribute(name = "devicetype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String devicetype;
    @XmlAttribute(name = "servicefp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String servicefp;
    protected List<Cpe> cpe;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà conf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConf() {
        return conf;
    }

    /**
     * Imposta il valore della proprietà conf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConf(String value) {
        this.conf = value;
    }

    /**
     * Recupera il valore della proprietà method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Imposta il valore della proprietà method.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
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
     * Recupera il valore della proprietà product.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Imposta il valore della proprietà product.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
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

    /**
     * Recupera il valore della proprietà tunnel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnel() {
        return tunnel;
    }

    /**
     * Imposta il valore della proprietà tunnel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnel(String value) {
        this.tunnel = value;
    }

    /**
     * Recupera il valore della proprietà proto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProto() {
        return proto;
    }

    /**
     * Imposta il valore della proprietà proto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProto(String value) {
        this.proto = value;
    }

    /**
     * Recupera il valore della proprietà rpcnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpcnum() {
        return rpcnum;
    }

    /**
     * Imposta il valore della proprietà rpcnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpcnum(String value) {
        this.rpcnum = value;
    }

    /**
     * Recupera il valore della proprietà lowver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowver() {
        return lowver;
    }

    /**
     * Imposta il valore della proprietà lowver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowver(String value) {
        this.lowver = value;
    }

    /**
     * Recupera il valore della proprietà highver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighver() {
        return highver;
    }

    /**
     * Imposta il valore della proprietà highver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighver(String value) {
        this.highver = value;
    }

    /**
     * Recupera il valore della proprietà hostname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Imposta il valore della proprietà hostname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Recupera il valore della proprietà ostype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOstype() {
        return ostype;
    }

    /**
     * Imposta il valore della proprietà ostype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOstype(String value) {
        this.ostype = value;
    }

    /**
     * Recupera il valore della proprietà devicetype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicetype() {
        return devicetype;
    }

    /**
     * Imposta il valore della proprietà devicetype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicetype(String value) {
        this.devicetype = value;
    }

    /**
     * Recupera il valore della proprietà servicefp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicefp() {
        return servicefp;
    }

    /**
     * Imposta il valore della proprietà servicefp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicefp(String value) {
        this.servicefp = value;
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
