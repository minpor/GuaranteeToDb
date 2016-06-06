
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Обеспечение заявки
 * 
 * <p>Java class for guaranteeAppType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guaranteeAppType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="procedure" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="settlementAccount" type="{http://zakupki.gov.ru/oos/types/1}settlementAccountType" minOccurs="0"/>
 *         &lt;element name="personalAccount" type="{http://zakupki.gov.ru/oos/types/1}personalAccountType" minOccurs="0"/>
 *         &lt;element name="bik" type="{http://zakupki.gov.ru/oos/types/1}bikType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guaranteeAppType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "procedure",
    "settlementAccount",
    "personalAccount",
    "bik"
})
@XmlSeeAlso({
    ru.minpor.jaxb.NotificationEFType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp.class,
    ru.minpor.jaxb.NotificationOKType.Lots.Lot.CustomerRequirements.CustomerRequirement.GuaranteeApp.class
})
public class GuaranteeAppType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String procedure;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String settlementAccount;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String personalAccount;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String bik;

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

}
