
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
 * Сведения о недействительности типового контракта, типовых условий контракта 
 * 
 * <p>Java class for zfcs_standardContractInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_standardContractInvalidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="standardContractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractNumberType"/>
 *         &lt;element name="placerOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractTypeEnum" minOccurs="0"/>
 *         &lt;element name="approveInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="document">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
 *                             &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *         &lt;element name="indications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
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
 *                                         &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
 *                                         &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                                         &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
 *                   &lt;element name="contractPrice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="minPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                             &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherIndicators" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="useCases" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="useTerms" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="requiredTerms" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="okpd2okved2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="invalidityInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
@XmlType(name = "zfcs_standardContractInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "docPublishDate",
    "standardContractNumber",
    "placerOrganization",
    "type",
    "approveInfo",
    "indications",
    "useCases",
    "okpd2Okved2",
    "printForm",
    "attachments",
    "invalidityInfo"
})
public class ZfcsStandardContractInvalidType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String standardContractNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseOrganizationType placerOrganization;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsStandardContractTypeEnum type;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsStandardContractInvalidType.ApproveInfo approveInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsStandardContractInvalidType.Indications indications;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsStandardContractInvalidType.UseCases useCases;
    @XmlElement(name = "okpd2okved2", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean okpd2Okved2;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsStandardContractInvalidType.InvalidityInfo invalidityInfo;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Gets the value of the placerOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public ZfcsPurchaseOrganizationType getPlacerOrganization() {
        return placerOrganization;
    }

    /**
     * Sets the value of the placerOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public void setPlacerOrganization(ZfcsPurchaseOrganizationType value) {
        this.placerOrganization = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStandardContractTypeEnum }
     *     
     */
    public ZfcsStandardContractTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStandardContractTypeEnum }
     *     
     */
    public void setType(ZfcsStandardContractTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the approveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStandardContractInvalidType.ApproveInfo }
     *     
     */
    public ZfcsStandardContractInvalidType.ApproveInfo getApproveInfo() {
        return approveInfo;
    }

    /**
     * Sets the value of the approveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStandardContractInvalidType.ApproveInfo }
     *     
     */
    public void setApproveInfo(ZfcsStandardContractInvalidType.ApproveInfo value) {
        this.approveInfo = value;
    }

    /**
     * Gets the value of the indications property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStandardContractInvalidType.Indications }
     *     
     */
    public ZfcsStandardContractInvalidType.Indications getIndications() {
        return indications;
    }

    /**
     * Sets the value of the indications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStandardContractInvalidType.Indications }
     *     
     */
    public void setIndications(ZfcsStandardContractInvalidType.Indications value) {
        this.indications = value;
    }

    /**
     * Gets the value of the useCases property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStandardContractInvalidType.UseCases }
     *     
     */
    public ZfcsStandardContractInvalidType.UseCases getUseCases() {
        return useCases;
    }

    /**
     * Sets the value of the useCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStandardContractInvalidType.UseCases }
     *     
     */
    public void setUseCases(ZfcsStandardContractInvalidType.UseCases value) {
        this.useCases = value;
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
     * Gets the value of the invalidityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStandardContractInvalidType.InvalidityInfo }
     *     
     */
    public ZfcsStandardContractInvalidType.InvalidityInfo getInvalidityInfo() {
        return invalidityInfo;
    }

    /**
     * Sets the value of the invalidityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStandardContractInvalidType.InvalidityInfo }
     *     
     */
    public void setInvalidityInfo(ZfcsStandardContractInvalidType.InvalidityInfo value) {
        this.invalidityInfo = value;
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
     *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="document">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
     *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "organization",
        "date",
        "document"
    })
    public static class ApproveInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseOrganizationType organization;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsStandardContractInvalidType.ApproveInfo.Document document;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public ZfcsPurchaseOrganizationType getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public void setOrganization(ZfcsPurchaseOrganizationType value) {
            this.organization = value;
        }

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
         * Gets the value of the document property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsStandardContractInvalidType.ApproveInfo.Document }
         *     
         */
        public ZfcsStandardContractInvalidType.ApproveInfo.Document getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsStandardContractInvalidType.ApproveInfo.Document }
         *     
         */
        public void setDocument(ZfcsStandardContractInvalidType.ApproveInfo.Document value) {
            this.document = value;
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
         *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "number",
            "name",
            "date"
        })
        public static class Document {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String number;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String name;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar date;

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
     *                               &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
     *                               &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                               &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
     *                             &lt;/choice>
     *                             &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
     *         &lt;element name="contractPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="minPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                   &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherIndicators" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "purchaseObjects",
        "contractPrice",
        "otherIndicators"
    })
    public static class Indications {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsStandardContractInvalidType.Indications.PurchaseObjects purchaseObjects;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsStandardContractInvalidType.Indications.ContractPrice contractPrice;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String otherIndicators;

        /**
         * Gets the value of the purchaseObjects property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsStandardContractInvalidType.Indications.PurchaseObjects }
         *     
         */
        public ZfcsStandardContractInvalidType.Indications.PurchaseObjects getPurchaseObjects() {
            return purchaseObjects;
        }

        /**
         * Sets the value of the purchaseObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsStandardContractInvalidType.Indications.PurchaseObjects }
         *     
         */
        public void setPurchaseObjects(ZfcsStandardContractInvalidType.Indications.PurchaseObjects value) {
            this.purchaseObjects = value;
        }

        /**
         * Gets the value of the contractPrice property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsStandardContractInvalidType.Indications.ContractPrice }
         *     
         */
        public ZfcsStandardContractInvalidType.Indications.ContractPrice getContractPrice() {
            return contractPrice;
        }

        /**
         * Sets the value of the contractPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsStandardContractInvalidType.Indications.ContractPrice }
         *     
         */
        public void setContractPrice(ZfcsStandardContractInvalidType.Indications.ContractPrice value) {
            this.contractPrice = value;
        }

        /**
         * Gets the value of the otherIndicators property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherIndicators() {
            return otherIndicators;
        }

        /**
         * Sets the value of the otherIndicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherIndicators(String value) {
            this.otherIndicators = value;
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
         *         &lt;element name="minPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *         &lt;element name="maxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
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
            "minPrice",
            "maxPrice"
        })
        public static class ContractPrice {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String minPrice;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String maxPrice;

            /**
             * Gets the value of the minPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinPrice() {
                return minPrice;
            }

            /**
             * Sets the value of the minPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinPrice(String value) {
                this.minPrice = value;
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
         *                     &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
         *                     &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *                     &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
         *                   &lt;/choice>
         *                   &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
            "purchaseObject"
        })
        public static class PurchaseObjects {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsStandardContractInvalidType.Indications.PurchaseObjects.PurchaseObject> purchaseObject;

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
             * {@link ZfcsStandardContractInvalidType.Indications.PurchaseObjects.PurchaseObject }
             * 
             * 
             */
            public List<ZfcsStandardContractInvalidType.Indications.PurchaseObjects.PurchaseObject> getPurchaseObject() {
                if (purchaseObject == null) {
                    purchaseObject = new ArrayList<ZfcsStandardContractInvalidType.Indications.PurchaseObjects.PurchaseObject>();
                }
                return this.purchaseObject;
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
             *           &lt;element name="OKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
             *           &lt;element name="OKVED2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKVEDRef"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="OKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
             *           &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPDRef"/>
             *         &lt;/choice>
             *         &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
                "okved",
                "okved2",
                "okpd",
                "okpd2",
                "description"
            })
            public static class PurchaseObject {

                @XmlElement(name = "OKVED", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKVEDRef okved;
                @XmlElement(name = "OKVED2", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKVEDRef okved2;
                @XmlElement(name = "OKPD", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKPDRef okpd;
                @XmlElement(name = "OKPD2", namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsOKPDRef okpd2;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String description;

                /**
                 * Gets the value of the okved property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOKVEDRef }
                 *     
                 */
                public ZfcsOKVEDRef getOKVED() {
                    return okved;
                }

                /**
                 * Sets the value of the okved property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOKVEDRef }
                 *     
                 */
                public void setOKVED(ZfcsOKVEDRef value) {
                    this.okved = value;
                }

                /**
                 * Gets the value of the okved2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsOKVEDRef }
                 *     
                 */
                public ZfcsOKVEDRef getOKVED2() {
                    return okved2;
                }

                /**
                 * Sets the value of the okved2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsOKVEDRef }
                 *     
                 */
                public void setOKVED2(ZfcsOKVEDRef value) {
                    this.okved2 = value;
                }

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
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
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
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="useTerms" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="requiredTerms" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "type",
        "useTerms",
        "addInfo",
        "requiredTerms"
    })
    public static class UseCases {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<String> type;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String useTerms;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String addInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String requiredTerms;

        /**
         * Gets the value of the type property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the type property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getType() {
            if (type == null) {
                type = new ArrayList<String>();
            }
            return this.type;
        }

        /**
         * Gets the value of the useTerms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseTerms() {
            return useTerms;
        }

        /**
         * Sets the value of the useTerms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseTerms(String value) {
            this.useTerms = value;
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
         * Gets the value of the requiredTerms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequiredTerms() {
            return requiredTerms;
        }

        /**
         * Sets the value of the requiredTerms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequiredTerms(String value) {
            this.requiredTerms = value;
        }

    }

}
