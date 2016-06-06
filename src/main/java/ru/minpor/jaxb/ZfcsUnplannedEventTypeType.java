
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_unplannedEventTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_unplannedEventTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="VV"/>
 *     &lt;enumeration value="VK"/>
 *     &lt;enumeration value="OV"/>
 *     &lt;enumeration value="OK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_unplannedEventTypeType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsUnplannedEventTypeType {

    V,
    K,
    O,
    VV,
    VK,
    OV,
    OK;

    public String value() {
        return name();
    }

    public static ZfcsUnplannedEventTypeType fromValue(String v) {
        return valueOf(v);
    }

}
