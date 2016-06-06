
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_modification.authorityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_modification.authorityType">
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
@XmlType(name = "zfcs_modification.authorityType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsModificationAuthorityType {

    FA,
    FO,
    S,
    M;

    public String value() {
        return name();
    }

    public static ZfcsModificationAuthorityType fromValue(String v) {
        return valueOf(v);
    }

}
