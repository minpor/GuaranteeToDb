
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_appealStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_appealStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="DCP"/>
 *     &lt;enumeration value="DU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_appealStatusType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsAppealStatusType {

    DC,
    DCP,
    DU;

    public String value() {
        return name();
    }

    public static ZfcsAppealStatusType fromValue(String v) {
        return valueOf(v);
    }

}
