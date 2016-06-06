
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_eventResult.resultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_eventResult.resultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIOLATIONS"/>
 *     &lt;enumeration value="NO_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_NO_VIOLATIONS"/>
 *     &lt;enumeration value="COMPLAINT_PARTLY_VALID"/>
 *     &lt;enumeration value="COMPLAINT_NOT_MATCHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_eventResult.resultType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsEventResultResultType {

    VIOLATIONS,
    NO_VIOLATIONS,
    COMPLAINT_VIOLATIONS,
    COMPLAINT_NO_VIOLATIONS,
    COMPLAINT_PARTLY_VALID,
    COMPLAINT_NOT_MATCHED;

    public String value() {
        return name();
    }

    public static ZfcsEventResultResultType fromValue(String v) {
        return valueOf(v);
    }

}
