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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SpoorbaandeelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpoorbaandeelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0}_Top10nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeInfrastructuur" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="typeSpoorbaan" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="fysiekVoorkomen" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spoorbreedte" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="aantalSporen" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="vervoerfunctie" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="elektrificatie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType"/>
 *         &lt;element name="hoogteniveau" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="status" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="brugnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tunnelnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baanvaknaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SpoorbaandeelType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0", propOrder = {
    "typeInfrastructuur",
    "typeSpoorbaan",
    "fysiekVoorkomen",
    "spoorbreedte",
    "aantalSporen",
    "vervoerfunctie",
    "elektrificatie",
    "hoogteniveau",
    "status",
    "brugnaam",
    "tunnelnaam",
    "baanvaknaam",
    "geometrie"
})
public class SpoorbaandeelType
    extends Top10NlObjectType
{

    @XmlElement(required = true)
    protected CodeType typeInfrastructuur;
    @XmlElement(required = true)
    protected CodeType typeSpoorbaan;
    protected List<CodeType> fysiekVoorkomen;
    @XmlElement(required = true)
    protected CodeType spoorbreedte;
    @XmlElement(required = true)
    protected CodeType aantalSporen;
    @XmlElement(required = true)
    protected CodeType vervoerfunctie;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType elektrificatie;
    @XmlElement(required = true)
    protected BigInteger hoogteniveau;
    @XmlElement(required = true)
    protected CodeType status;
    protected String brugnaam;
    protected String tunnelnaam;
    protected String baanvaknaam;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the typeInfrastructuur property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeInfrastructuur() {
        return typeInfrastructuur;
    }

    /**
     * Sets the value of the typeInfrastructuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeInfrastructuur(CodeType value) {
        this.typeInfrastructuur = value;
    }

    /**
     * Gets the value of the typeSpoorbaan property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeSpoorbaan() {
        return typeSpoorbaan;
    }

    /**
     * Sets the value of the typeSpoorbaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeSpoorbaan(CodeType value) {
        this.typeSpoorbaan = value;
    }

    /**
     * Gets the value of the fysiekVoorkomen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fysiekVoorkomen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFysiekVoorkomen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFysiekVoorkomen() {
        if (fysiekVoorkomen == null) {
            fysiekVoorkomen = new ArrayList<CodeType>();
        }
        return this.fysiekVoorkomen;
    }

    /**
     * Gets the value of the spoorbreedte property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSpoorbreedte() {
        return spoorbreedte;
    }

    /**
     * Sets the value of the spoorbreedte property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSpoorbreedte(CodeType value) {
        this.spoorbreedte = value;
    }

    /**
     * Gets the value of the aantalSporen property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAantalSporen() {
        return aantalSporen;
    }

    /**
     * Sets the value of the aantalSporen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAantalSporen(CodeType value) {
        this.aantalSporen = value;
    }

    /**
     * Gets the value of the vervoerfunctie property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getVervoerfunctie() {
        return vervoerfunctie;
    }

    /**
     * Sets the value of the vervoerfunctie property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setVervoerfunctie(CodeType value) {
        this.vervoerfunctie = value;
    }

    /**
     * Gets the value of the elektrificatie property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getElektrificatie() {
        return elektrificatie;
    }

    /**
     * Sets the value of the elektrificatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setElektrificatie(BRTJaNeeWaardeType value) {
        this.elektrificatie = value;
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
     * Gets the value of the brugnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrugnaam() {
        return brugnaam;
    }

    /**
     * Sets the value of the brugnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrugnaam(String value) {
        this.brugnaam = value;
    }

    /**
     * Gets the value of the tunnelnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelnaam() {
        return tunnelnaam;
    }

    /**
     * Sets the value of the tunnelnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelnaam(String value) {
        this.tunnelnaam = value;
    }

    /**
     * Gets the value of the baanvaknaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaanvaknaam() {
        return baanvaknaam;
    }

    /**
     * Sets the value of the baanvaknaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaanvaknaam(String value) {
        this.baanvaknaam = value;
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
