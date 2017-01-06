//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.06 at 11:39:08 AM CET 
//


package nl.b3p.topnl.top10nl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PlaatsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaatsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0}_Top10nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeGebied" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="bebouwdeKom" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType"/>
 *         &lt;element name="isBAGwoonplaats" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType"/>
 *         &lt;element name="aantalinwoners" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="naamOfficieel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naamNL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naamFries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTVlakMultivlakOfPuntPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaatsType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0", propOrder = {
    "typeGebied",
    "bebouwdeKom",
    "isBAGwoonplaats",
    "aantalinwoners",
    "naamOfficieel",
    "naamNL",
    "naamFries",
    "geometrie"
})
public class PlaatsType
    extends Top10NlObjectType
{

    @XmlElement(required = true)
    protected CodeType typeGebied;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType bebouwdeKom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType isBAGwoonplaats;
    protected BigInteger aantalinwoners;
    protected String naamOfficieel;
    protected String naamNL;
    protected String naamFries;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the typeGebied property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeGebied() {
        return typeGebied;
    }

    /**
     * Sets the value of the typeGebied property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeGebied(CodeType value) {
        this.typeGebied = value;
    }

    /**
     * Gets the value of the bebouwdeKom property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getBebouwdeKom() {
        return bebouwdeKom;
    }

    /**
     * Sets the value of the bebouwdeKom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setBebouwdeKom(BRTJaNeeWaardeType value) {
        this.bebouwdeKom = value;
    }

    /**
     * Gets the value of the isBAGwoonplaats property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getIsBAGwoonplaats() {
        return isBAGwoonplaats;
    }

    /**
     * Sets the value of the isBAGwoonplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setIsBAGwoonplaats(BRTJaNeeWaardeType value) {
        this.isBAGwoonplaats = value;
    }

    /**
     * Gets the value of the aantalinwoners property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAantalinwoners() {
        return aantalinwoners;
    }

    /**
     * Sets the value of the aantalinwoners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAantalinwoners(BigInteger value) {
        this.aantalinwoners = value;
    }

    /**
     * Gets the value of the naamOfficieel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamOfficieel() {
        return naamOfficieel;
    }

    /**
     * Sets the value of the naamOfficieel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamOfficieel(String value) {
        this.naamOfficieel = value;
    }

    /**
     * Gets the value of the naamNL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamNL() {
        return naamNL;
    }

    /**
     * Sets the value of the naamNL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamNL(String value) {
        this.naamNL = value;
    }

    /**
     * Gets the value of the naamFries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamFries() {
        return naamFries;
    }

    /**
     * Sets the value of the naamFries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamFries(String value) {
        this.naamFries = value;
    }

    /**
     * Gets the value of the geometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getGeometrie() {
        return geometrie;
    }

    /**
     * Sets the value of the geometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setGeometrie(Element value) {
        this.geometrie = value;
    }

}
