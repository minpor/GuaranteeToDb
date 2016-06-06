
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Данные процедуры контрактования
 * 
 * <p>Java class for zfcs_purchaseProcedureContractingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProcedureContractingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractingTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="evadeConditions" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseProcedureContractingType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "contractingTerm",
    "evadeConditions"
})
public class ZfcsPurchaseProcedureContractingType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String contractingTerm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String evadeConditions;

    /**
     * Gets the value of the contractingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractingTerm() {
        return contractingTerm;
    }

    /**
     * Sets the value of the contractingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractingTerm(String value) {
        this.contractingTerm = value;
    }

    /**
     * Gets the value of the evadeConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvadeConditions() {
        return evadeConditions;
    }

    /**
     * Sets the value of the evadeConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvadeConditions(String value) {
        this.evadeConditions = value;
    }

}
