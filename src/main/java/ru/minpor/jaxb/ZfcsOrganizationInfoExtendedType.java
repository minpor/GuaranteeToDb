
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об организации с расширенным перечнем реквизитов
 * 
 * <p>Java class for zfcs_organizationInfoExtendedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_organizationInfoExtendedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType">
 *       &lt;sequence>
 *         &lt;element name="adress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}phoneType"/>
 *         &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}eMailType"/>
 *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
 *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_organizationInfoExtendedType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "adress",
    "phone",
    "email",
    "oktmo",
    "okpo",
    "okopf"
})
@XmlSeeAlso({
    ru.minpor.jaxb.ZfcsCustomerReportContractExecutionType.Customer.class
})
public class ZfcsOrganizationInfoExtendedType
    extends ZfcsOrganizationInfoType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String adress;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String phone;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String email;
    @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsOKTMORef oktmo;
    @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOKPORef okpo;
    @XmlElement(name = "OKOPF", namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsOkopfRef okopf;

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public ZfcsOKTMORef getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public void setOKTMO(ZfcsOKTMORef value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKPORef }
     *     
     */
    public ZfcsOKPORef getOKPO() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKPORef }
     *     
     */
    public void setOKPO(ZfcsOKPORef value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the okopf property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOkopfRef }
     *     
     */
    public ZfcsOkopfRef getOKOPF() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOkopfRef }
     *     
     */
    public void setOKOPF(ZfcsOkopfRef value) {
        this.okopf = value;
    }

}
