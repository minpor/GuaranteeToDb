
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_contractPartyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_contractPartyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_contractPartyType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsContractPartyType {

    C,
    S;

    public String value() {
        return name();
    }

    public static ZfcsContractPartyType fromValue(String v) {
        return valueOf(v);
    }

}
