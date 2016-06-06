
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for admissionResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="admissionResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admissionResult" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolCommissionMember" type="{http://zakupki.gov.ru/oos/types/1}commissionMemberType"/>
 *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "admissionResults", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "admissionResult"
})
public class AdmissionResults {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<AdmissionResults.AdmissionResult> admissionResult;

    /**
     * Gets the value of the admissionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admissionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdmissionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdmissionResults.AdmissionResult }
     * 
     * 
     */
    public List<AdmissionResults.AdmissionResult> getAdmissionResult() {
        if (admissionResult == null) {
            admissionResult = new ArrayList<AdmissionResults.AdmissionResult>();
        }
        return this.admissionResult;
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
     *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/types/1}appRejectedReasonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "admitted",
        "appRejectedReason"
    })
    public static class AdmissionResult {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected CommissionMemberType protocolCommissionMember;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected boolean admitted;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected List<AppRejectedReasonType> appRejectedReason;

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

}
