
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о недействительности сведений о банковской гарантии
 * 
 * <p>Java class for zfcs_bankGuaranteeInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeInvalidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="guaranteeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bank" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType" minOccurs="0"/>
 *                   &lt;element name="placingOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType" minOccurs="0"/>
 *                   &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
 *                   &lt;element name="guarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="documents" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_bankGuaranteeInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "regNumber",
    "docNumber",
    "docPublishDate",
    "reason",
    "guaranteeInfo",
    "href",
    "printForm",
    "documents"
})
public class ZfcsBankGuaranteeInvalidType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String regNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String docNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String reason;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeInvalidType.GuaranteeInfo guaranteeInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType documents;
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
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
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

    /**
     * Gets the value of the guaranteeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeInvalidType.GuaranteeInfo }
     *     
     */
    public ZfcsBankGuaranteeInvalidType.GuaranteeInfo getGuaranteeInfo() {
        return guaranteeInfo;
    }

    /**
     * Sets the value of the guaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeInvalidType.GuaranteeInfo }
     *     
     */
    public void setGuaranteeInfo(ZfcsBankGuaranteeInvalidType.GuaranteeInfo value) {
        this.guaranteeInfo = value;
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
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setDocuments(ZfcsAttachmentListType value) {
        this.documents = value;
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
     *         &lt;element name="bank" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType" minOccurs="0"/>
     *         &lt;element name="placingOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType" minOccurs="0"/>
     *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
     *         &lt;element name="guarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType" minOccurs="0"/>
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
        "bank",
        "placingOrg",
        "supplierInfo",
        "guarantee"
    })
    public static class GuaranteeInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeOrganizationType bank;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeOrganizationType placingOrg;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeParticipantType supplierInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeInfoType guarantee;

        /**
         * Gets the value of the bank property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeOrganizationType }
         *     
         */
        public ZfcsBankGuaranteeOrganizationType getBank() {
            return bank;
        }

        /**
         * Sets the value of the bank property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeOrganizationType }
         *     
         */
        public void setBank(ZfcsBankGuaranteeOrganizationType value) {
            this.bank = value;
        }

        /**
         * Gets the value of the placingOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeOrganizationType }
         *     
         */
        public ZfcsBankGuaranteeOrganizationType getPlacingOrg() {
            return placingOrg;
        }

        /**
         * Sets the value of the placingOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeOrganizationType }
         *     
         */
        public void setPlacingOrg(ZfcsBankGuaranteeOrganizationType value) {
            this.placingOrg = value;
        }

        /**
         * Gets the value of the supplierInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeParticipantType }
         *     
         */
        public ZfcsBankGuaranteeParticipantType getSupplierInfo() {
            return supplierInfo;
        }

        /**
         * Sets the value of the supplierInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeParticipantType }
         *     
         */
        public void setSupplierInfo(ZfcsBankGuaranteeParticipantType value) {
            this.supplierInfo = value;
        }

        /**
         * Gets the value of the guarantee property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeInfoType }
         *     
         */
        public ZfcsBankGuaranteeInfoType getGuarantee() {
            return guarantee;
        }

        /**
         * Sets the value of the guarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeInfoType }
         *     
         */
        public void setGuarantee(ZfcsBankGuaranteeInfoType value) {
            this.guarantee = value;
        }

    }

}
