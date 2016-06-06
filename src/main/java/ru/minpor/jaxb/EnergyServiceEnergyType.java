
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for energyService.energyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="energyService.energyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FV"/>
 *     &lt;enumeration value="FP"/>
 *     &lt;enumeration value="MIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "energyService.energyType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum EnergyServiceEnergyType {

    FV,
    FP,
    MIN;

    public String value() {
        return name();
    }

    public static EnergyServiceEnergyType fromValue(String v) {
        return valueOf(v);
    }

}
