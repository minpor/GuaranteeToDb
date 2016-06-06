
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
 * Протокол вскрытия конвертов и открытия доступа к электронным документам первоначальных заявок в ОК-Д
 * 
 * <p>Java class for zfcs_protocolOKD1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolOKD1Type">
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
 *                             &lt;element name="documentRequirements" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="documentRequirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType" maxOccurs="unbounded"/>
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
 *                                                 &lt;element name="documentCompliances" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="documentCompliance" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="compliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentComplianceEnum"/>
 *                                                                     &lt;element name="otherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/extension>
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
 *         &lt;element name="isPrequalification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolOKD1Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLots",
    "isPrequalification"
})
public class ZfcsProtocolOKD1Type
    extends ZfcsPurchaseProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolOKD1Type.ProtocolLots protocolLots;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean isPrequalification;

    /**
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKD1Type.ProtocolLots }
     *     
     */
    public ZfcsProtocolOKD1Type.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKD1Type.ProtocolLots }
     *     
     */
    public void setProtocolLots(ZfcsProtocolOKD1Type.ProtocolLots value) {
        this.protocolLots = value;
    }

    /**
     * Gets the value of the isPrequalification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrequalification() {
        return isPrequalification;
    }

    /**
     * Sets the value of the isPrequalification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrequalification(Boolean value) {
        this.isPrequalification = value;
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
     *                   &lt;element name="documentRequirements" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="documentRequirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType" maxOccurs="unbounded"/>
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
     *                                       &lt;element name="documentCompliances" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="documentCompliance" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="compliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentComplianceEnum"/>
     *                                                           &lt;element name="otherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/extension>
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
        protected List<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot> protocolLot;

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
         * {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot }
         * 
         * 
         */
        public List<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot> getProtocolLot() {
            if (protocolLot == null) {
                protocolLot = new ArrayList<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot>();
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
         *         &lt;element name="documentRequirements" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="documentRequirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType" maxOccurs="unbounded"/>
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
         *                             &lt;element name="documentCompliances" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="documentCompliance" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="compliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentComplianceEnum"/>
         *                                                 &lt;element name="otherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/extension>
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
            "documentRequirements",
            "applications",
            "abandonedReason"
        })
        public static class ProtocolLot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsLotInfoType lotInfo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.DocumentRequirements documentRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications applications;
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
             * Gets the value of the documentRequirements property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.DocumentRequirements }
             *     
             */
            public ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.DocumentRequirements getDocumentRequirements() {
                return documentRequirements;
            }

            /**
             * Sets the value of the documentRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.DocumentRequirements }
             *     
             */
            public void setDocumentRequirements(ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.DocumentRequirements value) {
                this.documentRequirements = value;
            }

            /**
             * Gets the value of the applications property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications getApplications() {
                return applications;
            }

            /**
             * Sets the value of the applications property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public void setApplications(ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications value) {
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
             *                   &lt;element name="documentCompliances" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="documentCompliance" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType">
             *                                     &lt;sequence>
             *                                       &lt;element name="compliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentComplianceEnum"/>
             *                                       &lt;element name="otherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                protected List<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application> application;

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
                 * {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application }
                 * 
                 * 
                 */
                public List<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application> getApplication() {
                    if (application == null) {
                        application = new ArrayList<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application>();
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
                 *         &lt;element name="documentCompliances" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="documentCompliance" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType">
                 *                           &lt;sequence>
                 *                             &lt;element name="compliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentComplianceEnum"/>
                 *                             &lt;element name="otherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                    "journalNumber",
                    "appDate",
                    "appParticipants",
                    "documentCompliances"
                })
                public static class Application {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String journalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar appDate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants appParticipants;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances documentCompliances;

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
                     *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants }
                     *     
                     */
                    public ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants getAppParticipants() {
                        return appParticipants;
                    }

                    /**
                     * Sets the value of the appParticipants property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants }
                     *     
                     */
                    public void setAppParticipants(ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants value) {
                        this.appParticipants = value;
                    }

                    /**
                     * Gets the value of the documentCompliances property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances }
                     *     
                     */
                    public ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances getDocumentCompliances() {
                        return documentCompliances;
                    }

                    /**
                     * Sets the value of the documentCompliances property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances }
                     *     
                     */
                    public void setDocumentCompliances(ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances value) {
                        this.documentCompliances = value;
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
                     *         &lt;element name="documentCompliance" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType">
                     *                 &lt;sequence>
                     *                   &lt;element name="compliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentComplianceEnum"/>
                     *                   &lt;element name="otherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                        "documentCompliance"
                    })
                    public static class DocumentCompliances {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance> documentCompliance;

                        /**
                         * Gets the value of the documentCompliance property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the documentCompliance property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDocumentCompliance().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance }
                         * 
                         * 
                         */
                        public List<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance> getDocumentCompliance() {
                            if (documentCompliance == null) {
                                documentCompliance = new ArrayList<ZfcsProtocolOKD1Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance>();
                            }
                            return this.documentCompliance;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType">
                         *       &lt;sequence>
                         *         &lt;element name="compliance" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentComplianceEnum"/>
                         *         &lt;element name="otherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                            "compliance",
                            "otherInfo"
                        })
                        public static class DocumentCompliance
                            extends ZfcsDocumentRequirementType
                        {

                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                            @XmlSchemaType(name = "string")
                            protected ZfcsDocumentComplianceEnum compliance;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected String otherInfo;

                            /**
                             * Gets the value of the compliance property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ZfcsDocumentComplianceEnum }
                             *     
                             */
                            public ZfcsDocumentComplianceEnum getCompliance() {
                                return compliance;
                            }

                            /**
                             * Sets the value of the compliance property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ZfcsDocumentComplianceEnum }
                             *     
                             */
                            public void setCompliance(ZfcsDocumentComplianceEnum value) {
                                this.compliance = value;
                            }

                            /**
                             * Gets the value of the otherInfo property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getOtherInfo() {
                                return otherInfo;
                            }

                            /**
                             * Sets the value of the otherInfo property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setOtherInfo(String value) {
                                this.otherInfo = value;
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
             *         &lt;element name="documentRequirement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentRequirementType" maxOccurs="unbounded"/>
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
                protected List<ZfcsDocumentRequirementType> documentRequirement;

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
                 * {@link ZfcsDocumentRequirementType }
                 * 
                 * 
                 */
                public List<ZfcsDocumentRequirementType> getDocumentRequirement() {
                    if (documentRequirement == null) {
                        documentRequirement = new ArrayList<ZfcsDocumentRequirementType>();
                    }
                    return this.documentRequirement;
                }

            }

        }

    }

}
