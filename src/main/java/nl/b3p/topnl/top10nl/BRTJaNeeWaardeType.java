//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.06 at 11:39:08 AM CET 
//


package nl.b3p.topnl.top10nl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BRTJaNeeWaardeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BRTJaNeeWaardeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="nee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BRTJaNeeWaardeType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0")
@XmlEnum
public enum BRTJaNeeWaardeType {

    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("nee")
    NEE("nee");
    private final String value;

    BRTJaNeeWaardeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BRTJaNeeWaardeType fromValue(String v) {
        for (BRTJaNeeWaardeType c: BRTJaNeeWaardeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
