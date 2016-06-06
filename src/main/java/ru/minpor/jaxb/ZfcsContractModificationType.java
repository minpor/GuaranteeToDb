
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_contractModificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_contractModificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_contractModificationType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsContractModificationType {

    M,
    C;

    public String value() {
        return name();
    }

    public static ZfcsContractModificationType fromValue(String v) {
        return valueOf(v);
    }

}
