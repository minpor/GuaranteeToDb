
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Финансовое обеспечение на текущий финансовый год, первый и второй плановые года, а также на последующие годы, в тыс. рублей
 * 
 * <p>Java class for zfcs_financeResourcesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_financeResourcesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType" minOccurs="0"/>
 *         &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType" minOccurs="0"/>
 *         &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType" minOccurs="0"/>
 *         &lt;element name="subsecYears" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType" minOccurs="0"/>
 *         &lt;element name="total" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_financeResourcesType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "currentYear",
    "firstYear",
    "secondYear",
    "subsecYears",
    "total"
})
public class ZfcsFinanceResourcesType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String currentYear;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String firstYear;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String secondYear;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String subsecYears;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String total;

    /**
     * Gets the value of the currentYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentYear() {
        return currentYear;
    }

    /**
     * Sets the value of the currentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentYear(String value) {
        this.currentYear = value;
    }

    /**
     * Gets the value of the firstYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstYear() {
        return firstYear;
    }

    /**
     * Sets the value of the firstYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstYear(String value) {
        this.firstYear = value;
    }

    /**
     * Gets the value of the secondYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondYear() {
        return secondYear;
    }

    /**
     * Sets the value of the secondYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondYear(String value) {
        this.secondYear = value;
    }

    /**
     * Gets the value of the subsecYears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsecYears() {
        return subsecYears;
    }

    /**
     * Sets the value of the subsecYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsecYears(String value) {
        this.subsecYears = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

}
