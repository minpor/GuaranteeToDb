
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о недействительности сведений отчета с обоснованием закупки у единственного поставщика (подрядчика, исполнителя)
 * 
 * <p>Java class for zfcs_customerReportSingleContractorInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportSingleContractorInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportInvalidType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSingleContractorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportSingleContractorInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "report"
})
public class ZfcsCustomerReportSingleContractorInvalidType
    extends ZfcsCustomerReportInvalidType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportSingleContractorType report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSingleContractorType }
     *     
     */
    public ZfcsCustomerReportSingleContractorType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSingleContractorType }
     *     
     */
    public void setReport(ZfcsCustomerReportSingleContractorType value) {
        this.report = value;
    }

}
