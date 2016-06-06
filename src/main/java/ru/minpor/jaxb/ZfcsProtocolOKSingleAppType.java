
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
 * Протокол рассмотрения единственной заявки в ОК
 * 
 * <p>Java class for zfcs_protocolOKSingleAppType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolOKSingleAppType">
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
 *                             &lt;element name="contractMulti" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractMultiType" minOccurs="0"/>
 *                             &lt;element name="application">
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
 *                                       &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
 *                                       &lt;element name="admittedInfo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
 *                                                 &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *                                       &lt;element name="offerPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *                                       &lt;element name="spelledOfferPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                       &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "zfcs_protocolOKSingleAppType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLots",
    "foundationProtocol"
})
public class ZfcsProtocolOKSingleAppType
    extends ZfcsPurchaseProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolOKSingleAppType.ProtocolLots protocolLots;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsFoundationProtocolInfoType foundationProtocol;

    /**
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots }
     *     
     */
    public ZfcsProtocolOKSingleAppType.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots }
     *     
     */
    public void setProtocolLots(ZfcsProtocolOKSingleAppType.ProtocolLots value) {
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
     *                   &lt;element name="contractMulti" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractMultiType" minOccurs="0"/>
     *                   &lt;element name="application">
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
     *                             &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
     *                             &lt;element name="admittedInfo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
     *                                       &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
     *                             &lt;element name="offerPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
     *                             &lt;element name="spelledOfferPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                             &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        protected List<ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot> protocolLot;

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
         * {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot }
         * 
         * 
         */
        public List<ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot> getProtocolLot() {
            if (protocolLot == null) {
                protocolLot = new ArrayList<ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot>();
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
         *         &lt;element name="contractMulti" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contractMultiType" minOccurs="0"/>
         *         &lt;element name="application">
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
         *                   &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
         *                   &lt;element name="admittedInfo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
         *                             &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
         *                   &lt;element name="offerPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
         *                   &lt;element name="spelledOfferPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                   &lt;element name="unconsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "contractMulti",
            "application",
            "abandonedReason"
        })
        public static class ProtocolLot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsLotInfoType lotInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsContractMultiType contractMulti;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application application;
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
             * Gets the value of the contractMulti property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContractMultiType }
             *     
             */
            public ZfcsContractMultiType getContractMulti() {
                return contractMulti;
            }

            /**
             * Sets the value of the contractMulti property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContractMultiType }
             *     
             */
            public void setContractMulti(ZfcsContractMultiType value) {
                this.contractMulti = value;
            }

            /**
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application }
             *     
             */
            public ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application }
             *     
             */
            public void setApplication(ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application value) {
                this.application = value;
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
             *         &lt;element name="admissionResults" type="{http://zakupki.gov.ru/oos/types/1}zfcs_admissionResults" minOccurs="0"/>
             *         &lt;element name="admittedInfo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
             *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
             *         &lt;element name="offerPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
             *         &lt;element name="spelledOfferPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                "admissionResults",
                "admittedInfo",
                "correspondencies",
                "overallValue",
                "offerPrice",
                "spelledOfferPrice",
                "unconsidered"
            })
            public static class Application {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String journalNumber;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar appDate;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AppParticipants appParticipants;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsAdmissionResults admissionResults;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AdmittedInfo admittedInfo;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.Correspondencies correspondencies;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected Double overallValue;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String offerPrice;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String spelledOfferPrice;
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
                 *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AppParticipants }
                 *     
                 */
                public ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AppParticipants getAppParticipants() {
                    return appParticipants;
                }

                /**
                 * Sets the value of the appParticipants property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AppParticipants }
                 *     
                 */
                public void setAppParticipants(ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AppParticipants value) {
                    this.appParticipants = value;
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
                 * Gets the value of the admittedInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AdmittedInfo }
                 *     
                 */
                public ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AdmittedInfo getAdmittedInfo() {
                    return admittedInfo;
                }

                /**
                 * Sets the value of the admittedInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AdmittedInfo }
                 *     
                 */
                public void setAdmittedInfo(ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.AdmittedInfo value) {
                    this.admittedInfo = value;
                }

                /**
                 * Gets the value of the correspondencies property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.Correspondencies }
                 *     
                 */
                public ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.Correspondencies getCorrespondencies() {
                    return correspondencies;
                }

                /**
                 * Sets the value of the correspondencies property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.Correspondencies }
                 *     
                 */
                public void setCorrespondencies(ZfcsProtocolOKSingleAppType.ProtocolLots.ProtocolLot.Application.Correspondencies value) {
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
                 * Gets the value of the offerPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOfferPrice() {
                    return offerPrice;
                }

                /**
                 * Sets the value of the offerPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOfferPrice(String value) {
                    this.offerPrice = value;
                }

                /**
                 * Gets the value of the spelledOfferPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSpelledOfferPrice() {
                    return spelledOfferPrice;
                }

                /**
                 * Sets the value of the spelledOfferPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSpelledOfferPrice(String value) {
                    this.spelledOfferPrice = value;
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
                 *       &lt;choice>
                 *         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_appRejectedReasonType" maxOccurs="unbounded"/>
                 *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                    "admitted"
                })
                public static class AdmittedInfo {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected List<ZfcsAppRejectedReasonType> appRejectedReason;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Boolean admitted;

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
