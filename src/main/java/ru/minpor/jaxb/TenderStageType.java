
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tenderStageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tenderStageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="CW"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="CO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tenderStageType", namespace = "http://zakupki.gov.ru/oos/types/1")
@XmlEnum
public enum TenderStageType {


    /**
     * Заказы на этапе подготовки извещения
     * 
     */
    NP,

    /**
     * Заказы на этапе подачи заявок
     * 
     */
    AP,

    /**
     * Заказы на этапе работы комиссии
     * 
     */
    CW,

    /**
     * Завершенные заказы
     * 
     */
    FO,

    /**
     * Отмененные заказы
     * 
     */
    CO;

    public String value() {
        return name();
    }

    public static TenderStageType fromValue(String v) {
        return valueOf(v);
    }

}
