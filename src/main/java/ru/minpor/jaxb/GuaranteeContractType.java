
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Обеспечение контракта
 * 
 * <p>Java class for guaranteeContractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guaranteeContractType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="procedure">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="settlementAccount" type="{http://zakupki.gov.ru/oos/types/1}settlementAccountType" minOccurs="0"/>
 *         &lt;element name="personalAccount" type="{http://zakupki.gov.ru/oos/types/1}personalAccountType" minOccurs="0"/>
 *         &lt;element name="bik" type="{http://zakupki.gov.ru/oos/types/1}bikType" minOccurs="0"/>
 *         &lt;element name="isBail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guaranteeContractType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "procedure",
    "settlementAccount",
    "personalAccount",
    "bik",
    "isBail"
})
@XmlSeeAlso({
    ru.minpor.jaxb.NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract.class,
    ru.minpor.jaxb.NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract.class,
    ru.minpor.jaxb.NotificationZKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeContract.class
})
public class GuaranteeContractType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String procedure;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String settlementAccount;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String personalAccount;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String bik;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean isBail;

    /**
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedure(String value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the settlementAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAccount() {
        return settlementAccount;
    }

    /**
     * Sets the value of the settlementAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAccount(String value) {
        this.settlementAccount = value;
    }

    /**
     * Gets the value of the personalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAccount() {
        return personalAccount;
    }

    /**
     * Sets the value of the personalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAccount(String value) {
        this.personalAccount = value;
    }

    /**
     * Gets the value of the bik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBik() {
        return bik;
    }

    /**
     * Sets the value of the bik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBik(String value) {
        this.bik = value;
    }

    /**
     * Gets the value of the isBail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBail() {
        return isBail;
    }

    /**
     * Sets the value of the isBail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBail(Boolean value) {
        this.isBail = value;
    }

}
