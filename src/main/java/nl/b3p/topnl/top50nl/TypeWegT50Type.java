//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.08 at 04:32:51 PM CET 
//


package nl.b3p.topnl.top50nl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeWegT50Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeWegT50Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="startbaan, landingsbaan"/>
 *     &lt;enumeration value="rolbaan, platform"/>
 *     &lt;enumeration value="autosnelweg"/>
 *     &lt;enumeration value="hoofdweg"/>
 *     &lt;enumeration value="regionale weg"/>
 *     &lt;enumeration value="lokale weg"/>
 *     &lt;enumeration value="straat"/>
 *     &lt;enumeration value="veerverbinding"/>
 *     &lt;enumeration value="parkeerplaats"/>
 *     &lt;enumeration value="parkeerplaats: carpool"/>
 *     &lt;enumeration value="parkeerplaats: P+R"/>
 *     &lt;enumeration value="overig"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeWegT50Type", namespace = "http://www.kadaster.nl/top50nl/1.1")
@XmlEnum
public enum TypeWegT50Type {


    /**
     * Strook grond waar vliegtuigen kunnen opstijgen en/of landen
     * 
     */
    @XmlEnumValue("startbaan, landingsbaan")
    STARTBAAN_LANDINGSBAAN("startbaan, landingsbaan"),

    /**
     * Afgebakende taxibaan op een vliegveld (rolbaan) / Terrein voor geparkeerd staande vliegtuigen (platform)
     * 
     */
    @XmlEnumValue("rolbaan, platform")
    ROLBAAN_PLATFORM("rolbaan, platform"),

    /**
     * Weg met gescheiden rijbanen en ongelijkvloerse kruisingen, daartoe aangeduid met het betreffende verkeersbord.
     * 
     */
    @XmlEnumValue("autosnelweg")
    AUTOSNELWEG("autosnelweg"),

    /**
     * Verharde weg die is aangeduid met een E-nummer, maar niet met een A-nummer, of verharde weg die onderdeel is van een verbindingsroute tussen grotere plaatsen, wat blijkt uit blauwe
     * ANWB-borden, dan wel onderdeel is van een route om eindigende A of E-routes tot een gesloten netwerk te completeren
     * 
     */
    @XmlEnumValue("hoofdweg")
    HOOFDWEG("hoofdweg"),

    /**
     * Verharde weg die een verbinding vormt tussen bewoonde oorden, tussen wijken binnen een dorp of stad, en daartoe bewegwijzerd zijn met blauwe ANWB-borden of lokale borden
     * 
     */
    @XmlEnumValue("regionale weg")
    REGIONALE_WEG("regionale weg"),

    /**
     * Weg van lokaal belang tussen bewegwijzerde routes
     * 
     */
    @XmlEnumValue("lokale weg")
    LOKALE_WEG("lokale weg"),

    /**
     * Weg van zeer plaatselijk belang / Weg met speciale bestemming
     * 
     */
    @XmlEnumValue("straat")
    STRAAT("straat"),

    /**
     * Verbinding tussen twee oevers waar voertuigen en personen door een vaartuig overgezet worden.
     * 
     */
    @XmlEnumValue("veerverbinding")
    VEERVERBINDING("veerverbinding"),

    /**
     * Parkeergelegenheid voor meerdere voertuigen in de openlucht
     * 
     */
    @XmlEnumValue("parkeerplaats")
    PARKEERPLAATS("parkeerplaats"),

    /**
     * Parkeerplaats voor personenwagens langs doorgaande wegen t.b.v. carpoolers
     * 
     */
    @XmlEnumValue("parkeerplaats: carpool")
    PARKEERPLAATS_CARPOOL("parkeerplaats: carpool"),

    /**
     * Parkeergelegenheid ten behoeve van het overstappen op het openbaar vervoer
     * 
     */
    @XmlEnumValue("parkeerplaats: P+R")
    PARKEERPLAATS_P_R("parkeerplaats: P+R"),

    /**
     * De waarde van het objectkenmerk is bekend, maar anders dan de genoemde waarden
     * 
     */
    @XmlEnumValue("overig")
    OVERIG("overig");
    private final String value;

    TypeWegT50Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeWegT50Type fromValue(String v) {
        for (TypeWegT50Type c: TypeWegT50Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
