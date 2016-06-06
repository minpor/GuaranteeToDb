
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for participantTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="participantTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="UF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "participantTypeType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ParticipantTypeType {

    P,
    PF,
    U,
    UF;

    public String value() {
        return name();
    }

    public static ParticipantTypeType fromValue(String v) {
        return valueOf(v);
    }

}
