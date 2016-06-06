
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_notificationChangeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_notificationChangeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="F"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_notificationChangeEnumType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsNotificationChangeEnumType {

    C,
    R,
    F;

    public String value() {
        return name();
    }

    public static ZfcsNotificationChangeEnumType fromValue(String v) {
        return valueOf(v);
    }

}
