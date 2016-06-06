
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_tenderSuspensionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_tenderSuspensionActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUSPENSION"/>
 *     &lt;enumeration value="REOPENING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_tenderSuspensionActionType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsTenderSuspensionActionType {

    SUSPENSION,
    REOPENING;

    public String value() {
        return name();
    }

    public static ZfcsTenderSuspensionActionType fromValue(String v) {
        return valueOf(v);
    }

}
