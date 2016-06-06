
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Месяц, год финансирования контракта
 * 
 * <p>Java class for zfcs_subStageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_subStageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType">
 *       &lt;sequence>
 *         &lt;element name="substageMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
 *         &lt;element name="substageYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_subStageType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "substageMonth",
    "substageYear"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsContractType.Finances.Budgetary.class,
    ru.minpor.jaxb.ZfcsContractType.Finances.Extrabudgetary.class
})
public class ZfcsSubStageType
    extends ZfcsStageType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected byte substageMonth;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int substageYear;

    /**
     * Gets the value of the substageMonth property.
     * 
     */
    public byte getSubstageMonth() {
        return substageMonth;
    }

    /**
     * Sets the value of the substageMonth property.
     * 
     */
    public void setSubstageMonth(byte value) {
        this.substageMonth = value;
    }

    /**
     * Gets the value of the substageYear property.
     * 
     */
    public int getSubstageYear() {
        return substageYear;
    }

    /**
     * Sets the value of the substageYear property.
     * 
     */
    public void setSubstageYear(int value) {
        this.substageYear = value;
    }

}
