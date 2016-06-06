
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
 * Недействительность правил нормирования в сфере закупок
 * 
 * <p>Java class for zfcs_regulationRulesInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_regulationRulesInvalidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="registryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_standardContractNumberType"/>
 *         &lt;element name="revisionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType"/>
 *         &lt;element name="publishOrg">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="ogrn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesTypeEnum" minOccurs="0"/>
 *         &lt;element name="state" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="termsControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvedFrom" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="government" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="publishOrg">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType">
 *                           &lt;sequence>
 *                             &lt;element name="ogrn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                             &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *                             &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="approveFor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="central" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="territorial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="treasury" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="budgetary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baseDocument" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesBaseDocumentTypeEnum"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="regions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="region" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef">
 *                           &lt;sequence>
 *                             &lt;element name="municipalities" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="municipality" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="documents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="document" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
 *                           &lt;sequence>
 *                             &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesDocumentsEnum"/>
 *                             &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="cangingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
 *         &lt;element name="printFormDocuments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="printFormDocument" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesDocumentsEnum"/>
 *                             &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="changingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
 *         &lt;element name="discussion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="term">
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
 *                   &lt;element name="postAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/types/1}eMailType" minOccurs="0"/>
 *                   &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesCouncilDecisionEnum" minOccurs="0"/>
 *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "zfcs_regulationRulesInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "docPublishDate",
    "id",
    "registryNum",
    "revisionNumber",
    "publishOrg",
    "type",
    "state",
    "termsControl",
    "approvedFrom",
    "approveFor",
    "baseDocument",
    "regions",
    "addInfo",
    "documents",
    "printFormDocuments",
    "discussion",
    "invalidityInfo",
    "attachments"
})
public class ZfcsRegulationRulesInvalidType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String registryNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String revisionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsRegulationRulesInvalidType.PublishOrg publishOrg;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String type;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String state;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean termsControl;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsRegulationRulesInvalidType.ApprovedFrom approvedFrom;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsRegulationRulesInvalidType.ApproveFor approveFor;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsRegulationRulesInvalidType.BaseDocument baseDocument;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsRegulationRulesInvalidType.Regions regions;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String addInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsRegulationRulesInvalidType.Documents documents;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsRegulationRulesInvalidType.PrintFormDocuments printFormDocuments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsRegulationRulesInvalidType.Discussion discussion;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsRegulationRulesInvalidType.InvalidityInfo invalidityInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;

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
     * Gets the value of the publishOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.PublishOrg }
     *     
     */
    public ZfcsRegulationRulesInvalidType.PublishOrg getPublishOrg() {
        return publishOrg;
    }

    /**
     * Sets the value of the publishOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.PublishOrg }
     *     
     */
    public void setPublishOrg(ZfcsRegulationRulesInvalidType.PublishOrg value) {
        this.publishOrg = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the termsControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTermsControl() {
        return termsControl;
    }

    /**
     * Sets the value of the termsControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTermsControl(Boolean value) {
        this.termsControl = value;
    }

    /**
     * Gets the value of the approvedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.ApprovedFrom }
     *     
     */
    public ZfcsRegulationRulesInvalidType.ApprovedFrom getApprovedFrom() {
        return approvedFrom;
    }

    /**
     * Sets the value of the approvedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.ApprovedFrom }
     *     
     */
    public void setApprovedFrom(ZfcsRegulationRulesInvalidType.ApprovedFrom value) {
        this.approvedFrom = value;
    }

    /**
     * Gets the value of the approveFor property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.ApproveFor }
     *     
     */
    public ZfcsRegulationRulesInvalidType.ApproveFor getApproveFor() {
        return approveFor;
    }

    /**
     * Sets the value of the approveFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.ApproveFor }
     *     
     */
    public void setApproveFor(ZfcsRegulationRulesInvalidType.ApproveFor value) {
        this.approveFor = value;
    }

    /**
     * Gets the value of the baseDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.BaseDocument }
     *     
     */
    public ZfcsRegulationRulesInvalidType.BaseDocument getBaseDocument() {
        return baseDocument;
    }

    /**
     * Sets the value of the baseDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.BaseDocument }
     *     
     */
    public void setBaseDocument(ZfcsRegulationRulesInvalidType.BaseDocument value) {
        this.baseDocument = value;
    }

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.Regions }
     *     
     */
    public ZfcsRegulationRulesInvalidType.Regions getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.Regions }
     *     
     */
    public void setRegions(ZfcsRegulationRulesInvalidType.Regions value) {
        this.regions = value;
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
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.Documents }
     *     
     */
    public ZfcsRegulationRulesInvalidType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.Documents }
     *     
     */
    public void setDocuments(ZfcsRegulationRulesInvalidType.Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the printFormDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.PrintFormDocuments }
     *     
     */
    public ZfcsRegulationRulesInvalidType.PrintFormDocuments getPrintFormDocuments() {
        return printFormDocuments;
    }

    /**
     * Sets the value of the printFormDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.PrintFormDocuments }
     *     
     */
    public void setPrintFormDocuments(ZfcsRegulationRulesInvalidType.PrintFormDocuments value) {
        this.printFormDocuments = value;
    }

    /**
     * Gets the value of the discussion property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.Discussion }
     *     
     */
    public ZfcsRegulationRulesInvalidType.Discussion getDiscussion() {
        return discussion;
    }

    /**
     * Sets the value of the discussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.Discussion }
     *     
     */
    public void setDiscussion(ZfcsRegulationRulesInvalidType.Discussion value) {
        this.discussion = value;
    }

    /**
     * Gets the value of the invalidityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRegulationRulesInvalidType.InvalidityInfo }
     *     
     */
    public ZfcsRegulationRulesInvalidType.InvalidityInfo getInvalidityInfo() {
        return invalidityInfo;
    }

    /**
     * Sets the value of the invalidityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRegulationRulesInvalidType.InvalidityInfo }
     *     
     */
    public void setInvalidityInfo(ZfcsRegulationRulesInvalidType.InvalidityInfo value) {
        this.invalidityInfo = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="government" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="publishOrg">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType">
     *                 &lt;sequence>
     *                   &lt;element name="ogrn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
     *                   &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "government",
        "publishOrg"
    })
    public static class ApprovedFrom {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean government;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsRegulationRulesInvalidType.ApprovedFrom.PublishOrg publishOrg;

        /**
         * Gets the value of the government property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGovernment() {
            return government;
        }

        /**
         * Sets the value of the government property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGovernment(Boolean value) {
            this.government = value;
        }

        /**
         * Gets the value of the publishOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsRegulationRulesInvalidType.ApprovedFrom.PublishOrg }
         *     
         */
        public ZfcsRegulationRulesInvalidType.ApprovedFrom.PublishOrg getPublishOrg() {
            return publishOrg;
        }

        /**
         * Sets the value of the publishOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsRegulationRulesInvalidType.ApprovedFrom.PublishOrg }
         *     
         */
        public void setPublishOrg(ZfcsRegulationRulesInvalidType.ApprovedFrom.PublishOrg value) {
            this.publishOrg = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType">
         *       &lt;sequence>
         *         &lt;element name="ogrn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
         *         &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
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
            "ogrn",
            "address",
            "phone",
            "email"
        })
        public static class PublishOrg
            extends ZfcsOrganizationInfoType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String ogrn;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String phone;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String email;

            /**
             * Gets the value of the ogrn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOgrn() {
                return ogrn;
            }

            /**
             * Sets the value of the ogrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOgrn(String value) {
                this.ogrn = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
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
     *         &lt;element name="central" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="territorial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="treasury" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="budgetary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "central",
        "territorial",
        "treasury",
        "budgetary"
    })
    public static class ApproveFor {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean central;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean territorial;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean treasury;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean budgetary;

        /**
         * Gets the value of the central property.
         * 
         */
        public boolean isCentral() {
            return central;
        }

        /**
         * Sets the value of the central property.
         * 
         */
        public void setCentral(boolean value) {
            this.central = value;
        }

        /**
         * Gets the value of the territorial property.
         * 
         */
        public boolean isTerritorial() {
            return territorial;
        }

        /**
         * Sets the value of the territorial property.
         * 
         */
        public void setTerritorial(boolean value) {
            this.territorial = value;
        }

        /**
         * Gets the value of the treasury property.
         * 
         */
        public boolean isTreasury() {
            return treasury;
        }

        /**
         * Sets the value of the treasury property.
         * 
         */
        public void setTreasury(boolean value) {
            this.treasury = value;
        }

        /**
         * Gets the value of the budgetary property.
         * 
         */
        public boolean isBudgetary() {
            return budgetary;
        }

        /**
         * Sets the value of the budgetary property.
         * 
         */
        public void setBudgetary(boolean value) {
            this.budgetary = value;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesBaseDocumentTypeEnum"/>
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
        "number",
        "date",
        "type"
    })
    public static class BaseDocument {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String number;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String type;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="term">
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
     *         &lt;element name="postAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/types/1}eMailType" minOccurs="0"/>
     *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesCouncilDecisionEnum" minOccurs="0"/>
     *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "term",
        "postAddress",
        "eMail",
        "decision",
        "addInfo"
    })
    public static class Discussion {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsRegulationRulesInvalidType.Discussion.Term term;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String postAddress;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String eMail;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "string")
        protected ZfcsRegulationRulesCouncilDecisionEnum decision;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String addInfo;

        /**
         * Gets the value of the term property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsRegulationRulesInvalidType.Discussion.Term }
         *     
         */
        public ZfcsRegulationRulesInvalidType.Discussion.Term getTerm() {
            return term;
        }

        /**
         * Sets the value of the term property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsRegulationRulesInvalidType.Discussion.Term }
         *     
         */
        public void setTerm(ZfcsRegulationRulesInvalidType.Discussion.Term value) {
            this.term = value;
        }

        /**
         * Gets the value of the postAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostAddress() {
            return postAddress;
        }

        /**
         * Sets the value of the postAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostAddress(String value) {
            this.postAddress = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the decision property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsRegulationRulesCouncilDecisionEnum }
         *     
         */
        public ZfcsRegulationRulesCouncilDecisionEnum getDecision() {
            return decision;
        }

        /**
         * Sets the value of the decision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsRegulationRulesCouncilDecisionEnum }
         *     
         */
        public void setDecision(ZfcsRegulationRulesCouncilDecisionEnum value) {
            this.decision = value;
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
        public static class Term {

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
     *         &lt;element name="document" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesDocumentsEnum"/>
     *                   &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="cangingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "document"
    })
    public static class Documents {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsRegulationRulesInvalidType.Documents.Document> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsRegulationRulesInvalidType.Documents.Document }
         * 
         * 
         */
        public List<ZfcsRegulationRulesInvalidType.Documents.Document> getDocument() {
            if (document == null) {
                document = new ArrayList<ZfcsRegulationRulesInvalidType.Documents.Document>();
            }
            return this.document;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
         *       &lt;sequence>
         *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesDocumentsEnum"/>
         *         &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="cangingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "type",
            "placingDate",
            "cangingDate"
        })
        public static class Document
            extends ZfcsAttachmentType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String type;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar placingDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar cangingDate;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the placingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPlacingDate() {
                return placingDate;
            }

            /**
             * Sets the value of the placingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPlacingDate(XMLGregorianCalendar value) {
                this.placingDate = value;
            }

            /**
             * Gets the value of the cangingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCangingDate() {
                return cangingDate;
            }

            /**
             * Sets the value of the cangingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCangingDate(XMLGregorianCalendar value) {
                this.cangingDate = value;
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
     *         &lt;element name="printFormDocument" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesDocumentsEnum"/>
     *                   &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="changingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "printFormDocument"
    })
    public static class PrintFormDocuments {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsRegulationRulesInvalidType.PrintFormDocuments.PrintFormDocument> printFormDocument;

        /**
         * Gets the value of the printFormDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the printFormDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrintFormDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsRegulationRulesInvalidType.PrintFormDocuments.PrintFormDocument }
         * 
         * 
         */
        public List<ZfcsRegulationRulesInvalidType.PrintFormDocuments.PrintFormDocument> getPrintFormDocument() {
            if (printFormDocument == null) {
                printFormDocument = new ArrayList<ZfcsRegulationRulesInvalidType.PrintFormDocuments.PrintFormDocument>();
            }
            return this.printFormDocument;
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
         *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_regulationRulesDocumentsEnum"/>
         *         &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="changingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "placingDate",
            "changingDate"
        })
        public static class PrintFormDocument {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String type;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar placingDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar changingDate;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the placingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPlacingDate() {
                return placingDate;
            }

            /**
             * Sets the value of the placingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPlacingDate(XMLGregorianCalendar value) {
                this.placingDate = value;
            }

            /**
             * Gets the value of the changingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getChangingDate() {
                return changingDate;
            }

            /**
             * Sets the value of the changingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setChangingDate(XMLGregorianCalendar value) {
                this.changingDate = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType">
     *       &lt;sequence>
     *         &lt;element name="ogrn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
     *         &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
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
        "ogrn",
        "address",
        "phone",
        "email"
    })
    public static class PublishOrg
        extends ZfcsOrganizationInfoType
    {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String ogrn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String address;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String phone;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String email;

        /**
         * Gets the value of the ogrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOgrn() {
            return ogrn;
        }

        /**
         * Sets the value of the ogrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOgrn(String value) {
            this.ogrn = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
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
     *         &lt;element name="region" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef">
     *                 &lt;sequence>
     *                   &lt;element name="municipalities" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="municipality" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "region"
    })
    public static class Regions {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsRegulationRulesInvalidType.Regions.Region> region;

        /**
         * Gets the value of the region property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the region property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsRegulationRulesInvalidType.Regions.Region }
         * 
         * 
         */
        public List<ZfcsRegulationRulesInvalidType.Regions.Region> getRegion() {
            if (region == null) {
                region = new ArrayList<ZfcsRegulationRulesInvalidType.Regions.Region>();
            }
            return this.region;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef">
         *       &lt;sequence>
         *         &lt;element name="municipalities" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="municipality" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "municipalities"
        })
        public static class Region
            extends ZfcsOKTMORef
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsRegulationRulesInvalidType.Regions.Region.Municipalities municipalities;

            /**
             * Gets the value of the municipalities property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsRegulationRulesInvalidType.Regions.Region.Municipalities }
             *     
             */
            public ZfcsRegulationRulesInvalidType.Regions.Region.Municipalities getMunicipalities() {
                return municipalities;
            }

            /**
             * Sets the value of the municipalities property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsRegulationRulesInvalidType.Regions.Region.Municipalities }
             *     
             */
            public void setMunicipalities(ZfcsRegulationRulesInvalidType.Regions.Region.Municipalities value) {
                this.municipalities = value;
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
             *         &lt;element name="municipality" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" maxOccurs="unbounded"/>
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
                "municipality"
            })
            public static class Municipalities {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsOKTMORef> municipality;

                /**
                 * Gets the value of the municipality property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the municipality property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMunicipality().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsOKTMORef }
                 * 
                 * 
                 */
                public List<ZfcsOKTMORef> getMunicipality() {
                    if (municipality == null) {
                        municipality = new ArrayList<ZfcsOKTMORef>();
                    }
                    return this.municipality;
                }

            }

        }

    }

}
