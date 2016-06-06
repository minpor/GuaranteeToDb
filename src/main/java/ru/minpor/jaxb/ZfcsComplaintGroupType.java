
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
 * Информация по групповой жалобе
 * 
 * <p>Java class for zfcs_complaintGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCommonInfoType"/>
 *         &lt;element name="indicted" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="text" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="complaintGroupItems" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemComplaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
 *                   &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
 *                   &lt;element name="applicant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantType" minOccurs="0"/>
 *                   &lt;element name="applicantNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantNewType" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
 *                     &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
 *                   &lt;/choice>
 *                   &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
 *                   &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *         &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
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
@XmlType(name = "zfcs_complaintGroupType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "indicted",
    "text",
    "complaintGroupItems",
    "printForm",
    "extPrintForm",
    "attachments",
    "returnInfo"
})
public class ZfcsComplaintGroupType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsComplaintCommonInfoType commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsComplaintGroupType.Indicted> indicted;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String text;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsComplaintGroupType.ComplaintGroupItems> complaintGroupItems;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsControlRegistersAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsComplaintReturnInfoType returnInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintCommonInfoType }
     *     
     */
    public ZfcsComplaintCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintCommonInfoType }
     *     
     */
    public void setCommonInfo(ZfcsComplaintCommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the indicted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsComplaintGroupType.Indicted }
     * 
     * 
     */
    public List<ZfcsComplaintGroupType.Indicted> getIndicted() {
        if (indicted == null) {
            indicted = new ArrayList<ZfcsComplaintGroupType.Indicted>();
        }
        return this.indicted;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the complaintGroupItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complaintGroupItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplaintGroupItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsComplaintGroupType.ComplaintGroupItems }
     * 
     * 
     */
    public List<ZfcsComplaintGroupType.ComplaintGroupItems> getComplaintGroupItems() {
        if (complaintGroupItems == null) {
            complaintGroupItems = new ArrayList<ZfcsComplaintGroupType.ComplaintGroupItems>();
        }
        return this.complaintGroupItems;
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
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public ZfcsControlRegistersAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the returnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintReturnInfoType }
     *     
     */
    public ZfcsComplaintReturnInfoType getReturnInfo() {
        return returnInfo;
    }

    /**
     * Sets the value of the returnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintReturnInfoType }
     *     
     */
    public void setReturnInfo(ZfcsComplaintReturnInfoType value) {
        this.returnInfo = value;
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
     *         &lt;element name="itemComplaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
     *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType" minOccurs="0"/>
     *         &lt;element name="applicant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantType" minOccurs="0"/>
     *         &lt;element name="applicantNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantNewType" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
     *           &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
     *         &lt;/choice>
     *         &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
     *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
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
        "itemComplaintNumber",
        "regNumber",
        "regDate",
        "notice",
        "purchaseCode",
        "applicant",
        "applicantNew",
        "order",
        "purchase",
        "returnInfo",
        "attachments"
    })
    public static class ComplaintGroupItems {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String itemComplaintNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String regNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar regDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsNoticeDetailsType notice;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String purchaseCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsApplicantType applicant;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsApplicantNewType applicantNew;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsComplaintOrderType order;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsComplaintPurchaseType purchase;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsComplaintReturnInfoType returnInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsControlRegistersAttachmentListType attachments;

        /**
         * Gets the value of the itemComplaintNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemComplaintNumber() {
            return itemComplaintNumber;
        }

        /**
         * Sets the value of the itemComplaintNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemComplaintNumber(String value) {
            this.itemComplaintNumber = value;
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
         * Gets the value of the regDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegDate() {
            return regDate;
        }

        /**
         * Sets the value of the regDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegDate(XMLGregorianCalendar value) {
            this.regDate = value;
        }

        /**
         * Gets the value of the notice property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public ZfcsNoticeDetailsType getNotice() {
            return notice;
        }

        /**
         * Sets the value of the notice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public void setNotice(ZfcsNoticeDetailsType value) {
            this.notice = value;
        }

        /**
         * Gets the value of the purchaseCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseCode() {
            return purchaseCode;
        }

        /**
         * Sets the value of the purchaseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseCode(String value) {
            this.purchaseCode = value;
        }

        /**
         * Gets the value of the applicant property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantType }
         *     
         */
        public ZfcsApplicantType getApplicant() {
            return applicant;
        }

        /**
         * Sets the value of the applicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantType }
         *     
         */
        public void setApplicant(ZfcsApplicantType value) {
            this.applicant = value;
        }

        /**
         * Gets the value of the applicantNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantNewType }
         *     
         */
        public ZfcsApplicantNewType getApplicantNew() {
            return applicantNew;
        }

        /**
         * Sets the value of the applicantNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantNewType }
         *     
         */
        public void setApplicantNew(ZfcsApplicantNewType value) {
            this.applicantNew = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintOrderType }
         *     
         */
        public ZfcsComplaintOrderType getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintOrderType }
         *     
         */
        public void setOrder(ZfcsComplaintOrderType value) {
            this.order = value;
        }

        /**
         * Gets the value of the purchase property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintPurchaseType }
         *     
         */
        public ZfcsComplaintPurchaseType getPurchase() {
            return purchase;
        }

        /**
         * Sets the value of the purchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintPurchaseType }
         *     
         */
        public void setPurchase(ZfcsComplaintPurchaseType value) {
            this.purchase = value;
        }

        /**
         * Gets the value of the returnInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintReturnInfoType }
         *     
         */
        public ZfcsComplaintReturnInfoType getReturnInfo() {
            return returnInfo;
        }

        /**
         * Sets the value of the returnInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintReturnInfoType }
         *     
         */
        public void setReturnInfo(ZfcsComplaintReturnInfoType value) {
            this.returnInfo = value;
        }

        /**
         * Gets the value of the attachments property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsControlRegistersAttachmentListType }
         *     
         */
        public ZfcsControlRegistersAttachmentListType getAttachments() {
            return attachments;
        }

        /**
         * Sets the value of the attachments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsControlRegistersAttachmentListType }
         *     
         */
        public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
            this.attachments = value;
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
     *           &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
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
        "epFailure",
        "epFailureNew"
    })
    public static class Indicted {

        @XmlElement(name = "EP_failure", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationRef epFailure;
        @XmlElement(name = "EP_failureNew", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOrganizationControlRegistersRef epFailureNew;

        /**
         * Gets the value of the epFailure property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getEPFailure() {
            return epFailure;
        }

        /**
         * Sets the value of the epFailure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setEPFailure(ZfcsOrganizationRef value) {
            this.epFailure = value;
        }

        /**
         * Gets the value of the epFailureNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getEPFailureNew() {
            return epFailureNew;
        }

        /**
         * Sets the value of the epFailureNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setEPFailureNew(ZfcsOrganizationControlRegistersRef value) {
            this.epFailureNew = value;
        }

    }

}
