
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_placerRoleContract2015Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_placerRoleContract2015Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="OA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_placerRoleContract2015Type", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsPlacerRoleContract2015Type {

    CU,
    RA,
    AI,
    OA;

    public String value() {
        return name();
    }

    public static ZfcsPlacerRoleContract2015Type fromValue(String v) {
        return valueOf(v);
    }

}
