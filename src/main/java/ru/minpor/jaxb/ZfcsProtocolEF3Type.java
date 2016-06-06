
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол подведения итогов электронного аукциона
 * 
 * <p>Java class for zfcs_protocolEF3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolEF3Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolEFType">
 *       &lt;sequence>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applications">
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
 *                                       &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
 *                                       &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
 *                                       &lt;choice>
 *                                         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
 *                                         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         &lt;element name="notConsidered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
@XmlType(name = "zfcs_protocolEF3Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLot"
})
public class ZfcsProtocolEF3Type
    extends ZfcsPurchaseProtocolEFType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolEF3Type.ProtocolLot protocolLot;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF3Type.ProtocolLot }
     *     
     */
    public ZfcsProtocolEF3Type.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF3Type.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolEF3Type.ProtocolLot value) {
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
     *         &lt;element name="applications">
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
     *                             &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
     *                             &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
     *                             &lt;choice>
     *                               &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
     *                               &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               &lt;element name="notConsidered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;/choice>
     *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
        "applications",
        "abandonedReason"
    })
    public static class ProtocolLot {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsProtocolEF3Type.ProtocolLot.Applications applications;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsAbandonedReasonType abandonedReason;

        /**
         * Gets the value of the applications property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolEF3Type.ProtocolLot.Applications }
         *     
         */
        public ZfcsProtocolEF3Type.ProtocolLot.Applications getApplications() {
            return applications;
        }

        /**
         * Sets the value of the applications property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolEF3Type.ProtocolLot.Applications }
         *     
         */
        public void setApplications(ZfcsProtocolEF3Type.ProtocolLot.Applications value) {
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
         *                   &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
         *                   &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
         *                   &lt;choice>
         *                     &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
         *                     &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     &lt;element name="notConsidered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;/choice>
         *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
            protected List<ZfcsProtocolEF3Type.ProtocolLot.Applications.Application> application;

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
             * {@link ZfcsProtocolEF3Type.ProtocolLot.Applications.Application }
             * 
             * 
             */
            public List<ZfcsProtocolEF3Type.ProtocolLot.Applications.Application> getApplication() {
                if (application == null) {
                    application = new ArrayList<ZfcsProtocolEF3Type.ProtocolLot.Applications.Application>();
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
             *         &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
             *         &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
             *         &lt;choice>
             *           &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
             *           &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           &lt;element name="notConsidered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "journalNumber",
                "appParticipant",
                "admissionResults",
                "appRejectedReason",
                "admitted",
                "notConsidered",
                "appRating"
            })
            public static class Application {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String journalNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsParticipantType appParticipant;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsAdmissionResults admissionResults;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected List<ZfcsAppRejectedReasonType> appRejectedReason;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Boolean admitted;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Boolean notConsidered;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Short appRating;

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
                 * Gets the value of the admissionResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsAdmissionResults }
                 *     
                 */
                public ZfcsAdmissionResults getAdmissionResults() {
                    return admissionResults;
                }

                /**
                 * Sets the value of the admissionResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsAdmissionResults }
                 *     
                 */
                public void setAdmissionResults(ZfcsAdmissionResults value) {
                    this.admissionResults = value;
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
                 * Gets the value of the admitted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isAdmitted() {
                    return admitted;
                }

                /**
                 * Sets the value of the admitted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setAdmitted(Boolean value) {
                    this.admitted = value;
                }

                /**
                 * Gets the value of the notConsidered property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNotConsidered() {
                    return notConsidered;
                }

                /**
                 * Sets the value of the notConsidered property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setNotConsidered(Boolean value) {
                    this.notConsidered = value;
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

        }

    }

}
