
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Поставщик в сведениях о банковской гарантии
 * 
 * <p>Java class for zfcs_bankGuaranteeParticipantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeParticipantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="legalEntityRF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef"/>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="shortName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType"/>
 *                   &lt;element name="OGRN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef"/>
 *                   &lt;element name="OKATO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKATORef" minOccurs="0"/>
 *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalEntityForeignState">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="fullNameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="registerInRFTaxBodies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                             &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType"/>
 *                             &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="placeOfStayInRF" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef"/>
 *                             &lt;element name="OKATO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKATORef" minOccurs="0"/>
 *                             &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
 *         &lt;element name="individualPersonRF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lastName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firstName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="middleName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                   &lt;element name="OGRNIP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef" minOccurs="0"/>
 *                   &lt;element name="OKATO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKATORef" minOccurs="0"/>
 *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="isIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="individualPersonForeignState">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lastName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firstName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="middleName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lastNameLat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firstNameLat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="middleNameLat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
@XmlType(name = "zfcs_bankGuaranteeParticipantType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "legalEntityRF",
    "legalEntityForeignState",
    "individualPersonRF",
    "individualPersonForeignState"
})
public class ZfcsBankGuaranteeParticipantType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeParticipantType.LegalEntityRF legalEntityRF;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeParticipantType.LegalEntityForeignState legalEntityForeignState;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeParticipantType.IndividualPersonRF individualPersonRF;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsBankGuaranteeParticipantType.IndividualPersonForeignState individualPersonForeignState;

    /**
     * Gets the value of the legalEntityRF property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityRF }
     *     
     */
    public ZfcsBankGuaranteeParticipantType.LegalEntityRF getLegalEntityRF() {
        return legalEntityRF;
    }

    /**
     * Sets the value of the legalEntityRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityRF }
     *     
     */
    public void setLegalEntityRF(ZfcsBankGuaranteeParticipantType.LegalEntityRF value) {
        this.legalEntityRF = value;
    }

    /**
     * Gets the value of the legalEntityForeignState property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityForeignState }
     *     
     */
    public ZfcsBankGuaranteeParticipantType.LegalEntityForeignState getLegalEntityForeignState() {
        return legalEntityForeignState;
    }

    /**
     * Sets the value of the legalEntityForeignState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityForeignState }
     *     
     */
    public void setLegalEntityForeignState(ZfcsBankGuaranteeParticipantType.LegalEntityForeignState value) {
        this.legalEntityForeignState = value;
    }

    /**
     * Gets the value of the individualPersonRF property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeParticipantType.IndividualPersonRF }
     *     
     */
    public ZfcsBankGuaranteeParticipantType.IndividualPersonRF getIndividualPersonRF() {
        return individualPersonRF;
    }

    /**
     * Sets the value of the individualPersonRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeParticipantType.IndividualPersonRF }
     *     
     */
    public void setIndividualPersonRF(ZfcsBankGuaranteeParticipantType.IndividualPersonRF value) {
        this.individualPersonRF = value;
    }

    /**
     * Gets the value of the individualPersonForeignState property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeParticipantType.IndividualPersonForeignState }
     *     
     */
    public ZfcsBankGuaranteeParticipantType.IndividualPersonForeignState getIndividualPersonForeignState() {
        return individualPersonForeignState;
    }

    /**
     * Sets the value of the individualPersonForeignState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeParticipantType.IndividualPersonForeignState }
     *     
     */
    public void setIndividualPersonForeignState(ZfcsBankGuaranteeParticipantType.IndividualPersonForeignState value) {
        this.individualPersonForeignState = value;
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
     *         &lt;element name="lastName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firstName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="middleName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lastNameLat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firstNameLat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="middleNameLat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
     *         &lt;element name="taxPayerCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
        "lastName",
        "firstName",
        "middleName",
        "lastNameLat",
        "firstNameLat",
        "middleNameLat",
        "inn",
        "taxPayerCode",
        "country",
        "address"
    })
    public static class IndividualPersonForeignState {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String lastName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String firstName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String middleName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String lastNameLat;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String firstNameLat;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String middleNameLat;
        @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String inn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String taxPayerCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCountryRef country;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String address;

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Gets the value of the lastNameLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastNameLat() {
            return lastNameLat;
        }

        /**
         * Sets the value of the lastNameLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastNameLat(String value) {
            this.lastNameLat = value;
        }

        /**
         * Gets the value of the firstNameLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstNameLat() {
            return firstNameLat;
        }

        /**
         * Sets the value of the firstNameLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstNameLat(String value) {
            this.firstNameLat = value;
        }

        /**
         * Gets the value of the middleNameLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleNameLat() {
            return middleNameLat;
        }

        /**
         * Sets the value of the middleNameLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleNameLat(String value) {
            this.middleNameLat = value;
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
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCountryRef }
         *     
         */
        public ZfcsCountryRef getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCountryRef }
         *     
         */
        public void setCountry(ZfcsCountryRef value) {
            this.country = value;
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
     *         &lt;element name="lastName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firstName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="middleName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *         &lt;element name="OGRNIP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef" minOccurs="0"/>
     *         &lt;element name="OKATO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKATORef" minOccurs="0"/>
     *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="isIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "lastName",
        "firstName",
        "middleName",
        "inn",
        "ogrnip",
        "registrationDate",
        "subjectRF",
        "okato",
        "oktmo",
        "address",
        "isIP"
    })
    public static class IndividualPersonRF {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String lastName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String firstName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String middleName;
        @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String inn;
        @XmlElement(name = "OGRNIP", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String ogrnip;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsSubjectRFRef subjectRF;
        @XmlElement(name = "OKATO", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOKATORef okato;
        @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOKTMORef oktmo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String address;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean isIP;

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
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
         * Gets the value of the ogrnip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOGRNIP() {
            return ogrnip;
        }

        /**
         * Sets the value of the ogrnip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOGRNIP(String value) {
            this.ogrnip = value;
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
         * Gets the value of the subjectRF property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsSubjectRFRef }
         *     
         */
        public ZfcsSubjectRFRef getSubjectRF() {
            return subjectRF;
        }

        /**
         * Sets the value of the subjectRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsSubjectRFRef }
         *     
         */
        public void setSubjectRF(ZfcsSubjectRFRef value) {
            this.subjectRF = value;
        }

        /**
         * Gets the value of the okato property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKATORef }
         *     
         */
        public ZfcsOKATORef getOKATO() {
            return okato;
        }

        /**
         * Sets the value of the okato property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKATORef }
         *     
         */
        public void setOKATO(ZfcsOKATORef value) {
            this.okato = value;
        }

        /**
         * Gets the value of the oktmo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKTMORef }
         *     
         */
        public ZfcsOKTMORef getOKTMO() {
            return oktmo;
        }

        /**
         * Sets the value of the oktmo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKTMORef }
         *     
         */
        public void setOKTMO(ZfcsOKTMORef value) {
            this.oktmo = value;
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
         * Gets the value of the isIP property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsIP() {
            return isIP;
        }

        /**
         * Sets the value of the isIP property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsIP(Boolean value) {
            this.isIP = value;
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
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="fullNameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="taxPayerCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="registerInRFTaxBodies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType"/>
     *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="placeOfStayInRF" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef"/>
     *                   &lt;element name="OKATO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKATORef" minOccurs="0"/>
     *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
        "fullName",
        "fullNameLat",
        "taxPayerCode",
        "registerInRFTaxBodies",
        "country",
        "address",
        "placeOfStayInRF"
    })
    public static class LegalEntityForeignState {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fullName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String fullNameLat;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String taxPayerCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.RegisterInRFTaxBodies registerInRFTaxBodies;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsCountryRef country;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String address;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.PlaceOfStayInRF placeOfStayInRF;

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
         * Gets the value of the fullNameLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullNameLat() {
            return fullNameLat;
        }

        /**
         * Sets the value of the fullNameLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullNameLat(String value) {
            this.fullNameLat = value;
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
         * Gets the value of the registerInRFTaxBodies property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.RegisterInRFTaxBodies }
         *     
         */
        public ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.RegisterInRFTaxBodies getRegisterInRFTaxBodies() {
            return registerInRFTaxBodies;
        }

        /**
         * Sets the value of the registerInRFTaxBodies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.RegisterInRFTaxBodies }
         *     
         */
        public void setRegisterInRFTaxBodies(ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.RegisterInRFTaxBodies value) {
            this.registerInRFTaxBodies = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCountryRef }
         *     
         */
        public ZfcsCountryRef getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCountryRef }
         *     
         */
        public void setCountry(ZfcsCountryRef value) {
            this.country = value;
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
         * Gets the value of the placeOfStayInRF property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.PlaceOfStayInRF }
         *     
         */
        public ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.PlaceOfStayInRF getPlaceOfStayInRF() {
            return placeOfStayInRF;
        }

        /**
         * Sets the value of the placeOfStayInRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.PlaceOfStayInRF }
         *     
         */
        public void setPlaceOfStayInRF(ZfcsBankGuaranteeParticipantType.LegalEntityForeignState.PlaceOfStayInRF value) {
            this.placeOfStayInRF = value;
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
         *         &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef"/>
         *         &lt;element name="OKATO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKATORef" minOccurs="0"/>
         *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
            "subjectRF",
            "okato",
            "oktmo",
            "address"
        })
        public static class PlaceOfStayInRF {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsSubjectRFRef subjectRF;
            @XmlElement(name = "OKATO", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKATORef okato;
            @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOKTMORef oktmo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String address;

            /**
             * Gets the value of the subjectRF property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSubjectRFRef }
             *     
             */
            public ZfcsSubjectRFRef getSubjectRF() {
                return subjectRF;
            }

            /**
             * Sets the value of the subjectRF property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSubjectRFRef }
             *     
             */
            public void setSubjectRF(ZfcsSubjectRFRef value) {
                this.subjectRF = value;
            }

            /**
             * Gets the value of the okato property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKATORef }
             *     
             */
            public ZfcsOKATORef getOKATO() {
                return okato;
            }

            /**
             * Sets the value of the okato property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKATORef }
             *     
             */
            public void setOKATO(ZfcsOKATORef value) {
                this.okato = value;
            }

            /**
             * Gets the value of the oktmo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsOKTMORef }
             *     
             */
            public ZfcsOKTMORef getOKTMO() {
                return oktmo;
            }

            /**
             * Sets the value of the oktmo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsOKTMORef }
             *     
             */
            public void setOKTMO(ZfcsOKTMORef value) {
                this.oktmo = value;
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
         *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
         *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType"/>
         *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "inn",
            "kpp",
            "registrationDate"
        })
        public static class RegisterInRFTaxBodies {

            @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String inn;
            @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String kpp;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar registrationDate;

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
     *         &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef"/>
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="shortName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType"/>
     *         &lt;element name="OGRN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="subjectRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subjectRFRef"/>
     *         &lt;element name="OKATO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKATORef" minOccurs="0"/>
     *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
        "legalForm",
        "fullName",
        "shortName",
        "inn",
        "kpp",
        "ogrn",
        "registrationDate",
        "subjectRF",
        "okato",
        "oktmo",
        "address"
    })
    public static class LegalEntityRF {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOkopfRef legalForm;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fullName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String shortName;
        @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String inn;
        @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String kpp;
        @XmlElement(name = "OGRN", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String ogrn;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsSubjectRFRef subjectRF;
        @XmlElement(name = "OKATO", namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsOKATORef okato;
        @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOKTMORef oktmo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String address;

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
         * Gets the value of the ogrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOGRN() {
            return ogrn;
        }

        /**
         * Sets the value of the ogrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOGRN(String value) {
            this.ogrn = value;
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
         * Gets the value of the subjectRF property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsSubjectRFRef }
         *     
         */
        public ZfcsSubjectRFRef getSubjectRF() {
            return subjectRF;
        }

        /**
         * Sets the value of the subjectRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsSubjectRFRef }
         *     
         */
        public void setSubjectRF(ZfcsSubjectRFRef value) {
            this.subjectRF = value;
        }

        /**
         * Gets the value of the okato property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKATORef }
         *     
         */
        public ZfcsOKATORef getOKATO() {
            return okato;
        }

        /**
         * Sets the value of the okato property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKATORef }
         *     
         */
        public void setOKATO(ZfcsOKATORef value) {
            this.okato = value;
        }

        /**
         * Gets the value of the oktmo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKTMORef }
         *     
         */
        public ZfcsOKTMORef getOKTMO() {
            return oktmo;
        }

        /**
         * Sets the value of the oktmo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKTMORef }
         *     
         */
        public void setOKTMO(ZfcsOKTMORef value) {
            this.oktmo = value;
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

    }

}
