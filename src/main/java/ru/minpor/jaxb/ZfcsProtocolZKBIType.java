
package ru.minpor.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Общая информация об объекте закупки и структурированный протокол рассмотрения и оценки заявок на участие в ЗК-БИ (запрос котировок без извещения);
 * 
 * внесение изменений
 * 
 * <p>Java class for zfcs_protocolZKBIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolZKBIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="purchaseResponsible">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
 *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
 *                   &lt;element name="responsibleInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="orgPostAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="orgFactAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="specializedOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="placingWay">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
 *                                       &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                       &lt;choice>
 *                                         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                         &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                       &lt;element name="onesideRejection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
 *         &lt;element name="okpd2okved2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="protocolLot" type="{http://zakupki.gov.ru/oos/types/1}zfcs_infoProtocolZKBIType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationModificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolZKBIType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "purchaseNumber",
    "docPublishDate",
    "signDate",
    "docNumber",
    "href",
    "printForm",
    "extPrintForm",
    "purchaseObjectInfo",
    "purchaseResponsible",
    "placingWay",
    "lot",
    "okpd2Okved2",
    "protocolLot",
    "attachments",
    "modification"
})
public class ZfcsProtocolZKBIType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String purchaseNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String docNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String purchaseObjectInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolZKBIType.PurchaseResponsible purchaseResponsible;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolZKBIType.PlacingWay placingWay;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolZKBIType.Lot lot;
    @XmlElement(name = "okpd2okved2", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean okpd2Okved2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsInfoProtocolZKBIType protocolLot;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNotificationModificationType modification;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the purchaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    /**
     * Sets the value of the purchaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseNumber(String value) {
        this.purchaseNumber = value;
    }

    /**
     * Gets the value of the docPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPublishDate() {
        return docPublishDate;
    }

    /**
     * Sets the value of the docPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPublishDate(XMLGregorianCalendar value) {
        this.docPublishDate = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
    }

    /**
     * Gets the value of the purchaseObjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseObjectInfo() {
        return purchaseObjectInfo;
    }

    /**
     * Sets the value of the purchaseObjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseObjectInfo(String value) {
        this.purchaseObjectInfo = value;
    }

    /**
     * Gets the value of the purchaseResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZKBIType.PurchaseResponsible }
     *     
     */
    public ZfcsProtocolZKBIType.PurchaseResponsible getPurchaseResponsible() {
        return purchaseResponsible;
    }

    /**
     * Sets the value of the purchaseResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZKBIType.PurchaseResponsible }
     *     
     */
    public void setPurchaseResponsible(ZfcsProtocolZKBIType.PurchaseResponsible value) {
        this.purchaseResponsible = value;
    }

    /**
     * Gets the value of the placingWay property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZKBIType.PlacingWay }
     *     
     */
    public ZfcsProtocolZKBIType.PlacingWay getPlacingWay() {
        return placingWay;
    }

    /**
     * Sets the value of the placingWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZKBIType.PlacingWay }
     *     
     */
    public void setPlacingWay(ZfcsProtocolZKBIType.PlacingWay value) {
        this.placingWay = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZKBIType.Lot }
     *     
     */
    public ZfcsProtocolZKBIType.Lot getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZKBIType.Lot }
     *     
     */
    public void setLot(ZfcsProtocolZKBIType.Lot value) {
        this.lot = value;
    }

    /**
     * Gets the value of the okpd2Okved2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOkpd2Okved2() {
        return okpd2Okved2;
    }

    /**
     * Sets the value of the okpd2Okved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOkpd2Okved2(Boolean value) {
        this.okpd2Okved2 = value;
    }

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInfoProtocolZKBIType }
     *     
     */
    public ZfcsInfoProtocolZKBIType getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInfoProtocolZKBIType }
     *     
     */
    public void setProtocolLot(ZfcsInfoProtocolZKBIType value) {
        this.protocolLot = value;
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
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
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
     *                             &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                             &lt;choice>
     *                               &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                               &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
     *                             &lt;/choice>
     *                             &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                             &lt;element name="onesideRejection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
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
        protected ZfcsProtocolZKBIType.Lot.CustomerRequirements customerRequirements;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsProtocolZKBIType.Lot.PurchaseObjects purchaseObjects;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsProtocolZKBIType.Lot.Preferenses preferenses;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsProtocolZKBIType.Lot.Requirements requirements;
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
         *     {@link ZfcsProtocolZKBIType.Lot.CustomerRequirements }
         *     
         */
        public ZfcsProtocolZKBIType.Lot.CustomerRequirements getCustomerRequirements() {
            return customerRequirements;
        }

        /**
         * Sets the value of the customerRequirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZKBIType.Lot.CustomerRequirements }
         *     
         */
        public void setCustomerRequirements(ZfcsProtocolZKBIType.Lot.CustomerRequirements value) {
            this.customerRequirements = value;
        }

        /**
         * Gets the value of the purchaseObjects property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects }
         *     
         */
        public ZfcsProtocolZKBIType.Lot.PurchaseObjects getPurchaseObjects() {
            return purchaseObjects;
        }

        /**
         * Sets the value of the purchaseObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects }
         *     
         */
        public void setPurchaseObjects(ZfcsProtocolZKBIType.Lot.PurchaseObjects value) {
            this.purchaseObjects = value;
        }

        /**
         * Gets the value of the preferenses property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolZKBIType.Lot.Preferenses }
         *     
         */
        public ZfcsProtocolZKBIType.Lot.Preferenses getPreferenses() {
            return preferenses;
        }

        /**
         * Sets the value of the preferenses property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZKBIType.Lot.Preferenses }
         *     
         */
        public void setPreferenses(ZfcsProtocolZKBIType.Lot.Preferenses value) {
            this.preferenses = value;
        }

        /**
         * Gets the value of the requirements property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolZKBIType.Lot.Requirements }
         *     
         */
        public ZfcsProtocolZKBIType.Lot.Requirements getRequirements() {
            return requirements;
        }

        /**
         * Sets the value of the requirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZKBIType.Lot.Requirements }
         *     
         */
        public void setRequirements(ZfcsProtocolZKBIType.Lot.Requirements value) {
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
         *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                   &lt;choice>
         *                     &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                     &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
         *                   &lt;/choice>
         *                   &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                   &lt;element name="onesideRejection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
            protected List<ZfcsProtocolZKBIType.Lot.CustomerRequirements.CustomerRequirement> customerRequirement;

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
             * {@link ZfcsProtocolZKBIType.Lot.CustomerRequirements.CustomerRequirement }
             * 
             * 
             */
            public List<ZfcsProtocolZKBIType.Lot.CustomerRequirements.CustomerRequirement> getCustomerRequirement() {
                if (customerRequirement == null) {
                    customerRequirement = new ArrayList<ZfcsProtocolZKBIType.Lot.CustomerRequirements.CustomerRequirement>();
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
             *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
             *         &lt;choice>
             *           &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
             *           &lt;element name="kladrPlaces" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kladrPlacesType"/>
             *         &lt;/choice>
             *         &lt;element name="deliveryTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
             *         &lt;element name="onesideRejection" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
                "onesideRejection",
                "tenderPlanInfo",
                "nonbudgetFinancings",
                "budgetFinancings"
            })
            public static class CustomerRequirement {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsOrganizationRef customer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String maxPrice;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String deliveryPlace;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsKladrPlacesType kladrPlaces;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String deliveryTerm;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String onesideRejection;
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
                 * Gets the value of the onesideRejection property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOnesideRejection() {
                    return onesideRejection;
                }

                /**
                 * Sets the value of the onesideRejection property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOnesideRejection(String value) {
                    this.onesideRejection = value;
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
            protected List<ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject> purchaseObject;
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
             * {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject }
             * 
             * 
             */
            public List<ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject> getPurchaseObject() {
                if (purchaseObject == null) {
                    purchaseObject = new ArrayList<ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject>();
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
                protected ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities customerQuantities;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String price;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.Quantity quantity;
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
                 *     {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities }
                 *     
                 */
                public ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities getCustomerQuantities() {
                    return customerQuantities;
                }

                /**
                 * Sets the value of the customerQuantities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities }
                 *     
                 */
                public void setCustomerQuantities(ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities value) {
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
                 *     {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.Quantity }
                 *     
                 */
                public ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.Quantity getQuantity() {
                    return quantity;
                }

                /**
                 * Sets the value of the quantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.Quantity }
                 *     
                 */
                public void setQuantity(ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.Quantity value) {
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
                    protected List<ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity> customerQuantity;

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
                     * {@link ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity }
                     * 
                     * 
                     */
                    public List<ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity> getCustomerQuantity() {
                        if (customerQuantity == null) {
                            customerQuantity = new ArrayList<ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.CustomerQuantities.CustomerQuantity>();
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PlacingWay
        extends ZfcsPlacingWayType
    {


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
     *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
     *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
     *         &lt;element name="responsibleInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="orgPostAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="orgFactAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="specializedOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType" minOccurs="0"/>
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
        "responsibleOrg",
        "responsibleRole",
        "responsibleInfo",
        "specializedOrg"
    })
    public static class PurchaseResponsible {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseOrganizationType responsibleOrg;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsResponsibleRoleType responsibleRole;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsProtocolZKBIType.PurchaseResponsible.ResponsibleInfo responsibleInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPurchaseOrganizationType specializedOrg;

        /**
         * Gets the value of the responsibleOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public ZfcsPurchaseOrganizationType getResponsibleOrg() {
            return responsibleOrg;
        }

        /**
         * Sets the value of the responsibleOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public void setResponsibleOrg(ZfcsPurchaseOrganizationType value) {
            this.responsibleOrg = value;
        }

        /**
         * Gets the value of the responsibleRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsResponsibleRoleType }
         *     
         */
        public ZfcsResponsibleRoleType getResponsibleRole() {
            return responsibleRole;
        }

        /**
         * Sets the value of the responsibleRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsResponsibleRoleType }
         *     
         */
        public void setResponsibleRole(ZfcsResponsibleRoleType value) {
            this.responsibleRole = value;
        }

        /**
         * Gets the value of the responsibleInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolZKBIType.PurchaseResponsible.ResponsibleInfo }
         *     
         */
        public ZfcsProtocolZKBIType.PurchaseResponsible.ResponsibleInfo getResponsibleInfo() {
            return responsibleInfo;
        }

        /**
         * Sets the value of the responsibleInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZKBIType.PurchaseResponsible.ResponsibleInfo }
         *     
         */
        public void setResponsibleInfo(ZfcsProtocolZKBIType.PurchaseResponsible.ResponsibleInfo value) {
            this.responsibleInfo = value;
        }

        /**
         * Gets the value of the specializedOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public ZfcsPurchaseOrganizationType getSpecializedOrg() {
            return specializedOrg;
        }

        /**
         * Sets the value of the specializedOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public void setSpecializedOrg(ZfcsPurchaseOrganizationType value) {
            this.specializedOrg = value;
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
         *         &lt;element name="orgPostAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="orgFactAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
            "orgPostAddress",
            "orgFactAddress"
        })
        public static class ResponsibleInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String orgPostAddress;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String orgFactAddress;

            /**
             * Gets the value of the orgPostAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgPostAddress() {
                return orgPostAddress;
            }

            /**
             * Sets the value of the orgPostAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrgPostAddress(String value) {
                this.orgPostAddress = value;
            }

            /**
             * Gets the value of the orgFactAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgFactAddress() {
                return orgFactAddress;
            }

            /**
             * Sets the value of the orgFactAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrgFactAddress(String value) {
                this.orgFactAddress = value;
            }

        }

    }

}
