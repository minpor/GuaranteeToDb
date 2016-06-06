
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о недействительности сведений отчета по мониторингу реализации крупных проектов с государственным участием
 * 
 * <p>Java class for zfcs_customerReportBigProjectMonitoringInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportBigProjectMonitoringInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportInvalidType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportBigProjectMonitoringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportBigProjectMonitoringInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "report"
})
public class ZfcsCustomerReportBigProjectMonitoringInvalidType
    extends ZfcsCustomerReportInvalidType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportBigProjectMonitoringType report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType }
     *     
     */
    public void setReport(ZfcsCustomerReportBigProjectMonitoringType value) {
        this.report = value;
    }

}
