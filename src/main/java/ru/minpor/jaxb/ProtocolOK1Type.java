
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
 * Протокол вскрытия конвертов с заявками на участие в открытом конкурсе
 * 
 * <p>Java class for protocolOK1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolOK1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *         &lt;element name="protocolNumber" type="{http://zakupki.gov.ru/oos/types/1}protocolNumberType" minOccurs="0"/>
 *         &lt;element name="foundationProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}protocolNumberType" minOccurs="0"/>
 *         &lt;element name="parentProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}protocolNumberType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="place" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="commission">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="protocolCommissionMembers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="protocolCommissionMember" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
 *                                     &lt;sequence>
 *                                       &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
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
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}document" minOccurs="0"/>
 *         &lt;element name="documentMetas" type="{http://zakupki.gov.ru/oos/types/1}documentList" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}modificationType" minOccurs="0"/>
 *         &lt;element name="href" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolLots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolLot" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="documentRequirements">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="documentRequirement" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                                 &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="reqValue">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="criterias">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NIR">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="OK"/>
 *                                             &lt;enumeration value="OKNM"/>
 *                                             &lt;enumeration value="OKLF"/>
 *                                             &lt;enumeration value="OKN3Y"/>
 *                                             &lt;enumeration value="OKFDG"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;choice>
 *                                         &lt;element name="auto" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="KD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                   &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}commonAttributesType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="manual" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="applications" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="application" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="journalNumber">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="20"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
 *                                                 &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                                 &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                 &lt;element name="requirementCompliances" type="{http://zakupki.gov.ru/oos/types/1}requirementCompliances"/>
 *                                                 &lt;element name="applicationParticipants">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType" maxOccurs="unbounded"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="commonInfo" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="2000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="contractConditions" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="contractCondition" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="criterion" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="condValue" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;maxLength value="4000"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contractMulti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "protocolOK1Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "notificationNumber",
    "protocolNumber",
    "foundationProtocolNumber",
    "parentProtocolNumber",
    "versionNumber",
    "place",
    "protocolDate",
    "signDate",
    "publishDate",
    "commission",
    "printForm",
    "documentMetas",
    "modification",
    "href",
    "protocolLots"
})
public class ProtocolOK1Type {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String notificationNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String protocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String foundationProtocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String parentProtocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String place;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protocolDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ProtocolOK1Type.Commission commission;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Document printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected DocumentList documentMetas;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ModificationType modification;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ProtocolOK1Type.ProtocolLots protocolLots;

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
     * Gets the value of the notificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationNumber() {
        return notificationNumber;
    }

