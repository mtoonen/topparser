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
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ReliefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReliefType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0}_Top10nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeRelief" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="hoogteklasse" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="hoogteniveau" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="functie" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="lijnGeometrie" type="{http://www.opengis.net/gml/3.2}CurvePropertyType" minOccurs="0"/>
 *         &lt;element name="taludGeometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTHogeEnLageZijdePropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReliefType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0", propOrder = {
    "typeRelief",
    "hoogteklasse",
    "hoogteniveau",
    "functie",
    "lijnGeometrie",
    "taludGeometrie"
})
public class ReliefType
    extends Top10NlObjectType
{

    @XmlElement(required = true)
    protected CodeType typeRelief;
    @XmlElement(required = true)
    protected CodeType hoogteklasse;
    @XmlElement(required = true)
    protected BigInteger hoogteniveau;
    protected CodeType functie;
    @XmlAnyElement
    protected Element lijnGeometrie;
    @XmlAnyElement
    protected Element taludGeometrie;

    /**
     * Gets the value of the typeRelief property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeRelief() {
        return typeRelief;
    }

    /**
     * Sets the value of the typeRelief property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeRelief(CodeType value) {
        this.typeRelief = value;
    }

    /**
     * Gets the value of the hoogteklasse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getHoogteklasse() {
        return hoogteklasse;
    }

    /**
     * Sets the value of the hoogteklasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setHoogteklasse(CodeType value) {
        this.hoogteklasse = value;
    }

    /**
     * Gets the value of the hoogteniveau property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHoogteniveau() {
        return hoogteniveau;
    }

    /**
     * Sets the value of the hoogteniveau property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHoogteniveau(BigInteger value) {
        this.hoogteniveau = value;
    }

    /**
     * Gets the value of the functie property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFunctie() {
        return functie;
    }

    /**
     * Sets the value of the functie property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFunctie(CodeType value) {
        this.functie = value;
    }

    /**
     * Gets the value of the lijnGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getLijnGeometrie() {
        return lijnGeometrie;
    }

    /**
     * Sets the value of the lijnGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setLijnGeometrie(Element value) {
        this.lijnGeometrie = value;
    }

    /**
     * Gets the value of the taludGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getTaludGeometrie() {
        return taludGeometrie;
    }

    /**
     * Sets the value of the taludGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setTaludGeometrie(Element value) {
        this.taludGeometrie = value;
    }

}
