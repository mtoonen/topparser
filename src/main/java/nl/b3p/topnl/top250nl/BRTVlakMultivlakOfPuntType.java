//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.02 at 12:37:54 PM CET 
//


package nl.b3p.topnl.top250nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BRTVlakMultivlakOfPuntType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BRTVlakMultivlakOfPuntType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="vlakGeometrie" type="{http://www.opengis.net/gml/3.2}SurfacePropertyType"/>
 *         &lt;element name="multivlakGeometrie" type="{http://www.opengis.net/gml/3.2}MultiSurfacePropertyType"/>
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
@XmlType(name = "BRTVlakMultivlakOfPuntType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0", propOrder = {
    "vlakGeometrie",
    "multivlakGeometrie",
    "puntGeometrie"
})
public class BRTVlakMultivlakOfPuntType {

    protected SurfacePropertyType vlakGeometrie;
    protected MultiSurfacePropertyType multivlakGeometrie;
    protected PointPropertyType puntGeometrie;

    /**
     * Gets the value of the vlakGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getVlakGeometrie() {
        return vlakGeometrie;
    }

    /**
     * Sets the value of the vlakGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setVlakGeometrie(SurfacePropertyType value) {
        this.vlakGeometrie = value;
    }

    /**
     * Gets the value of the multivlakGeometrie property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getMultivlakGeometrie() {
        return multivlakGeometrie;
    }

    /**
     * Sets the value of the multivlakGeometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setMultivlakGeometrie(MultiSurfacePropertyType value) {
        this.multivlakGeometrie = value;
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
