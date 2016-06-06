
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_customerReportContractTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_customerReportContractTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMP"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="S30"/>
 *     &lt;enumeration value="CRD"/>
 *     &lt;enumeration value="SGL"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="ZK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_customerReportContractTypeEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsCustomerReportContractTypeEnum {

    SMP("SMP"),
    CON("CON"),
    @XmlEnumValue("S30")
    S_30("S30"),
    CRD("CRD"),
    SGL("SGL"),
    ATM("ATM"),
    ZK("ZK");
    private final String value;

    ZfcsCustomerReportContractTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsCustomerReportContractTypeEnum fromValue(String v) {
        for (ZfcsCustomerReportContractTypeEnum c: ZfcsCustomerReportContractTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
