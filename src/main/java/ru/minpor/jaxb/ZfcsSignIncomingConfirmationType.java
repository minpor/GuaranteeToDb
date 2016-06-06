
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
 * Результат обработки с присвоенным реестровым номером и датой публикации документа
 * 
 * <p>Java class for zfcs_signIncomingConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_signIncomingConfirmationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refPacketUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType"/>
 *         &lt;choice>
 *           &lt;element name="success">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="registrationInfo">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="loadId">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="30"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="documentUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
 *                               &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signIncomingRegNumberType"/>
 *                               &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                               &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="loadUrl" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                     &lt;element name="warnings" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="warning" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="violations">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="violation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="processing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
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
@XmlType(name = "zfcs_signIncomingConfirmationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "refPacketUid",
    "success",
    "violations",
    "processing"
})
public class ZfcsSignIncomingConfirmationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String refPacketUid;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsSignIncomingConfirmationType.Success success;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsSignIncomingConfirmationType.Violations violations;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", defaultValue = "true")
    protected Boolean processing;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the refPacketUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPacketUid() {
        return refPacketUid;
    }

    /**
     * Sets the value of the refPacketUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPacketUid(String value) {
        this.refPacketUid = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSignIncomingConfirmationType.Success }
     *     
     */
    public ZfcsSignIncomingConfirmationType.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSignIncomingConfirmationType.Success }
     *     
     */
    public void setSuccess(ZfcsSignIncomingConfirmationType.Success value) {
        this.success = value;
    }

    /**
     * Gets the value of the violations property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSignIncomingConfirmationType.Violations }
     *     
     */
    public ZfcsSignIncomingConfirmationType.Violations getViolations() {
        return violations;
    }

    /**
     * Sets the value of the violations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSignIncomingConfirmationType.Violations }
     *     
     */
    public void setViolations(ZfcsSignIncomingConfirmationType.Violations value) {
        this.violations = value;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessing(Boolean value) {
        this.processing = value;
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
     *         &lt;element name="registrationInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="loadId">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="documentUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
     *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signIncomingRegNumberType"/>
     *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="loadUrl" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *         &lt;element name="warnings" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="warning" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
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
        "registrationInfo",
        "loadUrl",
        "warnings"
    })
    public static class Success {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsSignIncomingConfirmationType.Success.RegistrationInfo registrationInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String loadUrl;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsSignIncomingConfirmationType.Success.Warnings warnings;

        /**
         * Gets the value of the registrationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsSignIncomingConfirmationType.Success.RegistrationInfo }
         *     
         */
        public ZfcsSignIncomingConfirmationType.Success.RegistrationInfo getRegistrationInfo() {
            return registrationInfo;
        }

        /**
         * Sets the value of the registrationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsSignIncomingConfirmationType.Success.RegistrationInfo }
         *     
         */
        public void setRegistrationInfo(ZfcsSignIncomingConfirmationType.Success.RegistrationInfo value) {
            this.registrationInfo = value;
        }

        /**
         * Gets the value of the loadUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoadUrl() {
            return loadUrl;
        }

        /**
         * Sets the value of the loadUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoadUrl(String value) {
            this.loadUrl = value;
        }

        /**
         * Gets the value of the warnings property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsSignIncomingConfirmationType.Success.Warnings }
         *     
         */
        public ZfcsSignIncomingConfirmationType.Success.Warnings getWarnings() {
            return warnings;
        }

        /**
         * Sets the value of the warnings property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsSignIncomingConfirmationType.Success.Warnings }
         *     
         */
        public void setWarnings(ZfcsSignIncomingConfirmationType.Success.Warnings value) {
            this.warnings = value;
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
         *         &lt;element name="loadId">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="documentUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
         *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signIncomingRegNumberType"/>
         *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "loadId",
            "documentUid",
            "regNumber",
            "publishDate",
            "versionNumber"
        })
        public static class RegistrationInfo {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String loadId;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String documentUid;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String regNumber;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar publishDate;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected Integer versionNumber;

            /**
             * Gets the value of the loadId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoadId() {
                return loadId;
            }

            /**
             * Sets the value of the loadId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoadId(String value) {
                this.loadId = value;
            }

            /**
             * Gets the value of the documentUid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentUid() {
                return documentUid;
            }

            /**
             * Sets the value of the documentUid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentUid(String value) {
                this.documentUid = value;
            }

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
             * Gets the value of the publishDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPublishDate() {
                return publishDate;
            }

            /**
             * Sets the value of the publishDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPublishDate(XMLGregorianCalendar value) {
                this.publishDate = value;
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
         *         &lt;element name="warning" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
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
            "warning"
        })
        public static class Warnings {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsViolationType> warning;

            /**
             * Gets the value of the warning property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the warning property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWarning().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsViolationType }
             * 
             * 
             */
            public List<ZfcsViolationType> getWarning() {
                if (warning == null) {
                    warning = new ArrayList<ZfcsViolationType>();
                }
                return this.warning;
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
     *         &lt;element name="violation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
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
        "violation"
    })
    public static class Violations {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsViolationType> violation;

        /**
         * Gets the value of the violation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getViolation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsViolationType }
         * 
         * 
         */
        public List<ZfcsViolationType> getViolation() {
            if (violation == null) {
                violation = new ArrayList<ZfcsViolationType>();
            }
            return this.violation;
        }

    }

}
