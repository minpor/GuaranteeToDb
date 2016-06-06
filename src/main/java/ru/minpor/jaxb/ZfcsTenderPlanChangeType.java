
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Изменение плана-графика
 * 
 * <p>Java class for zfcs_tenderPlanChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlanChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="planNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanNumberType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="responsibleContactInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_userTenderPlanType" minOccurs="0"/>
 *         &lt;element name="providedPurchases" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="finalPositions" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanFinalPositionsType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlanChangeType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "id",
    "planNumber",
    "versionNumber",
    "description",
    "confirmDate",
    "responsibleContactInfo",
    "providedPurchases",
    "extPrintForm"
})
public class ZfcsTenderPlanChangeType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String planNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Integer versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String description;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsUserTenderPlanType responsibleContactInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsTenderPlanChangeType.ProvidedPurchases providedPurchases;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the planNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Sets the value of the planNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNumber(String value) {
        this.planNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the confirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmDate() {
        return confirmDate;
    }

    /**
     * Sets the value of the confirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmDate(XMLGregorianCalendar value) {
        this.confirmDate = value;
    }

    /**
     * Gets the value of the responsibleContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUserTenderPlanType }
     *     
     */
    public ZfcsUserTenderPlanType getResponsibleContactInfo() {
        return responsibleContactInfo;
    }

    /**
     * Sets the value of the responsibleContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUserTenderPlanType }
     *     
     */
    public void setResponsibleContactInfo(ZfcsUserTenderPlanType value) {
        this.responsibleContactInfo = value;
    }

    /**
     * Gets the value of the providedPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanChangeType.ProvidedPurchases }
     *     
     */
    public ZfcsTenderPlanChangeType.ProvidedPurchases getProvidedPurchases() {
        return providedPurchases;
    }

    /**
     * Sets the value of the providedPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanChangeType.ProvidedPurchases }
     *     
     */
    public void setProvidedPurchases(ZfcsTenderPlanChangeType.ProvidedPurchases value) {
        this.providedPurchases = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *         &lt;element name="positions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="finalPositions" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanFinalPositionsType"/>
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
        "positions",
        "finalPositions"
    })
    public static class ProvidedPurchases {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsTenderPlanChangeType.ProvidedPurchases.Positions positions;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsTenderPlanFinalPositionsType finalPositions;

        /**
         * Gets the value of the positions property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanChangeType.ProvidedPurchases.Positions }
         *     
         */
        public ZfcsTenderPlanChangeType.ProvidedPurchases.Positions getPositions() {
            return positions;
        }

        /**
         * Sets the value of the positions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanChangeType.ProvidedPurchases.Positions }
         *     
         */
        public void setPositions(ZfcsTenderPlanChangeType.ProvidedPurchases.Positions value) {
            this.positions = value;
        }

        /**
         * Gets the value of the finalPositions property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanFinalPositionsType }
         *     
         */
        public ZfcsTenderPlanFinalPositionsType getFinalPositions() {
            return finalPositions;
        }

        /**
         * Sets the value of the finalPositions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanFinalPositionsType }
         *     
         */
        public void setFinalPositions(ZfcsTenderPlanFinalPositionsType value) {
            this.finalPositions = value;
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
         *         &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionType" maxOccurs="unbounded"/>
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
            "position"
        })
        public static class Positions {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsTenderPlanPositionType> position;

            /**
             * Gets the value of the position property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the position property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPosition().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsTenderPlanPositionType }
             * 
             * 
             */
            public List<ZfcsTenderPlanPositionType> getPosition() {
                if (position == null) {
                    position = new ArrayList<ZfcsTenderPlanPositionType>();
                }
                return this.position;
            }

        }

    }

}
