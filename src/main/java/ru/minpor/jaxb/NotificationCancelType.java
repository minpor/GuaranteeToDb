
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
 * Извещение об отказе от проведения
 * 
 * <p>Java class for notificationCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationCancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lot" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="notificationCancelFailure" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="recoveryToStage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="stage" type="{http://zakupki.gov.ru/oos/types/1}tenderStageType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="notRecovery">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="substitutedOrder" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *                                       &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *                 &lt;/choice>
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
@XmlType(name = "notificationCancelType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "notificationNumber",
    "createDate",
    "publishDate",
    "versionNumber",
    "lots",
    "printForm",
    "documentMetas",
    "modification",
    "notificationCancelFailure"
})
public class NotificationCancelType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String notificationNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected NotificationCancelType.Lots lots;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Document printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected DocumentList documentMetas;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ModificationType modification;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected NotificationCancelType.NotificationCancelFailure notificationCancelFailure;

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
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancelType.Lots }
     *     
     */
    public NotificationCancelType.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancelType.Lots }
     *     
     */
    public void setLots(NotificationCancelType.Lots value) {
        this.lots = value;
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
     * Gets the value of the notificationCancelFailure property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancelType.NotificationCancelFailure }
     *     
     */
    public NotificationCancelType.NotificationCancelFailure getNotificationCancelFailure() {
        return notificationCancelFailure;
    }

    /**
     * Sets the value of the notificationCancelFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancelType.NotificationCancelFailure }
     *     
     */
    public void setNotificationCancelFailure(NotificationCancelType.NotificationCancelFailure value) {
        this.notificationCancelFailure = value;
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
     *         &lt;element name="lot" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "lot"
    })
    public static class Lots {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<NotificationCancelType.Lots.Lot> lot;

        /**
         * Gets the value of the lot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationCancelType.Lots.Lot }
         * 
         * 
         */
        public List<NotificationCancelType.Lots.Lot> getLot() {
            if (lot == null) {
                lot = new ArrayList<NotificationCancelType.Lots.Lot>();
            }
            return this.lot;
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
         *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "ordinalNumber"
        })
        public static class Lot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int ordinalNumber;

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
     *       &lt;choice>
     *         &lt;element name="recoveryToStage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="stage" type="{http://zakupki.gov.ru/oos/types/1}tenderStageType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="notRecovery">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="substitutedOrder" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
     *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "recoveryToStage",
        "notRecovery"
    })
    public static class NotificationCancelFailure {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected NotificationCancelType.NotificationCancelFailure.RecoveryToStage recoveryToStage;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected NotificationCancelType.NotificationCancelFailure.NotRecovery notRecovery;

        /**
         * Gets the value of the recoveryToStage property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationCancelType.NotificationCancelFailure.RecoveryToStage }
         *     
         */
        public NotificationCancelType.NotificationCancelFailure.RecoveryToStage getRecoveryToStage() {
            return recoveryToStage;
        }

        /**
         * Sets the value of the recoveryToStage property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationCancelType.NotificationCancelFailure.RecoveryToStage }
         *     
         */
        public void setRecoveryToStage(NotificationCancelType.NotificationCancelFailure.RecoveryToStage value) {
            this.recoveryToStage = value;
        }

        /**
         * Gets the value of the notRecovery property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationCancelType.NotificationCancelFailure.NotRecovery }
         *     
         */
        public NotificationCancelType.NotificationCancelFailure.NotRecovery getNotRecovery() {
            return notRecovery;
        }

        /**
         * Sets the value of the notRecovery property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationCancelType.NotificationCancelFailure.NotRecovery }
         *     
         */
        public void setNotRecovery(NotificationCancelType.NotificationCancelFailure.NotRecovery value) {
            this.notRecovery = value;
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
         *         &lt;element name="substitutedOrder" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
         *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "substitutedOrder"
        })
        public static class NotRecovery {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected NotificationCancelType.NotificationCancelFailure.NotRecovery.SubstitutedOrder substitutedOrder;

            /**
             * Gets the value of the substitutedOrder property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationCancelType.NotificationCancelFailure.NotRecovery.SubstitutedOrder }
             *     
             */
            public NotificationCancelType.NotificationCancelFailure.NotRecovery.SubstitutedOrder getSubstitutedOrder() {
                return substitutedOrder;
            }

            /**
             * Sets the value of the substitutedOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationCancelType.NotificationCancelFailure.NotRecovery.SubstitutedOrder }
             *     
             */
            public void setSubstitutedOrder(NotificationCancelType.NotificationCancelFailure.NotRecovery.SubstitutedOrder value) {
                this.substitutedOrder = value;
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
             *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
             *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "notificationNumber",
                "lotNumber"
            })
            public static class SubstitutedOrder {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String notificationNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Integer lotNumber;

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
                 * Gets the value of the lotNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getLotNumber() {
                    return lotNumber;
                }

                /**
                 * Sets the value of the lotNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setLotNumber(Integer value) {
                    this.lotNumber = value;
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
         *         &lt;element name="stage" type="{http://zakupki.gov.ru/oos/types/1}tenderStageType"/>
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
        public static class RecoveryToStage {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected TenderStageType stage;

            /**
             * Gets the value of the stage property.
             * 
             * @return
             *     possible object is
             *     {@link TenderStageType }
             *     
             */
            public TenderStageType getStage() {
                return stage;
            }

            /**
             * Sets the value of the stage property.
             * 
             * @param value
             *     allowed object is
             *     {@link TenderStageType }
             *     
             */
            public void setStage(TenderStageType value) {
                this.stage = value;
            }

        }

    }

}
