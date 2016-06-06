
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Уведомление об изменении даты и времени проведения электронного аукциона 
 * 
 * <p>Java class for zfcs_notificationEFDateChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationEFDateChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="purchaseResponsible" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="placingWay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="auctionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="newAuctionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reason">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="authorityPrescription">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="reestrPrescription">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
 *                                         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType" minOccurs="0"/>
 *                                         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="externalPrescription">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                         &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
 *                                         &lt;element name="docName">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="1000"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                         &lt;element name="docNumber">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="100"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="courtDecision">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="courtName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                               &lt;element name="docName">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="1000"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                               &lt;element name="docNumber">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="100"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_notificationEFDateChangeType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "purchaseNumber",
    "docNumber",
    "docPublishDate",
    "purchaseResponsible",
    "purchaseObjectInfo",
    "placingWay",
    "auctionTime",
    "newAuctionDate",
    "reason",
    "href",
    "printForm",
    "extPrintForm"
})
public class ZfcsNotificationEFDateChangeType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String purchaseNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String docNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNotificationEFDateChangeType.PurchaseResponsible purchaseResponsible;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String purchaseObjectInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsNotificationEFDateChangeType.PlacingWay placingWay;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auctionTime;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar newAuctionDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNotificationEFDateChangeType.Reason reason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
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
     * Gets the value of the purchaseResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationEFDateChangeType.PurchaseResponsible }
     *     
     */
    public ZfcsNotificationEFDateChangeType.PurchaseResponsible getPurchaseResponsible() {
        return purchaseResponsible;
    }

    /**
     * Sets the value of the purchaseResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationEFDateChangeType.PurchaseResponsible }
     *     
     */
    public void setPurchaseResponsible(ZfcsNotificationEFDateChangeType.PurchaseResponsible value) {
        this.purchaseResponsible = value;
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
     * Gets the value of the placingWay property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationEFDateChangeType.PlacingWay }
     *     
     */
    public ZfcsNotificationEFDateChangeType.PlacingWay getPlacingWay() {
        return placingWay;
    }

    /**
     * Sets the value of the placingWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationEFDateChangeType.PlacingWay }
     *     
     */
    public void setPlacingWay(ZfcsNotificationEFDateChangeType.PlacingWay value) {
        this.placingWay = value;
    }

    /**
     * Gets the value of the auctionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuctionTime() {
        return auctionTime;
    }

    /**
     * Sets the value of the auctionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuctionTime(XMLGregorianCalendar value) {
        this.auctionTime = value;
    }

    /**
     * Gets the value of the newAuctionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewAuctionDate() {
        return newAuctionDate;
    }

    /**
     * Sets the value of the newAuctionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewAuctionDate(XMLGregorianCalendar value) {
        this.newAuctionDate = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationEFDateChangeType.Reason }
     *     
     */
    public ZfcsNotificationEFDateChangeType.Reason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationEFDateChangeType.Reason }
     *     
     */
    public void setReason(ZfcsNotificationEFDateChangeType.Reason value) {
        this.reason = value;
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
     *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType" minOccurs="0"/>
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
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
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
     *           &lt;element name="authorityPrescription">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;choice>
     *                     &lt;element name="reestrPrescription">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
     *                               &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType" minOccurs="0"/>
     *                               &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                               &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                               &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="externalPrescription">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                               &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
     *                               &lt;element name="docName">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;maxLength value="1000"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                               &lt;element name="docNumber">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;maxLength value="100"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="courtDecision">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="courtName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                     &lt;element name="docName">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="1000"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                     &lt;element name="docNumber">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="100"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "authorityPrescription",
        "courtDecision",
        "addInfo"
    })
    public static class Reason {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription authorityPrescription;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsNotificationEFDateChangeType.Reason.CourtDecision courtDecision;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String addInfo;

        /**
         * Gets the value of the authorityPrescription property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription }
         *     
         */
        public ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription getAuthorityPrescription() {
            return authorityPrescription;
        }

        /**
         * Sets the value of the authorityPrescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription }
         *     
         */
        public void setAuthorityPrescription(ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription value) {
            this.authorityPrescription = value;
        }

        /**
         * Gets the value of the courtDecision property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationEFDateChangeType.Reason.CourtDecision }
         *     
         */
        public ZfcsNotificationEFDateChangeType.Reason.CourtDecision getCourtDecision() {
            return courtDecision;
        }

        /**
         * Sets the value of the courtDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationEFDateChangeType.Reason.CourtDecision }
         *     
         */
        public void setCourtDecision(ZfcsNotificationEFDateChangeType.Reason.CourtDecision value) {
            this.courtDecision = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="reestrPrescription">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
         *                   &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType" minOccurs="0"/>
         *                   &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                   &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                   &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="externalPrescription">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                   &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
         *                   &lt;element name="docName">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="1000"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="docNumber">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "reestrPrescription",
            "externalPrescription"
        })
        public static class AuthorityPrescription {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ReestrPrescription reestrPrescription;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ExternalPrescription externalPrescription;

            /**
             * Gets the value of the reestrPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ReestrPrescription }
             *     
             */
            public ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ReestrPrescription getReestrPrescription() {
                return reestrPrescription;
            }

            /**
             * Sets the value of the reestrPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ReestrPrescription }
             *     
             */
            public void setReestrPrescription(ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ReestrPrescription value) {
                this.reestrPrescription = value;
            }

            /**
             * Gets the value of the externalPrescription property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ExternalPrescription }
             *     
             */
            public ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ExternalPrescription getExternalPrescription() {
                return externalPrescription;
            }

            /**
             * Sets the value of the externalPrescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ExternalPrescription }
             *     
             */
            public void setExternalPrescription(ZfcsNotificationEFDateChangeType.Reason.AuthorityPrescription.ExternalPrescription value) {
                this.externalPrescription = value;
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
             *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
             *         &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
             *         &lt;element name="docName">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="1000"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="docNumber">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "authorityName",
                "authorityType",
                "docName",
                "docDate",
                "docNumber"
            })
            public static class ExternalPrescription {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String authorityName;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "string")
                protected ZfcsModificationAuthorityType authorityType;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String docName;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar docDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String docNumber;

                /**
                 * Gets the value of the authorityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorityName() {
                    return authorityName;
                }

                /**
                 * Sets the value of the authorityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorityName(String value) {
                    this.authorityName = value;
                }

                /**
                 * Gets the value of the authorityType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsModificationAuthorityType }
                 *     
                 */
                public ZfcsModificationAuthorityType getAuthorityType() {
                    return authorityType;
                }

                /**
                 * Sets the value of the authorityType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsModificationAuthorityType }
                 *     
                 */
                public void setAuthorityType(ZfcsModificationAuthorityType value) {
                    this.authorityType = value;
                }

                /**
                 * Gets the value of the docName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocName() {
                    return docName;
                }

                /**
                 * Sets the value of the docName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocName(String value) {
                    this.docName = value;
                }

                /**
                 * Gets the value of the docDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDocDate() {
                    return docDate;
                }

                /**
                 * Sets the value of the docDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDocDate(XMLGregorianCalendar value) {
                    this.docDate = value;
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
             *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
             *         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType" minOccurs="0"/>
             *         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
                "checkResultNumber",
                "prescriptionNumber",
                "foundation",
                "authorityName",
                "docDate"
            })
            public static class ReestrPrescription {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String checkResultNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String prescriptionNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String foundation;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String authorityName;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar docDate;

                /**
                 * Gets the value of the checkResultNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCheckResultNumber() {
                    return checkResultNumber;
                }

                /**
                 * Sets the value of the checkResultNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCheckResultNumber(String value) {
                    this.checkResultNumber = value;
                }

                /**
                 * Gets the value of the prescriptionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrescriptionNumber() {
                    return prescriptionNumber;
                }

                /**
                 * Sets the value of the prescriptionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrescriptionNumber(String value) {
                    this.prescriptionNumber = value;
                }

                /**
                 * Gets the value of the foundation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFoundation() {
                    return foundation;
                }

                /**
                 * Sets the value of the foundation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFoundation(String value) {
                    this.foundation = value;
                }

                /**
                 * Gets the value of the authorityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorityName() {
                    return authorityName;
                }

                /**
                 * Sets the value of the authorityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorityName(String value) {
                    this.authorityName = value;
                }

                /**
                 * Gets the value of the docDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDocDate() {
                    return docDate;
                }

                /**
                 * Sets the value of the docDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDocDate(XMLGregorianCalendar value) {
                    this.docDate = value;
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
         *         &lt;element name="courtName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="docName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="docNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "courtName",
            "docName",
            "docDate",
            "docNumber"
        })
        public static class CourtDecision {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String courtName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String docName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar docDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String docNumber;

            /**
             * Gets the value of the courtName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourtName() {
                return courtName;
            }

            /**
             * Sets the value of the courtName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourtName(String value) {
                this.courtName = value;
            }

            /**
             * Gets the value of the docName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocName() {
                return docName;
            }

            /**
             * Sets the value of the docName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocName(String value) {
                this.docName = value;
            }

            /**
             * Gets the value of the docDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDocDate() {
                return docDate;
            }

            /**
             * Sets the value of the docDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDocDate(XMLGregorianCalendar value) {
                this.docDate = value;
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

        }

    }

}
