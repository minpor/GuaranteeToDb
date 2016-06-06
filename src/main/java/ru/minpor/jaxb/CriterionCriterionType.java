
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for criterion.criterionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="criterion.criterionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="SC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "criterion.criterionType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum CriterionCriterionType {

    CR,
    SC;

    public String value() {
        return name();
    }

    public static CriterionCriterionType fromValue(String v) {
        return valueOf(v);
    }

}
