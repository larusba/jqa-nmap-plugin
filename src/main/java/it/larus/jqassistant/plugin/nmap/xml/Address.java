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
@XmlRootElement(name = "address")
public class Address {

    @XmlAttribute(name = "addr", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addr;
    @XmlAttribute(name = "addrtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addrtype;
    @XmlAttribute(name = "vendor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vendor;

    /**
     * Recupera il valore della proprietà addr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Imposta il valore della proprietà addr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * Recupera il valore della proprietà addrtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrtype() {
        if (addrtype == null) {
            return "ipv4";
        } else {
            return addrtype;
        }
    }

    /**
     * Imposta il valore della proprietà addrtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrtype(String value) {
        this.addrtype = value;
    }

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

}
