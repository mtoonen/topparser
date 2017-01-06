//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.06 at 11:39:08 AM CET 
//


package nl.b3p.topnl.top10nl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for GebouwType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GebouwType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0}_Top10nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeGebouw" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded"/>
 *         &lt;element name="fysiekVoorkomen" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="hoogteklasse" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="hoogteniveau" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="hoogte" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="soortnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gebruiksdoel" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTVlakOfPuntPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GebouwType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0", propOrder = {
    "typeGebouw",
    "fysiekVoorkomen",
    "hoogteklasse",
    "hoogteniveau",
    "hoogte",
    "status",
    "soortnaam",
    "naam",
    "gebruiksdoel",
    "geometrie"
})
public class GebouwType
    extends Top10NlObjectType
{

    @XmlElement(required = true)
    protected List<CodeType> typeGebouw;
    protected CodeType fysiekVoorkomen;
    @XmlElement(required = true)
    protected CodeType hoogteklasse;
    @XmlElement(required = true)
    protected BigInteger hoogteniveau;
    protected Double hoogte;
    @XmlElement(required = true)
    protected CodeType status;
    protected String soortnaam;
    protected List<String> naam;
    protected List<CodeType> gebruiksdoel;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the typeGebouw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeGebouw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeGebouw().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTypeGebouw() {
        if (typeGebouw == null) {
            typeGebouw = new ArrayList<CodeType>();
        }
        return this.typeGebouw;
    }

    /**
     * Gets the value of the fysiekVoorkomen property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFysiekVoorkomen() {
        return fysiekVoorkomen;
    }

    /**
     * Sets the value of the fysiekVoorkomen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFysiekVoorkomen(CodeType value) {
        this.fysiekVoorkomen = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatus(CodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the soortnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoortnaam() {
        return soortnaam;
    }

    /**
     * Sets the value of the soortnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoortnaam(String value) {
        this.soortnaam = value;
    }

    /**
     * Gets the value of the naam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNaam() {
        if (naam == null) {
            naam = new ArrayList<String>();
        }
        return this.naam;
    }

    /**
     * Gets the value of the gebruiksdoel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebruiksdoel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebruiksdoel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGebruiksdoel() {
        if (gebruiksdoel == null) {
            gebruiksdoel = new ArrayList<CodeType>();
        }
        return this.gebruiksdoel;
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
