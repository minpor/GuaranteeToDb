
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_etpActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_etpActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="PR1"/>
 *     &lt;enumeration value="PR2"/>
 *     &lt;enumeration value="PR3"/>
 *     &lt;enumeration value="PR4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_etpActionType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsEtpActionType {

    PRP("PRP"),
    @XmlEnumValue("PR1")
    PR_1("PR1"),
    @XmlEnumValue("PR2")
    PR_2("PR2"),
    @XmlEnumValue("PR3")
    PR_3("PR3"),
    @XmlEnumValue("PR4")
    PR_4("PR4");
    private final String value;

    ZfcsEtpActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsEtpActionType fromValue(String v) {
        for (ZfcsEtpActionType c: ZfcsEtpActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
