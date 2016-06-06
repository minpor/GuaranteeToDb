
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="OU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organizationType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum OrganizationType {

    Z,
    O,
    U,
    S,
    OU;

    public String value() {
        return name();
    }

    public static OrganizationType fromValue(String v) {
        return valueOf(v);
    }

}
