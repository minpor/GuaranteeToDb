
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_improperIndicatorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_improperIndicatorTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ro1"/>
 *     &lt;enumeration value="Ro2"/>
 *     &lt;enumeration value="Ro3"/>
 *     &lt;enumeration value="Ro4"/>
 *     &lt;enumeration value="Ro5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_improperIndicatorTypeEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsImproperIndicatorTypeEnum {

    @XmlEnumValue("Ro1")
    RO_1("Ro1"),
    @XmlEnumValue("Ro2")
    RO_2("Ro2"),
    @XmlEnumValue("Ro3")
    RO_3("Ro3"),
    @XmlEnumValue("Ro4")
    RO_4("Ro4"),
    @XmlEnumValue("Ro5")
    RO_5("Ro5");
    private final String value;

    ZfcsImproperIndicatorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsImproperIndicatorTypeEnum fromValue(String v) {
        for (ZfcsImproperIndicatorTypeEnum c: ZfcsImproperIndicatorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
