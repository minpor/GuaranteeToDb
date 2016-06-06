
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orgPlacerChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orgPlacerChangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orgPlacerChangeType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum OrgPlacerChangeType {

    C,
    R;

    public String value() {
        return name();
    }

    public static OrgPlacerChangeType fromValue(String v) {
        return valueOf(v);
    }

}
