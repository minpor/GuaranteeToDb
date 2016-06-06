
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_responsibleRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_responsibleRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="OCU"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="ORA"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="OAI"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="OOA"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="OCS"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="OCC"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="OAU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_responsibleRoleType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsResponsibleRoleType {

    CU,
    OCU,
    RA,
    ORA,
    AI,
    OAI,
    OA,
    OOA,
    CS,
    OCS,
    CC,
    OCC,
    AU,
    OAU;

    public String value() {
        return name();
    }

    public static ZfcsResponsibleRoleType fromValue(String v) {
        return valueOf(v);
    }

}
