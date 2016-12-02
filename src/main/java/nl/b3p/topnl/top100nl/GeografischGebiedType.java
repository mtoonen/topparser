//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.02 at 04:14:28 PM CET 
//


package nl.b3p.topnl.top100nl;

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
 * <p>Java class for GeografischGebiedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeografischGebiedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0}_Top100nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeGeografischGebied" type="{http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0}TypeGeografischGebiedT100Type"/>
 *         &lt;element name="aantalInwoners" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="naamOfficieel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="naamNL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="naamFries" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0}VlakMultivlakOfPuntPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeografischGebiedType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0", propOrder = {
    "typeGeografischGebied",
    "aantalInwoners",
    "naamOfficieel",
    "naamNL",
    "naamFries",
    "geometrie"
})
public class GeografischGebiedType
    extends Top100NlObjectType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeGeografischGebiedT100Type typeGeografischGebied;
    protected BigInteger aantalInwoners;
    @XmlElement(required = true)
    protected String naamOfficieel;
    @XmlElement(required = true)
    protected List<String> naamNL;
    protected List<String> naamFries;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the typeGeografischGebied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGeografischGebiedT100Type }
     *     
     */
    public TypeGeografischGebiedT100Type getTypeGeografischGebied() {
        return typeGeografischGebied;
    }

    /**
     * Sets the value of the typeGeografischGebied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGeografischGebiedT100Type }
     *     
     */
    public void setTypeGeografischGebied(TypeGeografischGebiedT100Type value) {
        this.typeGeografischGebied = value;
    }

    /**
     * Gets the value of the aantalInwoners property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    /**
     * Sets the value of the aantalInwoners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAantalInwoners(BigInteger value) {
        this.aantalInwoners = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naamNL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaamNL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNaamNL() {
        if (naamNL == null) {
            naamNL = new ArrayList<String>();
        }
        return this.naamNL;
    }

    /**
     * Gets the value of the naamFries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naamFries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaamFries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNaamFries() {
        if (naamFries == null) {
            naamFries = new ArrayList<String>();
        }
        return this.naamFries;
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
