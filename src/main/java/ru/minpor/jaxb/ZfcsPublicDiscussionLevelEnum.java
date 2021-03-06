
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_publicDiscussionLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_publicDiscussionLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_publicDiscussionLevelEnum", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsPublicDiscussionLevelEnum {

    R,
    M;

    public String value() {
        return name();
    }

    public static ZfcsPublicDiscussionLevelEnum fromValue(String v) {
        return valueOf(v);
    }

}
