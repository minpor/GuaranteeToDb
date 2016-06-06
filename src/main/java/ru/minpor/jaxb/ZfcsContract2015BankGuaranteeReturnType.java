
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
 * Информация о возвращении банковской гарантии или уведомление об освобождении от обязательств по банковской гарантии
 * 
 * <p>Java class for zfcs_contract2015BankGuaranteeReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contract2015BankGuaranteeReturnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guaranteeReturn" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="bankGuaranteeReturn">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
 *                             &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *                             &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="returnReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="returnPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="waiverNotice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
 *                             &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *                             &lt;element name="noticeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="noticeNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="noticeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="noticePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
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
@XmlType(name = "zfcs_contract2015BankGuaranteeReturnType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "guaranteeReturn"
})
public class ZfcsContract2015BankGuaranteeReturnType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn> guaranteeReturn;

    /**
     * Gets the value of the guaranteeReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn }
     * 
     * 
     */
    public List<ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn> getGuaranteeReturn() {
        if (guaranteeReturn == null) {
            guaranteeReturn = new ArrayList<ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn>();
        }
        return this.guaranteeReturn;
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
     *         &lt;element name="bankGuaranteeReturn">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
     *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
     *                   &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="returnReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="returnPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="waiverNotice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
     *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
     *                   &lt;element name="noticeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="noticeNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="noticeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="noticePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "bankGuaranteeReturn",
        "waiverNotice"
    })
    public static class GuaranteeReturn {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.BankGuaranteeReturn bankGuaranteeReturn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.WaiverNotice waiverNotice;

        /**
         * Gets the value of the bankGuaranteeReturn property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.BankGuaranteeReturn }
         *     
         */
        public ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.BankGuaranteeReturn getBankGuaranteeReturn() {
            return bankGuaranteeReturn;
        }

        /**
         * Sets the value of the bankGuaranteeReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.BankGuaranteeReturn }
         *     
         */
        public void setBankGuaranteeReturn(ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.BankGuaranteeReturn value) {
            this.bankGuaranteeReturn = value;
        }

        /**
         * Gets the value of the waiverNotice property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.WaiverNotice }
         *     
         */
        public ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.WaiverNotice getWaiverNotice() {
            return waiverNotice;
        }

        /**
         * Sets the value of the waiverNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.WaiverNotice }
         *     
         */
        public void setWaiverNotice(ZfcsContract2015BankGuaranteeReturnType.GuaranteeReturn.WaiverNotice value) {
            this.waiverNotice = value;
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
         *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
         *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
         *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="returnReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="returnPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "regNumber",
            "docNumber",
            "returnDate",
            "returnReason",
            "returnPublishDate"
        })
        public static class BankGuaranteeReturn {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String regNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String docNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar returnDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String returnReason;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar returnPublishDate;

            /**
             * Gets the value of the regNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegNumber() {
                return regNumber;
            }

            /**
             * Sets the value of the regNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegNumber(String value) {
                this.regNumber = value;
            }

            /**
             * Gets the value of the docNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocNumber() {
                return docNumber;
            }

            /**
             * Sets the value of the docNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocNumber(String value) {
                this.docNumber = value;
            }

            /**
             * Gets the value of the returnDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReturnDate() {
                return returnDate;
            }

            /**
             * Sets the value of the returnDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReturnDate(XMLGregorianCalendar value) {
                this.returnDate = value;
            }

            /**
             * Gets the value of the returnReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReturnReason() {
                return returnReason;
            }

            /**
             * Sets the value of the returnReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReturnReason(String value) {
                this.returnReason = value;
            }

            /**
             * Gets the value of the returnPublishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReturnPublishDate() {
                return returnPublishDate;
            }

            /**
             * Sets the value of the returnPublishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReturnPublishDate(XMLGregorianCalendar value) {
                this.returnPublishDate = value;
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
         *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
         *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
         *         &lt;element name="noticeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="noticeNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="noticeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="noticePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "regNumber",
            "docNumber",
            "noticeDate",
            "noticeNumber",
            "noticeReason",
            "noticePublishDate"
        })
        public static class WaiverNotice {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String regNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String docNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar noticeDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String noticeNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String noticeReason;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar noticePublishDate;

            /**
             * Gets the value of the regNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegNumber() {
                return regNumber;
            }

            /**
             * Sets the value of the regNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegNumber(String value) {
                this.regNumber = value;
            }

            /**
             * Gets the value of the docNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocNumber() {
                return docNumber;
            }

            /**
             * Sets the value of the docNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocNumber(String value) {
                this.docNumber = value;
            }

            /**
             * Gets the value of the noticeDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNoticeDate() {
                return noticeDate;
            }

            /**
             * Sets the value of the noticeDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNoticeDate(XMLGregorianCalendar value) {
                this.noticeDate = value;
            }

            /**
             * Gets the value of the noticeNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoticeNumber() {
                return noticeNumber;
            }

            /**
             * Sets the value of the noticeNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoticeNumber(String value) {
                this.noticeNumber = value;
            }

            /**
             * Gets the value of the noticeReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoticeReason() {
                return noticeReason;
            }

            /**
             * Sets the value of the noticeReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoticeReason(String value) {
                this.noticeReason = value;
            }

            /**
             * Gets the value of the noticePublishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNoticePublishDate() {
                return noticePublishDate;
            }

            /**
             * Sets the value of the noticePublishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNoticePublishDate(XMLGregorianCalendar value) {
                this.noticePublishDate = value;
            }

        }

    }

}
