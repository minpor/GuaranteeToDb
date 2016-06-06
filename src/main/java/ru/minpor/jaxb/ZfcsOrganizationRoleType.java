
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_organizationRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_organizationRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="EO"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="CIA"/>
 *     &lt;enumeration value="ICB"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="OV"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="AC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_organizationRoleType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsOrganizationRoleType {

    CU,
    RA,
    AI,
    SO,
    CO,
    SP,
    FO,
    EO,
    AA,
    CA,
    NA,
    DA,
    BA,
    TA,
    OA,
    CIA,
    ICB,
    NP,
    GR,
    OV,
    CS,
    CC,
    AU,
    IS,
    BT,
    MP,
    MC,
    AC;

    public String value() {
        return name();
    }

    public static ZfcsOrganizationRoleType fromValue(String v) {
        return valueOf(v);
    }

}
