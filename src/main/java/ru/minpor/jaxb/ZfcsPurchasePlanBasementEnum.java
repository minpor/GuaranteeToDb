
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_purchasePlanBasementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_purchasePlanBasementEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PPF552"/>
 *     &lt;enumeration value="PPF1043"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_purchasePlanBasementEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsPurchasePlanBasementEnum {

    @XmlEnumValue("PPF552")
    PPF_552("PPF552"),
    @XmlEnumValue("PPF1043")
    PPF_1043("PPF1043");
    private final String value;

    ZfcsPurchasePlanBasementEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsPurchasePlanBasementEnum fromValue(String v) {
        for (ZfcsPurchasePlanBasementEnum c: ZfcsPurchasePlanBasementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
