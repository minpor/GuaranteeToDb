
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_eventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_eventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_eventType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsEventType {

    PP,
    PR,
    PO;

    public String value() {
        return name();
    }

    public static ZfcsEventType fromValue(String v) {
        return valueOf(v);
    }

}
