
package ru.minpor.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Извещение о проведении ЗП (запрос предложений);
 * внесение изменений
 * 
 * <p>Java class for zfcs_notificationZPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationZPType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNotificationType">
 *       &lt;sequence>
 *         &lt;element name="purchaseDocumentation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_releasePurchaseDocumentationType"/>
 *         &lt;element name="procedureInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
 *                   &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *                   &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringPlaceType"/>
 *                   &lt;element name="finalOpening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="priceFormula" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="standardContractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractNumberType" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                   &lt;element name="financeSource" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="customerRequirements">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="customerRequirement" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                                       &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                                       &lt;choice>
 *                                         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                         &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                       &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
 *                                       &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
 *                                       &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tendePlanInfoType" minOccurs="0"/>
 *                                       &lt;element name="nonbudgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nonbudgetFinancingsType" minOccurs="0"/>
 *                                       &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFinancingsType" minOccurs="0"/>
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
 *                   &lt;element name="purchaseObjects">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="purchaseObject" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                                         &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                       &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
 *                                       &lt;element name="customerQuantities" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="customerQuantity" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                                                           &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                       &lt;element name="quantity">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
 *                                                 &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                   &lt;element name="restrictInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="publicDiscussion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionType" minOccurs="0"/>
 *                   &lt;element name="noPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationModificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_notificationZPType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "purchaseDocumentation",
    "procedureInfo",
    "lot",
    "attachments",
    "modification"
})
public class ZfcsNotificationZPType
    extends ZfcsPurchaseNotificationType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsReleasePurchaseDocumentationType purchaseDocumentation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNotificationZPType.ProcedureInfo procedureInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNotificationZPType.Lot lot;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNotificationModificationType modification;

    /**
     * Gets the value of the purchaseDocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsReleasePurchaseDocumentationType }
     *     
     */
    public ZfcsReleasePurchaseDocumentationType getPurchaseDocumentation() {
        return purchaseDocumentation;
    }

    /**
     * Sets the value of the purchaseDocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsReleasePurchaseDocumentationType }
     *     
     */
    public void setPurchaseDocumentation(ZfcsReleasePurchaseDocumentationType value) {
        this.purchaseDocumentation = value;
    }

    /**
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZPType.ProcedureInfo }
     *     
     */
    public ZfcsNotificationZPType.ProcedureInfo getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZPType.ProcedureInfo }
     *     
     */
    public void setProcedureInfo(ZfcsNotificationZPType.ProcedureInfo value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZPType.Lot }
     *     
     */
    public ZfcsNotificationZPType.Lot getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZPType.Lot }
     *     
     */
    public void setLot(ZfcsNotificationZPType.Lot value) {
        this.lot = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationModificationType }
     *     
     */
    public ZfcsNotificationModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationModificationType }
     *     
     */
    public void setModification(ZfcsNotificationModificationType value) {
        this.modification = value;
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
     *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="priceFormula" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="standardContractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractNumberType" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *         &lt;element name="financeSource" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="customerRequirements">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="customerRequirement" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                             &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                             &lt;choice>
     *                               &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                               &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
     *                             &lt;/choice>
     *                             &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                             &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
     *                             &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
     *                             &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tendePlanInfoType" minOccurs="0"/>
     *                             &lt;element name="nonbudgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nonbudgetFinancingsType" minOccurs="0"/>
     *                             &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFinancingsType" minOccurs="0"/>
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
     *         &lt;element name="purchaseObjects">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="purchaseObject" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                               &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                             &lt;/choice>
     *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                             &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
     *                             &lt;element name="customerQuantities" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="customerQuantity" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                                                 &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                             &lt;element name="quantity">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
     *                                       &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *         &lt;element name="restrictInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="publicDiscussion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionType" minOccurs="0"/>
     *         &lt;element name="noPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "maxPrice",
        "priceFormula",
        "standardContractNumber",
        "currency",
        "financeSource",
        "quantityUndefined",
        "customerRequirements",
        "purchaseObjects",
        "preferenses",
        "requirements",
        "restrictInfo",
        "addInfo",
        "publicDiscussion",
        "noPublicDiscussion"
    })
    public static class Lot {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String maxPrice;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String priceFormula;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String standardContractNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCurrencyRef currency;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String financeSource;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean quantityUndefined;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsNotificationZPType.Lot.CustomerRequirements customerRequirements;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsNotificationZPType.Lot.PurchaseObjects purchaseObjects;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsNotificationZPType.Lot.Preferenses preferenses;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsNotificationZPType.Lot.Requirements requirements;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String restrictInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String addInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPublicDiscussionType publicDiscussion;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean noPublicDiscussion;

        /**
         * Gets the value of the maxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxPrice() {
            return maxPrice;
        }

        /**
         * Sets the value of the maxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxPrice(String value) {
            this.maxPrice = value;
        }

        /**
         * Gets the value of the priceFormula property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceFormula() {
            return priceFormula;
        }

        /**
         * Sets the value of the priceFormula property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceFormula(String value) {
            this.priceFormula = value;
        }

        /**
         * Gets the value of the standardContractNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStandardContractNumber() {
            return standardContractNumber;
        }

        /**
         * Sets the value of the standardContractNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStandardContractNumber(String value) {
            this.standardContractNumber = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public ZfcsCurrencyRef getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCurrencyRef }
         *     
         */
        public void setCurrency(ZfcsCurrencyRef value) {
            this.currency = value;
        }

        /**
         * Gets the value of the financeSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinanceSource() {
            return financeSource;
        }

        /**
         * Sets the value of the financeSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinanceSource(String value) {
            this.financeSource = value;
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
         * Gets the value of the customerRequirements property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationZPType.Lot.CustomerRequirements }
         *     
         */
        public ZfcsNotificationZPType.Lot.CustomerRequirements getCustomerRequirements() {
            return customerRequirements;
        }

        /**
         * Sets the value of the customerRequirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationZPType.Lot.CustomerRequirements }
         *     
         */
        public void setCustomerRequirements(ZfcsNotificationZPType.Lot.CustomerRequirements value) {
            this.customerRequirements = value;
        }

        /**
         * Gets the value of the purchaseObjects property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationZPType.Lot.PurchaseObjects }
         *     
         */
        public ZfcsNotificationZPType.Lot.PurchaseObjects getPurchaseObjects() {
            return purchaseObjects;
        }

        /**
         * Sets the value of the purchaseObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationZPType.Lot.PurchaseObjects }
         *     
         */
        public void setPurchaseObjects(ZfcsNotificationZPType.Lot.PurchaseObjects value) {
            this.purchaseObjects = value;
        }

        /**
         * Gets the value of the preferenses property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationZPType.Lot.Preferenses }
         *     
         */
        public ZfcsNotificationZPType.Lot.Preferenses getPreferenses() {
            return preferenses;
        }

        /**
         * Sets the value of the preferenses property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationZPType.Lot.Preferenses }
         *     
         */
        public void setPreferenses(ZfcsNotificationZPType.Lot.Preferenses value) {
            this.preferenses = value;
        }

        /**
         * Gets the value of the requirements property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationZPType.Lot.Requirements }
         *     
         */
        public ZfcsNotificationZPType.Lot.Requirements getRequirements() {
            return requirements;
        }

        /**
         * Sets the value of the requirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationZPType.Lot.Requirements }
         *     
         */
        public void setRequirements(ZfcsNotificationZPType.Lot.Requirements value) {
            this.requirements = value;
        }

        /**
         * Gets the value of the restrictInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestrictInfo() {
            return restrictInfo;
        }

        /**
         * Sets the value of the restrictInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestrictInfo(String value) {
            this.restrictInfo = value;
        }

        /**
         * Gets the value of the addInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddInfo() {
            return addInfo;
        }

        /**
         * Sets the value of the addInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddInfo(String value) {
            this.addInfo = value;
        }

        /**
         * Gets the value of the publicDiscussion property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPublicDiscussionType }
         *     
         */
        public ZfcsPublicDiscussionType getPublicDiscussion() {
            return publicDiscussion;
        }

        /**
         * Sets the value of the publicDiscussion property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPublicDiscussionType }
         *     
         */
        public void setPublicDiscussion(ZfcsPublicDiscussionType value) {
            this.publicDiscussion = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="customerRequirement" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *                   &lt;choice>
         *                     &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                     &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
         *                   &lt;/choice>
         *                   &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                   &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
         *                   &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
         *                   &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tendePlanInfoType" minOccurs="0"/>
         *                   &lt;element name="nonbudgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nonbudgetFinancingsType" minOccurs="0"/>
         *                   &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFinancingsType" minOccurs="0"/>
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
            "customerRequirement"
        })
        public static class CustomerRequirements {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsNotificationZPType.Lot.CustomerRequirements.CustomerRequirement> customerRequirement;

            /**
             * Gets the value of the customerRequirement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customerRequirement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomerRequirement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsNotificationZPType.Lot.CustomerRequirements.CustomerRequirement }
             * 
             * 
             */
            public List<ZfcsNotificationZPType.Lot.CustomerRequirements.CustomerRequirement> getCustomerRequirement() {
                if (customerRequirement == null) {
                    customerRequirement = new ArrayList<ZfcsNotificationZPType.Lot.CustomerRequirements.CustomerRequirement>();
                }
                return this.customerRequirement;
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
             *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
             *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
             *         &lt;choice>
             *           &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
             *           &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
             *         &lt;/choice>
             *         &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
             *         &lt;element name="applicationGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
             *         &lt;element name="contractGuarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_paymentInfoType" minOccurs="0"/>
             *         &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tendePlanInfoType" minOccurs="0"/>
             *         &lt;element name="nonbudgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nonbudgetFinancingsType" minOccurs="0"/>
             *         &lt;element name="budgetFinancings" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFinancingsType" minOccurs="0"/>
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
                "customer",
                "maxPrice",
                "deliveryPlace",
                "kladrPlaces",
                "deliveryTerm",
                "applicationGuarantee",
                "contractGuarantee",
                "tenderPlanInfo",
                "nonbudgetFinancings",
                "budgetFinancings"
            })
            public static class CustomerRequirement {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsOrganizationRef customer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String maxPrice;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String deliveryPlace;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsKladrPlacesType kladrPlaces;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String deliveryTerm;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsPaymentInfoType applicationGuarantee;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsPaymentInfoType contractGuarantee;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsTendePlanInfoType tenderPlanInfo;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsNonbudgetFinancingsType nonbudgetFinancings;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsBudgetFinancingsType budgetFinancings;

                /**
                 * Gets the value of the customer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOrganizationRef }
                 *     
                 */
                public ZfcsOrganizationRef getCustomer() {
                    return customer;
                }

                /**
                 * Sets the value of the customer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOrganizationRef }
                 *     
                 */
                public void setCustomer(ZfcsOrganizationRef value) {
                    this.customer = value;
                }

                /**
                 * Gets the value of the maxPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMaxPrice() {
                    return maxPrice;
                }

                /**
                 * Sets the value of the maxPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMaxPrice(String value) {
                    this.maxPrice = value;
                }

                /**
                 * Gets the value of the deliveryPlace property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDeliveryPlace() {
                    return deliveryPlace;
                }

                /**
                 * Sets the value of the deliveryPlace property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDeliveryPlace(String value) {
                    this.deliveryPlace = value;
                }

                /**
                 * Gets the value of the kladrPlaces property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsKladrPlacesType }
                 *     
                 */
                public ZfcsKladrPlacesType getKladrPlaces() {
                    return kladrPlaces;
                }

                /**
                 * Sets the value of the kladrPlaces property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsKladrPlacesType }
                 *     
                 */
                public void setKladrPlaces(ZfcsKladrPlacesType value) {
                    this.kladrPlaces = value;
                }

                /**
                 * Gets the value of the deliveryTerm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDeliveryTerm() {
                    return deliveryTerm;
                }

                /**
                 * Sets the value of the deliveryTerm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDeliveryTerm(String value) {
                    this.deliveryTerm = value;
                }

                /**
                 * Gets the value of the applicationGuarantee property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPaymentInfoType }
                 *     
                 */
                public ZfcsPaymentInfoType getApplicationGuarantee() {
                    return applicationGuarantee;
                }

                /**
                 * Sets the value of the applicationGuarantee property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPaymentInfoType }
                 *     
                 */
                public void setApplicationGuarantee(ZfcsPaymentInfoType value) {
                    this.applicationGuarantee = value;
                }

                /**
                 * Gets the value of the contractGuarantee property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPaymentInfoType }
                 *     
                 */
                public ZfcsPaymentInfoType getContractGuarantee() {
                    return contractGuarantee;
                }

                /**
                 * Sets the value of the contractGuarantee property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPaymentInfoType }
                 *     
                 */
                public void setContractGuarantee(ZfcsPaymentInfoType value) {
                    this.contractGuarantee = value;
                }

                /**
                 * Gets the value of the tenderPlanInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsTendePlanInfoType }
                 *     
                 */
                public ZfcsTendePlanInfoType getTenderPlanInfo() {
                    return tenderPlanInfo;
                }

                /**
                 * Sets the value of the tenderPlanInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsTendePlanInfoType }
                 *     
                 */
                public void setTenderPlanInfo(ZfcsTendePlanInfoType value) {
                    this.tenderPlanInfo = value;
                }

                /**
                 * Gets the value of the nonbudgetFinancings property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsNonbudgetFinancingsType }
                 *     
                 */
                public ZfcsNonbudgetFinancingsType getNonbudgetFinancings() {
                    return nonbudgetFinancings;
                }

                /**
                 * Sets the value of the nonbudgetFinancings property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsNonbudgetFinancingsType }
                 *     
                 */
                public void setNonbudgetFinancings(ZfcsNonbudgetFinancingsType value) {
                    this.nonbudgetFinancings = value;
                }

                /**
                 * Gets the value of the budgetFinancings property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsBudgetFinancingsType }
                 *     
                 */
                public ZfcsBudgetFinancingsType getBudgetFinancings() {
                    return budgetFinancings;
                }

                /**
                 * Sets the value of the budgetFinancings property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsBudgetFinancingsType }
                 *     
                 */
                public void setBudgetFinancings(ZfcsBudgetFinancingsType value) {
                    this.budgetFinancings = value;
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
         *         &lt;element name="purchaseObject" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *                     &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *                   &lt;/choice>
         *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                   &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
         *                   &lt;element name="customerQuantities" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="customerQuantity" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *                                       &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
         *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                   &lt;element name="quantity">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
         *                             &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
            "purchaseObject",
            "totalSum"
        })
        public static class PurchaseObjects {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject> purchaseObject;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String totalSum;

            /**
             * Gets the value of the purchaseObject property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the purchaseObject property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPurchaseObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject }
             * 
             * 
             */
            public List<ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject> getPurchaseObject() {
                if (purchaseObject == null) {
                    purchaseObject = new ArrayList<ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject>();
                }
                return this.purchaseObject;
            }

            /**
             * Gets the value of the totalSum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalSum() {
                return totalSum;
            }

            /**
             * Sets the value of the totalSum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalSum(String value) {
                this.totalSum = value;
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
             *         &lt;element name="OKEI" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.OKEIType" minOccurs="0"/>
             *         &lt;element name="customerQuantities" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="customerQuantity" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
             *                             &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
             *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
             *         &lt;element name="quantity">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
             *                   &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
                "okei",
                "customerQuantities",
                "price",
                "quantity",
                "sum"
            })
            public static class PurchaseObject {

                @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKPDRef okpd;
                @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKPDRef okpd2;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String name;
                @XmlElement(name = "OKEI", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsContractOKEIType okei;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities customerQuantities;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String price;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.Quantity quantity;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String sum;

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
                 * Gets the value of the okei property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsContractOKEIType }
                 *     
                 */
                public ZfcsContractOKEIType getOKEI() {
                    return okei;
                }

                /**
                 * Sets the value of the okei property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsContractOKEIType }
                 *     
                 */
                public void setOKEI(ZfcsContractOKEIType value) {
                    this.okei = value;
                }

                /**
                 * Gets the value of the customerQuantities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities }
                 *     
                 */
                public ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities getCustomerQuantities() {
                    return customerQuantities;
                }

                /**
                 * Sets the value of the customerQuantities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities }
                 *     
                 */
                public void setCustomerQuantities(ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities value) {
                    this.customerQuantities = value;
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
                 * Gets the value of the quantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.Quantity }
                 *     
                 */
                public ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.Quantity getQuantity() {
                    return quantity;
                }

                /**
                 * Sets the value of the quantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.Quantity }
                 *     
                 */
                public void setQuantity(ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.Quantity value) {
                    this.quantity = value;
                }

                /**
                 * Gets the value of the sum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSum() {
                    return sum;
                }

                /**
                 * Sets the value of the sum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSum(String value) {
                    this.sum = value;
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
                 *         &lt;element name="customerQuantity" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
                 *                   &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
                    "customerQuantity"
                })
                public static class CustomerQuantities {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected List<ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity> customerQuantity;

                    /**
                     * Gets the value of the customerQuantity property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the customerQuantity property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCustomerQuantity().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity }
                     * 
                     * 
                     */
                    public List<ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity> getCustomerQuantity() {
                        if (customerQuantity == null) {
                            customerQuantity = new ArrayList<ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity>();
                        }
                        return this.customerQuantity;
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
                     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
                     *         &lt;element name="quantity" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
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
                        "customer",
                        "quantity"
                    })
                    public static class CustomerQuantity {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected ZfcsOrganizationRef customer;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected BigDecimal quantity;

                        /**
                         * Gets the value of the customer property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ZfcsOrganizationRef }
                         *     
                         */
                        public ZfcsOrganizationRef getCustomer() {
                            return customer;
                        }

                        /**
                         * Sets the value of the customer property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ZfcsOrganizationRef }
                         *     
                         */
                        public void setCustomer(ZfcsOrganizationRef value) {
                            this.customer = value;
                        }

                        /**
                         * Gets the value of the quantity property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getQuantity() {
                            return quantity;
                        }

                        /**
                         * Sets the value of the quantity property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setQuantity(BigDecimal value) {
                            this.quantity = value;
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
                 *       &lt;choice>
                 *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_quantityType"/>
                 *         &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "value",
                    "undefined"
                })
                public static class Quantity {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected BigDecimal value;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Boolean undefined;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValue(BigDecimal value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the undefined property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isUndefined() {
                        return undefined;
                    }

                    /**
                     * Sets the value of the undefined property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setUndefined(Boolean value) {
                        this.undefined = value;
                    }

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
     *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
     *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
     *         &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringPlaceType"/>
     *         &lt;element name="finalOpening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
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
        "collecting",
        "opening",
        "scoring",
        "finalOpening"
    })
    public static class ProcedureInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureCollectingType collecting;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureOpeningType opening;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureScoringPlaceType scoring;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureOpeningType finalOpening;

        /**
         * Gets the value of the collecting property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureCollectingType }
         *     
         */
        public ZfcsPurchaseProcedureCollectingType getCollecting() {
            return collecting;
        }

        /**
         * Sets the value of the collecting property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureCollectingType }
         *     
         */
        public void setCollecting(ZfcsPurchaseProcedureCollectingType value) {
            this.collecting = value;
        }

        /**
         * Gets the value of the opening property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public ZfcsPurchaseProcedureOpeningType getOpening() {
            return opening;
        }

        /**
         * Sets the value of the opening property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public void setOpening(ZfcsPurchaseProcedureOpeningType value) {
            this.opening = value;
        }

        /**
         * Gets the value of the scoring property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureScoringPlaceType }
         *     
         */
        public ZfcsPurchaseProcedureScoringPlaceType getScoring() {
            return scoring;
        }

        /**
         * Sets the value of the scoring property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureScoringPlaceType }
         *     
         */
        public void setScoring(ZfcsPurchaseProcedureScoringPlaceType value) {
            this.scoring = value;
        }

        /**
         * Gets the value of the finalOpening property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public ZfcsPurchaseProcedureOpeningType getFinalOpening() {
            return finalOpening;
        }

        /**
         * Sets the value of the finalOpening property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public void setFinalOpening(ZfcsPurchaseProcedureOpeningType value) {
            this.finalOpening = value;
        }

    }

}
