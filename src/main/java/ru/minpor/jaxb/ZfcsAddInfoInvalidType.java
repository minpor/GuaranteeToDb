
package ru.minpor.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о недействительности записи реестра дополнительной информации
 * 
 * <p>Java class for zfcs_addInfoInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_addInfoInvalidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="registryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *         &lt;element name="publishOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.printFormType" minOccurs="0"/>
 *         &lt;element name="infoType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_addInfoTypeEnum" minOccurs="0"/>
 *         &lt;element name="invalidityInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="contract" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *                     &lt;element name="number" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="30"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;sequence>
 *             &lt;element name="purchase" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                       &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                       &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                       &lt;element name="placingWay" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayCodeType"/>
 *                                 &lt;element name="name" minOccurs="0">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;maxLength value="500"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="contractor" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;choice>
 *                       &lt;element name="organizationRF">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                 &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                 &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innOrganizationType"/>
 *                                 &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="personRF">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
 *                                 &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innPersonType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="organizationForeignState">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                 &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                 &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType"/>
 *                                 &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="personForeignState">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
 *                                 &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_addInfoInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "externalId",
    "id",
    "registryNum",
    "publishOrg",
    "versionNumber",
    "docPublishDate",
    "firstPublishDate",
    "href",
    "printForm",
    "infoType",
    "invalidityInfo",
    "contract",
    "purchase",
    "contractor",
    "attachments",
    "extPrintForm"
})
public class ZfcsAddInfoInvalidType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String registryNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsOrganizationInfoType publishOrg;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsAddInfoTypeEnum infoType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsAddInfoInvalidType.InvalidityInfo invalidityInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAddInfoInvalidType.Contract contract;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAddInfoInvalidType.Purchase purchase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAddInfoInvalidType.Contractor contractor;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

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
     * Gets the value of the registryNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNum() {
        return registryNum;
    }

    /**
     * Sets the value of the registryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNum(String value) {
        this.registryNum = value;
    }

    /**
     * Gets the value of the publishOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getPublishOrg() {
        return publishOrg;
    }

    /**
     * Sets the value of the publishOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setPublishOrg(ZfcsOrganizationInfoType value) {
        this.publishOrg = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
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
     * Gets the value of the firstPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPublishDate() {
        return firstPublishDate;
    }

    /**
     * Sets the value of the firstPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPublishDate(XMLGregorianCalendar value) {
        this.firstPublishDate = value;
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
     *     {@link ZfcsContractPrintFormType }
     *     
     */
    public ZfcsContractPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsContractPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoTypeEnum }
     *     
     */
    public ZfcsAddInfoTypeEnum getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoTypeEnum }
     *     
     */
    public void setInfoType(ZfcsAddInfoTypeEnum value) {
        this.infoType = value;
    }

    /**
     * Gets the value of the invalidityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoInvalidType.InvalidityInfo }
     *     
     */
    public ZfcsAddInfoInvalidType.InvalidityInfo getInvalidityInfo() {
        return invalidityInfo;
    }

    /**
     * Sets the value of the invalidityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoInvalidType.InvalidityInfo }
     *     
     */
    public void setInvalidityInfo(ZfcsAddInfoInvalidType.InvalidityInfo value) {
        this.invalidityInfo = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoInvalidType.Contract }
     *     
     */
    public ZfcsAddInfoInvalidType.Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoInvalidType.Contract }
     *     
     */
    public void setContract(ZfcsAddInfoInvalidType.Contract value) {
        this.contract = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoInvalidType.Purchase }
     *     
     */
    public ZfcsAddInfoInvalidType.Purchase getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoInvalidType.Purchase }
     *     
     */
    public void setPurchase(ZfcsAddInfoInvalidType.Purchase value) {
        this.purchase = value;
    }

    /**
     * Gets the value of the contractor property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoInvalidType.Contractor }
     *     
     */
    public ZfcsAddInfoInvalidType.Contractor getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoInvalidType.Contractor }
     *     
     */
    public void setContractor(ZfcsAddInfoInvalidType.Contractor value) {
        this.contractor = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
     *         &lt;element name="number" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType" minOccurs="0"/>
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
        "regNum",
        "number",
        "signDate",
        "customer"
    })
    public static class Contract {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String regNum;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String number;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationInfoType customer;

        /**
         * Gets the value of the regNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegNum() {
            return regNum;
        }

        /**
         * Sets the value of the regNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegNum(String value) {
            this.regNum = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
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
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationInfoType }
         *     
         */
        public ZfcsOrganizationInfoType getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationInfoType }
         *     
         */
        public void setCustomer(ZfcsOrganizationInfoType value) {
            this.customer = value;
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
     *         &lt;element name="organizationRF">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innOrganizationType"/>
     *                   &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="personRF">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
     *                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innPersonType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="organizationForeignState">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType"/>
     *                   &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="personForeignState">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
     *                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType"/>
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
        "organizationRF",
        "personRF",
        "organizationForeignState",
        "personForeignState"
    })
    public static class Contractor {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAddInfoInvalidType.Contractor.OrganizationRF organizationRF;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAddInfoInvalidType.Contractor.PersonRF personRF;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAddInfoInvalidType.Contractor.OrganizationForeignState organizationForeignState;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAddInfoInvalidType.Contractor.PersonForeignState personForeignState;

        /**
         * Gets the value of the organizationRF property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.OrganizationRF }
         *     
         */
        public ZfcsAddInfoInvalidType.Contractor.OrganizationRF getOrganizationRF() {
            return organizationRF;
        }

        /**
         * Sets the value of the organizationRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.OrganizationRF }
         *     
         */
        public void setOrganizationRF(ZfcsAddInfoInvalidType.Contractor.OrganizationRF value) {
            this.organizationRF = value;
        }

        /**
         * Gets the value of the personRF property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.PersonRF }
         *     
         */
        public ZfcsAddInfoInvalidType.Contractor.PersonRF getPersonRF() {
            return personRF;
        }

        /**
         * Sets the value of the personRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.PersonRF }
         *     
         */
        public void setPersonRF(ZfcsAddInfoInvalidType.Contractor.PersonRF value) {
            this.personRF = value;
        }

        /**
         * Gets the value of the organizationForeignState property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.OrganizationForeignState }
         *     
         */
        public ZfcsAddInfoInvalidType.Contractor.OrganizationForeignState getOrganizationForeignState() {
            return organizationForeignState;
        }

        /**
         * Sets the value of the organizationForeignState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.OrganizationForeignState }
         *     
         */
        public void setOrganizationForeignState(ZfcsAddInfoInvalidType.Contractor.OrganizationForeignState value) {
            this.organizationForeignState = value;
        }

        /**
         * Gets the value of the personForeignState property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.PersonForeignState }
         *     
         */
        public ZfcsAddInfoInvalidType.Contractor.PersonForeignState getPersonForeignState() {
            return personForeignState;
        }

        /**
         * Sets the value of the personForeignState property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoInvalidType.Contractor.PersonForeignState }
         *     
         */
        public void setPersonForeignState(ZfcsAddInfoInvalidType.Contractor.PersonForeignState value) {
            this.personForeignState = value;
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
         *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType"/>
         *         &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
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
            "fullName",
            "firmName",
            "inn",
            "kpp"
        })
        public static class OrganizationForeignState {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String fullName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String firmName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String inn;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String kpp;

            /**
             * Gets the value of the fullName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * Sets the value of the fullName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

            /**
             * Gets the value of the firmName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirmName() {
                return firmName;
            }

            /**
             * Sets the value of the firmName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirmName(String value) {
                this.firmName = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInn(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKpp() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKpp(String value) {
                this.kpp = value;
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
         *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innOrganizationType"/>
         *         &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
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
            "fullName",
            "firmName",
            "inn",
            "kpp"
        })
        public static class OrganizationRF {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String fullName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String firmName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String inn;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String kpp;

            /**
             * Gets the value of the fullName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * Sets the value of the fullName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

            /**
             * Gets the value of the firmName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirmName() {
                return firmName;
            }

            /**
             * Sets the value of the firmName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirmName(String value) {
                this.firmName = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInn(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKpp() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKpp(String value) {
                this.kpp = value;
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
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
         *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innAnalogType"/>
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
            "name",
            "inn"
        })
        public static class PersonForeignState {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContactPersonType name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String inn;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContactPersonType }
             *     
             */
            public ZfcsContactPersonType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContactPersonType }
             *     
             */
            public void setName(ZfcsContactPersonType value) {
                this.name = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInn(String value) {
                this.inn = value;
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
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
         *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innPersonType" minOccurs="0"/>
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
            "name",
            "inn"
        })
        public static class PersonRF {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsContactPersonType name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String inn;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContactPersonType }
             *     
             */
            public ZfcsContactPersonType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContactPersonType }
             *     
             */
            public void setName(ZfcsContactPersonType value) {
                this.name = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInn(String value) {
                this.inn = value;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
        "date",
        "reason"
    })
    public static class InvalidityInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String reason;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
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
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="placingWay" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayCodeType"/>
     *                   &lt;element name="name" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType" minOccurs="0"/>
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
        "purchaseNumber",
        "lotNumber",
        "purchaseObjectInfo",
        "placingWay",
        "customer"
    })
    public static class Purchase {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String purchaseNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected BigInteger lotNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String purchaseObjectInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAddInfoInvalidType.Purchase.PlacingWay placingWay;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationInfoType customer;

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
         *     {@link ZfcsAddInfoInvalidType.Purchase.PlacingWay }
         *     
         */
        public ZfcsAddInfoInvalidType.Purchase.PlacingWay getPlacingWay() {
            return placingWay;
        }

        /**
         * Sets the value of the placingWay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoInvalidType.Purchase.PlacingWay }
         *     
         */
        public void setPlacingWay(ZfcsAddInfoInvalidType.Purchase.PlacingWay value) {
            this.placingWay = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationInfoType }
         *     
         */
        public ZfcsOrganizationInfoType getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationInfoType }
         *     
         */
        public void setCustomer(ZfcsOrganizationInfoType value) {
            this.customer = value;
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
         *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayCodeType"/>
         *         &lt;element name="name" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="500"/>
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
            "code",
            "name"
        })
        public static class PlacingWay {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String code;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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

        }

    }

}
