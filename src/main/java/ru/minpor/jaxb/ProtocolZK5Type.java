
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
 * Протокол рассмотрения котировочных заявок по главе 5
 * 
 * <p>Java class for protocolZK5Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolZK5Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *           &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType" minOccurs="0"/>
 *           &lt;element name="protocolNumber" type="{http://zakupki.gov.ru/oos/types/1}protocolNumberType" minOccurs="0"/>
 *           &lt;element name="foundationProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}protocolNumberType" minOccurs="0"/>
 *           &lt;element name="parentProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}protocolNumberType" minOccurs="0"/>
 *           &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *           &lt;element name="place" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="4000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="commission">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                     &lt;element name="name">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="2000"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="protocolCommissionMembers">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="protocolCommissionMember" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
 *                                       &lt;sequence>
 *                                         &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}document" minOccurs="0"/>
 *           &lt;element name="documentMetas" type="{http://zakupki.gov.ru/oos/types/1}documentList" minOccurs="0"/>
 *           &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}modificationType" minOccurs="0"/>
 *           &lt;element name="href" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="1024"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="orderName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="order">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="placer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
 *                   &lt;element name="placerOrgType" type="{http://zakupki.gov.ru/oos/types/1}organizationType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contactInfo" type="{http://zakupki.gov.ru/oos/types/1}contactInfoType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType" minOccurs="0"/>
 *         &lt;element name="protocolLots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolLot">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType" minOccurs="0"/>
 *                             &lt;element name="customerRequirements">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="customerRequirement">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="quantity" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="additionalInfo" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
 *                             &lt;element name="applications" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="application" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="journalNumber">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="20"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
 *                                                 &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                                 &lt;element name="applicationParticipants" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="goodsDelivered" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="expensesInfo" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="goodsQuantity" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="admissionResults" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="appRejectedReasons" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="resultType" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;enumeration value="W"/>
 *                                                       &lt;enumeration value="EMPTY"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
@XmlType(name = "protocolZK5Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "notificationNumber",
    "protocolNumber",
    "foundationProtocolNumber",
    "parentProtocolNumber",
    "versionNumber",
    "place",
    "protocolDate",
    "signDate",
    "publishDate",
    "commission",
    "printForm",
    "documentMetas",
    "modification",
    "href",
    "orderName",
    "order",
    "contactInfo",
    "currency",
    "protocolLots"
})
public class ProtocolZK5Type {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String notificationNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String protocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String foundationProtocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String parentProtocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String place;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protocolDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ProtocolZK5Type.Commission commission;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Document printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected DocumentList documentMetas;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ModificationType modification;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String orderName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ProtocolZK5Type.Order order;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ContactInfoType contactInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected CurrencyType currency;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ProtocolZK5Type.ProtocolLots protocolLots;

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
     * Gets the value of the notificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationNumber() {
        return notificationNumber;
    }

