
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_publicDiscussionLargePurchaseStagesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_publicDiscussionLargePurchaseStagesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S1"/>
 *     &lt;enumeration value="S2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_publicDiscussionLargePurchaseStagesEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsPublicDiscussionLargePurchaseStagesEnum {

    @XmlEnumValue("S1")
    S_1("S1"),
    @XmlEnumValue("S2")
    S_2("S2");
    private final String value;

    ZfcsPublicDiscussionLargePurchaseStagesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsPublicDiscussionLargePurchaseStagesEnum fromValue(String v) {
        for (ZfcsPublicDiscussionLargePurchaseStagesEnum c: ZfcsPublicDiscussionLargePurchaseStagesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
