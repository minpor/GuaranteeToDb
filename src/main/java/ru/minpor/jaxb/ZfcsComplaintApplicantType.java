
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_complaintApplicantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_complaintApplicantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_complaintApplicantType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsComplaintApplicantType {

    P,
    U,
    I;

    public String value() {
        return name();
    }

    public static ZfcsComplaintApplicantType fromValue(String v) {
        return valueOf(v);
    }

}
