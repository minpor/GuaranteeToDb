
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
 * Протокол предквалификационного отбора в ОК-ОУ
 * 
 * <p>Java class for zfcs_protocolOKOU2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolOKOU2Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolType">
 *       &lt;sequence>
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
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             &lt;element name="lotInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotInfoType" minOccurs="0"/>
 *                             &lt;element name="applications">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="application" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
 *                                                 &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                                 &lt;element name="appParticipants">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                                 &lt;element name="admittedInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                                 &lt;element name="correspondencies" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="correspondence" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicationCorrespondence" maxOccurs="unbounded"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                             &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
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
 *         &lt;element name="foundationProtocol" type="{http://zakupki.gov.ru/oos/types/1}zfcs_foundationProtocolInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolOKOU2Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLots",
    "foundationProtocol"
})
public class ZfcsProtocolOKOU2Type
    extends ZfcsPurchaseProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolOKOU2Type.ProtocolLots protocolLots;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsFoundationProtocolInfoType foundationProtocol;

    /**
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKOU2Type.ProtocolLots }
     *     
     */
    public ZfcsProtocolOKOU2Type.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKOU2Type.ProtocolLots }
     *     
     */
    public void setProtocolLots(ZfcsProtocolOKOU2Type.ProtocolLots value) {
        this.protocolLots = value;
    }

    /**
     * Gets the value of the foundationProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsFoundationProtocolInfoType }
     *     
     */
    public ZfcsFoundationProtocolInfoType getFoundationProtocol() {
        return foundationProtocol;
    }

    /**
     * Sets the value of the foundationProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsFoundationProtocolInfoType }
     *     
     */
    public void setFoundationProtocol(ZfcsFoundationProtocolInfoType value) {
        this.foundationProtocol = value;
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
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   &lt;element name="lotInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotInfoType" minOccurs="0"/>
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
     *                                       &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                       &lt;element name="appParticipants">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                                       &lt;element name="admittedInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
     *                                       &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        protected List<ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot> protocolLot;

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
         * {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot }
         * 
         * 
         */
        public List<ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot> getProtocolLot() {
            if (protocolLot == null) {
                protocolLot = new ArrayList<ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot>();
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
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         &lt;element name="lotInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotInfoType" minOccurs="0"/>
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
         *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                             &lt;element name="appParticipants">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                             &lt;element name="admittedInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
         *                             &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "lotInfo",
            "applications",
            "abandonedReason"
        })
        public static class ProtocolLot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsLotInfoType lotInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications applications;
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
             *     {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications getApplications() {
                return applications;
            }

            /**
             * Sets the value of the applications property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public void setApplications(ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications value) {
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
             *                   &lt;element name="appParticipants">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
             *                   &lt;element name="admittedInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
             *                   &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                protected List<ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application> application;

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
                 * {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application }
                 * 
                 * 
                 */
                public List<ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application> getApplication() {
                    if (application == null) {
                        application = new ArrayList<ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application>();
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
                 *         &lt;element name="appParticipants">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
                 *         &lt;element name="admittedInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
                 *         &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                    "appParticipants",
                    "price",
                    "admittedInfo",
                    "explanation",
                    "correspondencies",
                    "unconsidered"
                })
                public static class Application {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String journalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar appDate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants appParticipants;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String price;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected boolean admittedInfo;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String explanation;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.Correspondencies correspondencies;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Boolean unconsidered;

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
                     * Gets the value of the appParticipants property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants }
                     *     
                     */
                    public ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants getAppParticipants() {
                        return appParticipants;
                    }

                    /**
                     * Sets the value of the appParticipants property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants }
                     *     
                     */
                    public void setAppParticipants(ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants value) {
                        this.appParticipants = value;
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
                     * Gets the value of the admittedInfo property.
                     * 
                     */
                    public boolean isAdmittedInfo() {
                        return admittedInfo;
                    }

                    /**
                     * Sets the value of the admittedInfo property.
                     * 
                     */
                    public void setAdmittedInfo(boolean value) {
                        this.admittedInfo = value;
                    }

                    /**
                     * Gets the value of the explanation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExplanation() {
                        return explanation;
                    }

                    /**
                     * Sets the value of the explanation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExplanation(String value) {
                        this.explanation = value;
                    }

                    /**
                     * Gets the value of the correspondencies property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.Correspondencies }
                     *     
                     */
                    public ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.Correspondencies getCorrespondencies() {
                        return correspondencies;
                    }

                    /**
                     * Sets the value of the correspondencies property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.Correspondencies }
                     *     
                     */
                    public void setCorrespondencies(ZfcsProtocolOKOU2Type.ProtocolLots.ProtocolLot.Applications.Application.Correspondencies value) {
                        this.correspondencies = value;
                    }

                    /**
                     * Gets the value of the unconsidered property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isUnconsidered() {
                        return unconsidered;
                    }

                    /**
                     * Sets the value of the unconsidered property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setUnconsidered(Boolean value) {
                        this.unconsidered = value;
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
                     *         &lt;element name="appParticipant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType" maxOccurs="unbounded"/>
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
                        "appParticipant"
                    })
                    public static class AppParticipants {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<ZfcsParticipantType> appParticipant;

                        /**
                         * Gets the value of the appParticipant property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the appParticipant property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAppParticipant().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ZfcsParticipantType }
                         * 
                         * 
                         */
                        public List<ZfcsParticipantType> getAppParticipant() {
                            if (appParticipant == null) {
                                appParticipant = new ArrayList<ZfcsParticipantType>();
                            }
                            return this.appParticipant;
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

        }

    }

}
