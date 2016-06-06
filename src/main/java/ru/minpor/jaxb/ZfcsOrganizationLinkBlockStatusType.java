
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_organizationLinkBlockStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_organizationLinkBlockStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="BO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_organizationLinkBlockStatusType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsOrganizationLinkBlockStatusType {

    A,
    B,
    BO;

    public String value() {
        return name();
    }

    public static ZfcsOrganizationLinkBlockStatusType fromValue(String v) {
        return valueOf(v);
    }

}
