
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_participantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_participantTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="UF"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="BF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_participantTypeEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsParticipantTypeEnum {

    P,
    PF,
    U,
    UF,
    B,
    BF;

    public String value() {
        return name();
    }

    public static ZfcsParticipantTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
