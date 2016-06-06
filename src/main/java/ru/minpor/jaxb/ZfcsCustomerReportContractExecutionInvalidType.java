
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о недействительности сведений отчета об исполнении контракта (результатах отдельного этапа исполнения контракта)
 * 
 * <p>Java class for zfcs_customerReportContractExecutionInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportContractExecutionInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportInvalidType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportContractExecutionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportContractExecutionInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "report"
})
public class ZfcsCustomerReportContractExecutionInvalidType
    extends ZfcsCustomerReportInvalidType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsCustomerReportContractExecutionType report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportContractExecutionType }
     *     
     */
    public ZfcsCustomerReportContractExecutionType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportContractExecutionType }
     *     
     */
    public void setReport(ZfcsCustomerReportContractExecutionType value) {
        this.report = value;
    }

}
