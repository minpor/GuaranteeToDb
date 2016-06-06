
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_contract.contractStageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_contract.contractStageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="IN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_contract.contractStageType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsContractContractStageType {

    E,
    ET,
    EC,
    IN;

    public String value() {
        return name();
    }

    public static ZfcsContractContractStageType fromValue(String v) {
        return valueOf(v);
    }

}
