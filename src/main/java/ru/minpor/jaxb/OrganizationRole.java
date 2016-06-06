
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organizationRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="OU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organizationRole", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum OrganizationRole {

    Z,
    U,
    O,
    OU;

    public String value() {
        return name();
    }

    public static OrganizationRole fromValue(String v) {
        return valueOf(v);
    }

}
