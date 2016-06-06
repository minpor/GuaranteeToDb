
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Заявитель для РЖ по 44-ФЗ (согласно ПП РФ №1148)
 * 
 * <p>Java class for zfcs_applicantNewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_applicantNewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="legalEntity">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="fullShortFirmNameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef"/>
 *                   &lt;element name="INN" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_innType">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="contactPhone" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="contactEMail" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="256"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="individualPerson">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="nameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
 *                   &lt;element name="placeOfStay" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="contactPhone" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="contactEMail" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placeOfStayInRegCountry" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="contactPhone">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="contactEMail">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
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
 *         &lt;element name="individualBusinessman">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="nameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="placeOfStay" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="contactPhone" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="contactEMail" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placeOfStayInRegCountry" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                             &lt;element name="contactPhone">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="contactEMail">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="256"/>
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
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_applicantNewType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "legalEntity",
    "individualPerson",
    "individualBusinessman"
})
public class ZfcsApplicantNewType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsApplicantNewType.LegalEntity legalEntity;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsApplicantNewType.IndividualPerson individualPerson;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsApplicantNewType.IndividualBusinessman individualBusinessman;

    /**
     * Gets the value of the legalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsApplicantNewType.LegalEntity }
     *     
     */
    public ZfcsApplicantNewType.LegalEntity getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsApplicantNewType.LegalEntity }
     *     
     */
    public void setLegalEntity(ZfcsApplicantNewType.LegalEntity value) {
        this.legalEntity = value;
    }

    /**
     * Gets the value of the individualPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsApplicantNewType.IndividualPerson }
     *     
     */
    public ZfcsApplicantNewType.IndividualPerson getIndividualPerson() {
        return individualPerson;
    }

    /**
     * Sets the value of the individualPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsApplicantNewType.IndividualPerson }
     *     
     */
    public void setIndividualPerson(ZfcsApplicantNewType.IndividualPerson value) {
        this.individualPerson = value;
    }

    /**
     * Gets the value of the individualBusinessman property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsApplicantNewType.IndividualBusinessman }
     *     
     */
    public ZfcsApplicantNewType.IndividualBusinessman getIndividualBusinessman() {
        return individualBusinessman;
    }

    /**
     * Sets the value of the individualBusinessman property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsApplicantNewType.IndividualBusinessman }
     *     
     */
    public void setIndividualBusinessman(ZfcsApplicantNewType.IndividualBusinessman value) {
        this.individualBusinessman = value;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="nameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="placeOfStay" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="contactPhone" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="contactEMail" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placeOfStayInRegCountry" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="contactPhone">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="contactEMail">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
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
        "name",
        "nameLat",
        "inn",
        "registrationDate",
        "placeOfStay",
        "placeOfStayInRegCountry"
    })
    public static class IndividualBusinessman {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String nameLat;
        @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String inn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStay placeOfStay;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStayInRegCountry placeOfStayInRegCountry;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the nameLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameLat() {
            return nameLat;
        }

        /**
         * Sets the value of the nameLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameLat(String value) {
            this.nameLat = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the registrationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistrationDate() {
            return registrationDate;
        }

        /**
         * Sets the value of the registrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistrationDate(XMLGregorianCalendar value) {
            this.registrationDate = value;
        }

        /**
         * Gets the value of the placeOfStay property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStay }
         *     
         */
        public ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStay getPlaceOfStay() {
            return placeOfStay;
        }

        /**
         * Sets the value of the placeOfStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStay }
         *     
         */
        public void setPlaceOfStay(ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStay value) {
            this.placeOfStay = value;
        }

        /**
         * Gets the value of the placeOfStayInRegCountry property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStayInRegCountry }
         *     
         */
        public ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStayInRegCountry getPlaceOfStayInRegCountry() {
            return placeOfStayInRegCountry;
        }

        /**
         * Sets the value of the placeOfStayInRegCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStayInRegCountry }
         *     
         */
        public void setPlaceOfStayInRegCountry(ZfcsApplicantNewType.IndividualBusinessman.PlaceOfStayInRegCountry value) {
            this.placeOfStayInRegCountry = value;
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
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="contactPhone" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="contactEMail" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
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
            "address",
            "contactPhone",
            "contactEMail"
        })
        public static class PlaceOfStay {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactPhone;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactEMail;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the contactPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactPhone() {
                return contactPhone;
            }

            /**
             * Sets the value of the contactPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactPhone(String value) {
                this.contactPhone = value;
            }

            /**
             * Gets the value of the contactEMail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactEMail() {
                return contactEMail;
            }

            /**
             * Sets the value of the contactEMail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactEMail(String value) {
                this.contactEMail = value;
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
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="contactPhone">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="contactEMail">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
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
            "address",
            "contactPhone",
            "contactEMail"
        })
        public static class PlaceOfStayInRegCountry {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactPhone;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactEMail;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the contactPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactPhone() {
                return contactPhone;
            }

            /**
             * Sets the value of the contactPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactPhone(String value) {
                this.contactPhone = value;
            }

            /**
             * Gets the value of the contactEMail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactEMail() {
                return contactEMail;
            }

            /**
             * Sets the value of the contactEMail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactEMail(String value) {
                this.contactEMail = value;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="nameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
     *         &lt;element name="placeOfStay" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="contactPhone" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="contactEMail" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placeOfStayInRegCountry" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                   &lt;element name="contactPhone">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="contactEMail">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="256"/>
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
        "name",
        "nameLat",
        "inn",
        "placeOfStay",
        "placeOfStayInRegCountry"
    })
    public static class IndividualPerson {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String nameLat;
        @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String inn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsApplicantNewType.IndividualPerson.PlaceOfStay placeOfStay;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsApplicantNewType.IndividualPerson.PlaceOfStayInRegCountry placeOfStayInRegCountry;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the nameLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameLat() {
            return nameLat;
        }

        /**
         * Sets the value of the nameLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameLat(String value) {
            this.nameLat = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the placeOfStay property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantNewType.IndividualPerson.PlaceOfStay }
         *     
         */
        public ZfcsApplicantNewType.IndividualPerson.PlaceOfStay getPlaceOfStay() {
            return placeOfStay;
        }

        /**
         * Sets the value of the placeOfStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantNewType.IndividualPerson.PlaceOfStay }
         *     
         */
        public void setPlaceOfStay(ZfcsApplicantNewType.IndividualPerson.PlaceOfStay value) {
            this.placeOfStay = value;
        }

        /**
         * Gets the value of the placeOfStayInRegCountry property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantNewType.IndividualPerson.PlaceOfStayInRegCountry }
         *     
         */
        public ZfcsApplicantNewType.IndividualPerson.PlaceOfStayInRegCountry getPlaceOfStayInRegCountry() {
            return placeOfStayInRegCountry;
        }

        /**
         * Sets the value of the placeOfStayInRegCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantNewType.IndividualPerson.PlaceOfStayInRegCountry }
         *     
         */
        public void setPlaceOfStayInRegCountry(ZfcsApplicantNewType.IndividualPerson.PlaceOfStayInRegCountry value) {
            this.placeOfStayInRegCountry = value;
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
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="contactPhone" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="contactEMail" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
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
            "address",
            "contactPhone",
            "contactEMail"
        })
        public static class PlaceOfStay {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactPhone;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactEMail;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the contactPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactPhone() {
                return contactPhone;
            }

            /**
             * Sets the value of the contactPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactPhone(String value) {
                this.contactPhone = value;
            }

            /**
             * Gets the value of the contactEMail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactEMail() {
                return contactEMail;
            }

            /**
             * Sets the value of the contactEMail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactEMail(String value) {
                this.contactEMail = value;
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
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *         &lt;element name="contactPhone">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="contactEMail">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="256"/>
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
            "address",
            "contactPhone",
            "contactEMail"
        })
        public static class PlaceOfStayInRegCountry {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactPhone;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactEMail;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the contactPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactPhone() {
                return contactPhone;
            }

            /**
             * Sets the value of the contactPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactPhone(String value) {
                this.contactPhone = value;
            }

            /**
             * Gets the value of the contactEMail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactEMail() {
                return contactEMail;
            }

            /**
             * Sets the value of the contactEMail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactEMail(String value) {
                this.contactEMail = value;
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
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="firmName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="fullShortFirmNameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef"/>
     *         &lt;element name="INN" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_innType">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType" minOccurs="0"/>
     *         &lt;element name="taxPayerCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="contactPhone" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="256"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="contactEMail" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="256"/>
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
        "fullName",
        "shortName",
        "firmName",
        "fullShortFirmNameLat",
        "legalForm",
        "inn",
        "kpp",
        "registrationDate",
        "okpo",
        "taxPayerCode",
        "address",
        "contactPhone",
        "contactEMail"
    })
    public static class LegalEntity {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fullName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String shortName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String firmName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String fullShortFirmNameLat;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOkopfRef legalForm;
        @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String inn;
        @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String kpp;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String okpo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String taxPayerCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String address;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String contactPhone;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String contactEMail;

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullName(String value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the shortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortName(String value) {
            this.shortName = value;
        }

        /**
         * Gets the value of the firmName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirmName() {
            return firmName;
        }

        /**
         * Sets the value of the firmName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirmName(String value) {
            this.firmName = value;
        }

        /**
         * Gets the value of the fullShortFirmNameLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullShortFirmNameLat() {
            return fullShortFirmNameLat;
        }

        /**
         * Sets the value of the fullShortFirmNameLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullShortFirmNameLat(String value) {
            this.fullShortFirmNameLat = value;
        }

        /**
         * Gets the value of the legalForm property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOkopfRef }
         *     
         */
        public ZfcsOkopfRef getLegalForm() {
            return legalForm;
        }

        /**
         * Sets the value of the legalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOkopfRef }
         *     
         */
        public void setLegalForm(ZfcsOkopfRef value) {
            this.legalForm = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the kpp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKPP() {
            return kpp;
        }

        /**
         * Sets the value of the kpp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKPP(String value) {
            this.kpp = value;
        }

        /**
         * Gets the value of the registrationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistrationDate() {
            return registrationDate;
        }

        /**
         * Sets the value of the registrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistrationDate(XMLGregorianCalendar value) {
            this.registrationDate = value;
        }

        /**
         * Gets the value of the okpo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKPO() {
            return okpo;
        }

        /**
         * Sets the value of the okpo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOKPO(String value) {
            this.okpo = value;
        }

        /**
         * Gets the value of the taxPayerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxPayerCode() {
            return taxPayerCode;
        }

        /**
         * Sets the value of the taxPayerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxPayerCode(String value) {
            this.taxPayerCode = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the contactPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactPhone() {
            return contactPhone;
        }

        /**
         * Sets the value of the contactPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactPhone(String value) {
            this.contactPhone = value;
        }

        /**
         * Gets the value of the contactEMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactEMail() {
            return contactEMail;
        }

        /**
         * Sets the value of the contactEMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactEMail(String value) {
            this.contactEMail = value;
        }

    }

}
