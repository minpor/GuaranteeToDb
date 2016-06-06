
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Общая информация о недействительности сведений отчета заказчика
 * 
 * <p>Java class for zfcs_customerReportInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportBaseType">
 *       &lt;sequence>
 *         &lt;element name="reportId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_reportIdType"/>
 *         &lt;element name="invalidReportInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_invalidReportType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportInvalidType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "reportId",
    "invalidReportInfo"
})
@XmlSeeAlso({
    ZfcsCustomerReportContractExecutionInvalidType.class,
    ZfcsCustomerReportSmallScaleBusinessInvalidType.class,
    ZfcsCustomerReportSingleContractorInvalidType.class,
    ZfcsCustomerReportBigProjectMonitoringInvalidType.class
})
public class ZfcsCustomerReportInvalidType
    extends ZfcsCustomerReportBaseType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String reportId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsInvalidReportType invalidReportInfo;

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the invalidReportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInvalidReportType }
     *     
     */
    public ZfcsInvalidReportType getInvalidReportInfo() {
        return invalidReportInfo;
    }

    /**
     * Sets the value of the invalidReportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInvalidReportType }
     *     
     */
    public void setInvalidReportInfo(ZfcsInvalidReportType value) {
        this.invalidReportInfo = value;
    }

}
