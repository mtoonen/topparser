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
 * <p>Java class for WegdeelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WegdeelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0}_Top10nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeInfrastructuur" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="typeWeg" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded"/>
 *         &lt;element name="hoofdverkeersgebruik" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded"/>
 *         &lt;element name="fysiekVoorkomen" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verhardingsbreedteklasse" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="gescheidenRijbaan" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType"/>
 *         &lt;element name="verhardingstype" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="aantalRijstroken" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="hoogteniveau" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="status" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isBAGnaam" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType" minOccurs="0"/>
 *         &lt;element name="aWegnummer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nWegnummer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eWegnummer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sWegnummer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="afritnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afritnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="knooppuntnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brugnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tunnelnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hartGeometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTLijnOfPuntPropertyType" minOccurs="0"/>
 *         &lt;element name="hoofdGeometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTVlakLijnOfPuntPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WegdeelType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0", propOrder = {
    "typeInfrastructuur",
    "typeWeg",
    "hoofdverkeersgebruik",
    "fysiekVoorkomen",
    "verhardingsbreedteklasse",
    "gescheidenRijbaan",
    "verhardingstype",
    "aantalRijstroken",
    "hoogteniveau",
    "status",
    "naam",
    "isBAGnaam",
    "aWegnummer",
    "nWegnummer",
    "eWegnummer",
    "sWegnummer",
    "afritnummer",
    "afritnaam",
    "knooppuntnaam",
    "brugnaam",
    "tunnelnaam",
    "hartGeometrie",
    "hoofdGeometrie"
})
public class WegdeelType
    extends Top10NlObjectType
{

    @XmlElement(required = true)
    protected CodeType typeInfrastructuur;
    @XmlElement(required = true)
    protected List<CodeType> typeWeg;
    @XmlElement(required = true)
    protected List<CodeType> hoofdverkeersgebruik;
    protected List<CodeType> fysiekVoorkomen;
    protected CodeType verhardingsbreedteklasse;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType gescheidenRijbaan;
    @XmlElement(required = true)
    protected CodeType verhardingstype;
    protected BigInteger aantalRijstroken;
    @XmlElement(required = true)
    protected BigInteger hoogteniveau;
    @XmlElement(required = true)
    protected CodeType status;
    protected List<String> naam;
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType isBAGnaam;
    protected List<String> aWegnummer;
    protected List<String> nWegnummer;
    protected List<String> eWegnummer;
    protected List<String> sWegnummer;
    protected String afritnummer;
    protected String afritnaam;
    protected String knooppuntnaam;
    protected String brugnaam;
    protected String tunnelnaam;
    @XmlAnyElement
    protected Element hartGeometrie;
    @XmlAnyElement
    protected Element hoofdGeometrie;

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
     * Gets the value of the typeWeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeWeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeWeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTypeWeg() {
        if (typeWeg == null) {
            typeWeg = new ArrayList<CodeType>();
        }
        return this.typeWeg;
    }

    /**
     * Gets the value of the hoofdverkeersgebruik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hoofdverkeersgebruik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoofdverkeersgebruik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getHoofdverkeersgebruik() {
        if (hoofdverkeersgebruik == null) {
            hoofdverkeersgebruik = new ArrayList<CodeType>();
        }
        return this.hoofdverkeersgebruik;
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
     * Gets the value of the verhardingsbreedteklasse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getVerhardingsbreedteklasse() {
        return verhardingsbreedteklasse;
    }

    /**
     * Sets the value of the verhardingsbreedteklasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setVerhardingsbreedteklasse(CodeType value) {
        this.verhardingsbreedteklasse = value;
    }

    /**
     * Gets the value of the gescheidenRijbaan property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getGescheidenRijbaan() {
        return gescheidenRijbaan;
    }

    /**
     * Sets the value of the gescheidenRijbaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setGescheidenRijbaan(BRTJaNeeWaardeType value) {
        this.gescheidenRijbaan = value;
    }

    /**
     * Gets the value of the verhardingstype property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getVerhardingstype() {
        return verhardingstype;
    }

    /**
     * Sets the value of the verhardingstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setVerhardingstype(CodeType value) {
        this.verhardingstype = value;
    }

    /**
     * Gets the value of the aantalRijstroken property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAantalRijstroken() {
        return aantalRijstroken;
    }

    /**
     * Sets the value of the aantalRijstroken property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAantalRijstroken(BigInteger value) {
        this.aantalRijstroken = value;
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
     * Gets the value of the isBAGnaam property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getIsBAGnaam() {
        return isBAGnaam;
    }

    /**
     * Sets the value of the isBAGnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setIsBAGnaam(BRTJaNeeWaardeType value) {
        this.isBAGnaam = value;
    }

    /**
     * Gets the value of the aWegnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aWegnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAWegnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAWegnummer() {
        if (aWegnummer == null) {
            aWegnummer = new ArrayList<String>();
        }
        return this.aWegnummer;
    }

    /**
     * Gets the value of the nWegnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nWegnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNWegnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNWegnummer() {
        if (nWegnummer == null) {
            nWegnummer = new ArrayList<String>();
        }
        return this.nWegnummer;
    }

    /**
     * Gets the value of the eWegnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eWegnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEWegnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEWegnummer() {
        if (eWegnummer == null) {
            eWegnummer = new ArrayList<String>();
        }
        return this.eWegnummer;
    }

    /**
     * Gets the value of the sWegnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sWegnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWegnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSWegnummer() {
        if (sWegnummer == null) {
            sWegnummer = new ArrayList<String>();
        }
        return this.sWegnummer;
    }

    /**
     * Gets the value of the afritnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfritnummer() {
        return afritnummer;
    }

    /**
     * Sets the value of the afritnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfritnummer(String value) {
        this.afritnummer = value;
    }

    /**
     * Gets the value of the afritnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfritnaam() {
        return afritnaam;
    }

    /**
     * Sets the value of the afritnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfritnaam(String value) {
        this.afritnaam = value;
    }

    /**
     * Gets the value of the knooppuntnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnooppuntnaam() {
        return knooppuntnaam;
    }

    /**
     * Sets the value of the knooppuntnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnooppuntnaam(String value) {
        this.knooppuntnaam = value;
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
     * Gets the value of the hartGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getHartGeometrie() {
        return hartGeometrie;
    }

    /**
     * Sets the value of the hartGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setHartGeometrie(Element value) {
        this.hartGeometrie = value;
    }

    /**
     * Gets the value of the hoofdGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getHoofdGeometrie() {
        return hoofdGeometrie;
    }

    /**
     * Sets the value of the hoofdGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setHoofdGeometrie(Element value) {
        this.hoofdGeometrie = value;
    }

}
