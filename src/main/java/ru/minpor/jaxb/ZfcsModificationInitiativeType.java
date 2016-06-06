
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_modification.initiativeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_modification.initiativeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_modification.initiativeType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsModificationInitiativeType {

    Z,
    U,
    US,
    S;

    public String value() {
        return name();
    }

    public static ZfcsModificationInitiativeType fromValue(String v) {
        return valueOf(v);
    }

}
