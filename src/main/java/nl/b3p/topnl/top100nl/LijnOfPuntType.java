//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.02 at 04:14:28 PM CET 
//


package nl.b3p.topnl.top100nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LijnOfPuntType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LijnOfPuntType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="lijnGeometrie" type="{http://www.opengis.net/gml/3.2}CurvePropertyType"/>
 *         &lt;element name="puntGeometrie" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LijnOfPuntType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0", propOrder = {
    "lijnGeometrie",
    "puntGeometrie"
})
public class LijnOfPuntType {

    protected CurvePropertyType lijnGeometrie;
    protected PointPropertyType puntGeometrie;

    /**
     * Gets the value of the lijnGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getLijnGeometrie() {
        return lijnGeometrie;
    }

    /**
     * Sets the value of the lijnGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setLijnGeometrie(CurvePropertyType value) {
        this.lijnGeometrie = value;
    }

    /**
     * Gets the value of the puntGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPuntGeometrie() {
        return puntGeometrie;
    }

    /**
     * Sets the value of the puntGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPuntGeometrie(PointPropertyType value) {
        this.puntGeometrie = value;
    }

}
