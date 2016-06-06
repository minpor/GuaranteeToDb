
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_complaint.regType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_complaint.regType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_complaint.regType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsComplaintRegType {

    M,
    E,
    I;

    public String value() {
        return name();
    }

    public static ZfcsComplaintRegType fromValue(String v) {
        return valueOf(v);
    }

}
