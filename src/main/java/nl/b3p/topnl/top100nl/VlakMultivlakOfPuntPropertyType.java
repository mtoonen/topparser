//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.02 at 04:14:28 PM CET 
//


package nl.b3p.topnl.top100nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VlakMultivlakOfPuntPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VlakMultivlakOfPuntPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0}VlakMultivlakOfPunt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VlakMultivlakOfPuntPropertyType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0", propOrder = {
    "vlakMultivlakOfPunt"
})
public class VlakMultivlakOfPuntPropertyType {

    @XmlElement(name = "VlakMultivlakOfPunt", required = true)
    protected VlakMultivlakOfPuntType vlakMultivlakOfPunt;

    /**
     * Gets the value of the vlakMultivlakOfPunt property.
     * 
     * @return
     *     possible object is
     *     {@link VlakMultivlakOfPuntType }
     *     
     */
    public VlakMultivlakOfPuntType getVlakMultivlakOfPunt() {
        return vlakMultivlakOfPunt;
    }

    /**
     * Sets the value of the vlakMultivlakOfPunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VlakMultivlakOfPuntType }
     *     
     */
    public void setVlakMultivlakOfPunt(VlakMultivlakOfPuntType value) {
        this.vlakMultivlakOfPunt = value;
    }

}
