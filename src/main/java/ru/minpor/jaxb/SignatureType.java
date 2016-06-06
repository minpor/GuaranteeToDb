
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="signatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAdES-BES"/>
 *     &lt;enumeration value="CAdES-A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "signatureType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum SignatureType {

    @XmlEnumValue("CAdES-BES")
    C_AD_ES_BES("CAdES-BES"),
    @XmlEnumValue("CAdES-A")
    C_AD_ES_A("CAdES-A");
    private final String value;

    SignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureType fromValue(String v) {
        for (SignatureType c: SignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
