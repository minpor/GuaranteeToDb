
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modification.authorityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="modification.authorityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modification.authorityType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ModificationAuthorityType {

    FA,
    FO,
    S,
    M;

    public String value() {
        return name();
    }

    public static ModificationAuthorityType fromValue(String v) {
        return valueOf(v);
    }

}