    /**
     * Sets the value of the notificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationNumber(String value) {
        this.notificationNumber = value;
    }

    /**
     * Gets the value of the protocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Sets the value of the protocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolNumber(String value) {
        this.protocolNumber = value;
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

    /**
     * Gets the value of the parentProtocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProtocolNumber() {
        return parentProtocolNumber;
    }

    /**
     * Sets the value of the parentProtocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProtocolNumber(String value) {
        this.parentProtocolNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
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
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOK1Type.Commission }
     *     
     */
    public ProtocolOK1Type.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOK1Type.Commission }
     *     
     */
    public void setCommission(ProtocolOK1Type.Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setPrintForm(Document value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the documentMetas property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentList }
     *     
     */
    public DocumentList getDocumentMetas() {
        return documentMetas;
    }

    /**
     * Sets the value of the documentMetas property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentList }
     *     
     */
    public void setDocumentMetas(DocumentList value) {
        this.documentMetas = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationType }
     *     
     */
    public ModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationType }
     *     
     */
    public void setModification(ModificationType value) {
        this.modification = value;
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
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOK1Type.ProtocolLots }
     *     
     */
    public ProtocolOK1Type.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOK1Type.ProtocolLots }
     *     
     */
    public void setProtocolLots(ProtocolOK1Type.ProtocolLots value) {
        this.protocolLots = value;
    }


    /**
     * Комиссия, участвующая в составлении протокола
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="protocolCommissionMembers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="protocolCommissionMember" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
     *                           &lt;sequence>
     *                             &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "regNumber",
        "name",
        "protocolCommissionMembers"
    })
    public static class Commission {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected int regNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ProtocolOK1Type.Commission.ProtocolCommissionMembers protocolCommissionMembers;

        /**
         * Gets the value of the regNumber property.
         * 
         */
        public int getRegNumber() {
            return regNumber;
        }

        /**
         * Sets the value of the regNumber property.
         * 
         */
        public void setRegNumber(int value) {
            this.regNumber = value;
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
         * Gets the value of the protocolCommissionMembers property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolOK1Type.Commission.ProtocolCommissionMembers }
         *     
         */
        public ProtocolOK1Type.Commission.ProtocolCommissionMembers getProtocolCommissionMembers() {
            return protocolCommissionMembers;
        }

        /**
         * Sets the value of the protocolCommissionMembers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolOK1Type.Commission.ProtocolCommissionMembers }
         *     
         */
        public void setProtocolCommissionMembers(ProtocolOK1Type.Commission.ProtocolCommissionMembers value) {
            this.protocolCommissionMembers = value;
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
         *         &lt;element name="protocolCommissionMember" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
         *                 &lt;sequence>
         *                   &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "protocolCommissionMember"
        })
        public static class ProtocolCommissionMembers {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ProtocolOK1Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember> protocolCommissionMember;

            /**
             * Gets the value of the protocolCommissionMember property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the protocolCommissionMember property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProtocolCommissionMember().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProtocolOK1Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember }
             * 
             * 
             */
            public List<ProtocolOK1Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember> getProtocolCommissionMember() {
                if (protocolCommissionMember == null) {
                    protocolCommissionMember = new ArrayList<ProtocolOK1Type.Commission.ProtocolCommissionMembers.ProtocolCommissionMember>();
                }
                return this.protocolCommissionMember;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}commissionMemberType">
             *       &lt;sequence>
             *         &lt;element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "present"
            })
            public static class ProtocolCommissionMember
                extends CommissionMemberType
            {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected boolean present;

                /**
                 * Gets the value of the present property.
                 * 
                 */
                public boolean isPresent() {
                    return present;
                }

                /**
                 * Sets the value of the present property.
                 * 
                 */
                public void setPresent(boolean value) {
                    this.present = value;
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
     *         &lt;element name="protocolLot" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="documentRequirements">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="documentRequirement" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="reqValue">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
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
     *                   &lt;element name="criterias">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NIR">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="OK"/>
     *                                   &lt;enumeration value="OKNM"/>
     *                                   &lt;enumeration value="OKLF"/>
     *                                   &lt;enumeration value="OKN3Y"/>
     *                                   &lt;enumeration value="OKFDG"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;choice>
     *                               &lt;element name="auto" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
     *                                       &lt;sequence>
     *                                         &lt;element name="KD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                         &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}commonAttributesType" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="manual" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="applications" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="application" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="journalNumber">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="20"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
     *                                       &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                                       &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                       &lt;element name="requirementCompliances" type="{http://zakupki.gov.ru/oos/types/1}requirementCompliances"/>
     *                                       &lt;element name="applicationParticipants">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="commonInfo" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="2000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="contractConditions" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="contractCondition" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="criterion" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="condValue" minOccurs="0">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;maxLength value="4000"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
     *                   &lt;element name="contractMulti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "protocolLot"
    })
    public static class ProtocolLots {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ProtocolOK1Type.ProtocolLots.ProtocolLot> protocolLot;

        /**
         * Gets the value of the protocolLot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protocolLot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProtocolLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProtocolOK1Type.ProtocolLots.ProtocolLot }
         * 
         * 
         */
        public List<ProtocolOK1Type.ProtocolLots.ProtocolLot> getProtocolLot() {
            if (protocolLot == null) {
                protocolLot = new ArrayList<ProtocolOK1Type.ProtocolLots.ProtocolLot>();
            }
            return this.protocolLot;
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
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="documentRequirements">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="documentRequirement" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="reqValue">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
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
         *         &lt;element name="criterias">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NIR">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="OK"/>
         *                         &lt;enumeration value="OKNM"/>
         *                         &lt;enumeration value="OKLF"/>
         *                         &lt;enumeration value="OKN3Y"/>
         *                         &lt;enumeration value="OKFDG"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;choice>
         *                     &lt;element name="auto" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
         *                             &lt;sequence>
         *                               &lt;element name="KD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                               &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}commonAttributesType" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="manual" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="applications" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="application" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="journalNumber">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
         *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                             &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                             &lt;element name="requirementCompliances" type="{http://zakupki.gov.ru/oos/types/1}requirementCompliances"/>
         *                             &lt;element name="applicationParticipants">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="commonInfo" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="2000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="contractConditions" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="contractCondition" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="criterion" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="condValue" minOccurs="0">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;maxLength value="4000"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
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
         *         &lt;element name="contractMulti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "lotNumber",
            "documentRequirements",
            "criterias",
            "applications",
            "contractMulti"
        })
        public static class ProtocolLot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements documentRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias criterias;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications applications;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean contractMulti;

            /**
             * Gets the value of the lotNumber property.
             * 
             */
            public int getLotNumber() {
                return lotNumber;
            }

            /**
             * Sets the value of the lotNumber property.
             * 
             */
            public void setLotNumber(int value) {
                this.lotNumber = value;
            }

            /**
             * Gets the value of the documentRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements }
             *     
             */
            public ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements getDocumentRequirements() {
                return documentRequirements;
            }

            /**
             * Sets the value of the documentRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements }
             *     
             */
            public void setDocumentRequirements(ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements value) {
                this.documentRequirements = value;
            }

            /**
             * Gets the value of the criterias property.
             * 
             * @return
             *     possible object is
             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias }
             *     
             */
            public ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias getCriterias() {
                return criterias;
            }

            /**
             * Sets the value of the criterias property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias }
             *     
             */
            public void setCriterias(ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias value) {
                this.criterias = value;
            }

            /**
             * Gets the value of the applications property.
             * 
             * @return
             *     possible object is
             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications getApplications() {
                return applications;
            }

            /**
             * Sets the value of the applications property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public void setApplications(ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications value) {
                this.applications = value;
            }

            /**
             * Gets the value of the contractMulti property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isContractMulti() {
                return contractMulti;
            }

            /**
             * Sets the value of the contractMulti property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setContractMulti(Boolean value) {
                this.contractMulti = value;
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
             *         &lt;element name="application" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="journalNumber">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
             *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                   &lt;element name="requirementCompliances" type="{http://zakupki.gov.ru/oos/types/1}requirementCompliances"/>
             *                   &lt;element name="applicationParticipants">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="commonInfo" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="2000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="contractConditions" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="contractCondition" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="criterion" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
             *                                               &lt;sequence>
             *                                                 &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="condValue" minOccurs="0">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;maxLength value="4000"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "application"
            })
            public static class Applications {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application> application;

                /**
                 * Gets the value of the application property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the application property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getApplication().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application }
                 * 
                 * 
                 */
                public List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application> getApplication() {
                    if (application == null) {
                        application = new ArrayList<ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application>();
                    }
                    return this.application;
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
                 *         &lt;element name="journalNumber">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
                 *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
                 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *         &lt;element name="requirementCompliances" type="{http://zakupki.gov.ru/oos/types/1}requirementCompliances"/>
                 *         &lt;element name="applicationParticipants">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="commonInfo" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="2000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="contractConditions" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="contractCondition" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="criterion" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="condValue" minOccurs="0">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;maxLength value="4000"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                    "journalNumber",
                    "appFormat",
                    "appDate",
                    "price",
                    "increasePrice",
                    "requirementCompliances",
                    "applicationParticipants",
                    "commonInfo",
                    "contractConditions"
                })
                public static class Application {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String journalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "string")
                    protected ApplicationFormatType appFormat;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar appDate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double price;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Boolean increasePrice;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected RequirementCompliances requirementCompliances;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants applicationParticipants;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String commonInfo;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions contractConditions;

                    /**
                     * Gets the value of the journalNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getJournalNumber() {
                        return journalNumber;
                    }

                    /**
                     * Sets the value of the journalNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setJournalNumber(String value) {
                        this.journalNumber = value;
                    }

                    /**
                     * Gets the value of the appFormat property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ApplicationFormatType }
                     *     
                     */
                    public ApplicationFormatType getAppFormat() {
                        return appFormat;
                    }

                    /**
                     * Sets the value of the appFormat property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ApplicationFormatType }
                     *     
                     */
                    public void setAppFormat(ApplicationFormatType value) {
                        this.appFormat = value;
                    }

                    /**
                     * Gets the value of the appDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getAppDate() {
                        return appDate;
                    }

                    /**
                     * Sets the value of the appDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setAppDate(XMLGregorianCalendar value) {
                        this.appDate = value;
                    }

                    /**
                     * Gets the value of the price property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getPrice() {
                        return price;
                    }

                    /**
                     * Sets the value of the price property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setPrice(Double value) {
                        this.price = value;
                    }

                    /**
                     * Gets the value of the increasePrice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIncreasePrice() {
                        return increasePrice;
                    }

                    /**
                     * Sets the value of the increasePrice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIncreasePrice(Boolean value) {
                        this.increasePrice = value;
                    }

                    /**
                     * Gets the value of the requirementCompliances property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RequirementCompliances }
                     *     
                     */
                    public RequirementCompliances getRequirementCompliances() {
                        return requirementCompliances;
                    }

                    /**
                     * Sets the value of the requirementCompliances property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RequirementCompliances }
                     *     
                     */
                    public void setRequirementCompliances(RequirementCompliances value) {
                        this.requirementCompliances = value;
                    }

                    /**
                     * Gets the value of the applicationParticipants property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants }
                     *     
                     */
                    public ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants getApplicationParticipants() {
                        return applicationParticipants;
                    }

                    /**
                     * Sets the value of the applicationParticipants property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants }
                     *     
                     */
                    public void setApplicationParticipants(ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants value) {
                        this.applicationParticipants = value;
                    }

                    /**
                     * Gets the value of the commonInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCommonInfo() {
                        return commonInfo;
                    }

                    /**
                     * Sets the value of the commonInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCommonInfo(String value) {
                        this.commonInfo = value;
                    }

                    /**
                     * Gets the value of the contractConditions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions }
                     *     
                     */
                    public ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions getContractConditions() {
                        return contractConditions;
                    }

                    /**
                     * Sets the value of the contractConditions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions }
                     *     
                     */
                    public void setContractConditions(ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions value) {
                        this.contractConditions = value;
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
                     *         &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType" maxOccurs="unbounded"/>
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
                        "applicationParticipant"
                    })
                    public static class ApplicationParticipants {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<ParticipantType> applicationParticipant;

                        /**
                         * Gets the value of the applicationParticipant property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the applicationParticipant property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getApplicationParticipant().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ParticipantType }
                         * 
                         * 
                         */
                        public List<ParticipantType> getApplicationParticipant() {
                            if (applicationParticipant == null) {
                                applicationParticipant = new ArrayList<ParticipantType>();
                            }
                            return this.applicationParticipant;
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
                     *         &lt;element name="contractCondition" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="criterion" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
                     *                           &lt;sequence>
                     *                             &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="condValue" minOccurs="0">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;maxLength value="4000"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                        "contractCondition"
                    })
                    public static class ContractConditions {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition> contractCondition;

                        /**
                         * Gets the value of the contractCondition property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the contractCondition property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getContractCondition().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition }
                         * 
                         * 
                         */
                        public List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition> getContractCondition() {
                            if (contractCondition == null) {
                                contractCondition = new ArrayList<ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition>();
                            }
                            return this.contractCondition;
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
                         *         &lt;element name="criterion" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
                         *                 &lt;sequence>
                         *                   &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="condValue" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;maxLength value="4000"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="noOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                            "criterion",
                            "condValue",
                            "noOffer"
                        })
                        public static class ContractCondition {

                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Criterion criterion;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected String condValue;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected Boolean noOffer;

                            /**
                             * Gets the value of the criterion property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Criterion }
                             *     
                             */
                            public ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Criterion getCriterion() {
                                return criterion;
                            }

                            /**
                             * Sets the value of the criterion property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Criterion }
                             *     
                             */
                            public void setCriterion(ProtocolOK1Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Criterion value) {
                                this.criterion = value;
                            }

                            /**
                             * Gets the value of the condValue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCondValue() {
                                return condValue;
                            }

                            /**
                             * Sets the value of the condValue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCondValue(String value) {
                                this.condValue = value;
                            }

                            /**
                             * Gets the value of the noOffer property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isNoOffer() {
                                return noOffer;
                            }

                            /**
                             * Sets the value of the noOffer property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setNoOffer(Boolean value) {
                                this.noOffer = value;
                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterionRef">
                             *       &lt;sequence>
                             *         &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}contractConditionAttributesType" maxOccurs="unbounded" minOccurs="0"/>
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
                                "attributes"
                            })
                            public static class Criterion
                                extends CriterionRef
                            {

                                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                                protected List<ContractConditionAttributesType> attributes;

                                /**
                                 * Gets the value of the attributes property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the attributes property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getAttributes().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ContractConditionAttributesType }
                                 * 
                                 * 
                                 */
                                public List<ContractConditionAttributesType> getAttributes() {
                                    if (attributes == null) {
                                        attributes = new ArrayList<ContractConditionAttributesType>();
                                    }
                                    return this.attributes;
                                }

                            }

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
             *         &lt;element name="NIR">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="OK"/>
             *               &lt;enumeration value="OKNM"/>
             *               &lt;enumeration value="OKLF"/>
             *               &lt;enumeration value="OKN3Y"/>
             *               &lt;enumeration value="OKFDG"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;choice>
             *           &lt;element name="auto" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
             *                   &lt;sequence>
             *                     &lt;element name="KD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                     &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}commonAttributesType" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/extension>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="manual" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
             *                 &lt;/extension>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
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
                "nir",
                "auto",
                "manual"
            })
            public static class Criterias {

                @XmlElement(name = "NIR", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String nir;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Auto> auto;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Manual> manual;

                /**
                 * Gets the value of the nir property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNIR() {
                    return nir;
                }

                /**
                 * Sets the value of the nir property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNIR(String value) {
                    this.nir = value;
                }

                /**
                 * Gets the value of the auto property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the auto property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAuto().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Auto }
                 * 
                 * 
                 */
                public List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Auto> getAuto() {
                    if (auto == null) {
                        auto = new ArrayList<ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Auto>();
                    }
                    return this.auto;
                }

                /**
                 * Gets the value of the manual property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the manual property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getManual().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Manual }
                 * 
                 * 
                 */
                public List<ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Manual> getManual() {
                    if (manual == null) {
                        manual = new ArrayList<ProtocolOK1Type.ProtocolLots.ProtocolLot.Criterias.Manual>();
                    }
                    return this.manual;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
                 *       &lt;sequence>
                 *         &lt;element name="KD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *         &lt;element name="attributes" type="{http://zakupki.gov.ru/oos/types/1}commonAttributesType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "kd",
                    "attributes"
                })
                public static class Auto
                    extends ru.minpor.jaxb.Criterion
                {

                    @XmlElement(name = "KD", namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Boolean kd;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected List<CommonAttributesType> attributes;

                    /**
                     * Gets the value of the kd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isKD() {
                        return kd;
                    }

                    /**
                     * Sets the value of the kd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setKD(Boolean value) {
                        this.kd = value;
                    }

                    /**
                     * Gets the value of the attributes property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the attributes property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAttributes().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CommonAttributesType }
                     * 
                     * 
                     */
                    public List<CommonAttributesType> getAttributes() {
                        if (attributes == null) {
                            attributes = new ArrayList<CommonAttributesType>();
                        }
                        return this.attributes;
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
                 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}criterion">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Manual
                    extends ru.minpor.jaxb.Criterion
                {


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
             *         &lt;element name="documentRequirement" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="reqValue">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
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
                "documentRequirement"
            })
            public static class DocumentRequirements {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements.DocumentRequirement> documentRequirement;

                /**
                 * Gets the value of the documentRequirement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the documentRequirement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocumentRequirement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements.DocumentRequirement }
                 * 
                 * 
                 */
                public List<ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements.DocumentRequirement> getDocumentRequirement() {
                    if (documentRequirement == null) {
                        documentRequirement = new ArrayList<ProtocolOK1Type.ProtocolLots.ProtocolLot.DocumentRequirements.DocumentRequirement>();
                    }
                    return this.documentRequirement;
                }


                /**
                 * Требования к составу документов.
                 * 
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="reqValue">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
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
                    "sid",
                    "ordinalNumber",
                    "reqValue"
                })
                public static class DocumentRequirement {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Long sid;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected int ordinalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String reqValue;

                    /**
                     * Gets the value of the sid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *     
                     */
                    public Long getSid() {
                        return sid;
                    }

                    /**
                     * Sets the value of the sid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *     
                     */
                    public void setSid(Long value) {
                        this.sid = value;
                    }

                    /**
                     * Gets the value of the ordinalNumber property.
                     * 
                     */
                    public int getOrdinalNumber() {
                        return ordinalNumber;
                    }

                    /**
                     * Sets the value of the ordinalNumber property.
                     * 
                     */
                    public void setOrdinalNumber(int value) {
                        this.ordinalNumber = value;
                    }

                    /**
                     * Gets the value of the reqValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReqValue() {
                        return reqValue;
                    }

                    /**
                     * Sets the value of the reqValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReqValue(String value) {
                        this.reqValue = value;
                    }

                }

            }

        }

    }

}
