
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Привилегии пользователя на ЭП
 * 
 * <p>Java class for zfcs_etpPrivilege complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_etpPrivilege">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ETPType"/>
 *         &lt;element name="etpAction" type="{http://zakupki.gov.ru/oos/types/1}zfcs_etpActionType"/>
 *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_etpActionStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_etpPrivilege", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "etp",
    "etpAction",
    "organization",
    "status"
})
public class ZfcsEtpPrivilege {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsETPType etp;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsEtpActionType etpAction;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOrganizationRef organization;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    @XmlSchemaType(name = "string")
    protected ZfcsEtpActionStatusType status;

    /**
     * Gets the value of the etp property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsETPType }
     *     
     */
    public ZfcsETPType getEtp() {
        return etp;
    }

    /**
     * Sets the value of the etp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsETPType }
     *     
     */
    public void setEtp(ZfcsETPType value) {
        this.etp = value;
    }

    /**
     * Gets the value of the etpAction property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEtpActionType }
     *     
     */
    public ZfcsEtpActionType getEtpAction() {
        return etpAction;
    }

    /**
     * Sets the value of the etpAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEtpActionType }
     *     
     */
    public void setEtpAction(ZfcsEtpActionType value) {
        this.etpAction = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setOrganization(ZfcsOrganizationRef value) {
        this.organization = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEtpActionStatusType }
     *     
     */
    public ZfcsEtpActionStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEtpActionStatusType }
     *     
     */
    public void setStatus(ZfcsEtpActionStatusType value) {
        this.status = value;
    }

}
