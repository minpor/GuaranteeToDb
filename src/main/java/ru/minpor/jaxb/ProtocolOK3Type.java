
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол оценки и сопоставления заявок на участие в открытом конкурсе
 * 
 * <p>Java class for protocolOK3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolOK3Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}protocolType">
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
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *                                                 &lt;element name="journalNumber">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="20"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                                                 &lt;element name="resultType" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;enumeration value="W"/>
 *                                                       &lt;enumeration value="S"/>
 *                                                       &lt;enumeration value="EMPTY"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="prefExpl" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="2000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="generalPrefs" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
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
 *                                                                     &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}criterionRef" minOccurs="0"/>
 *                                                                     &lt;element name="evaluationResults" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="evaluationResult" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
 *                                                                                         &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="perMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                                     &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                     &lt;element name="manual" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                               &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
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
 *                                                 &lt;element name="featuresCorrespondences" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="featuresCorrespondence" type="{http://zakupki.gov.ru/oos/types/1}applicationFeaturesCorrespondence" maxOccurs="unbounded"/>
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
 *                             &lt;element name="contractMulti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolOK3Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLots"
})
public class ProtocolOK3Type
    extends ProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ProtocolOK3Type.ProtocolLots protocolLots;

    /**
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOK3Type.ProtocolLots }
     *     
     */
    public ProtocolOK3Type.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOK3Type.ProtocolLots }
     *     
     */
    public void setProtocolLots(ProtocolOK3Type.ProtocolLots value) {
        this.protocolLots = value;
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
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
     *                                       &lt;element name="journalNumber">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="20"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                                       &lt;element name="resultType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="17"/>
     *                                             &lt;enumeration value="W"/>
     *                                             &lt;enumeration value="S"/>
     *                                             &lt;enumeration value="EMPTY"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="prefExpl" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="2000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="generalPrefs" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
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
     *                                                           &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}criterionRef" minOccurs="0"/>
     *                                                           &lt;element name="evaluationResults" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="evaluationResult" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
     *                                                                               &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="perMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                           &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                           &lt;element name="manual" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                                                     &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
     *                                       &lt;element name="featuresCorrespondences" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="featuresCorrespondence" type="{http://zakupki.gov.ru/oos/types/1}applicationFeaturesCorrespondence" maxOccurs="unbounded"/>
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
     *                   &lt;element name="contractMulti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        protected List<ProtocolOK3Type.ProtocolLots.ProtocolLot> protocolLot;

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
         * {@link ProtocolOK3Type.ProtocolLots.ProtocolLot }
         * 
         * 
         */
        public List<ProtocolOK3Type.ProtocolLots.ProtocolLot> getProtocolLot() {
            if (protocolLot == null) {
                protocolLot = new ArrayList<ProtocolOK3Type.ProtocolLots.ProtocolLot>();
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
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
         *                             &lt;element name="journalNumber">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
         *                             &lt;element name="resultType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="17"/>
         *                                   &lt;enumeration value="W"/>
         *                                   &lt;enumeration value="S"/>
         *                                   &lt;enumeration value="EMPTY"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="prefExpl" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="2000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="generalPrefs" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
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
         *                                                 &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}criterionRef" minOccurs="0"/>
         *                                                 &lt;element name="evaluationResults" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="evaluationResult" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
         *                                                                     &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
         *                                                 &lt;element name="perMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                                 &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                                 &lt;element name="manual" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                                                           &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
         *                             &lt;element name="featuresCorrespondences" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="featuresCorrespondence" type="{http://zakupki.gov.ru/oos/types/1}applicationFeaturesCorrespondence" maxOccurs="unbounded"/>
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
         *         &lt;element name="contractMulti" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "applications",
            "contractMulti"
        })
        public static class ProtocolLot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications applications;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Boolean contractMulti;

            /**
             * Gets the value of the lotNumber property.
             * 
             */
            public int getLotNumber() {
                return lotNumber;
            }

            /**
             * Sets the value of the lotNumber property.
             * 
             */
            public void setLotNumber(int value) {
                this.lotNumber = value;
            }

            /**
             * Gets the value of the applications property.
             * 
             * @return
             *     possible object is
             *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications getApplications() {
                return applications;
            }

            /**
             * Sets the value of the applications property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public void setApplications(ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications value) {
                this.applications = value;
            }

            /**
             * Gets the value of the contractMulti property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isContractMulti() {
                return contractMulti;
            }

            /**
             * Sets the value of the contractMulti property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setContractMulti(Boolean value) {
                this.contractMulti = value;
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
             *                   &lt;element name="journalNumber">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
             *                   &lt;element name="resultType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="17"/>
             *                         &lt;enumeration value="W"/>
             *                         &lt;enumeration value="S"/>
             *                         &lt;enumeration value="EMPTY"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="prefExpl" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="2000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="generalPrefs" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
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
             *                                       &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}criterionRef" minOccurs="0"/>
             *                                       &lt;element name="evaluationResults" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="evaluationResult" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
             *                                                           &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
             *                                       &lt;element name="perMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                                       &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                                       &lt;element name="manual" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                                                 &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
             *                   &lt;element name="featuresCorrespondences" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="featuresCorrespondence" type="{http://zakupki.gov.ru/oos/types/1}applicationFeaturesCorrespondence" maxOccurs="unbounded"/>
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
                protected List<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application> application;

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
                 * {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application }
                 * 
                 * 
                 */
                public List<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application> getApplication() {
                    if (application == null) {
                        application = new ArrayList<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application>();
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
                 *         &lt;element name="journalNumber">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
                 *         &lt;element name="resultType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="17"/>
                 *               &lt;enumeration value="W"/>
                 *               &lt;enumeration value="S"/>
                 *               &lt;enumeration value="EMPTY"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="prefExpl" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="2000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="generalPrefs" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
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
                 *                             &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}criterionRef" minOccurs="0"/>
                 *                             &lt;element name="evaluationResults" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="evaluationResult" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
                 *                                                 &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                 *                             &lt;element name="perMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                             &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                             &lt;element name="manual" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *                                       &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                 *         &lt;element name="featuresCorrespondences" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="featuresCorrespondence" type="{http://zakupki.gov.ru/oos/types/1}applicationFeaturesCorrespondence" maxOccurs="unbounded"/>
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
                    "appRating",
                    "resultType",
                    "evalResult",
                    "prefExpl",
                    "generalPrefs",
                    "contractConditions",
                    "featuresCorrespondences"
                })
                public static class Application {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String journalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Short appRating;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String resultType;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double evalResult;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String prefExpl;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Byte generalPrefs;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions contractConditions;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences featuresCorrespondences;

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
                     * Gets the value of the resultType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResultType() {
                        return resultType;
                    }

                    /**
                     * Sets the value of the resultType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResultType(String value) {
                        this.resultType = value;
                    }

                    /**
                     * Gets the value of the evalResult property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getEvalResult() {
                        return evalResult;
                    }

                    /**
                     * Sets the value of the evalResult property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setEvalResult(Double value) {
                        this.evalResult = value;
                    }

                    /**
                     * Gets the value of the prefExpl property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrefExpl() {
                        return prefExpl;
                    }

                    /**
                     * Sets the value of the prefExpl property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrefExpl(String value) {
                        this.prefExpl = value;
                    }

                    /**
                     * Gets the value of the generalPrefs property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getGeneralPrefs() {
                        return generalPrefs;
                    }

                    /**
                     * Sets the value of the generalPrefs property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setGeneralPrefs(Byte value) {
                        this.generalPrefs = value;
                    }

                    /**
                     * Gets the value of the contractConditions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions }
                     *     
                     */
                    public ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions getContractConditions() {
                        return contractConditions;
                    }

                    /**
                     * Sets the value of the contractConditions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions }
                     *     
                     */
                    public void setContractConditions(ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions value) {
                        this.contractConditions = value;
                    }

                    /**
                     * Gets the value of the featuresCorrespondences property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences }
                     *     
                     */
                    public ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences getFeaturesCorrespondences() {
                        return featuresCorrespondences;
                    }

                    /**
                     * Sets the value of the featuresCorrespondences property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences }
                     *     
                     */
                    public void setFeaturesCorrespondences(ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences value) {
                        this.featuresCorrespondences = value;
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
                     *                   &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}criterionRef" minOccurs="0"/>
                     *                   &lt;element name="evaluationResults" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="evaluationResult" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
                     *                                       &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                     *                   &lt;element name="perMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *                   &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                     *                   &lt;element name="manual" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                     *                             &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                        "contractCondition"
                    })
                    public static class ContractConditions {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition> contractCondition;

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
                         * {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition }
                         * 
                         * 
                         */
                        public List<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition> getContractCondition() {
                            if (contractCondition == null) {
                                contractCondition = new ArrayList<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition>();
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
                         *         &lt;element name="criterion" type="{http://zakupki.gov.ru/oos/types/1}criterionRef" minOccurs="0"/>
                         *         &lt;element name="evaluationResults" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="evaluationResult" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
                         *                             &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                         *         &lt;element name="perMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                         *         &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                         *         &lt;element name="manual" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                         *                   &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                            "criterion",
                            "evaluationResults",
                            "perMember",
                            "evalResult",
                            "manual"
                        })
                        public static class ContractCondition {

                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected CriterionRef criterion;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults evaluationResults;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected boolean perMember;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected Double evalResult;
                            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Manual manual;

                            /**
                             * Gets the value of the criterion property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link CriterionRef }
                             *     
                             */
                            public CriterionRef getCriterion() {
                                return criterion;
                            }

                            /**
                             * Sets the value of the criterion property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link CriterionRef }
                             *     
                             */
                            public void setCriterion(CriterionRef value) {
                                this.criterion = value;
                            }

                            /**
                             * Gets the value of the evaluationResults property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults }
                             *     
                             */
                            public ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults getEvaluationResults() {
                                return evaluationResults;
                            }

                            /**
                             * Sets the value of the evaluationResults property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults }
                             *     
                             */
                            public void setEvaluationResults(ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults value) {
                                this.evaluationResults = value;
                            }

                            /**
                             * Gets the value of the perMember property.
                             * 
                             */
                            public boolean isPerMember() {
                                return perMember;
                            }

                            /**
                             * Sets the value of the perMember property.
                             * 
                             */
                            public void setPerMember(boolean value) {
                                this.perMember = value;
                            }

                            /**
                             * Gets the value of the evalResult property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Double }
                             *     
                             */
                            public Double getEvalResult() {
                                return evalResult;
                            }

                            /**
                             * Sets the value of the evalResult property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Double }
                             *     
                             */
                            public void setEvalResult(Double value) {
                                this.evalResult = value;
                            }

                            /**
                             * Gets the value of the manual property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Manual }
                             *     
                             */
                            public ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Manual getManual() {
                                return manual;
                            }

                            /**
                             * Sets the value of the manual property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Manual }
                             *     
                             */
                            public void setManual(ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.Manual value) {
                                this.manual = value;
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
                             *         &lt;element name="evaluationResult" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
                             *                   &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                                "evaluationResult"
                            })
                            public static class EvaluationResults {

                                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                                protected List<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults.EvaluationResult> evaluationResult;

                                /**
                                 * Gets the value of the evaluationResult property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the evaluationResult property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getEvaluationResult().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults.EvaluationResult }
                                 * 
                                 * 
                                 */
                                public List<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults.EvaluationResult> getEvaluationResult() {
                                    if (evaluationResult == null) {
                                        evaluationResult = new ArrayList<ProtocolOK3Type.ProtocolLots.ProtocolLot.Applications.Application.ContractConditions.ContractCondition.EvaluationResults.EvaluationResult>();
                                    }
                                    return this.evaluationResult;
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
                                 *         &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
                                 *         &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
                                    "protocolCommissionMember",
                                    "evalResult"
                                })
                                public static class EvaluationResult {

                                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                                    protected CommissionMemberType protocolCommissionMember;
                                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                                    protected double evalResult;

                                    /**
                                     * Gets the value of the protocolCommissionMember property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link CommissionMemberType }
                                     *     
                                     */
                                    public CommissionMemberType getProtocolCommissionMember() {
                                        return protocolCommissionMember;
                                    }

                                    /**
                                     * Sets the value of the protocolCommissionMember property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link CommissionMemberType }
                                     *     
                                     */
                                    public void setProtocolCommissionMember(CommissionMemberType value) {
                                        this.protocolCommissionMember = value;
                                    }

                                    /**
                                     * Gets the value of the evalResult property.
                                     * 
                                     */
                                    public double getEvalResult() {
                                        return evalResult;
                                    }

                                    /**
                                     * Sets the value of the evalResult property.
                                     * 
                                     */
                                    public void setEvalResult(double value) {
                                        this.evalResult = value;
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
                             *         &lt;element name="criterionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                             *         &lt;element name="evalResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                                "criterionValue",
                                "evalResult"
                            })
                            public static class Manual {

                                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                                protected Double criterionValue;
                                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                                protected Double evalResult;

                                /**
                                 * Gets the value of the criterionValue property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Double }
                                 *     
                                 */
                                public Double getCriterionValue() {
                                    return criterionValue;
                                }

                                /**
                                 * Sets the value of the criterionValue property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Double }
                                 *     
                                 */
                                public void setCriterionValue(Double value) {
                                    this.criterionValue = value;
                                }

                                /**
                                 * Gets the value of the evalResult property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Double }
                                 *     
                                 */
                                public Double getEvalResult() {
                                    return evalResult;
                                }

                                /**
                                 * Sets the value of the evalResult property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Double }
                                 *     
                                 */
                                public void setEvalResult(Double value) {
                                    this.evalResult = value;
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
                     *         &lt;element name="featuresCorrespondence" type="{http://zakupki.gov.ru/oos/types/1}applicationFeaturesCorrespondence" maxOccurs="unbounded"/>
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
                        "featuresCorrespondence"
                    })
                    public static class FeaturesCorrespondences {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<ApplicationFeaturesCorrespondence> featuresCorrespondence;

                        /**
                         * Gets the value of the featuresCorrespondence property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the featuresCorrespondence property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getFeaturesCorrespondence().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ApplicationFeaturesCorrespondence }
                         * 
                         * 
                         */
                        public List<ApplicationFeaturesCorrespondence> getFeaturesCorrespondence() {
                            if (featuresCorrespondence == null) {
                                featuresCorrespondence = new ArrayList<ApplicationFeaturesCorrespondence>();
                            }
                            return this.featuresCorrespondence;
                        }

                    }

                }

            }

        }

    }

}
