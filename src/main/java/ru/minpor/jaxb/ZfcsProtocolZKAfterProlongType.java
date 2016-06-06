
package ru.minpor.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол рассмотрения и оценки заявок по результатам продления срока подачи заявок в ЗК
 * 
 * <p>Java class for zfcs_protocolZKAfterProlongType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolZKAfterProlongType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolType">
 *       &lt;sequence>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="execution">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                                       &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                                       &lt;element name="spelledPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;element name="admittedInfo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
 *                                                 &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolZKAfterProlongType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLot"
})
public class ZfcsProtocolZKAfterProlongType
    extends ZfcsPurchaseProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolZKAfterProlongType.ProtocolLot protocolLot;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot }
     *     
     */
    public ZfcsProtocolZKAfterProlongType.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolZKAfterProlongType.ProtocolLot value) {
        this.protocolLot = value;
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
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="execution">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
     *                             &lt;element name="admittedInfo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
     *                                       &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
     *                                     &lt;/choice>
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
    @XmlType(name = "", propOrder = {
        "lotNumber",
        "execution",
        "lotInfo",
        "applications",
        "abandonedReason"
    })
    public static class ProtocolLot {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger lotNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsProtocolZKAfterProlongType.ProtocolLot.Execution execution;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsLotInfoType lotInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications applications;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAbandonedReasonType abandonedReason;

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
         * Gets the value of the execution property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Execution }
         *     
         */
        public ZfcsProtocolZKAfterProlongType.ProtocolLot.Execution getExecution() {
            return execution;
        }

        /**
         * Sets the value of the execution property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Execution }
         *     
         */
        public void setExecution(ZfcsProtocolZKAfterProlongType.ProtocolLot.Execution value) {
            this.execution = value;
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
         *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications }
         *     
         */
        public ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications getApplications() {
            return applications;
        }

        /**
         * Sets the value of the applications property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications }
         *     
         */
        public void setApplications(ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications value) {
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
         *                   &lt;element name="admittedInfo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
         *                             &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
         *                           &lt;/choice>
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
            protected List<ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application> application;

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
             * {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application }
             * 
             * 
             */
            public List<ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application> getApplication() {
                if (application == null) {
                    application = new ArrayList<ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application>();
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
             *         &lt;element name="admittedInfo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
             *                   &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
             *                 &lt;/choice>
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
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.AdmittedInfo admittedInfo;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.Correspondencies correspondencies;
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
                 * Gets the value of the admittedInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.AdmittedInfo }
                 *     
                 */
                public ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.AdmittedInfo getAdmittedInfo() {
                    return admittedInfo;
                }

                /**
                 * Sets the value of the admittedInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.AdmittedInfo }
                 *     
                 */
                public void setAdmittedInfo(ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.AdmittedInfo value) {
                    this.admittedInfo = value;
                }

                /**
                 * Gets the value of the correspondencies property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.Correspondencies }
                 *     
                 */
                public ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.Correspondencies getCorrespondencies() {
                    return correspondencies;
                }

                /**
                 * Sets the value of the correspondencies property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.Correspondencies }
                 *     
                 */
                public void setCorrespondencies(ZfcsProtocolZKAfterProlongType.ProtocolLot.Applications.Application.Correspondencies value) {
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
                 *       &lt;choice>
                 *         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
                 *         &lt;element name="resultType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResultsEnum"/>
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
                    "appRejectedReason",
                    "resultType"
                })
                public static class AdmittedInfo {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected List<ZfcsAppRejectedReasonType> appRejectedReason;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "string")
                    protected ZfcsAdmissionResultsEnum resultType;

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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "openingDate",
            "scoringDate"
        })
        public static class Execution {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar openingDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar scoringDate;

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

        }

    }

}
