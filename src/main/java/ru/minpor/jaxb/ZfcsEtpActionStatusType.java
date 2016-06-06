
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_etpActionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_etpActionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="RB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_etpActionStatusType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsEtpActionStatusType {

    A,
    B,
    RA,
    RB;

    public String value() {
        return name();
    }

    public static ZfcsEtpActionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
