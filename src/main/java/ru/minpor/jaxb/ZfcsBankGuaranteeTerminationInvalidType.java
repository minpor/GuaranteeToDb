
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о недействительности информации о прекращении обязательств поставщика по банковской гарантии
 * 
 * <p>Java class for zfcs_bankGuaranteeTerminationInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeTerminationInvalidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="terminationDocNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bankGuaranteeTerminationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bank" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType" minOccurs="0"/>
 *                   &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
 *                   &lt;element name="guarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType" minOccurs="0"/>
 *                   &lt;element name="bankGuaranteeTermination" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedure2015BankGuaranteeTerminationType">
 *                           &lt;sequence>
 *                             &lt;element name="terminationPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "zfcs_bankGuaranteeTerminationInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "externalId",
    "terminationDocNumber",
    "docNumber",
    "docPublishDate",
    "bankGuaranteeTerminationInfo",
    "href",
    "printForm",
    "extPrintForm",
    "attachments",
    "reason"
})
public class ZfcsBankGuaranteeTerminationInvalidType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String terminationDocNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String docNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo bankGuaranteeTerminationInfo;
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
     * Gets the value of the terminationDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationDocNumber() {
        return terminationDocNumber;
    }

    /**
     * Sets the value of the terminationDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationDocNumber(String value) {
        this.terminationDocNumber = value;
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
     * Gets the value of the bankGuaranteeTerminationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo }
     *     
     */
    public ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo getBankGuaranteeTerminationInfo() {
        return bankGuaranteeTerminationInfo;
    }

    /**
     * Sets the value of the bankGuaranteeTerminationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo }
     *     
     */
    public void setBankGuaranteeTerminationInfo(ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo value) {
        this.bankGuaranteeTerminationInfo = value;
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
     *         &lt;element name="bankGuaranteeTermination" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedure2015BankGuaranteeTerminationType">
     *                 &lt;sequence>
     *                   &lt;element name="terminationPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "bank",
        "supplierInfo",
        "guarantee",
        "bankGuaranteeTermination"
    })
    public static class BankGuaranteeTerminationInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeOrganizationType bank;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeParticipantType supplierInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeInfoType guarantee;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo.BankGuaranteeTermination bankGuaranteeTermination;

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
         * Gets the value of the bankGuaranteeTermination property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo.BankGuaranteeTermination }
         *     
         */
        public ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo.BankGuaranteeTermination getBankGuaranteeTermination() {
            return bankGuaranteeTermination;
        }

        /**
         * Sets the value of the bankGuaranteeTermination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo.BankGuaranteeTermination }
         *     
         */
        public void setBankGuaranteeTermination(ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo.BankGuaranteeTermination value) {
            this.bankGuaranteeTermination = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedure2015BankGuaranteeTerminationType">
         *       &lt;sequence>
         *         &lt;element name="terminationPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "terminationPublishDate"
        })
        public static class BankGuaranteeTermination
            extends ZfcsContractProcedure2015BankGuaranteeTerminationType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar terminationPublishDate;

            /**
             * Gets the value of the terminationPublishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTerminationPublishDate() {
                return terminationPublishDate;
            }

            /**
             * Sets the value of the terminationPublishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTerminationPublishDate(XMLGregorianCalendar value) {
                this.terminationPublishDate = value;
            }

        }

    }

}
