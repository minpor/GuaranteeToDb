
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о подписании государственного/муниципального контракта на ЭП
 * 
 * <p>Java class for zfcs_contractSignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractSignType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="foundation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="order">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                             &lt;element name="foundationProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
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
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *         &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *         &lt;element name="concludeContractRight" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="suppliers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="supplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="document" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publishedContentId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
 *                   &lt;element name="documentType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentType70ArticleType"/>
 *                   &lt;element name="fileName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1024"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fileSize" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="docDescription" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1024"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="url">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="1024"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="contentId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType"/>
 *                     &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                   &lt;/choice>
 *                   &lt;element name="customerSignature" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="supplierSignature" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="controlPersonalSignature" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
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
@XmlType(name = "zfcs_contractSignType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "number",
    "signDate",
    "foundation",
    "customer",
    "price",
    "priceRUR",
    "currency",
    "concludeContractRight",
    "protocolDate",
    "suppliers",
    "document"
})
public class ZfcsContractSignType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String number;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContractSignType.Foundation foundation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsOrganizationRef customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String price;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String priceRUR;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsCurrencyRef currency;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected boolean concludeContractRight;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsContractSignType.Suppliers suppliers;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContractSignType.Document document;
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
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractSignType.Foundation }
     *     
     */
    public ZfcsContractSignType.Foundation getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractSignType.Foundation }
     *     
     */
    public void setFoundation(ZfcsContractSignType.Foundation value) {
        this.foundation = value;
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
     * Gets the value of the priceRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRUR() {
        return priceRUR;
    }

    /**
     * Sets the value of the priceRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRUR(String value) {
        this.priceRUR = value;
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
     * Gets the value of the concludeContractRight property.
     * 
     */
    public boolean isConcludeContractRight() {
        return concludeContractRight;
    }

    /**
     * Sets the value of the concludeContractRight property.
     * 
     */
    public void setConcludeContractRight(boolean value) {
        this.concludeContractRight = value;
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
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractSignType.Suppliers }
     *     
     */
    public ZfcsContractSignType.Suppliers getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractSignType.Suppliers }
     *     
     */
    public void setSuppliers(ZfcsContractSignType.Suppliers value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractSignType.Document }
     *     
     */
    public ZfcsContractSignType.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractSignType.Document }
     *     
     */
    public void setDocument(ZfcsContractSignType.Document value) {
        this.document = value;
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
     *         &lt;element name="publishedContentId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
     *         &lt;element name="documentType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentType70ArticleType"/>
     *         &lt;element name="fileName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1024"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fileSize" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="40"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="docDescription" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1024"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="url">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 &lt;maxLength value="1024"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="contentId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType"/>
     *           &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *         &lt;/choice>
     *         &lt;element name="customerSignature" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                 &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="supplierSignature" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                 &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="controlPersonalSignature" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                 &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "publishedContentId",
        "documentType",
        "fileName",
        "fileSize",
        "docDescription",
        "url",
        "contentId",
        "content",
        "customerSignature",
        "supplierSignature",
        "controlPersonalSignature"
    })
    public static class Document {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String publishedContentId;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsDocumentType70ArticleType documentType;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fileName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String fileSize;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String docDescription;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String url;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String contentId;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected byte[] content;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractSignType.Document.CustomerSignature customerSignature;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractSignType.Document.SupplierSignature supplierSignature;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContractSignType.Document.ControlPersonalSignature controlPersonalSignature;

        /**
         * Gets the value of the publishedContentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublishedContentId() {
            return publishedContentId;
        }

        /**
         * Sets the value of the publishedContentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublishedContentId(String value) {
            this.publishedContentId = value;
        }

        /**
         * Gets the value of the documentType property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsDocumentType70ArticleType }
         *     
         */
        public ZfcsDocumentType70ArticleType getDocumentType() {
            return documentType;
        }

        /**
         * Sets the value of the documentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsDocumentType70ArticleType }
         *     
         */
        public void setDocumentType(ZfcsDocumentType70ArticleType value) {
            this.documentType = value;
        }

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the fileSize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileSize() {
            return fileSize;
        }

        /**
         * Sets the value of the fileSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileSize(String value) {
            this.fileSize = value;
        }

        /**
         * Gets the value of the docDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocDescription() {
            return docDescription;
        }

        /**
         * Sets the value of the docDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocDescription(String value) {
            this.docDescription = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the contentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentId() {
            return contentId;
        }

        /**
         * Sets the value of the contentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentId(String value) {
            this.contentId = value;
        }

        /**
         * Gets the value of the content property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getContent() {
            return content;
        }

        /**
         * Sets the value of the content property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setContent(byte[] value) {
            this.content = value;
        }

        /**
         * Gets the value of the customerSignature property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractSignType.Document.CustomerSignature }
         *     
         */
        public ZfcsContractSignType.Document.CustomerSignature getCustomerSignature() {
            return customerSignature;
        }

        /**
         * Sets the value of the customerSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractSignType.Document.CustomerSignature }
         *     
         */
        public void setCustomerSignature(ZfcsContractSignType.Document.CustomerSignature value) {
            this.customerSignature = value;
        }

        /**
         * Gets the value of the supplierSignature property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractSignType.Document.SupplierSignature }
         *     
         */
        public ZfcsContractSignType.Document.SupplierSignature getSupplierSignature() {
            return supplierSignature;
        }

        /**
         * Sets the value of the supplierSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractSignType.Document.SupplierSignature }
         *     
         */
        public void setSupplierSignature(ZfcsContractSignType.Document.SupplierSignature value) {
            this.supplierSignature = value;
        }

        /**
         * Gets the value of the controlPersonalSignature property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractSignType.Document.ControlPersonalSignature }
         *     
         */
        public ZfcsContractSignType.Document.ControlPersonalSignature getControlPersonalSignature() {
            return controlPersonalSignature;
        }

        /**
         * Sets the value of the controlPersonalSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractSignType.Document.ControlPersonalSignature }
         *     
         */
        public void setControlPersonalSignature(ZfcsContractSignType.Document.ControlPersonalSignature value) {
            this.controlPersonalSignature = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
         *       &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ControlPersonalSignature {

            @XmlValue
            protected byte[] value;
            @XmlAttribute(name = "type")
            protected ZfcsSignatureType type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setValue(byte[] value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public ZfcsSignatureType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public void setType(ZfcsSignatureType value) {
                this.type = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
         *       &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class CustomerSignature {

            @XmlValue
            protected byte[] value;
            @XmlAttribute(name = "type")
            protected ZfcsSignatureType type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setValue(byte[] value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public ZfcsSignatureType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public void setType(ZfcsSignatureType value) {
                this.type = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
         *       &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class SupplierSignature {

            @XmlValue
            protected byte[] value;
            @XmlAttribute(name = "type")
            protected ZfcsSignatureType type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setValue(byte[] value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public ZfcsSignatureType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public void setType(ZfcsSignatureType value) {
                this.type = value;
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
     *         &lt;element name="order">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                   &lt;element name="foundationProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
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
        "order"
    })
    public static class Foundation {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContractSignType.Foundation.Order order;

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractSignType.Foundation.Order }
         *     
         */
        public ZfcsContractSignType.Foundation.Order getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractSignType.Foundation.Order }
         *     
         */
        public void setOrder(ZfcsContractSignType.Foundation.Order value) {
            this.order = value;
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
         *         &lt;element name="foundationProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
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
            "foundationProtocolNumber"
        })
        public static class Order {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String purchaseNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String foundationProtocolNumber;

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
     *         &lt;element name="supplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
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
        "supplier"
    })
    public static class Suppliers {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsParticipantType> supplier;

        /**
         * Gets the value of the supplier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsParticipantType }
         * 
         * 
         */
        public List<ZfcsParticipantType> getSupplier() {
            if (supplier == null) {
                supplier = new ArrayList<ZfcsParticipantType>();
            }
            return this.supplier;
        }

    }

}
