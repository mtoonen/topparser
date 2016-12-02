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
 * <p>Java class for TypeBronT100Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeBronT100Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="externe data"/>
 *     &lt;enumeration value="TOP10NL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeBronT100Type", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0")
@XmlEnum
public enum TypeBronT100Type {


    /**
     * Data afkomstig uit andere bronnen dan TOP10NL
     * 
     */
    @XmlEnumValue("externe data")
    EXTERNE_DATA("externe data"),

    /**
     * Ontstaan door automatische generalisatie van TOP10NL data
     * 
     */
    @XmlEnumValue("TOP10NL")
    TOP_10_NL("TOP10NL");
    private final String value;

    TypeBronT100Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeBronT100Type fromValue(String v) {
        for (TypeBronT100Type c: TypeBronT100Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
