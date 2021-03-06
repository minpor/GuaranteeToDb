
package ru.minpor.jaxb;

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
 * Сведения о недействительности отказа заказчика в принятии банковской гарантии
 * 
 * <p>Java class for zfcs_bankGuaranteeRefusalInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeRefusalInvalidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="refusalDocNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bankGuaranteeRefusalInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bank" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType" minOccurs="0"/>
 *                   &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
 *                   &lt;element name="guarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType" minOccurs="0"/>
 *                   &lt;element name="refusalInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="refusalPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="docNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="docName" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="250"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="refusalReasons">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="refusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefReasonType" maxOccurs="unbounded"/>
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
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
@XmlType(name = "zfcs_bankGuaranteeRefusalInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "refusalDocNumber",
    "docNumber",
    "docPublishDate",
    "bankGuaranteeRefusalInfo",
    "href",
    "printForm",
    "extPrintForm",
    "attachments",
    "reason"
})
public class ZfcsBankGuaranteeRefusalInvalidType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String refusalDocNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String docNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo bankGuaranteeRefusalInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String reason;
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
     * Gets the value of the refusalDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefusalDocNumber() {
        return refusalDocNumber;
    }

    /**
     * Sets the value of the refusalDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefusalDocNumber(String value) {
        this.refusalDocNumber = value;
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
     * Gets the value of the bankGuaranteeRefusalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo }
     *     
     */
    public ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo getBankGuaranteeRefusalInfo() {
        return bankGuaranteeRefusalInfo;
    }

    /**
     * Sets the value of the bankGuaranteeRefusalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo }
     *     
     */
    public void setBankGuaranteeRefusalInfo(ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo value) {
        this.bankGuaranteeRefusalInfo = value;
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
     *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
     *         &lt;element name="guarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType" minOccurs="0"/>
     *         &lt;element name="refusalInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="refusalPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="docNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="docName" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="250"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="refusalReasons">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="refusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefReasonType" maxOccurs="unbounded"/>
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
        "bank",
        "supplierInfo",
        "guarantee",
        "refusalInfo"
    })
    public static class BankGuaranteeRefusalInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeOrganizationType bank;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeParticipantType supplierInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeInfoType guarantee;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo refusalInfo;

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

        /**
         * Gets the value of the refusalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo }
         *     
         */
        public ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo getRefusalInfo() {
            return refusalInfo;
        }

        /**
         * Sets the value of the refusalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo }
         *     
         */
        public void setRefusalInfo(ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo value) {
            this.refusalInfo = value;
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
         *         &lt;element name="refusalPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="docNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="docName" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="250"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="refusalReasons">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="refusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefReasonType" maxOccurs="unbounded"/>
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
            "refusalPublishDate",
            "docDate",
            "docNumber",
            "docName",
            "refusalReasons"
        })
        public static class RefusalInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar refusalPublishDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar docDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String docNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String docName;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo.RefusalReasons refusalReasons;

            /**
             * Gets the value of the refusalPublishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRefusalPublishDate() {
                return refusalPublishDate;
            }

            /**
             * Sets the value of the refusalPublishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRefusalPublishDate(XMLGregorianCalendar value) {
                this.refusalPublishDate = value;
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
             * Gets the value of the refusalReasons property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo.RefusalReasons }
             *     
             */
            public ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo.RefusalReasons getRefusalReasons() {
                return refusalReasons;
            }

            /**
             * Sets the value of the refusalReasons property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo.RefusalReasons }
             *     
             */
            public void setRefusalReasons(ZfcsBankGuaranteeRefusalInvalidType.BankGuaranteeRefusalInfo.RefusalInfo.RefusalReasons value) {
                this.refusalReasons = value;
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
             *         &lt;element name="refusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefReasonType" maxOccurs="unbounded"/>
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
                "refusalReason"
            })
            public static class RefusalReasons {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsBankGuaranteeRefReasonType> refusalReason;

                /**
                 * Gets the value of the refusalReason property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the refusalReason property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRefusalReason().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsBankGuaranteeRefReasonType }
                 * 
                 * 
                 */
                public List<ZfcsBankGuaranteeRefReasonType> getRefusalReason() {
                    if (refusalReason == null) {
                        refusalReason = new ArrayList<ZfcsBankGuaranteeRefReasonType>();
                    }
                    return this.refusalReason;
                }

            }

        }

    }

}
