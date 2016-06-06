
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * План-график в структурированной форме
 * 
 * <p>Java class for zfcs_tenderPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanCommonInfoType"/>
 *         &lt;element name="customerInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
 *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="responsibleContactInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_userTenderPlanType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_tenderPlanType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "customerInfo",
    "responsibleContactInfo",
    "providedPurchases",
    "printForm",
    "extPrintForm"
})
public class ZfcsTenderPlanType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsTenderPlanCommonInfoType commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsTenderPlanType.CustomerInfo customerInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsTenderPlanType.ResponsibleContactInfo responsibleContactInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsTenderPlanType.ProvidedPurchases providedPurchases;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanCommonInfoType }
     *     
     */
    public ZfcsTenderPlanCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanCommonInfoType }
     *     
     */
    public void setCommonInfo(ZfcsTenderPlanCommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanType.CustomerInfo }
     *     
     */
    public ZfcsTenderPlanType.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanType.CustomerInfo }
     *     
     */
    public void setCustomerInfo(ZfcsTenderPlanType.CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the responsibleContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanType.ResponsibleContactInfo }
     *     
     */
    public ZfcsTenderPlanType.ResponsibleContactInfo getResponsibleContactInfo() {
        return responsibleContactInfo;
    }

    /**
     * Sets the value of the responsibleContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanType.ResponsibleContactInfo }
     *     
     */
    public void setResponsibleContactInfo(ZfcsTenderPlanType.ResponsibleContactInfo value) {
        this.responsibleContactInfo = value;
    }

    /**
     * Gets the value of the providedPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanType.ProvidedPurchases }
     *     
     */
    public ZfcsTenderPlanType.ProvidedPurchases getProvidedPurchases() {
        return providedPurchases;
    }

    /**
     * Sets the value of the providedPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanType.ProvidedPurchases }
     *     
     */
    public void setProvidedPurchases(ZfcsTenderPlanType.ProvidedPurchases value) {
        this.providedPurchases = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
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
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
     *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
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
        "customer",
        "oktmo"
    })
    public static class CustomerInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseOrganizationType customer;
        @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsOKTMORef oktmo;

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public ZfcsPurchaseOrganizationType getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public void setCustomer(ZfcsPurchaseOrganizationType value) {
            this.customer = value;
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
        protected ZfcsTenderPlanType.ProvidedPurchases.Positions positions;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsTenderPlanFinalPositionsType finalPositions;

        /**
         * Gets the value of the positions property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsTenderPlanType.ProvidedPurchases.Positions }
         *     
         */
        public ZfcsTenderPlanType.ProvidedPurchases.Positions getPositions() {
            return positions;
        }

        /**
         * Sets the value of the positions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsTenderPlanType.ProvidedPurchases.Positions }
         *     
         */
        public void setPositions(ZfcsTenderPlanType.ProvidedPurchases.Positions value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_userTenderPlanType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResponsibleContactInfo
        extends ZfcsUserTenderPlanType
    {


    }

}
