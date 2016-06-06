
package ru.minpor.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Критерий оценки заявок участников
 * 
 * <p>Java class for zfcs_criterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_criterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_criterionCodeEnum"/>
 *         &lt;element name="value" type="{http://zakupki.gov.ru/oos/types/1}zfcs_valueType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="indicators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indicator" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="limit" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorValueType" minOccurs="0"/>
 *         &lt;element name="measurementOrder" type="{http://zakupki.gov.ru/oos/types/1}zfcs_measurementOrderEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_criterionType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "code",
    "value",
    "addInfo",
    "indicators",
    "limit",
    "measurementOrder"
})
public class ZfcsCriterionType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsCriterionCodeEnum code;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected BigDecimal value;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String addInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCriterionType.Indicators indicators;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected BigDecimal limit;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsMeasurementOrderEnum measurementOrder;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCriterionCodeEnum }
     *     
     */
    public ZfcsCriterionCodeEnum getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCriterionCodeEnum }
     *     
     */
    public void setCode(ZfcsCriterionCodeEnum value) {
        this.code = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCriterionType.Indicators }
     *     
     */
    public ZfcsCriterionType.Indicators getIndicators() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCriterionType.Indicators }
     *     
     */
    public void setIndicators(ZfcsCriterionType.Indicators value) {
        this.indicators = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimit(BigDecimal value) {
        this.limit = value;
    }

    /**
     * Gets the value of the measurementOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsMeasurementOrderEnum }
     *     
     */
    public ZfcsMeasurementOrderEnum getMeasurementOrder() {
        return measurementOrder;
    }

    /**
     * Sets the value of the measurementOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsMeasurementOrderEnum }
     *     
     */
    public void setMeasurementOrder(ZfcsMeasurementOrderEnum value) {
        this.measurementOrder = value;
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
     *         &lt;element name="indicator" type="{http://zakupki.gov.ru/oos/types/1}zfcs_indicatorType" maxOccurs="unbounded"/>
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
        "indicator"
    })
    public static class Indicators {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsIndicatorType> indicator;

        /**
         * Gets the value of the indicator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indicator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndicator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsIndicatorType }
         * 
         * 
         */
        public List<ZfcsIndicatorType> getIndicator() {
            if (indicator == null) {
                indicator = new ArrayList<ZfcsIndicatorType>();
            }
            return this.indicator;
        }

    }

}
