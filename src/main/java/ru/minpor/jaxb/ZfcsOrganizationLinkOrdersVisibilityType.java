
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_organizationLinkOrdersVisibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_organizationLinkOrdersVisibilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_organizationLinkOrdersVisibilityType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsOrganizationLinkOrdersVisibilityType {

    A,
    B;

    public String value() {
        return name();
    }

    public static ZfcsOrganizationLinkOrdersVisibilityType fromValue(String v) {
        return valueOf(v);
    }

}
