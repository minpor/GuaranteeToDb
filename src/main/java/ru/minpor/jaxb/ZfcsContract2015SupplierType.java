
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Поставщик в информации о контракте с 01.01.01.2015
 * 
 * <p>Java class for zfcs_contract2015SupplierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contract2015SupplierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="legalEntityRF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef"/>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="shortName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firmName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantStatusContract2015Type" minOccurs="0"/>
 *                   &lt;element name="contractPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                   &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="contactInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType" minOccurs="0"/>
 *                   &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
 *                   &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
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
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="shortName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firmName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fullNameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                         &lt;minLength value="1"/>
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
 *                   &lt;element name="placeOfStayInRegCountry">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
 *                             &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placeOfStayInRF" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
 *                             &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
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
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firstName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="middleName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                   &lt;element name="isIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
 *                   &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
 *                   &lt;element name="isCulture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firstName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="middleName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lastNameLat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firstNameLat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="middleNameLat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="taxPayerCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="registerInRFTaxBodies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                             &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placeOfStayInRegCountry">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
 *                             &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="placeOfStayInRF" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                             &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                             &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
 *                             &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="isCulture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "zfcs_contract2015SupplierType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "legalEntityRF",
    "legalEntityForeignState",
    "individualPersonRF",
    "individualPersonForeignState"
})
public class ZfcsContract2015SupplierType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015SupplierType.LegalEntityRF legalEntityRF;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015SupplierType.LegalEntityForeignState legalEntityForeignState;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015SupplierType.IndividualPersonRF individualPersonRF;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsContract2015SupplierType.IndividualPersonForeignState individualPersonForeignState;

    /**
     * Gets the value of the legalEntityRF property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015SupplierType.LegalEntityRF }
     *     
     */
    public ZfcsContract2015SupplierType.LegalEntityRF getLegalEntityRF() {
        return legalEntityRF;
    }

    /**
     * Sets the value of the legalEntityRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015SupplierType.LegalEntityRF }
     *     
     */
    public void setLegalEntityRF(ZfcsContract2015SupplierType.LegalEntityRF value) {
        this.legalEntityRF = value;
    }

    /**
     * Gets the value of the legalEntityForeignState property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState }
     *     
     */
    public ZfcsContract2015SupplierType.LegalEntityForeignState getLegalEntityForeignState() {
        return legalEntityForeignState;
    }

    /**
     * Sets the value of the legalEntityForeignState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState }
     *     
     */
    public void setLegalEntityForeignState(ZfcsContract2015SupplierType.LegalEntityForeignState value) {
        this.legalEntityForeignState = value;
    }

    /**
     * Gets the value of the individualPersonRF property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015SupplierType.IndividualPersonRF }
     *     
     */
    public ZfcsContract2015SupplierType.IndividualPersonRF getIndividualPersonRF() {
        return individualPersonRF;
    }

    /**
     * Sets the value of the individualPersonRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015SupplierType.IndividualPersonRF }
     *     
     */
    public void setIndividualPersonRF(ZfcsContract2015SupplierType.IndividualPersonRF value) {
        this.individualPersonRF = value;
    }

    /**
     * Gets the value of the individualPersonForeignState property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState }
     *     
     */
    public ZfcsContract2015SupplierType.IndividualPersonForeignState getIndividualPersonForeignState() {
        return individualPersonForeignState;
    }

    /**
     * Sets the value of the individualPersonForeignState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState }
     *     
     */
    public void setIndividualPersonForeignState(ZfcsContract2015SupplierType.IndividualPersonForeignState value) {
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
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firstName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="middleName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lastNameLat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firstNameLat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="middleNameLat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="taxPayerCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="registerInRFTaxBodies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placeOfStayInRegCountry">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
     *                   &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placeOfStayInRF" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
     *                   &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="isCulture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "taxPayerCode",
        "registerInRFTaxBodies",
        "placeOfStayInRegCountry",
        "placeOfStayInRF",
        "isCulture"
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
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String taxPayerCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015SupplierType.IndividualPersonForeignState.RegisterInRFTaxBodies registerInRFTaxBodies;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRegCountry placeOfStayInRegCountry;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRF placeOfStayInRF;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean isCulture;

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
         *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState.RegisterInRFTaxBodies }
         *     
         */
        public ZfcsContract2015SupplierType.IndividualPersonForeignState.RegisterInRFTaxBodies getRegisterInRFTaxBodies() {
            return registerInRFTaxBodies;
        }

        /**
         * Sets the value of the registerInRFTaxBodies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState.RegisterInRFTaxBodies }
         *     
         */
        public void setRegisterInRFTaxBodies(ZfcsContract2015SupplierType.IndividualPersonForeignState.RegisterInRFTaxBodies value) {
            this.registerInRFTaxBodies = value;
        }

        /**
         * Gets the value of the placeOfStayInRegCountry property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRegCountry }
         *     
         */
        public ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRegCountry getPlaceOfStayInRegCountry() {
            return placeOfStayInRegCountry;
        }

        /**
         * Sets the value of the placeOfStayInRegCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRegCountry }
         *     
         */
        public void setPlaceOfStayInRegCountry(ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRegCountry value) {
            this.placeOfStayInRegCountry = value;
        }

        /**
         * Gets the value of the placeOfStayInRF property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRF }
         *     
         */
        public ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRF getPlaceOfStayInRF() {
            return placeOfStayInRF;
        }

        /**
         * Sets the value of the placeOfStayInRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRF }
         *     
         */
        public void setPlaceOfStayInRF(ZfcsContract2015SupplierType.IndividualPersonForeignState.PlaceOfStayInRF value) {
            this.placeOfStayInRF = value;
        }

        /**
         * Gets the value of the isCulture property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsCulture() {
            return isCulture;
        }

        /**
         * Sets the value of the isCulture property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsCulture(Boolean value) {
            this.isCulture = value;
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
         *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
         *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
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
            "country",
            "address",
            "contactEMail",
            "contactPhone"
        })
        public static class PlaceOfStayInRegCountry {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCountryRef country;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactEMail;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactPhone;

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
         *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
         *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
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
            "oktmo",
            "address",
            "contactEMail",
            "contactPhone"
        })
        public static class PlaceOfStayInRF {

            @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOKTMORef oktmo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactEMail;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactPhone;

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
            "registrationDate"
        })
        public static class RegisterInRFTaxBodies {

            @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String inn;
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
     *         &lt;element name="lastName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firstName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="middleName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *         &lt;element name="isIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
     *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
     *         &lt;element name="isCulture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "isIP",
        "registrationDate",
        "oktmo",
        "address",
        "contactEMail",
        "contactPhone",
        "isCulture"
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
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean isIP;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOKTMORef oktmo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String address;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String contactEMail;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String contactPhone;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean isCulture;

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
         * Gets the value of the isCulture property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsCulture() {
            return isCulture;
        }

        /**
         * Sets the value of the isCulture property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsCulture(Boolean value) {
            this.isCulture = value;
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
     *         &lt;element name="shortName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firmName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fullNameLat" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="taxPayerCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *               &lt;minLength value="1"/>
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
     *         &lt;element name="placeOfStayInRegCountry">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
     *                   &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="placeOfStayInRF" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
     *                   &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                   &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
     *                   &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
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
        "shortName",
        "firmName",
        "fullNameLat",
        "taxPayerCode",
        "registerInRFTaxBodies",
        "placeOfStayInRegCountry",
        "placeOfStayInRF"
    })
    public static class LegalEntityForeignState {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fullName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String shortName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String firmName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String fullNameLat;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String taxPayerCode;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015SupplierType.LegalEntityForeignState.RegisterInRFTaxBodies registerInRFTaxBodies;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRegCountry placeOfStayInRegCountry;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRF placeOfStayInRF;

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
         *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState.RegisterInRFTaxBodies }
         *     
         */
        public ZfcsContract2015SupplierType.LegalEntityForeignState.RegisterInRFTaxBodies getRegisterInRFTaxBodies() {
            return registerInRFTaxBodies;
        }

        /**
         * Sets the value of the registerInRFTaxBodies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState.RegisterInRFTaxBodies }
         *     
         */
        public void setRegisterInRFTaxBodies(ZfcsContract2015SupplierType.LegalEntityForeignState.RegisterInRFTaxBodies value) {
            this.registerInRFTaxBodies = value;
        }

        /**
         * Gets the value of the placeOfStayInRegCountry property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRegCountry }
         *     
         */
        public ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRegCountry getPlaceOfStayInRegCountry() {
            return placeOfStayInRegCountry;
        }

        /**
         * Sets the value of the placeOfStayInRegCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRegCountry }
         *     
         */
        public void setPlaceOfStayInRegCountry(ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRegCountry value) {
            this.placeOfStayInRegCountry = value;
        }

        /**
         * Gets the value of the placeOfStayInRF property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRF }
         *     
         */
        public ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRF getPlaceOfStayInRF() {
            return placeOfStayInRF;
        }

        /**
         * Sets the value of the placeOfStayInRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRF }
         *     
         */
        public void setPlaceOfStayInRF(ZfcsContract2015SupplierType.LegalEntityForeignState.PlaceOfStayInRF value) {
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
         *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/types/1}zfcs_countryRef"/>
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
         *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
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
            "country",
            "address",
            "contactEMail",
            "contactPhone"
        })
        public static class PlaceOfStayInRegCountry {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsCountryRef country;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactEMail;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String contactPhone;

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
         *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
         *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
         *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
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
            "oktmo",
            "address",
            "contactEMail",
            "contactPhone"
        })
        public static class PlaceOfStayInRF {

            @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsOKTMORef oktmo;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String address;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactEMail;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String contactPhone;

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
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="shortName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firmName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantStatusContract2015Type" minOccurs="0"/>
     *         &lt;element name="contractPrice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okpoType"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
     *         &lt;element name="address" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="contactInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType" minOccurs="0"/>
     *         &lt;element name="contactEMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType"/>
     *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType"/>
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
        "firmName",
        "status",
        "contractPrice",
        "okpo",
        "inn",
        "kpp",
        "registrationDate",
        "oktmo",
        "address",
        "contactInfo",
        "contactEMail",
        "contactPhone"
    })
    public static class LegalEntityRF {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOkopfRef legalForm;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String fullName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String shortName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String firmName;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String status;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String contractPrice;
        @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String okpo;
        @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String inn;
        @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String kpp;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOKTMORef oktmo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String address;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsContactPersonType contactInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String contactEMail;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String contactPhone;

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
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the contractPrice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractPrice() {
            return contractPrice;
        }

        /**
         * Sets the value of the contractPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractPrice(String value) {
            this.contractPrice = value;
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
         * Gets the value of the contactInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContactPersonType }
         *     
         */
        public ZfcsContactPersonType getContactInfo() {
            return contactInfo;
        }

        /**
         * Sets the value of the contactInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContactPersonType }
         *     
         */
        public void setContactInfo(ZfcsContactPersonType value) {
            this.contactInfo = value;
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

    }

}
