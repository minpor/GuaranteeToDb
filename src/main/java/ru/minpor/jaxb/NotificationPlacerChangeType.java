
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Уведомление об изменении организации, размещающей заказ
 * 
 * <p>Java class for notificationPlacerChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationPlacerChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="changeType" type="{http://zakupki.gov.ru/oos/types/1}orgPlacerChangeType"/>
 *         &lt;element name="placerChange">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="currentPlacer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
 *                   &lt;element name="newPlacer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="initiatorChange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="currentInitiator" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
 *                   &lt;element name="newInitiator" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="href" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}document" minOccurs="0"/>
 *         &lt;element name="documentMetas" type="{http://zakupki.gov.ru/oos/types/1}documentList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationPlacerChangeType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "notificationNumber",
    "versionNumber",
    "createDate",
    "publishDate",
    "changeType",
    "placerChange",
    "initiatorChange",
    "comment",
    "href",
    "printForm",
    "documentMetas"
})
public class NotificationPlacerChangeType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String notificationNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected OrgPlacerChangeType changeType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationPlacerChangeType.PlacerChange placerChange;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected NotificationPlacerChangeType.InitiatorChange initiatorChange;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String comment;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String href;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Document printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected DocumentList documentMetas;

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
     * Gets the value of the versionNumber property.
     * 
     */
    public int getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     */
    public void setVersionNumber(int value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
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
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link OrgPlacerChangeType }
     *     
     */
    public OrgPlacerChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgPlacerChangeType }
     *     
     */
    public void setChangeType(OrgPlacerChangeType value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the placerChange property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPlacerChangeType.PlacerChange }
     *     
     */
    public NotificationPlacerChangeType.PlacerChange getPlacerChange() {
        return placerChange;
    }

    /**
     * Sets the value of the placerChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPlacerChangeType.PlacerChange }
     *     
     */
    public void setPlacerChange(NotificationPlacerChangeType.PlacerChange value) {
        this.placerChange = value;
    }

    /**
     * Gets the value of the initiatorChange property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPlacerChangeType.InitiatorChange }
     *     
     */
    public NotificationPlacerChangeType.InitiatorChange getInitiatorChange() {
        return initiatorChange;
    }

    /**
     * Sets the value of the initiatorChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPlacerChangeType.InitiatorChange }
     *     
     */
    public void setInitiatorChange(NotificationPlacerChangeType.InitiatorChange value) {
        this.initiatorChange = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="currentInitiator" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
     *         &lt;element name="newInitiator" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
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
        "currentInitiator",
        "newInitiator"
    })
    public static class InitiatorChange {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected OrganizationRef currentInitiator;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected OrganizationRef newInitiator;

        /**
         * Gets the value of the currentInitiator property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getCurrentInitiator() {
            return currentInitiator;
        }

        /**
         * Sets the value of the currentInitiator property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setCurrentInitiator(OrganizationRef value) {
            this.currentInitiator = value;
        }

        /**
         * Gets the value of the newInitiator property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getNewInitiator() {
            return newInitiator;
        }

        /**
         * Sets the value of the newInitiator property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setNewInitiator(OrganizationRef value) {
            this.newInitiator = value;
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
     *         &lt;element name="currentPlacer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
     *         &lt;element name="newPlacer" type="{http://zakupki.gov.ru/oos/types/1}organizationRef"/>
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
        "currentPlacer",
        "newPlacer"
    })
    public static class PlacerChange {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected OrganizationRef currentPlacer;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected OrganizationRef newPlacer;

        /**
         * Gets the value of the currentPlacer property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getCurrentPlacer() {
            return currentPlacer;
        }

        /**
         * Sets the value of the currentPlacer property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setCurrentPlacer(OrganizationRef value) {
            this.currentPlacer = value;
        }

        /**
         * Gets the value of the newPlacer property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationRef }
         *     
         */
        public OrganizationRef getNewPlacer() {
            return newPlacer;
        }

        /**
         * Sets the value of the newPlacer property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationRef }
         *     
         */
        public void setNewPlacer(OrganizationRef value) {
            this.newPlacer = value;
        }

    }

}
