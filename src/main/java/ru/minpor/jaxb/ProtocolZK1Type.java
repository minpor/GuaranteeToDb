
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
 * Протокол рассмотрения котировочных заявок
 * 
 * <p>Java class for protocolZK1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolZK1Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}protocolType">
 *       &lt;sequence>
 *         &lt;element name="protocolLots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolLot">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *                                                 &lt;element name="journalNumber">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="20"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
 *                                                 &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                                 &lt;element name="applicationParticipants" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                                 &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                 &lt;element name="goodsDelivered" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="expensesInfo" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="admissionResults" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                                                 &lt;element name="resultType" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;enumeration value="WIN_OFFER"/>
 *                                                       &lt;enumeration value="LIKE_WIN_OFFER"/>
 *                                                       &lt;enumeration value="SECOND_OFFER"/>
 *                                                       &lt;enumeration value="PASS_OFFER"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
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
@XmlType(name = "protocolZK1Type", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "protocolLots"
})
public class ProtocolZK1Type
    extends ProtocolType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ProtocolZK1Type.ProtocolLots protocolLots;

    /**
     * Gets the value of the protocolLots property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZK1Type.ProtocolLots }
     *     
     */
    public ProtocolZK1Type.ProtocolLots getProtocolLots() {
        return protocolLots;
    }

    /**
     * Sets the value of the protocolLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZK1Type.ProtocolLots }
     *     
     */
    public void setProtocolLots(ProtocolZK1Type.ProtocolLots value) {
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
     *         &lt;element name="protocolLot">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
     *                                       &lt;element name="journalNumber">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="20"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
     *                                       &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                                       &lt;element name="applicationParticipants" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                                       &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                       &lt;element name="goodsDelivered" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="expensesInfo" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="admissionResults" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *                                       &lt;element name="resultType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="17"/>
     *                                             &lt;enumeration value="WIN_OFFER"/>
     *                                             &lt;enumeration value="LIKE_WIN_OFFER"/>
     *                                             &lt;enumeration value="SECOND_OFFER"/>
     *                                             &lt;enumeration value="PASS_OFFER"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
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
        protected ProtocolZK1Type.ProtocolLots.ProtocolLot protocolLot;

        /**
         * Gets the value of the protocolLot property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot }
         *     
         */
        public ProtocolZK1Type.ProtocolLots.ProtocolLot getProtocolLot() {
            return protocolLot;
        }

        /**
         * Sets the value of the protocolLot property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot }
         *     
         */
        public void setProtocolLot(ProtocolZK1Type.ProtocolLots.ProtocolLot value) {
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
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
         *                             &lt;element name="journalNumber">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
         *                             &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                             &lt;element name="applicationParticipants" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                             &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                             &lt;element name="goodsDelivered" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="expensesInfo" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="admissionResults" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
         *                             &lt;element name="resultType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="17"/>
         *                                   &lt;enumeration value="WIN_OFFER"/>
         *                                   &lt;enumeration value="LIKE_WIN_OFFER"/>
         *                                   &lt;enumeration value="SECOND_OFFER"/>
         *                                   &lt;enumeration value="PASS_OFFER"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
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
            "applications"
        })
        public static class ProtocolLot {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int lotNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications applications;

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
             *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications getApplications() {
                return applications;
            }

            /**
             * Sets the value of the applications property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications }
             *     
             */
            public void setApplications(ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications value) {
                this.applications = value;
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
             *                   &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
             *                   &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *                   &lt;element name="applicationParticipants" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *                   &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                   &lt;element name="goodsDelivered" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="expensesInfo" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="admissionResults" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                   &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
             *                   &lt;element name="resultType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="17"/>
             *                         &lt;enumeration value="WIN_OFFER"/>
             *                         &lt;enumeration value="LIKE_WIN_OFFER"/>
             *                         &lt;enumeration value="SECOND_OFFER"/>
             *                         &lt;enumeration value="PASS_OFFER"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
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
                protected List<ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application> application;

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
                 * {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application }
                 * 
                 * 
                 */
                public List<ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application> getApplication() {
                    if (application == null) {
                        application = new ArrayList<ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application>();
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
                 *         &lt;element name="appFormat" type="{http://zakupki.gov.ru/oos/types/1}applicationFormatType" minOccurs="0"/>
                 *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
                 *         &lt;element name="applicationParticipants" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
                 *         &lt;element name="increasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *         &lt;element name="goodsDelivered" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="expensesInfo" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="admissionResults" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *         &lt;element name="appRating" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
                 *         &lt;element name="resultType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="17"/>
                 *               &lt;enumeration value="WIN_OFFER"/>
                 *               &lt;enumeration value="LIKE_WIN_OFFER"/>
                 *               &lt;enumeration value="SECOND_OFFER"/>
                 *               &lt;enumeration value="PASS_OFFER"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "appFormat",
                    "appDate",
                    "applicationParticipants",
                    "price",
                    "increasePrice",
                    "goodsDelivered",
                    "expensesInfo",
                    "admissionResults",
                    "admitted",
                    "appRating",
                    "resultType",
                    "featuresCorrespondences"
                })
                public static class Application {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected String journalNumber;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "string")
                    protected ApplicationFormatType appFormat;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar appDate;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants applicationParticipants;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Double price;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Boolean increasePrice;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String goodsDelivered;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String expensesInfo;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults admissionResults;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected boolean admitted;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected Short appRating;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected String resultType;
                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                    protected ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences featuresCorrespondences;

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
                     * Gets the value of the appFormat property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ApplicationFormatType }
                     *     
                     */
                    public ApplicationFormatType getAppFormat() {
                        return appFormat;
                    }

                    /**
                     * Sets the value of the appFormat property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ApplicationFormatType }
                     *     
                     */
                    public void setAppFormat(ApplicationFormatType value) {
                        this.appFormat = value;
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
                     * Gets the value of the applicationParticipants property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants }
                     *     
                     */
                    public ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants getApplicationParticipants() {
                        return applicationParticipants;
                    }

                    /**
                     * Sets the value of the applicationParticipants property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants }
                     *     
                     */
                    public void setApplicationParticipants(ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.ApplicationParticipants value) {
                        this.applicationParticipants = value;
                    }

                    /**
                     * Gets the value of the price property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getPrice() {
                        return price;
                    }

                    /**
                     * Sets the value of the price property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setPrice(Double value) {
                        this.price = value;
                    }

                    /**
                     * Gets the value of the increasePrice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIncreasePrice() {
                        return increasePrice;
                    }

                    /**
                     * Sets the value of the increasePrice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIncreasePrice(Boolean value) {
                        this.increasePrice = value;
                    }

                    /**
                     * Gets the value of the goodsDelivered property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGoodsDelivered() {
                        return goodsDelivered;
                    }

                    /**
                     * Sets the value of the goodsDelivered property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGoodsDelivered(String value) {
                        this.goodsDelivered = value;
                    }

                    /**
                     * Gets the value of the expensesInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExpensesInfo() {
                        return expensesInfo;
                    }

                    /**
                     * Sets the value of the expensesInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExpensesInfo(String value) {
                        this.expensesInfo = value;
                    }

                    /**
                     * Gets the value of the admissionResults property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults }
                     *     
                     */
                    public ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults getAdmissionResults() {
                        return admissionResults;
                    }

                    /**
                     * Sets the value of the admissionResults property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults }
                     *     
                     */
                    public void setAdmissionResults(ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.AdmissionResults value) {
                        this.admissionResults = value;
                    }

                    /**
                     * Gets the value of the admitted property.
                     * 
                     */
                    public boolean isAdmitted() {
                        return admitted;
                    }

                    /**
                     * Sets the value of the admitted property.
                     * 
                     */
                    public void setAdmitted(boolean value) {
                        this.admitted = value;
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
                     * Gets the value of the featuresCorrespondences property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences }
                     *     
                     */
                    public ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences getFeaturesCorrespondences() {
                        return featuresCorrespondences;
                    }

                    /**
                     * Sets the value of the featuresCorrespondences property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences }
                     *     
                     */
                    public void setFeaturesCorrespondences(ProtocolZK1Type.ProtocolLots.ProtocolLot.Applications.Application.FeaturesCorrespondences value) {
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
                     *         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded"/>
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
                        "appRejectedReason"
                    })
                    public static class AdmissionResults {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected List<AppRejectedReasonType> appRejectedReason;

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
                         * {@link AppRejectedReasonType }
                         * 
                         * 
                         */
                        public List<AppRejectedReasonType> getAppRejectedReason() {
                            if (appRejectedReason == null) {
                                appRejectedReason = new ArrayList<AppRejectedReasonType>();
                            }
                            return this.appRejectedReason;
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
                     *         &lt;element name="applicationParticipant" type="{http://zakupki.gov.ru/oos/types/1}participantType"/>
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
                        "applicationParticipant"
                    })
                    public static class ApplicationParticipants {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected ParticipantType applicationParticipant;

                        /**
                         * Gets the value of the applicationParticipant property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ParticipantType }
                         *     
                         */
                        public ParticipantType getApplicationParticipant() {
                            return applicationParticipant;
                        }

                        /**
                         * Sets the value of the applicationParticipant property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ParticipantType }
                         *     
                         */
                        public void setApplicationParticipant(ParticipantType value) {
                            this.applicationParticipant = value;
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
