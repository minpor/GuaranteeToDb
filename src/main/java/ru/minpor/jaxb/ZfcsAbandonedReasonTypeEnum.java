
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_abandonedReasonTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_abandonedReasonTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="OV"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="OV2"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="NS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_abandonedReasonTypeEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsAbandonedReasonTypeEnum {

    OR("OR"),
    NR("NR"),
    OV("OV"),
    NV("NV"),
    @XmlEnumValue("OV2")
    OV_2("OV2"),
    O("O"),
    NS("NS");
    private final String value;

    ZfcsAbandonedReasonTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsAbandonedReasonTypeEnum fromValue(String v) {
        for (ZfcsAbandonedReasonTypeEnum c: ZfcsAbandonedReasonTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
