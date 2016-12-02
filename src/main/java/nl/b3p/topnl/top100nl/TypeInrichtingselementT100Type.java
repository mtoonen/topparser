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
 * <p>Java class for TypeInrichtingselementT100Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeInrichtingselementT100Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aanlegsteiger"/>
 *     &lt;enumeration value="baak"/>
 *     &lt;enumeration value="bomenrij"/>
 *     &lt;enumeration value="boom"/>
 *     &lt;enumeration value="boortoren"/>
 *     &lt;enumeration value="brug"/>
 *     &lt;enumeration value="dam, koedam"/>
 *     &lt;enumeration value="dukdalf"/>
 *     &lt;enumeration value="gedenkteken, monument"/>
 *     &lt;enumeration value="geluidswering"/>
 *     &lt;enumeration value="golfmeetpaal"/>
 *     &lt;enumeration value="GPS kernnetpunt"/>
 *     &lt;enumeration value="grenspunt"/>
 *     &lt;enumeration value="heg, haag"/>
 *     &lt;enumeration value="hekwerk"/>
 *     &lt;enumeration value="helikopterlandingsplatform"/>
 *     &lt;enumeration value="hoogspanningsleiding"/>
 *     &lt;enumeration value="hoogspanningsmast"/>
 *     &lt;enumeration value="hunebed"/>
 *     &lt;enumeration value="kaap"/>
 *     &lt;enumeration value="kabelbaan"/>
 *     &lt;enumeration value="kabelbaanmast"/>
 *     &lt;enumeration value="kilometerpaal"/>
 *     &lt;enumeration value="kilometerpaal spoorweg"/>
 *     &lt;enumeration value="kilometerpaal water"/>
 *     &lt;enumeration value="kilometerraaibord"/>
 *     &lt;enumeration value="kilometerraaipaal"/>
 *     &lt;enumeration value="kruis"/>
 *     &lt;enumeration value="laadperron"/>
 *     &lt;enumeration value="licht, lichtopstand"/>
 *     &lt;enumeration value="markant object"/>
 *     &lt;enumeration value="muur"/>
 *     &lt;enumeration value="oliepompinstallatie"/>
 *     &lt;enumeration value="paal"/>
 *     &lt;enumeration value="paalwerk"/>
 *     &lt;enumeration value="peilschaal"/>
 *     &lt;enumeration value="pijler"/>
 *     &lt;enumeration value="radarpost"/>
 *     &lt;enumeration value="radiotelescoop"/>
 *     &lt;enumeration value="RD punt"/>
 *     &lt;enumeration value="recreatiepier"/>
 *     &lt;enumeration value="schietbaan"/>
 *     &lt;enumeration value="schoorsteen"/>
 *     &lt;enumeration value="seinmast"/>
 *     &lt;enumeration value="sluisdeur"/>
 *     &lt;enumeration value="station"/>
 *     &lt;enumeration value="stormvloedkering"/>
 *     &lt;enumeration value="strandpaal"/>
 *     &lt;enumeration value="strekdam, krib, golfbreker"/>
 *     &lt;enumeration value="stuw"/>
 *     &lt;enumeration value="tol"/>
 *     &lt;enumeration value="toren"/>
 *     &lt;enumeration value="verkeersgeleider"/>
 *     &lt;enumeration value="vlampijp"/>
 *     &lt;enumeration value="wegafsluiting"/>
 *     &lt;enumeration value="wegwijzer"/>
 *     &lt;enumeration value="windmolentje"/>
 *     &lt;enumeration value="windturbine"/>
 *     &lt;enumeration value="zendmast"/>
 *     &lt;enumeration value="overig"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeInrichtingselementT100Type", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0")
@XmlEnum
public enum TypeInrichtingselementT100Type {

