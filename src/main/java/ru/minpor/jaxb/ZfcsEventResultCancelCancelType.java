
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_eventResultCancel.cancelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_eventResultCancel.cancelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CO_DECISION"/>
 *     &lt;enumeration value="JUDGE_DECISION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_eventResultCancel.cancelType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsEventResultCancelCancelType {

    CO_DECISION,
    JUDGE_DECISION;

    public String value() {
        return name();
    }

    public static ZfcsEventResultCancelCancelType fromValue(String v) {
        return valueOf(v);
    }

}
