
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractConclusionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contractConclusionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contractConclusionType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ContractConclusionType {

    R,
    C,
    N;

    public String value() {
        return name();
    }

    public static ContractConclusionType fromValue(String v) {
        return valueOf(v);
    }

}
