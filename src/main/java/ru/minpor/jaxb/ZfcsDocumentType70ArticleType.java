
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_documentType70ArticleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_documentType70ArticleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPWOS"/>
 *     &lt;enumeration value="PDWWS"/>
 *     &lt;enumeration value="RRWCS"/>
 *     &lt;enumeration value="CPWWS"/>
 *     &lt;enumeration value="ECWWS"/>
 *     &lt;enumeration value="CPWWCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_documentType70ArticleType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum ZfcsDocumentType70ArticleType {

    CPWOS,
    PDWWS,
    RRWCS,
    CPWWS,
    ECWWS,
    CPWWCS;

    public String value() {
        return name();
    }

    public static ZfcsDocumentType70ArticleType fromValue(String v) {
        return valueOf(v);
    }

}