    /**
     * Sets the value of the notificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationNumber(String value) {
        this.notificationNumber = value;
    }

    /**
     * Gets the value of the protocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Sets the value of the protocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolNumber(String value) {
        this.protocolNumber = value;
    }

    /**
     * Gets the value of the foundationProtocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationProtocolNumber() {
        return foundationProtocolNumber;
    }

    /**
     * Sets the value of the foundationProtocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationProtocolNumber(String value) {
        this.foundationProtocolNumber = value;
    }

    /**
     * Gets the value of the parentProtocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProtocolNumber() {
        return parentProtocolNumber;
    }

    /**
     * Sets the value of the parentProtocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProtocolNumber(String value) {
        this.parentProtocolNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the protocolDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolDate() {
        return protocolDate;
    }

    /**
     * Sets the value of the protocolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolDate(XMLGregorianCalendar value) {
        this.protocolDate = value;
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
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZK5Type.Commission }
     *     
     */
    public ProtocolZK5Type.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZK5Type.Commission }
     *     
     */
    public void setCommission(ProtocolZK5Type.Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setPrintForm(Document value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the documentMetas property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentList }
     *     
     */
    public DocumentList getDocumentMetas() {
        return documentMetas;
    }

    /**
     * Sets the value of the documentMetas property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentList }
     *     
     */
    public void setDocumentMetas(DocumentList value) {
        this.documentMetas = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationType }
     *     
     */
    public ModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationType }
     *     
     */
    public void setModification(ModificationType value) {
        this.modification = value;
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
     * Gets the value of the orderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Sets the value of the orderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderName(String value) {
        this.orderName = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZK5Type.Order }
     *     
     */
    public ProtocolZK5Type.Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZK5Type.Order }
     *     
     */
    public void setOrder(ProtocolZK5Type.Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZK5Type.ProtocolLots }
     *     
     */
    public ProtocolZK5Type.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZK5Type.ProtocolLots }
     *     
     */
    public void setProtocolLots(ProtocolZK5Type.ProtocolLots value) {
        this.protocolLots = value;
    }


    /**
     * Комиссия, участвующая в составлении протокола
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="protocolCommissionMembers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="protocolCommissionMember" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
     *                           &lt;sequence>
     *                             &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
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
        "regNumber",
        "name",
        "protocolCommissionMembers"
    })
    public static class Commission {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int regNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ProtocolZK5Type.Commission.ProtocolCommissionMembers protocolCommissionMembers;

        /**
         * Gets the value of the regNumber property.
         * 
         */
        public int getRegNumber() {
            return regNumber;
        }

        /**
         * Sets the value of the regNumber property.
         * 
         */
        public void setRegNumber(int value) {
            this.regNumber = value;
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
         * Gets the value of the protocolCommissionMembers property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolZK5Type.Commission.ProtocolCommissionMembers }
         *     
         */
        public ProtocolZK5Type.Commission.ProtocolCommissionMembers getProtocolCommissionMembers() {
            return protocolCommissionMembers;
        }

        /**
         * Sets the value of the protocolCommissionMembers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolZK5Type.Commission.ProtocolCommissionMembers }
         *     
         */
        public void setProtocolCommissionMembers(ProtocolZK5Type.Commission.ProtocolCommissionMembers value) {
            this.protocolCommissionMembers = value;
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
         *         &lt;element name="protocolCommissionMember" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
         *                 &lt;sequence>
         *                   &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "protocolCommissionMember"
        })
        public static class ProtocolCommissionMembers {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ProtocolZK5Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember> protocolCommissionMember;

            /**
             * Gets the value of the protocolCommissionMember property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the protocolCommissionMember property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProtocolCommissionMember().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProtocolZK5Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember }
             * 
             * 
             */
            public List<ProtocolZK5Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember> getProtocolCommissionMember() {
                if (protocolCommissionMember == null) {
                    protocolCommissionMember = new ArrayList<ProtocolZK5Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember>();
                }
                return this.protocolCommissionMember;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
             *       &lt;sequence>
             *         &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "present"
            })
            public static class ProtocolCommissionMember
                extends CommissionMemberType
            {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected boolean present;

                /**
                 * Gets the value of the present property.
                 * 
                 */
                public boolean isPresent() {
                    return present;
                }

                /**
                 * Sets the value of the present property.
                 * 
                 */
                public void setPresent(boolean value) {
                    this.present = value;
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
     *         &lt;element name="placer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
     *         &lt;element name="placerOrgType" type="{http://zakupki.gov.ru/oos/types/1}organizationType"/>
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
        "placer",
        "placerOrgType"
    })
    public static class Order {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected OrganizationRef placer;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected OrganizationType placerOrgType;

        /**
         * Gets the value of the placer property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getPlacer() {
            return placer;
        }

        /**
         * Sets the value of the placer property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setPlacer(OrganizationRef value) {
            this.placer = value;
        }

        /**
         * Gets the value of the placerOrgType property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationType }
         *     
         */
        public OrganizationType getPlacerOrgType() {
            return placerOrgType;
        }

        /**
         * Sets the value of the placerOrgType property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationType }
         *     
         */
        public void setPlacerOrgType(OrganizationType value) {
            this.placerOrgType = value;
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
     *         &lt;element name="protocolLot">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType" minOccurs="0"/>
     *                   &lt;element name="customerRequirements">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="customerRequirement">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="quantity" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="additionalInfo" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
     *                   &lt;element name="applications" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="application" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="journalNumber">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="20"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
     *                                       &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                                       &lt;element name="applicationParticipants" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="goodsDelivered" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="expensesInfo" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="goodsQuantity" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="admissionResults" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="appRejectedReasons" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="resultType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="17"/>
     *                                             &lt;enumeration value="W"/>
     *                                             &lt;enumeration value="EMPTY"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "protocolLot"
    })
    public static class ProtocolLots {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ProtocolZK5Type.ProtocolLots.ProtocolLot protocolLot;

        /**
         * Gets the value of the protocolLot property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot }
         *     
         */
        public ProtocolZK5Type.ProtocolLots.ProtocolLot getProtocolLot() {
            return protocolLot;
        }

        /**
         * Sets the value of the protocolLot property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot }
         *     
         */
        public void setProtocolLot(ProtocolZK5Type.ProtocolLots.ProtocolLot value) {
            this.protocolLot = value;
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
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}productsType" minOccurs="0"/>
         *         &lt;element name="customerRequirements">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="customerRequirement">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="quantity" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="additionalInfo" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
         *         &lt;element name="applications" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="application" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="journalNumber">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
         *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                             &lt;element name="applicationParticipants" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="goodsDelivered" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="expensesInfo" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="goodsQuantity" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="admissionResults" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="appRejectedReasons" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="resultType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="17"/>
         *                                   &lt;enumeration value="W"/>
         *                                   &lt;enumeration value="EMPTY"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
            "lotNumber",
            "products",
            "customerRequirements",
            "applications"
        })
        public static class ProtocolLot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ProductsType products;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements customerRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications applications;

            /**
             * Gets the value of the lotNumber property.
             * 
             */
            public int getLotNumber() {
                return lotNumber;
            }

            /**
             * Sets the value of the lotNumber property.
             * 
             */
            public void setLotNumber(int value) {
                this.lotNumber = value;
            }

            /**
             * Gets the value of the products property.
             * 
             * @return
             *     possible object is
             *     {@link ProductsType }
             *     
             */
            public ProductsType getProducts() {
                return products;
            }

            /**
             * Sets the value of the products property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProductsType }
             *     
             */
            public void setProducts(ProductsType value) {
                this.products = value;
            }

            /**
             * Gets the value of the customerRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements }
             *     
             */
            public ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements getCustomerRequirements() {
                return customerRequirements;
            }

            /**
             * Sets the value of the customerRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements }
             *     
             */
            public void setCustomerRequirements(ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements value) {
                this.customerRequirements = value;
            }

            /**
             * Gets the value of the applications property.
             * 
             * @return
             *     possible object is
             *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications getApplications() {
                return applications;
            }

            /**
             * Sets the value of the applications property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public void setApplications(ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications value) {
                this.applications = value;
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
             *         &lt;element name="application" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="journalNumber">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
             *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *                   &lt;element name="applicationParticipants" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="goodsDelivered" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="expensesInfo" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="goodsQuantity" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="admissionResults" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="appRejectedReasons" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="resultType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="17"/>
             *                         &lt;enumeration value="W"/>
             *                         &lt;enumeration value="EMPTY"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
                "application"
            })
            public static class Applications {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application> application;

                /**
                 * Gets the value of the application property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the application property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getApplication().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application }
                 * 
                 * 
                 */
                public List<ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application> getApplication() {
                    if (application == null) {
                        application = new ArrayList<ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application>();
                    }
                    return this.application;
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
                 *         &lt;element name="journalNumber">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
                 *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
                 *         &lt;element name="applicationParticipants" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="goodsDelivered" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="expensesInfo" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="goodsQuantity" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="admissionResults" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="appRejectedReasons" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="resultType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="17"/>
                 *               &lt;enumeration value="W"/>
                 *               &lt;enumeration value="EMPTY"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
                    "journalNumber",
                    "appFormat",
                    "appDate",
                    "applicationParticipants",
                    "price",
                    "goodsDelivered",
                    "expensesInfo",
                    "goodsQuantity",
                    "admissionResults",
                    "admitted",
                    "resultType",
                    "appRating"
                })
                public static class Application {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String journalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "string")
                    protected ApplicationFormatType appFormat;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar appDate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants applicationParticipants;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double price;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String goodsDelivered;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String expensesInfo;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String goodsQuantity;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults admissionResults;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected boolean admitted;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String resultType;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Short appRating;

                    /**
                     * Gets the value of the journalNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getJournalNumber() {
                        return journalNumber;
                    }

                    /**
                     * Sets the value of the journalNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setJournalNumber(String value) {
                        this.journalNumber = value;
                    }

                    /**
                     * Gets the value of the appFormat property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ApplicationFormatType }
                     *     
                     */
                    public ApplicationFormatType getAppFormat() {
                        return appFormat;
                    }

                    /**
                     * Sets the value of the appFormat property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ApplicationFormatType }
                     *     
                     */
                    public void setAppFormat(ApplicationFormatType value) {
                        this.appFormat = value;
                    }

                    /**
                     * Gets the value of the appDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getAppDate() {
                        return appDate;
                    }

                    /**
                     * Sets the value of the appDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setAppDate(XMLGregorianCalendar value) {
                        this.appDate = value;
                    }

                    /**
                     * Gets the value of the applicationParticipants property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants }
                     *     
                     */
                    public ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants getApplicationParticipants() {
                        return applicationParticipants;
                    }

                    /**
                     * Sets the value of the applicationParticipants property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants }
                     *     
                     */
                    public void setApplicationParticipants(ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants value) {
                        this.applicationParticipants = value;
                    }

                    /**
                     * Gets the value of the price property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getPrice() {
                        return price;
                    }

                    /**
                     * Sets the value of the price property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setPrice(Double value) {
                        this.price = value;
                    }

                    /**
                     * Gets the value of the goodsDelivered property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGoodsDelivered() {
                        return goodsDelivered;
                    }

                    /**
                     * Sets the value of the goodsDelivered property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGoodsDelivered(String value) {
                        this.goodsDelivered = value;
                    }

                    /**
                     * Gets the value of the expensesInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExpensesInfo() {
                        return expensesInfo;
                    }

                    /**
                     * Sets the value of the expensesInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExpensesInfo(String value) {
                        this.expensesInfo = value;
                    }

                    /**
                     * Gets the value of the goodsQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGoodsQuantity() {
                        return goodsQuantity;
                    }

                    /**
                     * Sets the value of the goodsQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGoodsQuantity(String value) {
                        this.goodsQuantity = value;
                    }

                    /**
                     * Gets the value of the admissionResults property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults }
                     *     
                     */
                    public ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults getAdmissionResults() {
                        return admissionResults;
                    }

                    /**
                     * Sets the value of the admissionResults property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults }
                     *     
                     */
                    public void setAdmissionResults(ProtocolZK5Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults value) {
                        this.admissionResults = value;
                    }

                    /**
                     * Gets the value of the admitted property.
                     * 
                     */
                    public boolean isAdmitted() {
                        return admitted;
                    }

                    /**
                     * Sets the value of the admitted property.
                     * 
                     */
                    public void setAdmitted(boolean value) {
                        this.admitted = value;
                    }

                    /**
                     * Gets the value of the resultType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResultType() {
                        return resultType;
                    }

                    /**
                     * Sets the value of the resultType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResultType(String value) {
                        this.resultType = value;
                    }

                    /**
                     * Gets the value of the appRating property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getAppRating() {
                        return appRating;
                    }

                    /**
                     * Sets the value of the appRating property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setAppRating(Short value) {
                        this.appRating = value;
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
                     *         &lt;element name="appRejectedReasons" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
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
                        "appRejectedReasons"
                    })
                    public static class AdmissionResults {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<AppRejectedReasonType> appRejectedReasons;

                        /**
                         * Gets the value of the appRejectedReasons property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the appRejectedReasons property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAppRejectedReasons().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link AppRejectedReasonType }
                         * 
                         * 
                         */
                        public List<AppRejectedReasonType> getAppRejectedReasons() {
                            if (appRejectedReasons == null) {
                                appRejectedReasons = new ArrayList<AppRejectedReasonType>();
                            }
                            return this.appRejectedReasons;
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
                     *         &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
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
                        "applicationParticipant"
                    })
                    public static class ApplicationParticipants {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected ParticipantType applicationParticipant;

                        /**
                         * Gets the value of the applicationParticipant property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ParticipantType }
                         *     
                         */
                        public ParticipantType getApplicationParticipant() {
                            return applicationParticipant;
                        }

                        /**
                         * Sets the value of the applicationParticipant property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ParticipantType }
                         *     
                         */
                        public void setApplicationParticipant(ParticipantType value) {
                            this.applicationParticipant = value;
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
             *         &lt;element name="customerRequirement">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="quantity" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="additionalInfo" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
                protected ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements.CustomerRequirement customerRequirement;

                /**
                 * Gets the value of the customerRequirement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements.CustomerRequirement }
                 *     
                 */
                public ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements.CustomerRequirement getCustomerRequirement() {
                    return customerRequirement;
                }

                /**
                 * Sets the value of the customerRequirement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements.CustomerRequirement }
                 *     
                 */
                public void setCustomerRequirement(ProtocolZK5Type.ProtocolLots.ProtocolLot.CustomerRequirements.CustomerRequirement value) {
                    this.customerRequirement = value;
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
                 *         &lt;element name="quantity" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="additionalInfo" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tenderPlanInfo" type="{http://zakupki.gov.ru/oos/types/1}tendePlanInfoType" minOccurs="0"/>
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
                    "quantity",
                    "additionalInfo",
                    "tenderPlanInfo"
                })
                public static class CustomerRequirement {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String quantity;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String additionalInfo;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected TendePlanInfoType tenderPlanInfo;

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

                    /**
                     * Gets the value of the tenderPlanInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TendePlanInfoType }
                     *     
                     */
                    public TendePlanInfoType getTenderPlanInfo() {
                        return tenderPlanInfo;
                    }

                    /**
                     * Sets the value of the tenderPlanInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TendePlanInfoType }
                     *     
                     */
                    public void setTenderPlanInfo(TendePlanInfoType value) {
                        this.tenderPlanInfo = value;
                    }

                }

            }

        }

    }

}
