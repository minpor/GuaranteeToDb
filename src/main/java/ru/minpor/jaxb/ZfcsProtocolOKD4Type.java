
package ru.minpor.jaxb;

import java.math.BigDecimal;
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
 * Протокол вскрытия конвертов и открытия доступа к электронным документам окончательных заявок в ОК-Д
 * 
 * <p>Java class for zfcs_protocolOKD4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolOKD4Type">
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
 *                             &lt;element name="criteria" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionType" maxOccurs="unbounded"/>
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
 *                                                                     &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
 *                                                                     &lt;choice>
 *                                                                       &lt;sequence>
 *                                                                         &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
 *                                                                         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                                       &lt;/sequence>
 *                                                                       &lt;element name="indicatorOffers">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;sequence>
 *                                                                                 &lt;element name="indicatorOffer" maxOccurs="unbounded">
 *                                                                                   &lt;complexType>
 *                                                                                     &lt;complexContent>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                         &lt;sequence>
 *                                                                                           &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                                                           &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
 *                                                                                           &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                                                                         &lt;/sequence>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/complexContent>
 *                                                                                   &lt;/complexType>
 *                                                                                 &lt;/element>
 *                                                                               &lt;/sequence>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                     &lt;/choice>
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
@XmlType(name = "zfcs_protocolOKD4Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLots",
    "foundationProtocol"
})
public class ZfcsProtocolOKD4Type
    extends ZfcsPurchaseProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsProtocolOKD4Type.ProtocolLots protocolLots;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsFoundationProtocolInfoType foundationProtocol;

    /**
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolOKD4Type.ProtocolLots }
     *     
     */
    public ZfcsProtocolOKD4Type.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolOKD4Type.ProtocolLots }
     *     
     */
    public void setProtocolLots(ZfcsProtocolOKD4Type.ProtocolLots value) {
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
     *                   &lt;element name="criteria" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionType" maxOccurs="unbounded"/>
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
     *                                                           &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
     *                                                           &lt;choice>
     *                                                             &lt;sequence>
     *                                                               &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
     *                                                               &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                                             &lt;/sequence>
     *                                                             &lt;element name="indicatorOffers">
     *                                                               &lt;complexType>
     *                                                                 &lt;complexContent>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                     &lt;sequence>
     *                                                                       &lt;element name="indicatorOffer" maxOccurs="unbounded">
     *                                                                         &lt;complexType>
     *                                                                           &lt;complexContent>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                               &lt;sequence>
     *                                                                                 &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                                                                 &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
     *                                                                                 &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                                                                               &lt;/sequence>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/complexContent>
     *                                                                         &lt;/complexType>
     *                                                                       &lt;/element>
     *                                                                     &lt;/sequence>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/complexContent>
     *                                                               &lt;/complexType>
     *                                                             &lt;/element>
     *                                                           &lt;/choice>
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
        protected List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot> protocolLot;

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
         * {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot }
         * 
         * 
         */
        public List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot> getProtocolLot() {
            if (protocolLot == null) {
                protocolLot = new ArrayList<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot>();
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
         *         &lt;element name="criteria" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionType" maxOccurs="unbounded"/>
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
         *                                                 &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
         *                                                 &lt;choice>
         *                                                   &lt;sequence>
         *                                                     &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
         *                                                     &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                                                   &lt;/sequence>
         *                                                   &lt;element name="indicatorOffers">
         *                                                     &lt;complexType>
         *                                                       &lt;complexContent>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                           &lt;sequence>
         *                                                             &lt;element name="indicatorOffer" maxOccurs="unbounded">
         *                                                               &lt;complexType>
         *                                                                 &lt;complexContent>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                     &lt;sequence>
         *                                                                       &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                                                                       &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
         *                                                                       &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *                                                                     &lt;/sequence>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/complexContent>
         *                                                               &lt;/complexType>
         *                                                             &lt;/element>
         *                                                           &lt;/sequence>
         *                                                         &lt;/restriction>
         *                                                       &lt;/complexContent>
         *                                                     &lt;/complexType>
         *                                                   &lt;/element>
         *                                                 &lt;/choice>
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
            "criteria",
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
            protected ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.DocumentRequirements documentRequirements;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Criteria criteria;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications applications;
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
             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.DocumentRequirements }
             *     
             */
            public ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.DocumentRequirements getDocumentRequirements() {
                return documentRequirements;
            }

            /**
             * Sets the value of the documentRequirements property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.DocumentRequirements }
             *     
             */
            public void setDocumentRequirements(ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.DocumentRequirements value) {
                this.documentRequirements = value;
            }

            /**
             * Gets the value of the criteria property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Criteria }
             *     
             */
            public ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Criteria getCriteria() {
                return criteria;
            }

            /**
             * Sets the value of the criteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Criteria }
             *     
             */
            public void setCriteria(ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Criteria value) {
                this.criteria = value;
            }

            /**
             * Gets the value of the applications property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications getApplications() {
                return applications;
            }

            /**
             * Sets the value of the applications property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public void setApplications(ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications value) {
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
             *                                       &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
             *                                       &lt;choice>
             *                                         &lt;sequence>
             *                                           &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
             *                                           &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *                                         &lt;/sequence>
             *                                         &lt;element name="indicatorOffers">
             *                                           &lt;complexType>
             *                                             &lt;complexContent>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                 &lt;sequence>
             *                                                   &lt;element name="indicatorOffer" maxOccurs="unbounded">
             *                                                     &lt;complexType>
             *                                                       &lt;complexContent>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                           &lt;sequence>
             *                                                             &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                                                             &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
             *                                                             &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
             *                                                           &lt;/sequence>
             *                                                         &lt;/restriction>
             *                                                       &lt;/complexContent>
             *                                                     &lt;/complexType>
             *                                                   &lt;/element>
             *                                                 &lt;/sequence>
             *                                               &lt;/restriction>
             *                                             &lt;/complexContent>
             *                                           &lt;/complexType>
             *                                         &lt;/element>
             *                                       &lt;/choice>
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
                protected List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application> application;

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
                 * {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application }
                 * 
                 * 
                 */
                public List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application> getApplication() {
                    if (application == null) {
                        application = new ArrayList<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application>();
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
                 *                             &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
                 *                             &lt;choice>
                 *                               &lt;sequence>
                 *                                 &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                 *                                 &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
                 *                               &lt;/sequence>
                 *                               &lt;element name="indicatorOffers">
                 *                                 &lt;complexType>
                 *                                   &lt;complexContent>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                       &lt;sequence>
                 *                                         &lt;element name="indicatorOffer" maxOccurs="unbounded">
                 *                                           &lt;complexType>
                 *                                             &lt;complexContent>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                 &lt;sequence>
                 *                                                   &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *                                                   &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                 *                                                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
                 *                                                 &lt;/sequence>
                 *                                               &lt;/restriction>
                 *                                             &lt;/complexContent>
                 *                                           &lt;/complexType>
                 *                                         &lt;/element>
                 *                                       &lt;/sequence>
                 *                                     &lt;/restriction>
                 *                                   &lt;/complexContent>
                 *                                 &lt;/complexType>
                 *                               &lt;/element>
                 *                             &lt;/choice>
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
                    "appDate",
                    "appParticipants",
                    "documentCompliances",
                    "contractConditions"
                })
                public static class Application {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String journalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar appDate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants appParticipants;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances documentCompliances;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions contractConditions;

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
                     *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants }
                     *     
                     */
                    public ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants getAppParticipants() {
                        return appParticipants;
                    }

                    /**
                     * Sets the value of the appParticipants property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants }
                     *     
                     */
                    public void setAppParticipants(ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.AppParticipants value) {
                        this.appParticipants = value;
                    }

                    /**
                     * Gets the value of the documentCompliances property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances }
                     *     
                     */
                    public ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances getDocumentCompliances() {
                        return documentCompliances;
                    }

                    /**
                     * Sets the value of the documentCompliances property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances }
                     *     
                     */
                    public void setDocumentCompliances(ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances value) {
                        this.documentCompliances = value;
                    }

                    /**
                     * Gets the value of the contractConditions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions }
                     *     
                     */
                    public ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions getContractConditions() {
                        return contractConditions;
                    }

                    /**
                     * Sets the value of the contractConditions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions }
                     *     
                     */
                    public void setContractConditions(ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions value) {
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
                     *         &lt;element name="contractCondition" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
                     *                   &lt;choice>
                     *                     &lt;sequence>
                     *                       &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                     *                       &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
                     *                     &lt;/sequence>
                     *                     &lt;element name="indicatorOffers">
                     *                       &lt;complexType>
                     *                         &lt;complexContent>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                             &lt;sequence>
                     *                               &lt;element name="indicatorOffer" maxOccurs="unbounded">
                     *                                 &lt;complexType>
                     *                                   &lt;complexContent>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                       &lt;sequence>
                     *                                         &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
                     *                                         &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                     *                                         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
                     *                                       &lt;/sequence>
                     *                                     &lt;/restriction>
                     *                                   &lt;/complexContent>
                     *                                 &lt;/complexType>
                     *                               &lt;/element>
                     *                             &lt;/sequence>
                     *                           &lt;/restriction>
                     *                         &lt;/complexContent>
                     *                       &lt;/complexType>
                     *                     &lt;/element>
                     *                   &lt;/choice>
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
                        protected List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition> contractCondition;

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
                         * {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition }
                         * 
                         * 
                         */
                        public List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition> getContractCondition() {
                            if (contractCondition == null) {
                                contractCondition = new ArrayList<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition>();
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
                         *         &lt;element name="criterionCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
                         *         &lt;choice>
                         *           &lt;sequence>
                         *             &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                         *             &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
                         *           &lt;/sequence>
                         *           &lt;element name="indicatorOffers">
                         *             &lt;complexType>
                         *               &lt;complexContent>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                   &lt;sequence>
                         *                     &lt;element name="indicatorOffer" maxOccurs="unbounded">
                         *                       &lt;complexType>
                         *                         &lt;complexContent>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                             &lt;sequence>
                         *                               &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
                         *                               &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                         *                               &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
                         *                             &lt;/sequence>
                         *                           &lt;/restriction>
                         *                         &lt;/complexContent>
                         *                       &lt;/complexType>
                         *                     &lt;/element>
                         *                   &lt;/sequence>
                         *                 &lt;/restriction>
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
                            "criterionCode",
                            "offer",
                            "addInfo",
                            "indicatorOffers"
                        })
                        public static class ContractCondition {

                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                            @XmlSchemaType(name = "string")
                            protected ZfcsCriterionCodeEnum criterionCode;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected BigDecimal offer;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected String addInfo;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers indicatorOffers;

                            /**
                             * Gets the value of the criterionCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ZfcsCriterionCodeEnum }
                             *     
                             */
                            public ZfcsCriterionCodeEnum getCriterionCode() {
                                return criterionCode;
                            }

                            /**
                             * Sets the value of the criterionCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ZfcsCriterionCodeEnum }
                             *     
                             */
                            public void setCriterionCode(ZfcsCriterionCodeEnum value) {
                                this.criterionCode = value;
                            }

                            /**
                             * Gets the value of the offer property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getOffer() {
                                return offer;
                            }

                            /**
                             * Sets the value of the offer property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setOffer(BigDecimal value) {
                                this.offer = value;
                            }

                            /**
                             * Gets the value of the addInfo property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAddInfo() {
                                return addInfo;
                            }

                            /**
                             * Sets the value of the addInfo property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAddInfo(String value) {
                                this.addInfo = value;
                            }

                            /**
                             * Gets the value of the indicatorOffers property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers }
                             *     
                             */
                            public ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers getIndicatorOffers() {
                                return indicatorOffers;
                            }

                            /**
                             * Sets the value of the indicatorOffers property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers }
                             *     
                             */
                            public void setIndicatorOffers(ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers value) {
                                this.indicatorOffers = value;
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
                             *         &lt;element name="indicatorOffer" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
                             *                   &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                             *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                                "indicatorOffer"
                            })
                            public static class IndicatorOffers {

                                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                                protected List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers.IndicatorOffer> indicatorOffer;

                                /**
                                 * Gets the value of the indicatorOffer property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the indicatorOffer property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getIndicatorOffer().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers.IndicatorOffer }
                                 * 
                                 * 
                                 */
                                public List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers.IndicatorOffer> getIndicatorOffer() {
                                    if (indicatorOffer == null) {
                                        indicatorOffer = new ArrayList<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.IndicatorOffers.IndicatorOffer>();
                                    }
                                    return this.indicatorOffer;
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
                                 *         &lt;element name="indicatorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
                                 *         &lt;element name="offer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
                                 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
                                    "indicatorCode",
                                    "offer",
                                    "addInfo"
                                })
                                public static class IndicatorOffer {

                                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                                    protected long indicatorCode;
                                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                                    protected BigDecimal offer;
                                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                                    protected String addInfo;

                                    /**
                                     * Gets the value of the indicatorCode property.
                                     * 
                                     */
                                    public long getIndicatorCode() {
                                        return indicatorCode;
                                    }

                                    /**
                                     * Sets the value of the indicatorCode property.
                                     * 
                                     */
                                    public void setIndicatorCode(long value) {
                                        this.indicatorCode = value;
                                    }

                                    /**
                                     * Gets the value of the offer property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getOffer() {
                                        return offer;
                                    }

                                    /**
                                     * Sets the value of the offer property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setOffer(BigDecimal value) {
                                        this.offer = value;
                                    }

                                    /**
                                     * Gets the value of the addInfo property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getAddInfo() {
                                        return addInfo;
                                    }

                                    /**
                                     * Sets the value of the addInfo property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setAddInfo(String value) {
                                        this.addInfo = value;
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
                        protected List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance> documentCompliance;

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
                         * {@link ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance }
                         * 
                         * 
                         */
                        public List<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance> getDocumentCompliance() {
                            if (documentCompliance == null) {
                                documentCompliance = new ArrayList<ZfcsProtocolOKD4Type.ProtocolLots.ProtocolLot.Applications.Application.DocumentCompliances.DocumentCompliance>();
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
             *         &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionType" maxOccurs="unbounded"/>
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
                "criterion"
            })
            public static class Criteria {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected List<ZfcsCriterionType> criterion;

                /**
                 * Gets the value of the criterion property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the criterion property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCriterion().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsCriterionType }
                 * 
                 * 
                 */
                public List<ZfcsCriterionType> getCriterion() {
                    if (criterion == null) {
                        criterion = new ArrayList<ZfcsCriterionType>();
                    }
                    return this.criterion;
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
