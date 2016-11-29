//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.29 at 10:46:59 AM CET 
//


package nl.b3p.topnl.top250nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for HoogteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoogteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top250nl/1.2.0}_Top250nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeHoogte" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="hoogte" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="referentievlak" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTLijnOfPuntPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoogteType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top250nl/1.2.0", propOrder = {
    "typeHoogte",
    "hoogte",
    "referentievlak",
    "geometrie"
})
public class HoogteType
    extends Top250NlObjectType
{

    @XmlElement(required = true)
    protected CodeType typeHoogte;
    protected Double hoogte;
    protected CodeType referentievlak;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the typeHoogte property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeHoogte() {
        return typeHoogte;
    }

    /**
     * Sets the value of the typeHoogte property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeHoogte(CodeType value) {
        this.typeHoogte = value;
    }

    /**
     * Gets the value of the hoogte property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoogte() {
        return hoogte;
    }

    /**
     * Sets the value of the hoogte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoogte(Double value) {
        this.hoogte = value;
    }

    /**
     * Gets the value of the referentievlak property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReferentievlak() {
        return referentievlak;
    }

    /**
     * Sets the value of the referentievlak property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReferentievlak(CodeType value) {
        this.referentievlak = value;
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
