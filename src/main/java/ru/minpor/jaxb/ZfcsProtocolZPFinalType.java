
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
 * Итоговый протокол в ЗП
 * 
 * <p>Java class for zfcs_protocolZPFinalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolZPFinalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolType">
 *       &lt;sequence>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lotInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotInfoType" minOccurs="0"/>
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
 *                                       &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
 *                                       &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
 *                                       &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                       &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;element name="lastOffer" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                                                 &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                 &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="bestOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                                       &lt;element name="correspondencies" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="correspondence" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicationCorrespondence" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="overallValue" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                             &lt;minInclusive value="0"/>
 *                                             &lt;maxInclusive value="100"/>
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
 *                   &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="foundationProtocolName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolZPFinalType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLot",
    "foundationProtocolName"
})
public class ZfcsProtocolZPFinalType
    extends ZfcsPurchaseProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolZPFinalType.ProtocolLot protocolLot;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String foundationProtocolName;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZPFinalType.ProtocolLot }
     *     
     */
    public ZfcsProtocolZPFinalType.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZPFinalType.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolZPFinalType.ProtocolLot value) {
        this.protocolLot = value;
    }

    /**
     * Gets the value of the foundationProtocolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationProtocolName() {
        return foundationProtocolName;
    }

    /**
     * Sets the value of the foundationProtocolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationProtocolName(String value) {
        this.foundationProtocolName = value;
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
     *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                             &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                             &lt;element name="lastOffer" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *                                       &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                       &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="bestOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "lotInfo",
        "applications",
        "abandonedReason"
    })
    public static class ProtocolLot {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsLotInfoType lotInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsProtocolZPFinalType.ProtocolLot.Applications applications;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAbandonedReasonType abandonedReason;

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
         *     {@link ZfcsProtocolZPFinalType.ProtocolLot.Applications }
         *     
         */
        public ZfcsProtocolZPFinalType.ProtocolLot.Applications getApplications() {
            return applications;
        }

        /**
         * Sets the value of the applications property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZPFinalType.ProtocolLot.Applications }
         *     
         */
        public void setApplications(ZfcsProtocolZPFinalType.ProtocolLot.Applications value) {
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
         *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                   &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                   &lt;element name="lastOffer" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
         *                             &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="bestOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
            protected List<ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application> application;

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
             * {@link ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application }
             * 
             * 
             */
            public List<ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application> getApplication() {
                if (application == null) {
                    application = new ArrayList<ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application>();
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
             *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
             *         &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *         &lt;element name="lastOffer" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
             *                   &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="bestOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
                "lastOffer",
                "bestOffer",
                "appRating",
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
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String price;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String spelledPrice;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.LastOffer lastOffer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Boolean bestOffer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Short appRating;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.Correspondencies correspondencies;
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
                 * Gets the value of the lastOffer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.LastOffer }
                 *     
                 */
                public ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.LastOffer getLastOffer() {
                    return lastOffer;
                }

                /**
                 * Sets the value of the lastOffer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.LastOffer }
                 *     
                 */
                public void setLastOffer(ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.LastOffer value) {
                    this.lastOffer = value;
                }

                /**
                 * Gets the value of the bestOffer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isBestOffer() {
                    return bestOffer;
                }

                /**
                 * Sets the value of the bestOffer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setBestOffer(Boolean value) {
                    this.bestOffer = value;
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

                /**
                 * Gets the value of the correspondencies property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.Correspondencies }
                 *     
                 */
                public ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.Correspondencies getCorrespondencies() {
                    return correspondencies;
                }

                /**
                 * Sets the value of the correspondencies property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.Correspondencies }
                 *     
                 */
                public void setCorrespondencies(ZfcsProtocolZPFinalType.ProtocolLot.Applications.Application.Correspondencies value) {
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
                 *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
                 *         &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                    "price",
                    "spelledPrice",
                    "date"
                })
                public static class LastOffer {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String price;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String spelledPrice;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar date;

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

        }

    }

}
