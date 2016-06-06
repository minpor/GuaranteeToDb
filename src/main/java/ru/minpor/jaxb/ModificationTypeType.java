
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modificationTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="modificationTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modificationTypeType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ModificationTypeType {

    M,
    C;

    public String value() {
        return name();
    }

    public static ModificationTypeType fromValue(String v) {
        return valueOf(v);
    }

}
