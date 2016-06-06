
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractWithSingleApplicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contractWithSingleApplicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contractWithSingleApplicationType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ContractWithSingleApplicationType {

    Y,
    N,
    P;

    public String value() {
        return name();
    }

    public static ContractWithSingleApplicationType fromValue(String v) {
        return valueOf(v);
    }

}
