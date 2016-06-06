
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_regulationRulesCouncilDecisionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_regulationRulesCouncilDecisionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="PA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_regulationRulesCouncilDecisionEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsRegulationRulesCouncilDecisionEnum {

    RE,
    PA;

    public String value() {
        return name();
    }

    public static ZfcsRegulationRulesCouncilDecisionEnum fromValue(String v) {
        return valueOf(v);
    }

}
