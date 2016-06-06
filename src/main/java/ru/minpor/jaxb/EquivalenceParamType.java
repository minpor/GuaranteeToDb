
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equivalenceParamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="equivalenceParamType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXACT"/>
 *     &lt;enumeration value="MAX_AND_MIN"/>
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="MIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "equivalenceParamType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum EquivalenceParamType {

    EXACT,
    MAX_AND_MIN,
    MAX,
    MIN;

    public String value() {
        return name();
    }

    public static EquivalenceParamType fromValue(String v) {
        return valueOf(v);
    }

}
