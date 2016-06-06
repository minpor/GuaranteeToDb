
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_placingWayTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_placingWayTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FZ94"/>
 *     &lt;enumeration value="FZ44"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_placingWayTypeEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsPlacingWayTypeEnum {

    @XmlEnumValue("FZ94")
    FZ_94("FZ94"),
    @XmlEnumValue("FZ44")
    FZ_44("FZ44");
    private final String value;

    ZfcsPlacingWayTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsPlacingWayTypeEnum fromValue(String v) {
        for (ZfcsPlacingWayTypeEnum c: ZfcsPlacingWayTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
