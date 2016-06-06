
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_surveyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_surveyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OV"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_surveyType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsSurveyType {

    OV,
    OK,
    OR;

    public String value() {
        return name();
    }

    public static ZfcsSurveyType fromValue(String v) {
        return valueOf(v);
    }

}
