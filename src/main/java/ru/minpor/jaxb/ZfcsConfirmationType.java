
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат обработки
 * 
 * <p>Java class for zfcs_confirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_confirmationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_confirmationResultType"/>
 *         &lt;element name="violations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="violation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_violationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="loadUrl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="refId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;element name="missingIndexNums" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="indexNum" maxOccurs="unbounded">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
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
@XmlType(name = "zfcs_confirmationType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "loadId",
    "result",
    "violations",
    "loadUrl",
    "refId",
    "missingIndexNums"
})
public class ZfcsConfirmationType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String loadId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsConfirmationResultType result;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsConfirmationType.Violations violations;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String loadUrl;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String refId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsConfirmationType.MissingIndexNums missingIndexNums;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

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
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsConfirmationResultType }
     *     
     */
    public ZfcsConfirmationResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsConfirmationResultType }
     *     
     */
    public void setResult(ZfcsConfirmationResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the violations property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsConfirmationType.Violations }
     *     
     */
    public ZfcsConfirmationType.Violations getViolations() {
        return violations;
    }

    /**
     * Sets the value of the violations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsConfirmationType.Violations }
     *     
     */
    public void setViolations(ZfcsConfirmationType.Violations value) {
        this.violations = value;
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
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the missingIndexNums property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsConfirmationType.MissingIndexNums }
     *     
     */
    public ZfcsConfirmationType.MissingIndexNums getMissingIndexNums() {
        return missingIndexNums;
    }

    /**
     * Sets the value of the missingIndexNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsConfirmationType.MissingIndexNums }
     *     
     */
    public void setMissingIndexNums(ZfcsConfirmationType.MissingIndexNums value) {
        this.missingIndexNums = value;
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
     *         &lt;element name="indexNum" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
        "indexNum"
    })
    public static class MissingIndexNums {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", type = Integer.class)
        protected List<Integer> indexNum;

        /**
         * Gets the value of the indexNum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indexNum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndexNum().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getIndexNum() {
            if (indexNum == null) {
                indexNum = new ArrayList<Integer>();
            }
            return this.indexNum;
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
