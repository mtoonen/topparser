//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.08 at 12:46:09 PM CET 
//


package piet;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for _Top250nlObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_Top250nlObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="identificatie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}NEN3610ID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="brontype" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="bronactualiteit" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bronbeschrijving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bronnauwkeurigheid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="objectBeginTijd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="objectEindTijd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="visualisatieCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_Top250nlObjectType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top250nl/1.2.0", propOrder = {
    "identificatie",
    "brontype",
    "bronactualiteit",
    "bronbeschrijving",
    "bronnauwkeurigheid",
    "objectBeginTijd",
    "objectEindTijd",
    "visualisatieCode"
})
@XmlSeeAlso({
    FunctioneelGebiedType.class,
    GebouwType.class,
    SpoorbaandeelType.class,
    WaterdeelType.class,
    InrichtingselementType.class,
    PlanTopografieType.class,
    WegdeelType.class,
    PlaatsType.class,
    TerreinType.class,
    GeografischGebiedType.class,
    HoogteType.class,
    RegistratiefGebiedType.class,
    ReliefType.class
})
public abstract class Top250NlObjectType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected Top250NlObjectType.Identificatie identificatie;
    @XmlElement(required = true)
    protected CodeType brontype;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bronactualiteit;
    @XmlElement(required = true)
    protected String bronbeschrijving;
    protected double bronnauwkeurigheid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar objectBeginTijd;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar objectEindTijd;
    protected BigInteger visualisatieCode;

    /**
     * Gets the value of the identificatie property.
     * 
     * @return
     *     possible object is
     *     {@link Top250NlObjectType.Identificatie }
     *     
     */
    public Top250NlObjectType.Identificatie getIdentificatie() {
        return identificatie;
    }

    /**
     * Sets the value of the identificatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Top250NlObjectType.Identificatie }
     *     
     */
    public void setIdentificatie(Top250NlObjectType.Identificatie value) {
        this.identificatie = value;
    }

    /**
     * Gets the value of the brontype property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBrontype() {
        return brontype;
    }

    /**
     * Sets the value of the brontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBrontype(CodeType value) {
        this.brontype = value;
    }

    /**
     * Gets the value of the bronactualiteit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBronactualiteit() {
        return bronactualiteit;
    }

    /**
     * Sets the value of the bronactualiteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBronactualiteit(XMLGregorianCalendar value) {
        this.bronactualiteit = value;
    }

    /**
     * Gets the value of the bronbeschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBronbeschrijving() {
        return bronbeschrijving;
    }

    /**
     * Sets the value of the bronbeschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBronbeschrijving(String value) {
        this.bronbeschrijving = value;
    }

    /**
     * Gets the value of the bronnauwkeurigheid property.
     * 
     */
    public double getBronnauwkeurigheid() {
        return bronnauwkeurigheid;
    }

    /**
     * Sets the value of the bronnauwkeurigheid property.
     * 
     */
    public void setBronnauwkeurigheid(double value) {
        this.bronnauwkeurigheid = value;
    }

    /**
     * Gets the value of the objectBeginTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjectBeginTijd() {
        return objectBeginTijd;
    }

    /**
     * Sets the value of the objectBeginTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjectBeginTijd(XMLGregorianCalendar value) {
        this.objectBeginTijd = value;
    }

    /**
     * Gets the value of the objectEindTijd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjectEindTijd() {
        return objectEindTijd;
    }

    /**
     * Sets the value of the objectEindTijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjectEindTijd(XMLGregorianCalendar value) {
        this.objectEindTijd = value;
    }

    /**
     * Gets the value of the visualisatieCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisualisatieCode() {
        return visualisatieCode;
    }

    /**
     * Sets the value of the visualisatieCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisualisatieCode(BigInteger value) {
        this.visualisatieCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}NEN3610ID"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nen3610ID"
    })
    public static class Identificatie {

        @XmlElement(name = "NEN3610ID", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0", required = true)
        protected NEN3610IDType nen3610ID;

        /**
         * Gets the value of the nen3610ID property.
         * 
         * @return
         *     possible object is
         *     {@link NEN3610IDType }
         *     
         */
        public NEN3610IDType getNEN3610ID() {
            return nen3610ID;
        }

        /**
         * Sets the value of the nen3610ID property.
         * 
         * @param value
         *     allowed object is
         *     {@link NEN3610IDType }
         *     
         */
        public void setNEN3610ID(NEN3610IDType value) {
            this.nen3610ID = value;
        }

    }

}
