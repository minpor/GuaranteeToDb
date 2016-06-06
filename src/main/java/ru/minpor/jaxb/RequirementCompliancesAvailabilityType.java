
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requirementCompliances.availabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requirementCompliances.availabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requirementCompliances.availabilityType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum RequirementCompliancesAvailabilityType {

    A,
    U,
    O;

    public String value() {
        return name();
    }

    public static RequirementCompliancesAvailabilityType fromValue(String v) {
        return valueOf(v);
    }

}
