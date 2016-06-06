
package ru.minpor.jaxb;

import java.math.BigInteger;
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
 * Протокол признания участника уклонившимся от заключения контракта
 * 
 * <p>Java class for zfcs_protocolDeviationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolDeviationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *         &lt;element name="protocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="foundationProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="foundationProtocolName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="parentProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="commission" type="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionType"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="protocolPublisher" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publisherOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
 *                   &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseResponsible" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                             &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="notificationFullNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *                   &lt;element name="notificationFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolModificationType" minOccurs="0"/>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="lotInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotInfoType" minOccurs="0"/>
 *                   &lt;element name="application">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
 *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="appParticipants" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="refusalFact">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_deviationFactFoundation"/>
 *                             &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="voucherEntry" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolDeviationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "purchaseNumber",
    "protocolNumber",
    "foundationProtocolNumber",
    "foundationProtocolName",
    "parentProtocolNumber",
    "place",
    "protocolDate",
    "signDate",
    "publishDate",
    "extPrintForm",
    "commission",
    "href",
    "printForm",
    "protocolPublisher",
    "purchaseInfo",
    "attachments",
    "modification",
    "protocolLot"
})
public class ZfcsProtocolDeviationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String purchaseNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String protocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String foundationProtocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String foundationProtocolName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String parentProtocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
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
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCommissionType commission;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsProtocolDeviationType.ProtocolPublisher protocolPublisher;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsProtocolDeviationType.PurchaseInfo purchaseInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsProtocolModificationType modification;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolDeviationType.ProtocolLot protocolLot;
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
     * Gets the value of the foundationProtocolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationProtocolName() {
        return foundationProtocolName;
    }

    /**
     * Sets the value of the foundationProtocolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationProtocolName(String value) {
        this.foundationProtocolName = value;
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
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCommissionType }
     *     
     */
    public ZfcsCommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCommissionType }
     *     
     */
    public void setCommission(ZfcsCommissionType value) {
        this.commission = value;
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
     * Gets the value of the protocolPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolDeviationType.ProtocolPublisher }
     *     
     */
    public ZfcsProtocolDeviationType.ProtocolPublisher getProtocolPublisher() {
        return protocolPublisher;
    }

    /**
     * Sets the value of the protocolPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolDeviationType.ProtocolPublisher }
     *     
     */
    public void setProtocolPublisher(ZfcsProtocolDeviationType.ProtocolPublisher value) {
        this.protocolPublisher = value;
    }

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolDeviationType.PurchaseInfo }
     *     
     */
    public ZfcsProtocolDeviationType.PurchaseInfo getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolDeviationType.PurchaseInfo }
     *     
     */
    public void setPurchaseInfo(ZfcsProtocolDeviationType.PurchaseInfo value) {
        this.purchaseInfo = value;
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
     *     {@link ZfcsProtocolModificationType }
     *     
     */
    public ZfcsProtocolModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolModificationType }
     *     
     */
    public void setModification(ZfcsProtocolModificationType value) {
        this.modification = value;
    }

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolDeviationType.ProtocolLot }
     *     
     */
    public ZfcsProtocolDeviationType.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolDeviationType.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolDeviationType.ProtocolLot value) {
        this.protocolLot = value;
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
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="lotInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotInfoType" minOccurs="0"/>
     *         &lt;element name="application">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
     *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="appParticipants" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="refusalFact">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_deviationFactFoundation"/>
     *                   &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="voucherEntry" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "lotInfo",
        "application",
        "customer",
        "refusalFact"
    })
    public static class ProtocolLot {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger lotNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsLotInfoType lotInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsProtocolDeviationType.ProtocolLot.Application application;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOrganizationRef customer;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsProtocolDeviationType.ProtocolLot.RefusalFact refusalFact;

        /**
         * Gets the value of the lotNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLotNumber() {
            return lotNumber;
        }

        /**
         * Sets the value of the lotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLotNumber(BigInteger value) {
            this.lotNumber = value;
        }

        /**
         * Gets the value of the lotInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsLotInfoType }
         *     
         */
        public ZfcsLotInfoType getLotInfo() {
            return lotInfo;
        }

        /**
         * Sets the value of the lotInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsLotInfoType }
         *     
         */
        public void setLotInfo(ZfcsLotInfoType value) {
            this.lotInfo = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolDeviationType.ProtocolLot.Application }
         *     
         */
        public ZfcsProtocolDeviationType.ProtocolLot.Application getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolDeviationType.ProtocolLot.Application }
         *     
         */
        public void setApplication(ZfcsProtocolDeviationType.ProtocolLot.Application value) {
            this.application = value;
        }

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
         * Gets the value of the refusalFact property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolDeviationType.ProtocolLot.RefusalFact }
         *     
         */
        public ZfcsProtocolDeviationType.ProtocolLot.RefusalFact getRefusalFact() {
            return refusalFact;
        }

        /**
         * Sets the value of the refusalFact property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolDeviationType.ProtocolLot.RefusalFact }
         *     
         */
        public void setRefusalFact(ZfcsProtocolDeviationType.ProtocolLot.RefusalFact value) {
            this.refusalFact = value;
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
         *         &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
         *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="appParticipants" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "appDate",
            "appParticipants",
            "appRating"
        })
        public static class Application {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String journalNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar appDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsProtocolDeviationType.ProtocolLot.Application.AppParticipants appParticipants;
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
             * Gets the value of the appParticipants property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsProtocolDeviationType.ProtocolLot.Application.AppParticipants }
             *     
             */
            public ZfcsProtocolDeviationType.ProtocolLot.Application.AppParticipants getAppParticipants() {
                return appParticipants;
            }

            /**
             * Sets the value of the appParticipants property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolDeviationType.ProtocolLot.Application.AppParticipants }
             *     
             */
            public void setAppParticipants(ZfcsProtocolDeviationType.ProtocolLot.Application.AppParticipants value) {
                this.appParticipants = value;
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
             *         &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
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
                "appParticipant"
            })
            public static class AppParticipants {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsParticipantType> appParticipant;

                /**
                 * Gets the value of the appParticipant property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the appParticipant property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAppParticipant().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsParticipantType }
                 * 
                 * 
                 */
                public List<ZfcsParticipantType> getAppParticipant() {
                    if (appParticipant == null) {
                        appParticipant = new ArrayList<ZfcsParticipantType>();
                    }
                    return this.appParticipant;
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
         *         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_deviationFactFoundation"/>
         *         &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="voucherEntry" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
            "foundation",
            "explanation",
            "voucherEntry"
        })
        public static class RefusalFact {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsDeviationFactFoundation foundation;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String explanation;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String voucherEntry;

            /**
             * Gets the value of the foundation property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsDeviationFactFoundation }
             *     
             */
            public ZfcsDeviationFactFoundation getFoundation() {
                return foundation;
            }

            /**
             * Sets the value of the foundation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsDeviationFactFoundation }
             *     
             */
            public void setFoundation(ZfcsDeviationFactFoundation value) {
                this.foundation = value;
            }

            /**
             * Gets the value of the explanation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExplanation() {
                return explanation;
            }

            /**
             * Sets the value of the explanation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExplanation(String value) {
                this.explanation = value;
            }

            /**
             * Gets the value of the voucherEntry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoucherEntry() {
                return voucherEntry;
            }

            /**
             * Sets the value of the voucherEntry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoucherEntry(String value) {
                this.voucherEntry = value;
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
     *         &lt;element name="publisherOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
     *         &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
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
        "publisherOrg",
        "publisherRole"
    })
    public static class ProtocolPublisher {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseOrganizationType publisherOrg;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsResponsibleRoleType publisherRole;

        /**
         * Gets the value of the publisherOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public ZfcsPurchaseOrganizationType getPublisherOrg() {
            return publisherOrg;
        }

        /**
         * Sets the value of the publisherOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public void setPublisherOrg(ZfcsPurchaseOrganizationType value) {
            this.publisherOrg = value;
        }

        /**
         * Gets the value of the publisherRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsResponsibleRoleType }
         *     
         */
        public ZfcsResponsibleRoleType getPublisherRole() {
            return publisherRole;
        }

        /**
         * Sets the value of the publisherRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsResponsibleRoleType }
         *     
         */
        public void setPublisherRole(ZfcsResponsibleRoleType value) {
            this.publisherRole = value;
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
     *         &lt;element name="purchaseResponsible" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="notificationFullNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
     *         &lt;element name="notificationFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "purchaseResponsible",
        "placingWay",
        "publishDate",
        "purchaseObjectInfo",
        "notificationFullNumber",
        "notificationFullName"
    })
    public static class PurchaseInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsProtocolDeviationType.PurchaseInfo.PurchaseResponsible purchaseResponsible;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPlacingWayType placingWay;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String purchaseObjectInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String notificationFullNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String notificationFullName;

        /**
         * Gets the value of the purchaseResponsible property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolDeviationType.PurchaseInfo.PurchaseResponsible }
         *     
         */
        public ZfcsProtocolDeviationType.PurchaseInfo.PurchaseResponsible getPurchaseResponsible() {
            return purchaseResponsible;
        }

        /**
         * Sets the value of the purchaseResponsible property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolDeviationType.PurchaseInfo.PurchaseResponsible }
         *     
         */
        public void setPurchaseResponsible(ZfcsProtocolDeviationType.PurchaseInfo.PurchaseResponsible value) {
            this.purchaseResponsible = value;
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
         * Gets the value of the notificationFullNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationFullNumber() {
            return notificationFullNumber;
        }

        /**
         * Sets the value of the notificationFullNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotificationFullNumber(String value) {
            this.notificationFullNumber = value;
        }

        /**
         * Gets the value of the notificationFullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationFullName() {
            return notificationFullName;
        }

        /**
         * Sets the value of the notificationFullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotificationFullName(String value) {
            this.notificationFullName = value;
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
         *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
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
            "responsibleRole"
        })
        public static class PurchaseResponsible {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOrganizationRef responsibleOrg;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsResponsibleRoleType responsibleRole;

            /**
             * Gets the value of the responsibleOrg property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public ZfcsOrganizationRef getResponsibleOrg() {
                return responsibleOrg;
            }

            /**
             * Sets the value of the responsibleOrg property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public void setResponsibleOrg(ZfcsOrganizationRef value) {
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

        }

    }

}
