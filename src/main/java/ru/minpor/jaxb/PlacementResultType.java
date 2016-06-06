
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
 * Результат размещения заказа
 * 
 * <p>Java class for placementResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placementResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *         &lt;element name="protocolNumber" type="{http://zakupki.gov.ru/oos/types/1}protocolNumberType"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}statusType" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderPlacementCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changePossible" type="{http://zakupki.gov.ru/oos/types/1}changePossibleType" minOccurs="0"/>
 *         &lt;element name="repeatedPlacement" type="{http://zakupki.gov.ru/oos/types/1}repeatedPlacementType" minOccurs="0"/>
 *         &lt;element name="contractWithParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contractWithSingleApplication" type="{http://zakupki.gov.ru/oos/types/1}contractWithSingleApplicationType" minOccurs="0"/>
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
 *                             &lt;element name="contractConclusion" type="{http://zakupki.gov.ru/oos/types/1}contractConclusionType"/>
 *                             &lt;element name="makingType" type="{http://zakupki.gov.ru/oos/types/1}makingTypeType" minOccurs="0"/>
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
@XmlType(name = "placementResultType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "notificationNumber",
    "protocolNumber",
    "versionNumber",
    "status",
    "createDate",
    "lastUpdateDate",
    "lotNumber",
    "orderPlacementCancel",
    "changePossible",
    "repeatedPlacement",
    "contractWithParticipant",
    "contractWithSingleApplication",
    "applications"
})
public class PlacementResultType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String notificationNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String protocolNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected StatusType status;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected int lotNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean orderPlacementCancel;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ChangePossibleType changePossible;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected RepeatedPlacementType repeatedPlacement;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean contractWithParticipant;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ContractWithSingleApplicationType contractWithSingleApplication;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected PlacementResultType.Applications applications;

    /**
     * Gets the value of the notificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationNumber() {
        return notificationNumber;
    }

    /**
     * Sets the value of the notificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationNumber(String value) {
        this.notificationNumber = value;
    }

    /**
     * Gets the value of the protocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Sets the value of the protocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolNumber(String value) {
        this.protocolNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     */
    public int getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     */
    public void setVersionNumber(int value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

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
     * Gets the value of the orderPlacementCancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderPlacementCancel() {
        return orderPlacementCancel;
    }

    /**
     * Sets the value of the orderPlacementCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderPlacementCancel(Boolean value) {
        this.orderPlacementCancel = value;
    }

    /**
     * Gets the value of the changePossible property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePossibleType }
     *     
     */
    public ChangePossibleType getChangePossible() {
        return changePossible;
    }

    /**
     * Sets the value of the changePossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePossibleType }
     *     
     */
    public void setChangePossible(ChangePossibleType value) {
        this.changePossible = value;
    }

    /**
     * Gets the value of the repeatedPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatedPlacementType }
     *     
     */
    public RepeatedPlacementType getRepeatedPlacement() {
        return repeatedPlacement;
    }

    /**
     * Sets the value of the repeatedPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatedPlacementType }
     *     
     */
    public void setRepeatedPlacement(RepeatedPlacementType value) {
        this.repeatedPlacement = value;
    }

    /**
     * Gets the value of the contractWithParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractWithParticipant() {
        return contractWithParticipant;
    }

    /**
     * Sets the value of the contractWithParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractWithParticipant(Boolean value) {
        this.contractWithParticipant = value;
    }

    /**
     * Gets the value of the contractWithSingleApplication property.
     * 
     * @return
     *     possible object is
     *     {@link ContractWithSingleApplicationType }
     *     
     */
    public ContractWithSingleApplicationType getContractWithSingleApplication() {
        return contractWithSingleApplication;
    }

    /**
     * Sets the value of the contractWithSingleApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractWithSingleApplicationType }
     *     
     */
    public void setContractWithSingleApplication(ContractWithSingleApplicationType value) {
        this.contractWithSingleApplication = value;
    }

    /**
     * Gets the value of the applications property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementResultType.Applications }
     *     
     */
    public PlacementResultType.Applications getApplications() {
        return applications;
    }

    /**
     * Sets the value of the applications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementResultType.Applications }
     *     
     */
    public void setApplications(PlacementResultType.Applications value) {
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
     *                   &lt;element name="contractConclusion" type="{http://zakupki.gov.ru/oos/types/1}contractConclusionType"/>
     *                   &lt;element name="makingType" type="{http://zakupki.gov.ru/oos/types/1}makingTypeType" minOccurs="0"/>
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
        protected List<PlacementResultType.Applications.Application> application;

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
         * {@link PlacementResultType.Applications.Application }
         * 
         * 
         */
        public List<PlacementResultType.Applications.Application> getApplication() {
            if (application == null) {
                application = new ArrayList<PlacementResultType.Applications.Application>();
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
         *         &lt;element name="contractConclusion" type="{http://zakupki.gov.ru/oos/types/1}contractConclusionType"/>
         *         &lt;element name="makingType" type="{http://zakupki.gov.ru/oos/types/1}makingTypeType" minOccurs="0"/>
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
            "contractConclusion",
            "makingType"
        })
        public static class Application {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String journalNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "string")
            protected ContractConclusionType contractConclusion;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            @XmlSchemaType(name = "string")
            protected MakingTypeType makingType;

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
             * Gets the value of the contractConclusion property.
             * 
             * @return
             *     possible object is
             *     {@link ContractConclusionType }
             *     
             */
            public ContractConclusionType getContractConclusion() {
                return contractConclusion;
            }

            /**
             * Sets the value of the contractConclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContractConclusionType }
             *     
             */
            public void setContractConclusion(ContractConclusionType value) {
                this.contractConclusion = value;
            }

            /**
             * Gets the value of the makingType property.
             * 
             * @return
             *     possible object is
             *     {@link MakingTypeType }
             *     
             */
            public MakingTypeType getMakingType() {
                return makingType;
            }

            /**
             * Sets the value of the makingType property.
             * 
             * @param value
             *     allowed object is
             *     {@link MakingTypeType }
             *     
             */
            public void setMakingType(MakingTypeType value) {
                this.makingType = value;
            }

        }

    }

}
