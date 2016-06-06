
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_purchasePlanPeriodicityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_purchasePlanPeriodicityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_purchasePlanPeriodicityTypeEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsPurchasePlanPeriodicityTypeEnum {

    W,
    B,
    M,
    Q,
    S,
    Y,
    T;

    public String value() {
        return name();
    }

    public static ZfcsPurchasePlanPeriodicityTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
