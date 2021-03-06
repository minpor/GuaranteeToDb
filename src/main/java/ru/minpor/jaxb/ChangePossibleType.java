
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changePossibleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="changePossibleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "changePossibleType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ChangePossibleType {

    N,
    O,
    D;

    public String value() {
        return name();
    }

    public static ChangePossibleType fromValue(String v) {
        return valueOf(v);
    }

}