    @XmlEnumValue("aanlegsteiger")
    AANLEGSTEIGER("aanlegsteiger"),
    @XmlEnumValue("baak")
    BAAK("baak"),
    @XmlEnumValue("bomenrij")
    BOMENRIJ("bomenrij"),
    @XmlEnumValue("boom")
    BOOM("boom"),
    @XmlEnumValue("boortoren")
    BOORTOREN("boortoren"),
    @XmlEnumValue("brug")
    BRUG("brug"),
    @XmlEnumValue("dam, koedam")
    DAM_KOEDAM("dam, koedam"),
    @XmlEnumValue("dukdalf")
    DUKDALF("dukdalf"),
    @XmlEnumValue("gedenkteken, monument")
    GEDENKTEKEN_MONUMENT("gedenkteken, monument"),
    @XmlEnumValue("geluidswering")
    GELUIDSWERING("geluidswering"),
    @XmlEnumValue("golfmeetpaal")
    GOLFMEETPAAL("golfmeetpaal"),
    @XmlEnumValue("GPS kernnetpunt")
    GPS_KERNNETPUNT("GPS kernnetpunt"),
    @XmlEnumValue("grenspunt")
    GRENSPUNT("grenspunt"),
    @XmlEnumValue("heg, haag")
    HEG_HAAG("heg, haag"),
    @XmlEnumValue("hekwerk")
    HEKWERK("hekwerk"),
    @XmlEnumValue("helikopterlandingsplatform")
    HELIKOPTERLANDINGSPLATFORM("helikopterlandingsplatform"),
    @XmlEnumValue("hoogspanningsleiding")
    HOOGSPANNINGSLEIDING("hoogspanningsleiding"),
    @XmlEnumValue("hoogspanningsmast")
    HOOGSPANNINGSMAST("hoogspanningsmast"),
    @XmlEnumValue("hunebed")
    HUNEBED("hunebed"),
    @XmlEnumValue("kaap")
    KAAP("kaap"),
    @XmlEnumValue("kabelbaan")
    KABELBAAN("kabelbaan"),
    @XmlEnumValue("kabelbaanmast")
    KABELBAANMAST("kabelbaanmast"),
    @XmlEnumValue("kilometerpaal")
    KILOMETERPAAL("kilometerpaal"),
    @XmlEnumValue("kilometerpaal spoorweg")
    KILOMETERPAAL_SPOORWEG("kilometerpaal spoorweg"),
    @XmlEnumValue("kilometerpaal water")
    KILOMETERPAAL_WATER("kilometerpaal water"),
    @XmlEnumValue("kilometerraaibord")
    KILOMETERRAAIBORD("kilometerraaibord"),
    @XmlEnumValue("kilometerraaipaal")
    KILOMETERRAAIPAAL("kilometerraaipaal"),
    @XmlEnumValue("kruis")
    KRUIS("kruis"),
    @XmlEnumValue("laadperron")
    LAADPERRON("laadperron"),
    @XmlEnumValue("licht, lichtopstand")
    LICHT_LICHTOPSTAND("licht, lichtopstand"),
    @XmlEnumValue("markant object")
    MARKANT_OBJECT("markant object"),
    @XmlEnumValue("muur")
    MUUR("muur"),
    @XmlEnumValue("oliepompinstallatie")
    OLIEPOMPINSTALLATIE("oliepompinstallatie"),
    @XmlEnumValue("paal")
    PAAL("paal"),
    @XmlEnumValue("paalwerk")
    PAALWERK("paalwerk"),
    @XmlEnumValue("peilschaal")
    PEILSCHAAL("peilschaal"),
    @XmlEnumValue("pijler")
    PIJLER("pijler"),
    @XmlEnumValue("radarpost")
    RADARPOST("radarpost"),
    @XmlEnumValue("radiotelescoop")
    RADIOTELESCOOP("radiotelescoop"),
    @XmlEnumValue("RD punt")
    RD_PUNT("RD punt"),
    @XmlEnumValue("recreatiepier")
    RECREATIEPIER("recreatiepier"),
    @XmlEnumValue("schietbaan")
    SCHIETBAAN("schietbaan"),
    @XmlEnumValue("schoorsteen")
    SCHOORSTEEN("schoorsteen"),
    @XmlEnumValue("seinmast")
    SEINMAST("seinmast"),
    @XmlEnumValue("sluisdeur")
    SLUISDEUR("sluisdeur"),
    @XmlEnumValue("station")
    STATION("station"),
    @XmlEnumValue("stormvloedkering")
    STORMVLOEDKERING("stormvloedkering"),
    @XmlEnumValue("strandpaal")
    STRANDPAAL("strandpaal"),
    @XmlEnumValue("strekdam, krib, golfbreker")
    STREKDAM_KRIB_GOLFBREKER("strekdam, krib, golfbreker"),
    @XmlEnumValue("stuw")
    STUW("stuw"),
    @XmlEnumValue("tol")
    TOL("tol"),
    @XmlEnumValue("toren")
    TOREN("toren"),
    @XmlEnumValue("verkeersgeleider")
    VERKEERSGELEIDER("verkeersgeleider"),
    @XmlEnumValue("vlampijp")
    VLAMPIJP("vlampijp"),
    @XmlEnumValue("wegafsluiting")
    WEGAFSLUITING("wegafsluiting"),
    @XmlEnumValue("wegwijzer")
    WEGWIJZER("wegwijzer"),
    @XmlEnumValue("windmolentje")
    WINDMOLENTJE("windmolentje"),
    @XmlEnumValue("windturbine")
    WINDTURBINE("windturbine"),
    @XmlEnumValue("zendmast")
    ZENDMAST("zendmast"),
    @XmlEnumValue("overig")
    OVERIG("overig");
    private final String value;

    TypeInrichtingselementT100Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeInrichtingselementT100Type fromValue(String v) {
        for (TypeInrichtingselementT100Type c: TypeInrichtingselementT100Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
