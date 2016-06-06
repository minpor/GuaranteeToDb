
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for modificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initiativeType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}modification.initiativeType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="info" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}modification.authorityType" minOccurs="0"/>
 *         &lt;element name="authorityName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="courtName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="courtDesNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="desNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="authorityPrescription" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}checkResultNumberType"/>
 *                   &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}prescriptionNumberType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentMetas" type="{http://zakupki.gov.ru/oos/types/1}documentList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "initiativeType",
    "modificationDate",
    "info",
    "authorityType",
    "authorityName",
    "courtName",
    "courtDesNumber",
    "desNumber",
    "additionalInfo",
    "authorityPrescription",
    "documentMetas"
})
public class ModificationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ModificationInitiativeType initiativeType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String info;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ModificationAuthorityType authorityType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String authorityName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String courtName;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String courtDesNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String desNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String additionalInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ModificationType.AuthorityPrescription authorityPrescription;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected DocumentList documentMetas;

    /**
     * Gets the value of the initiativeType property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationInitiativeType }
     *     
     */
    public ModificationInitiativeType getInitiativeType() {
        return initiativeType;
    }

    /**
     * Sets the value of the initiativeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationInitiativeType }
     *     
     */
    public void setInitiativeType(ModificationInitiativeType value) {
        this.initiativeType = value;
    }

    /**
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the authorityType property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationAuthorityType }
     *     
     */
    public ModificationAuthorityType getAuthorityType() {
        return authorityType;
    }

    /**
     * Sets the value of the authorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationAuthorityType }
     *     
     */
    public void setAuthorityType(ModificationAuthorityType value) {
        this.authorityType = value;
    }

    /**
     * Gets the value of the authorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

    /**
     * Gets the value of the courtDesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtDesNumber() {
        return courtDesNumber;
    }

    /**
     * Sets the value of the courtDesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtDesNumber(String value) {
        this.courtDesNumber = value;
    }

    /**
     * Gets the value of the desNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesNumber() {
        return desNumber;
    }

    /**
     * Sets the value of the desNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesNumber(String value) {
        this.desNumber = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the authorityPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationType.AuthorityPrescription }
     *     
     */
    public ModificationType.AuthorityPrescription getAuthorityPrescription() {
        return authorityPrescription;
    }

    /**
     * Sets the value of the authorityPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationType.AuthorityPrescription }
     *     
     */
    public void setAuthorityPrescription(ModificationType.AuthorityPrescription value) {
        this.authorityPrescription = value;
    }

    /**
     * Gets the value of the documentMetas property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentList }
     *     
     */
    public DocumentList getDocumentMetas() {
        return documentMetas;
    }

    /**
     * Sets the value of the documentMetas property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentList }
     *     
     */
    public void setDocumentMetas(DocumentList value) {
        this.documentMetas = value;
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
     *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}checkResultNumberType"/>
     *         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}prescriptionNumberType"/>
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
        "checkResultNumber",
        "prescriptionNumber"
    })
    public static class AuthorityPrescription {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String checkResultNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String prescriptionNumber;

        /**
         * Gets the value of the checkResultNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckResultNumber() {
            return checkResultNumber;
        }

        /**
         * Sets the value of the checkResultNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckResultNumber(String value) {
            this.checkResultNumber = value;
        }

        /**
         * Gets the value of the prescriptionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrescriptionNumber() {
            return prescriptionNumber;
        }

        /**
         * Sets the value of the prescriptionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrescriptionNumber(String value) {
            this.prescriptionNumber = value;
        }

    }

}
