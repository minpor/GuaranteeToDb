
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_criterionCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_criterionCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="QF"/>
 *     &lt;enumeration value="QO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_criterionCodeEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsCriterionCodeEnum {

    CP,
    MC,
    TC,
    EN,
    QF,
    QO;

    public String value() {
        return name();
    }

    public static ZfcsCriterionCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
