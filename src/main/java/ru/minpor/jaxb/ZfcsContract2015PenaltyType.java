
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_contract2015PenaltyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_contract2015PenaltyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_contract2015PenaltyType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsContract2015PenaltyType {

    F,
    I;

    public String value() {
        return name();
    }

    public static ZfcsContract2015PenaltyType fromValue(String v) {
        return valueOf(v);
    }

}
