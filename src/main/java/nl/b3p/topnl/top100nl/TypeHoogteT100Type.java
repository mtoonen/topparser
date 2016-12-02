//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.02 at 04:14:28 PM CET 
//


package nl.b3p.topnl.top100nl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeHoogteT100Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeHoogteT100Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dieptelijn"/>
 *     &lt;enumeration value="dieptepunt"/>
 *     &lt;enumeration value="hoogtelijn"/>
 *     &lt;enumeration value="hoogtepunt"/>
 *     &lt;enumeration value="hoogwaterlijn"/>
 *     &lt;enumeration value="laagwaterlijn"/>
 *     &lt;enumeration value="peil:winterpeil"/>
 *     &lt;enumeration value="peil:zomerpeil"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeHoogteT100Type", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0")
@XmlEnum
public enum TypeHoogteT100Type {

    @XmlEnumValue("dieptelijn")
    DIEPTELIJN("dieptelijn"),
    @XmlEnumValue("dieptepunt")
    DIEPTEPUNT("dieptepunt"),
    @XmlEnumValue("hoogtelijn")
    HOOGTELIJN("hoogtelijn"),
    @XmlEnumValue("hoogtepunt")
    HOOGTEPUNT("hoogtepunt"),
    @XmlEnumValue("hoogwaterlijn")
    HOOGWATERLIJN("hoogwaterlijn"),
    @XmlEnumValue("laagwaterlijn")
    LAAGWATERLIJN("laagwaterlijn"),
    @XmlEnumValue("peil:winterpeil")
    PEIL_WINTERPEIL("peil:winterpeil"),
    @XmlEnumValue("peil:zomerpeil")
    PEIL_ZOMERPEIL("peil:zomerpeil");
    private final String value;

    TypeHoogteT100Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHoogteT100Type fromValue(String v) {
        for (TypeHoogteT100Type c: TypeHoogteT100Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
