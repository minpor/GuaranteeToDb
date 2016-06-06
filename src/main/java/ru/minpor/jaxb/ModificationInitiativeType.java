
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modification.initiativeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="modification.initiativeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "modification.initiativeType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ModificationInitiativeType {

    Z,
    U,
    US,
    S;

    public String value() {
        return name();
    }

    public static ModificationInitiativeType fromValue(String v) {
        return valueOf(v);
    }

}
