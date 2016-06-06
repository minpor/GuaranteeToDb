
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о плане-графике
 * 
 * <p>Java class for zfcs_tendePlanInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tendePlanInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanNumberType"/>
 *         &lt;choice>
 *           &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType"/>
 *           &lt;element name="purchase83st544" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tendePlanInfoType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "planNumber",
    "positionNumber",
    "purchase83St544"
})
public class ZfcsTendePlanInfoType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String planNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String positionNumber;
    @XmlElement(name = "purchase83st544", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Boolean purchase83St544;

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
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the purchase83St544 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchase83St544() {
        return purchase83St544;
    }

    /**
     * Sets the value of the purchase83St544 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchase83St544(Boolean value) {
        this.purchase83St544 = value;
    }

}
