
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Позиция плана-графика
 * 
 * <p>Java class for zfcs_tenderPlanPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlanPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
 *                   &lt;element name="extNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="orderNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;choice>
 *                       &lt;element name="amountKBKs2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKBK2016sType" minOccurs="0"/>
 *                       &lt;element name="amountKBKs2016Years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKBK2016sYearsType" minOccurs="0"/>
 *                     &lt;/choice>
 *                     &lt;choice>
 *                       &lt;element name="amountKBKs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKBKsType" minOccurs="0"/>
 *                       &lt;element name="amountKBKsYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKBKsYearsType" minOccurs="0"/>
 *                     &lt;/choice>
 *                   &lt;/choice>
 *                   &lt;choice>
 *                     &lt;choice>
 *                       &lt;element name="amountKVRs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKVRsType" minOccurs="0"/>
 *                       &lt;element name="amountKVRsYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKVRsYearsType" minOccurs="0"/>
 *                     &lt;/choice>
 *                     &lt;choice>
 *                       &lt;element name="amountKOSGUs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKOSGUsType" minOccurs="0"/>
 *                       &lt;element name="amountKOSGUsYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKOSGUsYearsType" minOccurs="0"/>
 *                     &lt;/choice>
 *                   &lt;/choice>
 *                   &lt;element name="OKVEDs">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef" maxOccurs="unbounded"/>
 *                             &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef" maxOccurs="unbounded"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contractSubjectName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="legalActRequisites" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="contractMaxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="payments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                   &lt;element name="contractPriceFeatures" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="contractCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType"/>
 *                   &lt;element name="features111" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="jointBiddingInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="jointBidding">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="jointBiddingOrganizer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="positionModification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_planPositionChangeReasonRef"/>
 *                             &lt;element name="additionalInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="positionPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="noPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="publicDiscussionNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="products">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="product" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                               &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                             &lt;/choice>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="internationalName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                             &lt;element name="minRequirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
 *                             &lt;element name="sumMax" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                             &lt;element name="quantityCurrentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseConditions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseFinCondition" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                             &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="contractFinCondition" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                             &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="advance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="purchaseGraph">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="purchasePlacingTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *                             &lt;element name="contractExecutionTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *                             &lt;element name="contractExecutionStages" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="periodicity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="prohibitions" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="preferensesRequirement" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="preferenses" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="requirements" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlanPositionType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "products",
    "purchaseConditions"
})
public class ZfcsTenderPlanPositionType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsTenderPlanPositionType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsTenderPlanPositionType.Products products;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsTenderPlanPositionType.PurchaseConditions purchaseConditions;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanPositionType.CommonInfo }
     *     
     */
    public ZfcsTenderPlanPositionType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanPositionType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsTenderPlanPositionType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanPositionType.Products }
     *     
     */
    public ZfcsTenderPlanPositionType.Products getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanPositionType.Products }
     *     
     */
    public void setProducts(ZfcsTenderPlanPositionType.Products value) {
        this.products = value;
    }

    /**
     * Gets the value of the purchaseConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanPositionType.PurchaseConditions }
     *     
     */
    public ZfcsTenderPlanPositionType.PurchaseConditions getPurchaseConditions() {
        return purchaseConditions;
    }

    /**
     * Sets the value of the purchaseConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanPositionType.PurchaseConditions }
     *     
     */
    public void setPurchaseConditions(ZfcsTenderPlanPositionType.PurchaseConditions value) {
        this.purchaseConditions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
     *         &lt;element name="extNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="orderNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;choice>
     *             &lt;element name="amountKBKs2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKBK2016sType" minOccurs="0"/>
     *             &lt;element name="amountKBKs2016Years" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKBK2016sYearsType" minOccurs="0"/>
     *           &lt;/choice>
     *           &lt;choice>
     *             &lt;element name="amountKBKs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKBKsType" minOccurs="0"/>
     *             &lt;element name="amountKBKsYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKBKsYearsType" minOccurs="0"/>
     *           &lt;/choice>
     *         &lt;/choice>
     *         &lt;choice>
     *           &lt;choice>
     *             &lt;element name="amountKVRs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKVRsType" minOccurs="0"/>
     *             &lt;element name="amountKVRsYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKVRsYearsType" minOccurs="0"/>
     *           &lt;/choice>
     *           &lt;choice>
     *             &lt;element name="amountKOSGUs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionKOSGUsType" minOccurs="0"/>
     *             &lt;element name="amountKOSGUsYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_PositionKOSGUsYearsType" minOccurs="0"/>
     *           &lt;/choice>
     *         &lt;/choice>
     *         &lt;element name="OKVEDs">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef" maxOccurs="unbounded"/>
     *                   &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef" maxOccurs="unbounded"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contractSubjectName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="legalActRequisites" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="contractMaxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="payments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *         &lt;element name="contractPriceFeatures" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="contractCurrency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType"/>
     *         &lt;element name="features111" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="jointBiddingInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="jointBidding">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="jointBiddingOrganizer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="positionModification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_planPositionChangeReasonRef"/>
     *                   &lt;element name="additionalInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="positionPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="noPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element name="publicDiscussionNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "positionNumber",
        "extNumber",
        "orderNumber",
        "amountKBKs2016",
        "amountKBKs2016Years",
        "amountKBKs",
        "amountKBKsYears",
        "amountKVRs",
        "amountKVRsYears",
        "amountKOSGUs",
        "amountKOSGUsYears",
        "okveDs",
        "contractSubjectName",
        "legalActRequisites",
        "contractMaxPrice",
        "payments",
        "contractPriceFeatures",
        "contractCurrency",
        "placingWay",
        "features111",
        "jointBiddingInfo",
        "positionModification",
        "positionPublishDate",
        "noPublicDiscussion",
        "publicDiscussionNum"
    })
    public static class CommonInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String positionNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Integer extNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String orderNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionKBK2016SType amountKBKs2016;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPositionKBK2016SYearsType amountKBKs2016Years;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionKBKsType amountKBKs;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPositionKBKsYearsType amountKBKsYears;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionKVRsType amountKVRs;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPositionKVRsYearsType amountKVRsYears;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionKOSGUsType amountKOSGUs;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPositionKOSGUsYearsType amountKOSGUsYears;
        @XmlElement(name = "OKVEDs", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsTenderPlanPositionType.CommonInfo.OKVEDs okveDs;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String contractSubjectName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String legalActRequisites;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String contractMaxPrice;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String payments;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String contractPriceFeatures;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCurrencyRef contractCurrency;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPlacingWayType placingWay;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean features111;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionType.CommonInfo.JointBiddingInfo jointBiddingInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionType.CommonInfo.PositionModification positionModification;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar positionPublishDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean noPublicDiscussion;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String publicDiscussionNum;

        /**
         * Gets the value of the positionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionNumber() {
            return positionNumber;
        }

        /**
         * Sets the value of the positionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionNumber(String value) {
            this.positionNumber = value;
        }

        /**
         * Gets the value of the extNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getExtNumber() {
            return extNumber;
        }

        /**
         * Sets the value of the extNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setExtNumber(Integer value) {
            this.extNumber = value;
        }

        /**
         * Gets the value of the orderNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderNumber() {
            return orderNumber;
        }

        /**
         * Sets the value of the orderNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderNumber(String value) {
            this.orderNumber = value;
        }

        /**
         * Gets the value of the amountKBKs2016 property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionKBK2016SType }
         *     
         */
        public ZfcsTenderPlanPositionKBK2016SType getAmountKBKs2016() {
            return amountKBKs2016;
        }

        /**
         * Sets the value of the amountKBKs2016 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionKBK2016SType }
         *     
         */
        public void setAmountKBKs2016(ZfcsTenderPlanPositionKBK2016SType value) {
            this.amountKBKs2016 = value;
        }

        /**
         * Gets the value of the amountKBKs2016Years property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPositionKBK2016SYearsType }
         *     
         */
        public ZfcsPositionKBK2016SYearsType getAmountKBKs2016Years() {
            return amountKBKs2016Years;
        }

        /**
         * Sets the value of the amountKBKs2016Years property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPositionKBK2016SYearsType }
         *     
         */
        public void setAmountKBKs2016Years(ZfcsPositionKBK2016SYearsType value) {
            this.amountKBKs2016Years = value;
        }

        /**
         * Gets the value of the amountKBKs property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionKBKsType }
         *     
         */
        public ZfcsTenderPlanPositionKBKsType getAmountKBKs() {
            return amountKBKs;
        }

        /**
         * Sets the value of the amountKBKs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionKBKsType }
         *     
         */
        public void setAmountKBKs(ZfcsTenderPlanPositionKBKsType value) {
            this.amountKBKs = value;
        }

        /**
         * Gets the value of the amountKBKsYears property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPositionKBKsYearsType }
         *     
         */
        public ZfcsPositionKBKsYearsType getAmountKBKsYears() {
            return amountKBKsYears;
        }

        /**
         * Sets the value of the amountKBKsYears property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPositionKBKsYearsType }
         *     
         */
        public void setAmountKBKsYears(ZfcsPositionKBKsYearsType value) {
            this.amountKBKsYears = value;
        }

        /**
         * Gets the value of the amountKVRs property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionKVRsType }
         *     
         */
        public ZfcsTenderPlanPositionKVRsType getAmountKVRs() {
            return amountKVRs;
        }

        /**
         * Sets the value of the amountKVRs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionKVRsType }
         *     
         */
        public void setAmountKVRs(ZfcsTenderPlanPositionKVRsType value) {
            this.amountKVRs = value;
        }

        /**
         * Gets the value of the amountKVRsYears property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPositionKVRsYearsType }
         *     
         */
        public ZfcsPositionKVRsYearsType getAmountKVRsYears() {
            return amountKVRsYears;
        }

        /**
         * Sets the value of the amountKVRsYears property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPositionKVRsYearsType }
         *     
         */
        public void setAmountKVRsYears(ZfcsPositionKVRsYearsType value) {
            this.amountKVRsYears = value;
        }

        /**
         * Gets the value of the amountKOSGUs property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionKOSGUsType }
         *     
         */
        public ZfcsTenderPlanPositionKOSGUsType getAmountKOSGUs() {
            return amountKOSGUs;
        }

        /**
         * Sets the value of the amountKOSGUs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionKOSGUsType }
         *     
         */
        public void setAmountKOSGUs(ZfcsTenderPlanPositionKOSGUsType value) {
            this.amountKOSGUs = value;
        }

        /**
         * Gets the value of the amountKOSGUsYears property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPositionKOSGUsYearsType }
         *     
         */
        public ZfcsPositionKOSGUsYearsType getAmountKOSGUsYears() {
            return amountKOSGUsYears;
        }

        /**
         * Sets the value of the amountKOSGUsYears property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPositionKOSGUsYearsType }
         *     
         */
        public void setAmountKOSGUsYears(ZfcsPositionKOSGUsYearsType value) {
            this.amountKOSGUsYears = value;
        }

        /**
         * Gets the value of the okveDs property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionType.CommonInfo.OKVEDs }
         *     
         */
        public ZfcsTenderPlanPositionType.CommonInfo.OKVEDs getOKVEDs() {
            return okveDs;
        }

        /**
         * Sets the value of the okveDs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionType.CommonInfo.OKVEDs }
         *     
         */
        public void setOKVEDs(ZfcsTenderPlanPositionType.CommonInfo.OKVEDs value) {
            this.okveDs = value;
        }

        /**
         * Gets the value of the contractSubjectName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractSubjectName() {
            return contractSubjectName;
        }

        /**
         * Sets the value of the contractSubjectName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractSubjectName(String value) {
            this.contractSubjectName = value;
        }

        /**
         * Gets the value of the legalActRequisites property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalActRequisites() {
            return legalActRequisites;
        }

        /**
         * Sets the value of the legalActRequisites property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalActRequisites(String value) {
            this.legalActRequisites = value;
        }

        /**
         * Gets the value of the contractMaxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractMaxPrice() {
            return contractMaxPrice;
        }

        /**
         * Sets the value of the contractMaxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractMaxPrice(String value) {
            this.contractMaxPrice = value;
        }

        /**
         * Gets the value of the payments property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayments() {
            return payments;
        }

        /**
         * Sets the value of the payments property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayments(String value) {
            this.payments = value;
        }

        /**
         * Gets the value of the contractPriceFeatures property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractPriceFeatures() {
            return contractPriceFeatures;
        }

        /**
         * Sets the value of the contractPriceFeatures property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractPriceFeatures(String value) {
            this.contractPriceFeatures = value;
        }

        /**
         * Gets the value of the contractCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public ZfcsCurrencyRef getContractCurrency() {
            return contractCurrency;
        }

        /**
         * Sets the value of the contractCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public void setContractCurrency(ZfcsCurrencyRef value) {
            this.contractCurrency = value;
        }

        /**
         * Gets the value of the placingWay property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPlacingWayType }
         *     
         */
        public ZfcsPlacingWayType getPlacingWay() {
            return placingWay;
        }

        /**
         * Sets the value of the placingWay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPlacingWayType }
         *     
         */
        public void setPlacingWay(ZfcsPlacingWayType value) {
            this.placingWay = value;
        }

        /**
         * Gets the value of the features111 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFeatures111() {
            return features111;
        }

        /**
         * Sets the value of the features111 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFeatures111(Boolean value) {
            this.features111 = value;
        }

        /**
         * Gets the value of the jointBiddingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionType.CommonInfo.JointBiddingInfo }
         *     
         */
        public ZfcsTenderPlanPositionType.CommonInfo.JointBiddingInfo getJointBiddingInfo() {
            return jointBiddingInfo;
        }

        /**
         * Sets the value of the jointBiddingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionType.CommonInfo.JointBiddingInfo }
         *     
         */
        public void setJointBiddingInfo(ZfcsTenderPlanPositionType.CommonInfo.JointBiddingInfo value) {
            this.jointBiddingInfo = value;
        }

        /**
         * Gets the value of the positionModification property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionType.CommonInfo.PositionModification }
         *     
         */
        public ZfcsTenderPlanPositionType.CommonInfo.PositionModification getPositionModification() {
            return positionModification;
        }

        /**
         * Sets the value of the positionModification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionType.CommonInfo.PositionModification }
         *     
         */
        public void setPositionModification(ZfcsTenderPlanPositionType.CommonInfo.PositionModification value) {
            this.positionModification = value;
        }

        /**
         * Gets the value of the positionPublishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPositionPublishDate() {
            return positionPublishDate;
        }

        /**
         * Sets the value of the positionPublishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPositionPublishDate(XMLGregorianCalendar value) {
            this.positionPublishDate = value;
        }

        /**
         * Gets the value of the noPublicDiscussion property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoPublicDiscussion() {
            return noPublicDiscussion;
        }

        /**
         * Sets the value of the noPublicDiscussion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoPublicDiscussion(Boolean value) {
            this.noPublicDiscussion = value;
        }

        /**
         * Gets the value of the publicDiscussionNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublicDiscussionNum() {
            return publicDiscussionNum;
        }

        /**
         * Sets the value of the publicDiscussionNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublicDiscussionNum(String value) {
            this.publicDiscussionNum = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="jointBidding">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="jointBiddingOrganizer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "jointBidding",
            "jointBiddingOrganizer"
        })
        public static class JointBiddingInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String jointBidding;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOrganizationRef jointBiddingOrganizer;

            /**
             * Gets the value of the jointBidding property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJointBidding() {
                return jointBidding;
            }

            /**
             * Sets the value of the jointBidding property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJointBidding(String value) {
                this.jointBidding = value;
            }

            /**
             * Gets the value of the jointBiddingOrganizer property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public ZfcsOrganizationRef getJointBiddingOrganizer() {
                return jointBiddingOrganizer;
            }

            /**
             * Sets the value of the jointBiddingOrganizer property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public void setJointBiddingOrganizer(ZfcsOrganizationRef value) {
                this.jointBiddingOrganizer = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef" maxOccurs="unbounded"/>
         *         &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef" maxOccurs="unbounded"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "okved",
            "okved2"
        })
        public static class OKVEDs {

            @XmlElement(name = "OKVED", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsOKVEDRef> okved;
            @XmlElement(name = "OKVED2", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsOKVEDRef> okved2;

            /**
             * Gets the value of the okved property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the okved property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOKVED().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsOKVEDRef }
             * 
             * 
             */
            public List<ZfcsOKVEDRef> getOKVED() {
                if (okved == null) {
                    okved = new ArrayList<ZfcsOKVEDRef>();
                }
                return this.okved;
            }

            /**
             * Gets the value of the okved2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the okved2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOKVED2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsOKVEDRef }
             * 
             * 
             */
            public List<ZfcsOKVEDRef> getOKVED2() {
                if (okved2 == null) {
                    okved2 = new ArrayList<ZfcsOKVEDRef>();
                }
                return this.okved2;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="changeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_planPositionChangeReasonRef"/>
         *         &lt;element name="additionalInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "changeReason",
            "additionalInfo"
        })
        public static class PositionModification {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsPlanPositionChangeReasonRef changeReason;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String additionalInfo;

            /**
             * Gets the value of the changeReason property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPlanPositionChangeReasonRef }
             *     
             */
            public ZfcsPlanPositionChangeReasonRef getChangeReason() {
                return changeReason;
            }

            /**
             * Sets the value of the changeReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPlanPositionChangeReasonRef }
             *     
             */
            public void setChangeReason(ZfcsPlanPositionChangeReasonRef value) {
                this.changeReason = value;
            }

            /**
             * Gets the value of the additionalInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalInfo() {
                return additionalInfo;
            }

            /**
             * Sets the value of the additionalInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalInfo(String value) {
                this.additionalInfo = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="product" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                     &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                   &lt;/choice>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="internationalName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="minRequirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
     *                   &lt;element name="sumMax" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                   &lt;element name="quantityCurrentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "product"
    })
    public static class Products {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsTenderPlanPositionType.Products.Product> product;

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsTenderPlanPositionType.Products.Product }
         * 
         * 
         */
        public List<ZfcsTenderPlanPositionType.Products.Product> getProduct() {
            if (product == null) {
                product = new ArrayList<ZfcsTenderPlanPositionType.Products.Product>();
            }
            return this.product;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *         &lt;/choice>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="internationalName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="minRequirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKEIRef" minOccurs="0"/>
         *         &lt;element name="sumMax" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *         &lt;element name="quantityCurrentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "okpd",
            "okpd2",
            "name",
            "internationalName",
            "minRequirement",
            "okei",
            "sumMax",
            "price",
            "quantityUndefined",
            "quantity",
            "quantityCurrentYear"
        })
        public static class Product {

            @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd;
            @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPDRef okpd2;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String internationalName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String minRequirement;
            @XmlElement(name = "OKEI", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKEIRef okei;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String sumMax;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String price;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected boolean quantityUndefined;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String quantity;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String quantityCurrentYear;

            /**
             * Gets the value of the okpd property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKPDRef }
             *     
             */
            public ZfcsOKPDRef getOKPD() {
                return okpd;
            }

            /**
             * Sets the value of the okpd property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKPDRef }
             *     
             */
            public void setOKPD(ZfcsOKPDRef value) {
                this.okpd = value;
            }

            /**
             * Gets the value of the okpd2 property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKPDRef }
             *     
             */
            public ZfcsOKPDRef getOKPD2() {
                return okpd2;
            }

            /**
             * Sets the value of the okpd2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKPDRef }
             *     
             */
            public void setOKPD2(ZfcsOKPDRef value) {
                this.okpd2 = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the internationalName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInternationalName() {
                return internationalName;
            }

            /**
             * Sets the value of the internationalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInternationalName(String value) {
                this.internationalName = value;
            }

            /**
             * Gets the value of the minRequirement property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinRequirement() {
                return minRequirement;
            }

            /**
             * Sets the value of the minRequirement property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinRequirement(String value) {
                this.minRequirement = value;
            }

            /**
             * Gets the value of the okei property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKEIRef }
             *     
             */
            public ZfcsOKEIRef getOKEI() {
                return okei;
            }

            /**
             * Sets the value of the okei property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKEIRef }
             *     
             */
            public void setOKEI(ZfcsOKEIRef value) {
                this.okei = value;
            }

            /**
             * Gets the value of the sumMax property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSumMax() {
                return sumMax;
            }

            /**
             * Sets the value of the sumMax property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSumMax(String value) {
                this.sumMax = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrice(String value) {
                this.price = value;
            }

            /**
             * Gets the value of the quantityUndefined property.
             * 
             */
            public boolean isQuantityUndefined() {
                return quantityUndefined;
            }

            /**
             * Sets the value of the quantityUndefined property.
             * 
             */
            public void setQuantityUndefined(boolean value) {
                this.quantityUndefined = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantity(String value) {
                this.quantity = value;
            }

            /**
             * Gets the value of the quantityCurrentYear property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantityCurrentYear() {
                return quantityCurrentYear;
            }

            /**
             * Sets the value of the quantityCurrentYear property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantityCurrentYear(String value) {
                this.quantityCurrentYear = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="purchaseFinCondition" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="contractFinCondition" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="advance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="purchaseGraph">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="purchasePlacingTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
     *                   &lt;element name="contractExecutionTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
     *                   &lt;element name="contractExecutionStages" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="periodicity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="prohibitions" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="preferensesRequirement" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="preferenses" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="requirements" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "purchaseFinCondition",
        "contractFinCondition",
        "advance",
        "purchaseGraph",
        "prohibitions",
        "preferensesRequirement"
    })
    public static class PurchaseConditions {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseFinCondition purchaseFinCondition;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionType.PurchaseConditions.ContractFinCondition contractFinCondition;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String advance;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseGraph purchaseGraph;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String prohibitions;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement preferensesRequirement;

        /**
         * Gets the value of the purchaseFinCondition property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseFinCondition }
         *     
         */
        public ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseFinCondition getPurchaseFinCondition() {
            return purchaseFinCondition;
        }

        /**
         * Sets the value of the purchaseFinCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseFinCondition }
         *     
         */
        public void setPurchaseFinCondition(ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseFinCondition value) {
            this.purchaseFinCondition = value;
        }

        /**
         * Gets the value of the contractFinCondition property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.ContractFinCondition }
         *     
         */
        public ZfcsTenderPlanPositionType.PurchaseConditions.ContractFinCondition getContractFinCondition() {
            return contractFinCondition;
        }

        /**
         * Sets the value of the contractFinCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.ContractFinCondition }
         *     
         */
        public void setContractFinCondition(ZfcsTenderPlanPositionType.PurchaseConditions.ContractFinCondition value) {
            this.contractFinCondition = value;
        }

        /**
         * Gets the value of the advance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvance() {
            return advance;
        }

        /**
         * Sets the value of the advance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvance(String value) {
            this.advance = value;
        }

        /**
         * Gets the value of the purchaseGraph property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseGraph }
         *     
         */
        public ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseGraph getPurchaseGraph() {
            return purchaseGraph;
        }

        /**
         * Sets the value of the purchaseGraph property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseGraph }
         *     
         */
        public void setPurchaseGraph(ZfcsTenderPlanPositionType.PurchaseConditions.PurchaseGraph value) {
            this.purchaseGraph = value;
        }

        /**
         * Gets the value of the prohibitions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProhibitions() {
            return prohibitions;
        }

        /**
         * Sets the value of the prohibitions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProhibitions(String value) {
            this.prohibitions = value;
        }

        /**
         * Gets the value of the preferensesRequirement property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement }
         *     
         */
        public ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement getPreferensesRequirement() {
            return preferensesRequirement;
        }

        /**
         * Sets the value of the preferensesRequirement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement }
         *     
         */
        public void setPreferensesRequirement(ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement value) {
            this.preferensesRequirement = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "procedure",
            "amount"
        })
        public static class ContractFinCondition {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String procedure;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String amount;

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
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmount(String value) {
                this.amount = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="preferenses" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="requirements" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "preferenses",
            "requirements"
        })
        public static class PreferensesRequirement {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Preferenses preferenses;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Requirements requirements;

            /**
             * Gets the value of the preferenses property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Preferenses }
             *     
             */
            public ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Preferenses getPreferenses() {
                return preferenses;
            }

            /**
             * Sets the value of the preferenses property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Preferenses }
             *     
             */
            public void setPreferenses(ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Preferenses value) {
                this.preferenses = value;
            }

            /**
             * Gets the value of the requirements property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Requirements }
             *     
             */
            public ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Requirements getRequirements() {
                return requirements;
            }

            /**
             * Sets the value of the requirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Requirements }
             *     
             */
            public void setRequirements(ZfcsTenderPlanPositionType.PurchaseConditions.PreferensesRequirement.Requirements value) {
                this.requirements = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="preferense" type="{http://zakupki.gov.ru/oos/types/1}zfcs_preferenseType" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "preferense"
            })
            public static class Preferenses {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsPreferenseType> preferense;

                /**
                 * Gets the value of the preferense property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the preferense property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPreferense().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsPreferenseType }
                 * 
                 * 
                 */
                public List<ZfcsPreferenseType> getPreferense() {
                    if (preferense == null) {
                        preferense = new ArrayList<ZfcsPreferenseType>();
                    }
                    return this.preferense;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="requirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_requirementType" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "requirement"
            })
            public static class Requirements {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsRequirementType> requirement;

                /**
                 * Gets the value of the requirement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the requirement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRequirement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsRequirementType }
                 * 
                 * 
                 */
                public List<ZfcsRequirementType> getRequirement() {
                    if (requirement == null) {
                        requirement = new ArrayList<ZfcsRequirementType>();
                    }
                    return this.requirement;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "procedure",
            "amount"
        })
        public static class PurchaseFinCondition {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String procedure;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String amount;

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
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmount(String value) {
                this.amount = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="purchasePlacingTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
         *         &lt;element name="contractExecutionTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
         *         &lt;element name="contractExecutionStages" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="periodicity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "purchasePlacingTerm",
            "contractExecutionTerm",
            "contractExecutionStages",
            "periodicity"
        })
        public static class PurchaseGraph {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsStageType purchasePlacingTerm;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsStageType contractExecutionTerm;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contractExecutionStages;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String periodicity;

            /**
             * Gets the value of the purchasePlacingTerm property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsStageType }
             *     
             */
            public ZfcsStageType getPurchasePlacingTerm() {
                return purchasePlacingTerm;
            }

            /**
             * Sets the value of the purchasePlacingTerm property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsStageType }
             *     
             */
            public void setPurchasePlacingTerm(ZfcsStageType value) {
                this.purchasePlacingTerm = value;
            }

            /**
             * Gets the value of the contractExecutionTerm property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsStageType }
             *     
             */
            public ZfcsStageType getContractExecutionTerm() {
                return contractExecutionTerm;
            }

            /**
             * Sets the value of the contractExecutionTerm property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsStageType }
             *     
             */
            public void setContractExecutionTerm(ZfcsStageType value) {
                this.contractExecutionTerm = value;
            }

            /**
             * Gets the value of the contractExecutionStages property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractExecutionStages() {
                return contractExecutionStages;
            }

            /**
             * Sets the value of the contractExecutionStages property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractExecutionStages(String value) {
                this.contractExecutionStages = value;
            }

            /**
             * Gets the value of the periodicity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPeriodicity() {
                return periodicity;
            }

            /**
             * Sets the value of the periodicity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPeriodicity(String value) {
                this.periodicity = value;
            }

        }

    }

}
