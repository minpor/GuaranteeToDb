
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_inspectionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_inspectionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="VV"/>
 *     &lt;enumeration value="VK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_inspectionTypeType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsInspectionTypeType {

    V,
    K,
    VV,
    VK;

    public String value() {
        return name();
    }

    public static ZfcsInspectionTypeType fromValue(String v) {
        return valueOf(v);
    }

}
