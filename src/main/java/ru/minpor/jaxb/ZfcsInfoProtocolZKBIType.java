
package ru.minpor.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о протоколе ЗК-БИ
 * 
 * <p>Java class for zfcs_infoProtocolZKBIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_infoProtocolZKBIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="execution">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="commission">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseResponsible" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                             &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="notificationFullNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *                   &lt;element name="notificationFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lotInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotInfoType" minOccurs="0"/>
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
 *                             &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
 *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
 *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                             &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                             &lt;element name="procent" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="admittedInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
 *                                         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="correspondencies" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="correspondence" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicationCorrespondence" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="overallValue" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="100"/>
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
 *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_infoProtocolZKBIType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "execution",
    "commission",
    "purchaseInfo",
    "lotInfo",
    "applications",
    "abandonedReason"
})
public class ZfcsInfoProtocolZKBIType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsInfoProtocolZKBIType.Execution execution;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsInfoProtocolZKBIType.Commission commission;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsInfoProtocolZKBIType.PurchaseInfo purchaseInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsLotInfoType lotInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsInfoProtocolZKBIType.Applications applications;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAbandonedReasonType abandonedReason;

    /**
     * Gets the value of the execution property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInfoProtocolZKBIType.Execution }
     *     
     */
    public ZfcsInfoProtocolZKBIType.Execution getExecution() {
        return execution;
    }

    /**
     * Sets the value of the execution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInfoProtocolZKBIType.Execution }
     *     
     */
    public void setExecution(ZfcsInfoProtocolZKBIType.Execution value) {
        this.execution = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInfoProtocolZKBIType.Commission }
     *     
     */
    public ZfcsInfoProtocolZKBIType.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInfoProtocolZKBIType.Commission }
     *     
     */
    public void setCommission(ZfcsInfoProtocolZKBIType.Commission value) {
        this.commission = value;
    }

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInfoProtocolZKBIType.PurchaseInfo }
     *     
     */
    public ZfcsInfoProtocolZKBIType.PurchaseInfo getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInfoProtocolZKBIType.PurchaseInfo }
     *     
     */
    public void setPurchaseInfo(ZfcsInfoProtocolZKBIType.PurchaseInfo value) {
        this.purchaseInfo = value;
    }

    /**
     * Gets the value of the lotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotInfoType }
     *     
     */
    public ZfcsLotInfoType getLotInfo() {
        return lotInfo;
    }

    /**
     * Sets the value of the lotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotInfoType }
     *     
     */
    public void setLotInfo(ZfcsLotInfoType value) {
        this.lotInfo = value;
    }

    /**
     * Gets the value of the applications property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInfoProtocolZKBIType.Applications }
     *     
     */
    public ZfcsInfoProtocolZKBIType.Applications getApplications() {
        return applications;
    }

    /**
     * Sets the value of the applications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInfoProtocolZKBIType.Applications }
     *     
     */
    public void setApplications(ZfcsInfoProtocolZKBIType.Applications value) {
        this.applications = value;
    }

    /**
     * Gets the value of the abandonedReason property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAbandonedReasonType }
     *     
     */
    public ZfcsAbandonedReasonType getAbandonedReason() {
        return abandonedReason;
    }

    /**
     * Sets the value of the abandonedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAbandonedReasonType }
     *     
     */
    public void setAbandonedReason(ZfcsAbandonedReasonType value) {
        this.abandonedReason = value;
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
     *                   &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
     *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
     *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                   &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="procent" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="admittedInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
     *                               &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
     *                             &lt;/choice>
     *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="correspondencies" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="correspondence" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicationCorrespondence" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="overallValue" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="100"/>
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
        "application"
    })
    public static class Applications {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsInfoProtocolZKBIType.Applications.Application> application;

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
         * {@link ZfcsInfoProtocolZKBIType.Applications.Application }
         * 
         * 
         */
        public List<ZfcsInfoProtocolZKBIType.Applications.Application> getApplication() {
            if (application == null) {
                application = new ArrayList<ZfcsInfoProtocolZKBIType.Applications.Application>();
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
         *         &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
         *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
         *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *         &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="procent" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="admittedInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
         *                     &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
         *                   &lt;/choice>
         *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="correspondencies" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="correspondence" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicationCorrespondence" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="overallValue" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="100"/>
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
            "journalNumber",
            "appDate",
            "appParticipant",
            "price",
            "spelledPrice",
            "procent",
            "admittedInfo",
            "correspondencies",
            "overallValue"
        })
        public static class Application {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String journalNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar appDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsParticipantType appParticipant;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String price;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String spelledPrice;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected BigDecimal procent;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsInfoProtocolZKBIType.Applications.Application.AdmittedInfo admittedInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsInfoProtocolZKBIType.Applications.Application.Correspondencies correspondencies;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Double overallValue;

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
             * Gets the value of the appParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsParticipantType }
             *     
             */
            public ZfcsParticipantType getAppParticipant() {
                return appParticipant;
            }

            /**
             * Sets the value of the appParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsParticipantType }
             *     
             */
            public void setAppParticipant(ZfcsParticipantType value) {
                this.appParticipant = value;
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
             * Gets the value of the spelledPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpelledPrice() {
                return spelledPrice;
            }

            /**
             * Sets the value of the spelledPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpelledPrice(String value) {
                this.spelledPrice = value;
            }

            /**
             * Gets the value of the procent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getProcent() {
                return procent;
            }

            /**
             * Sets the value of the procent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setProcent(BigDecimal value) {
                this.procent = value;
            }

            /**
             * Gets the value of the admittedInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsInfoProtocolZKBIType.Applications.Application.AdmittedInfo }
             *     
             */
            public ZfcsInfoProtocolZKBIType.Applications.Application.AdmittedInfo getAdmittedInfo() {
                return admittedInfo;
            }

            /**
             * Sets the value of the admittedInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsInfoProtocolZKBIType.Applications.Application.AdmittedInfo }
             *     
             */
            public void setAdmittedInfo(ZfcsInfoProtocolZKBIType.Applications.Application.AdmittedInfo value) {
                this.admittedInfo = value;
            }

            /**
             * Gets the value of the correspondencies property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsInfoProtocolZKBIType.Applications.Application.Correspondencies }
             *     
             */
            public ZfcsInfoProtocolZKBIType.Applications.Application.Correspondencies getCorrespondencies() {
                return correspondencies;
            }

            /**
             * Sets the value of the correspondencies property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsInfoProtocolZKBIType.Applications.Application.Correspondencies }
             *     
             */
            public void setCorrespondencies(ZfcsInfoProtocolZKBIType.Applications.Application.Correspondencies value) {
                this.correspondencies = value;
            }

            /**
             * Gets the value of the overallValue property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getOverallValue() {
                return overallValue;
            }

            /**
             * Sets the value of the overallValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setOverallValue(Double value) {
                this.overallValue = value;
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
             *           &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
             *           &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
             *         &lt;/choice>
             *         &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
                "resultType",
                "appRejectedReason",
                "appRating"
            })
            public static class AdmittedInfo {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                @XmlSchemaType(name = "string")
                protected ZfcsAdmissionResultsEnum resultType;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected List<ZfcsAppRejectedReasonType> appRejectedReason;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Short appRating;

                /**
                 * Gets the value of the resultType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsAdmissionResultsEnum }
                 *     
                 */
                public ZfcsAdmissionResultsEnum getResultType() {
                    return resultType;
                }

                /**
                 * Sets the value of the resultType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsAdmissionResultsEnum }
                 *     
                 */
                public void setResultType(ZfcsAdmissionResultsEnum value) {
                    this.resultType = value;
                }

                /**
                 * Gets the value of the appRejectedReason property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the appRejectedReason property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAppRejectedReason().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsAppRejectedReasonType }
                 * 
                 * 
                 */
                public List<ZfcsAppRejectedReasonType> getAppRejectedReason() {
                    if (appRejectedReason == null) {
                        appRejectedReason = new ArrayList<ZfcsAppRejectedReasonType>();
                    }
                    return this.appRejectedReason;
                }

                /**
                 * Gets the value of the appRating property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Short }
                 *     
                 */
                public Short getAppRating() {
                    return appRating;
                }

                /**
                 * Sets the value of the appRating property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Short }
                 *     
                 */
                public void setAppRating(Short value) {
                    this.appRating = value;
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
             *         &lt;element name="correspondence" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicationCorrespondence" maxOccurs="unbounded"/>
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
                "correspondence"
            })
            public static class Correspondencies {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsApplicationCorrespondence> correspondence;

                /**
                 * Gets the value of the correspondence property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the correspondence property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCorrespondence().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsApplicationCorrespondence }
                 * 
                 * 
                 */
                public List<ZfcsApplicationCorrespondence> getCorrespondence() {
                    if (correspondence == null) {
                        correspondence = new ArrayList<ZfcsApplicationCorrespondence>();
                    }
                    return this.correspondence;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_commissionType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Commission
        extends ZfcsCommissionType
    {


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
     *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "place",
        "openingDate",
        "scoringDate",
        "signDate"
    })
    public static class Execution {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String place;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar openingDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar scoringDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar signDate;

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
         * Gets the value of the openingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOpeningDate() {
            return openingDate;
        }

        /**
         * Sets the value of the openingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOpeningDate(XMLGregorianCalendar value) {
            this.openingDate = value;
        }

        /**
         * Gets the value of the scoringDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getScoringDate() {
            return scoringDate;
        }

        /**
         * Sets the value of the scoringDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setScoringDate(XMLGregorianCalendar value) {
            this.scoringDate = value;
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
     *         &lt;element name="purchaseResponsible" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placingWayType" minOccurs="0"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="notificationFullNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
     *         &lt;element name="notificationFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "purchaseResponsible",
        "placingWay",
        "publishDate",
        "purchaseObjectInfo",
        "notificationFullNumber",
        "notificationFullName"
    })
    public static class PurchaseInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsInfoProtocolZKBIType.PurchaseInfo.PurchaseResponsible purchaseResponsible;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPlacingWayType placingWay;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String purchaseObjectInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String notificationFullNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String notificationFullName;

        /**
         * Gets the value of the purchaseResponsible property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsInfoProtocolZKBIType.PurchaseInfo.PurchaseResponsible }
         *     
         */
        public ZfcsInfoProtocolZKBIType.PurchaseInfo.PurchaseResponsible getPurchaseResponsible() {
            return purchaseResponsible;
        }

        /**
         * Sets the value of the purchaseResponsible property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsInfoProtocolZKBIType.PurchaseInfo.PurchaseResponsible }
         *     
         */
        public void setPurchaseResponsible(ZfcsInfoProtocolZKBIType.PurchaseInfo.PurchaseResponsible value) {
            this.purchaseResponsible = value;
        }

        /**
         * Gets the value of the placingWay property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPlacingWayType }
         *     
         */
        public ZfcsPlacingWayType getPlacingWay() {
            return placingWay;
        }

        /**
         * Sets the value of the placingWay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPlacingWayType }
         *     
         */
        public void setPlacingWay(ZfcsPlacingWayType value) {
            this.placingWay = value;
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
         * Gets the value of the purchaseObjectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseObjectInfo() {
            return purchaseObjectInfo;
        }

        /**
         * Sets the value of the purchaseObjectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseObjectInfo(String value) {
            this.purchaseObjectInfo = value;
        }

        /**
         * Gets the value of the notificationFullNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationFullNumber() {
            return notificationFullNumber;
        }

        /**
         * Sets the value of the notificationFullNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotificationFullNumber(String value) {
            this.notificationFullNumber = value;
        }

        /**
         * Gets the value of the notificationFullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationFullName() {
            return notificationFullName;
        }

        /**
         * Sets the value of the notificationFullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotificationFullName(String value) {
            this.notificationFullName = value;
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
         *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
         *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
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
            "responsibleOrg",
            "responsibleRole"
        })
        public static class PurchaseResponsible {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOrganizationRef responsibleOrg;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsResponsibleRoleType responsibleRole;

            /**
             * Gets the value of the responsibleOrg property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public ZfcsOrganizationRef getResponsibleOrg() {
                return responsibleOrg;
            }

            /**
             * Sets the value of the responsibleOrg property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOrganizationRef }
             *     
             */
            public void setResponsibleOrg(ZfcsOrganizationRef value) {
                this.responsibleOrg = value;
            }

            /**
             * Gets the value of the responsibleRole property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsResponsibleRoleType }
             *     
             */
            public ZfcsResponsibleRoleType getResponsibleRole() {
                return responsibleRole;
            }

            /**
             * Sets the value of the responsibleRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsResponsibleRoleType }
             *     
             */
            public void setResponsibleRole(ZfcsResponsibleRoleType value) {
                this.responsibleRole = value;
            }

        }

    }

}
