
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
 * Информация о результатах проведения обязательного общественного обсуждения закупок
 * 
 * <p>Java class for zfcs_publicDiscussionResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicDiscussionNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *         &lt;element name="revisionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UpdatePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="phase">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S_1"/>
 *               &lt;enumeration value="S1F"/>
 *               &lt;enumeration value="S_2"/>
 *               &lt;enumeration value="FIN"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
 *         &lt;sequence>
 *           &lt;element name="planNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanNumberType"/>
 *           &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *           &lt;element name="planObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *           &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *           &lt;element name="planContractMaxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *           &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *           &lt;element name="objectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *           &lt;element name="contractMaxPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *         &lt;/sequence>
 *         &lt;element name="stages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stage" maxOccurs="2">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="number">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="revisionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType"/>
 *                             &lt;element name="updatePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="period">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="decisionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_decisionRef" minOccurs="0"/>
 *                             &lt;element name="baseType" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_baseRef">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
 *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_publicDiscussionResultType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "publicDiscussionNum",
    "revisionNumber",
    "publishDate",
    "updatePublishDate",
    "phase",
    "customer",
    "planNumber",
    "positionNumber",
    "planObjectInfo",
    "year",
    "planContractMaxPrice",
    "purchaseNumber",
    "lotNumber",
    "objectInfo",
    "contractMaxPrice",
    "stages",
    "place",
    "date",
    "attachments"
})
public class ZfcsPublicDiscussionResultType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String publicDiscussionNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String revisionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(name = "UpdatePublishDate", namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatePublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String phase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseOrganizationType customer;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String planNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String positionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String planObjectInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int year;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String planContractMaxPrice;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String purchaseNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lotNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String objectInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String contractMaxPrice;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPublicDiscussionResultType.Stages stages;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String place;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the publicDiscussionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicDiscussionNum() {
        return publicDiscussionNum;
    }

    /**
     * Sets the value of the publicDiscussionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDiscussionNum(String value) {
        this.publicDiscussionNum = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
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
     * Gets the value of the updatePublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatePublishDate() {
        return updatePublishDate;
    }

    /**
     * Sets the value of the updatePublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatePublishDate(XMLGregorianCalendar value) {
        this.updatePublishDate = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public ZfcsPurchaseOrganizationType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public void setCustomer(ZfcsPurchaseOrganizationType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the planNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Sets the value of the planNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNumber(String value) {
        this.planNumber = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the planObjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanObjectInfo() {
        return planObjectInfo;
    }

    /**
     * Sets the value of the planObjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanObjectInfo(String value) {
        this.planObjectInfo = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the planContractMaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanContractMaxPrice() {
        return planContractMaxPrice;
    }

    /**
     * Sets the value of the planContractMaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanContractMaxPrice(String value) {
        this.planContractMaxPrice = value;
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
     * Gets the value of the objectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectInfo() {
        return objectInfo;
    }

    /**
     * Sets the value of the objectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectInfo(String value) {
        this.objectInfo = value;
    }

    /**
     * Gets the value of the contractMaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractMaxPrice() {
        return contractMaxPrice;
    }

    /**
     * Sets the value of the contractMaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractMaxPrice(String value) {
        this.contractMaxPrice = value;
    }

    /**
     * Gets the value of the stages property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionResultType.Stages }
     *     
     */
    public ZfcsPublicDiscussionResultType.Stages getStages() {
        return stages;
    }

    /**
     * Sets the value of the stages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionResultType.Stages }
     *     
     */
    public void setStages(ZfcsPublicDiscussionResultType.Stages value) {
        this.stages = value;
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
     *         &lt;element name="stage" maxOccurs="2">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="number">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="revisionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType"/>
     *                   &lt;element name="updatePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="period">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="decisionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_decisionRef" minOccurs="0"/>
     *                   &lt;element name="baseType" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_baseRef">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
        "stage"
    })
    public static class Stages {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsPublicDiscussionResultType.Stages.Stage> stage;

        /**
         * Gets the value of the stage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPublicDiscussionResultType.Stages.Stage }
         * 
         * 
         */
        public List<ZfcsPublicDiscussionResultType.Stages.Stage> getStage() {
            if (stage == null) {
                stage = new ArrayList<ZfcsPublicDiscussionResultType.Stages.Stage>();
            }
            return this.stage;
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
         *         &lt;element name="number">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="revisionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType"/>
         *         &lt;element name="updatePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="period">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="decisionType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_decisionRef" minOccurs="0"/>
         *         &lt;element name="baseType" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_baseRef">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
            "publishDate",
            "revisionNumber",
            "updatePublishDate",
            "period",
            "decisionType",
            "baseType",
            "attachments"
        })
        public static class Stage {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected BigInteger number;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar publishDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String revisionNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar updatePublishDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsPublicDiscussionResultType.Stages.Stage.Period period;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsDecisionRef decisionType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsPublicDiscussionResultType.Stages.Stage.BaseType baseType;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsAttachmentListType attachments;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumber(BigInteger value) {
                this.number = value;
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
             * Gets the value of the revisionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRevisionNumber() {
                return revisionNumber;
            }

            /**
             * Sets the value of the revisionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRevisionNumber(String value) {
                this.revisionNumber = value;
            }

            /**
             * Gets the value of the updatePublishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getUpdatePublishDate() {
                return updatePublishDate;
            }

            /**
             * Sets the value of the updatePublishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setUpdatePublishDate(XMLGregorianCalendar value) {
                this.updatePublishDate = value;
            }

            /**
             * Gets the value of the period property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPublicDiscussionResultType.Stages.Stage.Period }
             *     
             */
            public ZfcsPublicDiscussionResultType.Stages.Stage.Period getPeriod() {
                return period;
            }

            /**
             * Sets the value of the period property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPublicDiscussionResultType.Stages.Stage.Period }
             *     
             */
            public void setPeriod(ZfcsPublicDiscussionResultType.Stages.Stage.Period value) {
                this.period = value;
            }

            /**
             * Gets the value of the decisionType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsDecisionRef }
             *     
             */
            public ZfcsDecisionRef getDecisionType() {
                return decisionType;
            }

            /**
             * Sets the value of the decisionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsDecisionRef }
             *     
             */
            public void setDecisionType(ZfcsDecisionRef value) {
                this.decisionType = value;
            }

            /**
             * Gets the value of the baseType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPublicDiscussionResultType.Stages.Stage.BaseType }
             *     
             */
            public ZfcsPublicDiscussionResultType.Stages.Stage.BaseType getBaseType() {
                return baseType;
            }

            /**
             * Sets the value of the baseType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPublicDiscussionResultType.Stages.Stage.BaseType }
             *     
             */
            public void setBaseType(ZfcsPublicDiscussionResultType.Stages.Stage.BaseType value) {
                this.baseType = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_baseRef">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="description" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
                "description"
            })
            public static class BaseType
                extends ZfcsBaseRef
            {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String description;

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
             *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
                "startDate",
                "endDate"
            })
            public static class Period {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar startDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar endDate;

                /**
                 * Gets the value of the startDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getStartDate() {
                    return startDate;
                }

                /**
                 * Sets the value of the startDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setStartDate(XMLGregorianCalendar value) {
                    this.startDate = value;
                }

                /**
                 * Gets the value of the endDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEndDate() {
                    return endDate;
                }

                /**
                 * Sets the value of the endDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEndDate(XMLGregorianCalendar value) {
                    this.endDate = value;
                }

            }

        }

    }

}
