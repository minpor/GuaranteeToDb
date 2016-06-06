
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_measurementOrderEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_measurementOrderEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_measurementOrderEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsMeasurementOrderEnum {

    F,
    L,
    O;

    public String value() {
        return name();
    }

    public static ZfcsMeasurementOrderEnum fromValue(String v) {
        return valueOf(v);
    }

}
