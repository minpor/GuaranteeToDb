
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * План закупок в структурированной форме
 * 
 * <p>Java class for zfcs_purchasePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *                   &lt;element name="planNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_sketchPlanNumberType" minOccurs="0"/>
 *                   &lt;element name="planPeriod">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nextYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                             &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="owner" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
 *                           &lt;sequence>
 *                             &lt;element name="responsibleRole">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType">
 *                                   &lt;enumeration value="CU"/>
 *                                   &lt;enumeration value="RA"/>
 *                                   &lt;enumeration value="AI"/>
 *                                   &lt;enumeration value="OA"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *                             &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanBasementEnum"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customerInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customer">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
 *                           &lt;sequence>
 *                             &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
 *                             &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                             &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
 *                             &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *                             &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="responsibleContactInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
 *                   &lt;element name="confirmContactInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType">
 *                           &lt;sequence>
 *                             &lt;element name="position">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="256"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanAddInfoType" minOccurs="0"/>
 *         &lt;element name="providedPurchases">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positions">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="specialPurchases" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="specialPurchase" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_specialPurchaseRef"/>
 *                                       &lt;element name="purchases">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="purchase" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
 *                                                           &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
 *                                                           &lt;element name="publishYear">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="finances" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;choice>
 *                                                                     &lt;element name="KVR">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="KBK">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/choice>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
 *                                                           &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totalSpecialPurchaseFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="finances">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="KVR" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
 *                                       &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="KBK" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
 *                                       &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="totalContractFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
 *                   &lt;element name="totalPurchaseFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_purchasePlanType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "customerInfo",
    "localInfo",
    "providedPurchases",
    "attachments",
    "printForm",
    "extPrintForm"
})
public class ZfcsPurchasePlanType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchasePlanType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchasePlanType.CustomerInfo customerInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchasePlanAddInfoType localInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchasePlanType.ProvidedPurchases providedPurchases;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanType.CommonInfo }
     *     
     */
    public ZfcsPurchasePlanType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsPurchasePlanType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanType.CustomerInfo }
     *     
     */
    public ZfcsPurchasePlanType.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanType.CustomerInfo }
     *     
     */
    public void setCustomerInfo(ZfcsPurchasePlanType.CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the localInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanAddInfoType }
     *     
     */
    public ZfcsPurchasePlanAddInfoType getLocalInfo() {
        return localInfo;
    }

    /**
     * Sets the value of the localInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanAddInfoType }
     *     
     */
    public void setLocalInfo(ZfcsPurchasePlanAddInfoType value) {
        this.localInfo = value;
    }

    /**
     * Gets the value of the providedPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanType.ProvidedPurchases }
     *     
     */
    public ZfcsPurchasePlanType.ProvidedPurchases getProvidedPurchases() {
        return providedPurchases;
    }

    /**
     * Sets the value of the providedPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanType.ProvidedPurchases }
     *     
     */
    public void setProvidedPurchases(ZfcsPurchasePlanType.ProvidedPurchases value) {
        this.providedPurchases = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
     *         &lt;element name="planNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_sketchPlanNumberType" minOccurs="0"/>
     *         &lt;element name="planPeriod">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nextYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                   &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="owner" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
     *                 &lt;sequence>
     *                   &lt;element name="responsibleRole">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType">
     *                         &lt;enumeration value="CU"/>
     *                         &lt;enumeration value="RA"/>
     *                         &lt;enumeration value="AI"/>
     *                         &lt;enumeration value="OA"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
     *                   &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanBasementEnum"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "id",
        "externalId",
        "planNumber",
        "planPeriod",
        "versionNumber",
        "owner",
        "createDate",
        "confirmDate",
        "base",
        "publishDate"
    })
    public static class CommonInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Long id;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String externalId;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String planNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchasePlanType.CommonInfo.PlanPeriod planPeriod;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Integer versionNumber;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPurchasePlanType.CommonInfo.Owner owner;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar confirmDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsPurchasePlanBasementEnum base;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setId(Long value) {
            this.id = value;
        }

        /**
         * Gets the value of the externalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalId() {
            return externalId;
        }

        /**
         * Sets the value of the externalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalId(String value) {
            this.externalId = value;
        }

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
         * Gets the value of the planPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanType.CommonInfo.PlanPeriod }
         *     
         */
        public ZfcsPurchasePlanType.CommonInfo.PlanPeriod getPlanPeriod() {
            return planPeriod;
        }

        /**
         * Sets the value of the planPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanType.CommonInfo.PlanPeriod }
         *     
         */
        public void setPlanPeriod(ZfcsPurchasePlanType.CommonInfo.PlanPeriod value) {
            this.planPeriod = value;
        }

        /**
         * Gets the value of the versionNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getVersionNumber() {
            return versionNumber;
        }

        /**
         * Sets the value of the versionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setVersionNumber(Integer value) {
            this.versionNumber = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanType.CommonInfo.Owner }
         *     
         */
        public ZfcsPurchasePlanType.CommonInfo.Owner getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanType.CommonInfo.Owner }
         *     
         */
        public void setOwner(ZfcsPurchasePlanType.CommonInfo.Owner value) {
            this.owner = value;
        }

        /**
         * Gets the value of the createDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDate() {
            return createDate;
        }

        /**
         * Sets the value of the createDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDate(XMLGregorianCalendar value) {
            this.createDate = value;
        }

        /**
         * Gets the value of the confirmDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getConfirmDate() {
            return confirmDate;
        }

        /**
         * Sets the value of the confirmDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setConfirmDate(XMLGregorianCalendar value) {
            this.confirmDate = value;
        }

        /**
         * Gets the value of the base property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanBasementEnum }
         *     
         */
        public ZfcsPurchasePlanBasementEnum getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanBasementEnum }
         *     
         */
        public void setBase(ZfcsPurchasePlanBasementEnum value) {
            this.base = value;
        }

        /**
         * Gets the value of the publishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishDate(XMLGregorianCalendar value) {
            this.publishDate = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
         *       &lt;sequence>
         *         &lt;element name="responsibleRole">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType">
         *               &lt;enumeration value="CU"/>
         *               &lt;enumeration value="RA"/>
         *               &lt;enumeration value="AI"/>
         *               &lt;enumeration value="OA"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
         *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "responsibleRole",
            "oktmo",
            "okpo"
        })
        public static class Owner
            extends ZfcsPurchasePlanOrganizationType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected ZfcsResponsibleRoleType responsibleRole;
            @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKTMORef oktmo;
            @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPORef okpo;

            /**
             * Gets the value of the responsibleRole property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsResponsibleRoleType }
             *     
             */
            public ZfcsResponsibleRoleType getResponsibleRole() {
                return responsibleRole;
            }

            /**
             * Sets the value of the responsibleRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsResponsibleRoleType }
             *     
             */
            public void setResponsibleRole(ZfcsResponsibleRoleType value) {
                this.responsibleRole = value;
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
         *         &lt;element name="nextYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *         &lt;element name="firstYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *         &lt;element name="secondYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
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
            "nextYear",
            "firstYear",
            "secondYear"
        })
        public static class PlanPeriod {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int nextYear;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int firstYear;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
            protected int secondYear;

            /**
             * Gets the value of the nextYear property.
             * 
             */
            public int getNextYear() {
                return nextYear;
            }

            /**
             * Sets the value of the nextYear property.
             * 
             */
            public void setNextYear(int value) {
                this.nextYear = value;
            }

            /**
             * Gets the value of the firstYear property.
             * 
             */
            public int getFirstYear() {
                return firstYear;
            }

            /**
             * Sets the value of the firstYear property.
             * 
             */
            public void setFirstYear(int value) {
                this.firstYear = value;
            }

            /**
             * Gets the value of the secondYear property.
             * 
             */
            public int getSecondYear() {
                return secondYear;
            }

            /**
             * Sets the value of the secondYear property.
             * 
             */
            public void setSecondYear(int value) {
                this.secondYear = value;
            }

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
     *         &lt;element name="customer">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
     *                 &lt;sequence>
     *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
     *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *                   &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
     *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
     *                   &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="responsibleContactInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
     *         &lt;element name="confirmContactInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType">
     *                 &lt;sequence>
     *                   &lt;element name="position">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="256"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "customer",
        "responsibleContactInfo",
        "confirmContactInfo"
    })
    public static class CustomerInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchasePlanType.CustomerInfo.Customer customer;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsContactPersonType responsibleContactInfo;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchasePlanType.CustomerInfo.ConfirmContactInfo confirmContactInfo;

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanType.CustomerInfo.Customer }
         *     
         */
        public ZfcsPurchasePlanType.CustomerInfo.Customer getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanType.CustomerInfo.Customer }
         *     
         */
        public void setCustomer(ZfcsPurchasePlanType.CustomerInfo.Customer value) {
            this.customer = value;
        }

        /**
         * Gets the value of the responsibleContactInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContactPersonType }
         *     
         */
        public ZfcsContactPersonType getResponsibleContactInfo() {
            return responsibleContactInfo;
        }

        /**
         * Sets the value of the responsibleContactInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContactPersonType }
         *     
         */
        public void setResponsibleContactInfo(ZfcsContactPersonType value) {
            this.responsibleContactInfo = value;
        }

        /**
         * Gets the value of the confirmContactInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanType.CustomerInfo.ConfirmContactInfo }
         *     
         */
        public ZfcsPurchasePlanType.CustomerInfo.ConfirmContactInfo getConfirmContactInfo() {
            return confirmContactInfo;
        }

        /**
         * Sets the value of the confirmContactInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanType.CustomerInfo.ConfirmContactInfo }
         *     
         */
        public void setConfirmContactInfo(ZfcsPurchasePlanType.CustomerInfo.ConfirmContactInfo value) {
            this.confirmContactInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType">
         *       &lt;sequence>
         *         &lt;element name="position">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="256"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "position"
        })
        public static class ConfirmContactInfo
            extends ZfcsContactPersonType
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String position;

            /**
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPosition(String value) {
                this.position = value;
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
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
         *       &lt;sequence>
         *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
         *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
         *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
         *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
         *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inn",
            "kpp",
            "okopf",
            "oktmo",
            "okpo"
        })
        public static class Customer
            extends ZfcsPurchasePlanOrganizationType
        {

            @XmlElement(name = "INN", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String inn;
            @XmlElement(name = "KPP", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected String kpp;
            @XmlElement(name = "OKOPF", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOkopfRef okopf;
            @XmlElement(name = "OKTMO", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKTMORef oktmo;
            @XmlElement(name = "OKPO", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected ZfcsOKPORef okpo;

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINN(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKPP() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKPP(String value) {
                this.kpp = value;
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
     *         &lt;element name="positions">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="specialPurchases" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="specialPurchase" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_specialPurchaseRef"/>
     *                             &lt;element name="purchases">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="purchase" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
     *                                                 &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
     *                                                 &lt;element name="publishYear">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="finances" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;choice>
     *                                                           &lt;element name="KVR">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="KBK">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/choice>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
     *                                                 &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totalSpecialPurchaseFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="finances">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="KVR" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
     *                             &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="KBK" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
     *                             &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="totalContractFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
     *         &lt;element name="totalPurchaseFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
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
        "positions",
        "specialPurchases",
        "finances",
        "totalContractFinances",
        "totalPurchaseFinances"
    })
    public static class ProvidedPurchases {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchasePlanType.ProvidedPurchases.Positions positions;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases specialPurchases;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchasePlanType.ProvidedPurchases.Finances finances;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsFinanceResourcesType totalContractFinances;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsFinanceResourcesType totalPurchaseFinances;

        /**
         * Gets the value of the positions property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.Positions }
         *     
         */
        public ZfcsPurchasePlanType.ProvidedPurchases.Positions getPositions() {
            return positions;
        }

        /**
         * Sets the value of the positions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.Positions }
         *     
         */
        public void setPositions(ZfcsPurchasePlanType.ProvidedPurchases.Positions value) {
            this.positions = value;
        }

        /**
         * Gets the value of the specialPurchases property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases }
         *     
         */
        public ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases getSpecialPurchases() {
            return specialPurchases;
        }

        /**
         * Sets the value of the specialPurchases property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases }
         *     
         */
        public void setSpecialPurchases(ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases value) {
            this.specialPurchases = value;
        }

        /**
         * Gets the value of the finances property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.Finances }
         *     
         */
        public ZfcsPurchasePlanType.ProvidedPurchases.Finances getFinances() {
            return finances;
        }

        /**
         * Sets the value of the finances property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.Finances }
         *     
         */
        public void setFinances(ZfcsPurchasePlanType.ProvidedPurchases.Finances value) {
            this.finances = value;
        }

        /**
         * Gets the value of the totalContractFinances property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public ZfcsFinanceResourcesType getTotalContractFinances() {
            return totalContractFinances;
        }

        /**
         * Sets the value of the totalContractFinances property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public void setTotalContractFinances(ZfcsFinanceResourcesType value) {
            this.totalContractFinances = value;
        }

        /**
         * Gets the value of the totalPurchaseFinances property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public ZfcsFinanceResourcesType getTotalPurchaseFinances() {
            return totalPurchaseFinances;
        }

        /**
         * Sets the value of the totalPurchaseFinances property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsFinanceResourcesType }
         *     
         */
        public void setTotalPurchaseFinances(ZfcsFinanceResourcesType value) {
            this.totalPurchaseFinances = value;
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
         *         &lt;element name="KVR" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
         *                   &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="KBK" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
         *                   &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "kvr",
            "kbk"
        })
        public static class Finances {

            @XmlElement(name = "KVR", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsPurchasePlanType.ProvidedPurchases.Finances.KVR> kvr;
            @XmlElement(name = "KBK", namespace = "http://zakupki.gov.ru/oos/types/1")
            protected List<ZfcsPurchasePlanType.ProvidedPurchases.Finances.KBK> kbk;

            /**
             * Gets the value of the kvr property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kvr property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKVR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsPurchasePlanType.ProvidedPurchases.Finances.KVR }
             * 
             * 
             */
            public List<ZfcsPurchasePlanType.ProvidedPurchases.Finances.KVR> getKVR() {
                if (kvr == null) {
                    kvr = new ArrayList<ZfcsPurchasePlanType.ProvidedPurchases.Finances.KVR>();
                }
                return this.kvr;
            }

            /**
             * Gets the value of the kbk property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kbk property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKBK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsPurchasePlanType.ProvidedPurchases.Finances.KBK }
             * 
             * 
             */
            public List<ZfcsPurchasePlanType.ProvidedPurchases.Finances.KBK> getKBK() {
                if (kbk == null) {
                    kbk = new ArrayList<ZfcsPurchasePlanType.ProvidedPurchases.Finances.KBK>();
                }
                return this.kbk;
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
             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
             *         &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
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
                "code",
                "amounts"
            })
            public static class KBK {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String code;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsFinanceResourcesType amounts;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the amounts property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsFinanceResourcesType }
                 *     
                 */
                public ZfcsFinanceResourcesType getAmounts() {
                    return amounts;
                }

                /**
                 * Sets the value of the amounts property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsFinanceResourcesType }
                 *     
                 */
                public void setAmounts(ZfcsFinanceResourcesType value) {
                    this.amounts = value;
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
             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
             *         &lt;element name="amounts" type="{http://zakupki.gov.ru/oos/types/1}zfcs_financeResourcesType"/>
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
                "code",
                "amounts"
            })
            public static class KVR {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String code;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsFinanceResourcesType amounts;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the amounts property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsFinanceResourcesType }
                 *     
                 */
                public ZfcsFinanceResourcesType getAmounts() {
                    return amounts;
                }

                /**
                 * Sets the value of the amounts property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsFinanceResourcesType }
                 *     
                 */
                public void setAmounts(ZfcsFinanceResourcesType value) {
                    this.amounts = value;
                }

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
         *         &lt;element name="position" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositionType" maxOccurs="unbounded"/>
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
            "position"
        })
        public static class Positions {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsPurchasePlanPositionType> position;

            /**
             * Gets the value of the position property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the position property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPosition().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsPurchasePlanPositionType }
             * 
             * 
             */
            public List<ZfcsPurchasePlanPositionType> getPosition() {
                if (position == null) {
                    position = new ArrayList<ZfcsPurchasePlanPositionType>();
                }
                return this.position;
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
         *         &lt;element name="specialPurchase" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_specialPurchaseRef"/>
         *                   &lt;element name="purchases">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="purchase" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
         *                                       &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
         *                                       &lt;element name="publishYear">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="finances" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;choice>
         *                                                 &lt;element name="KVR">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="KBK">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/choice>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
         *                                       &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totalSpecialPurchaseFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
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
            "specialPurchase",
            "totalSpecialPurchaseFinances"
        })
        public static class SpecialPurchases {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase> specialPurchase;
            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected String totalSpecialPurchaseFinances;

            /**
             * Gets the value of the specialPurchase property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the specialPurchase property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpecialPurchase().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase }
             * 
             * 
             */
            public List<ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase> getSpecialPurchase() {
                if (specialPurchase == null) {
                    specialPurchase = new ArrayList<ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase>();
                }
                return this.specialPurchase;
            }

            /**
             * Gets the value of the totalSpecialPurchaseFinances property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalSpecialPurchaseFinances() {
                return totalSpecialPurchaseFinances;
            }

            /**
             * Sets the value of the totalSpecialPurchaseFinances property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalSpecialPurchaseFinances(String value) {
                this.totalSpecialPurchaseFinances = value;
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
             *         &lt;element name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_specialPurchaseRef"/>
             *         &lt;element name="purchases">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="purchase" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
             *                             &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
             *                             &lt;element name="publishYear">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="finances" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;choice>
             *                                       &lt;element name="KVR">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="KBK">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/choice>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
             *                             &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
                "type",
                "purchases"
            })
            public static class SpecialPurchase {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsSpecialPurchaseRef type;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases purchases;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsSpecialPurchaseRef }
                 *     
                 */
                public ZfcsSpecialPurchaseRef getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsSpecialPurchaseRef }
                 *     
                 */
                public void setType(ZfcsSpecialPurchaseRef value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the purchases property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases }
                 *     
                 */
                public ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases getPurchases() {
                    return purchases;
                }

                /**
                 * Sets the value of the purchases property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases }
                 *     
                 */
                public void setPurchases(ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases value) {
                    this.purchases = value;
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
                 *         &lt;element name="purchase" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
                 *                   &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
                 *                   &lt;element name="publishYear">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="finances" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;choice>
                 *                             &lt;element name="KVR">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="KBK">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/choice>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
                 *                   &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
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
                    "purchase"
                })
                public static class Purchases {

                    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                    protected List<ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase> purchase;

                    /**
                     * Gets the value of the purchase property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the purchase property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPurchase().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase }
                     * 
                     * 
                     */
                    public List<ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase> getPurchase() {
                        if (purchase == null) {
                            purchase = new ArrayList<ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase>();
                        }
                        return this.purchase;
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
                     *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanPositionNumberType" minOccurs="0"/>
                     *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ikzCodeType"/>
                     *         &lt;element name="publishYear">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType">
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="finances" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;choice>
                     *                   &lt;element name="KVR">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="KBK">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/choice>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPlanType"/>
                     *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
                        "positionNumber",
                        "ikz",
                        "publishYear",
                        "finances",
                        "yearFinances",
                        "addInfo"
                    })
                    public static class Purchase {

                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected String positionNumber;
                        @XmlElement(name = "IKZ", namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected String ikz;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected int publishYear;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances finances;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                        protected String yearFinances;
                        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                        protected String addInfo;

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
                         * Gets the value of the ikz property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIKZ() {
                            return ikz;
                        }

                        /**
                         * Sets the value of the ikz property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIKZ(String value) {
                            this.ikz = value;
                        }

                        /**
                         * Gets the value of the publishYear property.
                         * 
                         */
                        public int getPublishYear() {
                            return publishYear;
                        }

                        /**
                         * Sets the value of the publishYear property.
                         * 
                         */
                        public void setPublishYear(int value) {
                            this.publishYear = value;
                        }

                        /**
                         * Gets the value of the finances property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances }
                         *     
                         */
                        public ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances getFinances() {
                            return finances;
                        }

                        /**
                         * Sets the value of the finances property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances }
                         *     
                         */
                        public void setFinances(ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances value) {
                            this.finances = value;
                        }

                        /**
                         * Gets the value of the yearFinances property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getYearFinances() {
                            return yearFinances;
                        }

                        /**
                         * Sets the value of the yearFinances property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setYearFinances(String value) {
                            this.yearFinances = value;
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
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;choice>
                         *         &lt;element name="KVR">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="KBK">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/choice>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "kvr",
                            "kbk"
                        })
                        public static class Finances {

                            @XmlElement(name = "KVR", namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KVR kvr;
                            @XmlElement(name = "KBK", namespace = "http://zakupki.gov.ru/oos/types/1")
                            protected ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KBK kbk;

                            /**
                             * Gets the value of the kvr property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KVR }
                             *     
                             */
                            public ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KVR getKVR() {
                                return kvr;
                            }

                            /**
                             * Sets the value of the kvr property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KVR }
                             *     
                             */
                            public void setKVR(ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KVR value) {
                                this.kvr = value;
                            }

                            /**
                             * Gets the value of the kbk property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KBK }
                             *     
                             */
                            public ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KBK getKBK() {
                                return kbk;
                            }

                            /**
                             * Sets the value of the kbk property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KBK }
                             *     
                             */
                            public void setKBK(ZfcsPurchasePlanType.ProvidedPurchases.SpecialPurchases.SpecialPurchase.Purchases.Purchase.Finances.KBK value) {
                                this.kbk = value;
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
                             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
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
                                "code"
                            })
                            public static class KBK {

                                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                                protected String code;

                                /**
                                 * Gets the value of the code property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCode() {
                                    return code;
                                }

                                /**
                                 * Sets the value of the code property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCode(String value) {
                                    this.code = value;
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
                             *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRCodeType"/>
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
                                "code"
                            })
                            public static class KVR {

                                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                                protected String code;

                                /**
                                 * Gets the value of the code property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCode() {
                                    return code;
                                }

                                /**
                                 * Sets the value of the code property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCode(String value) {
                                    this.code = value;
                                }

                            }

                        }

                    }

                }

            }

        }

    }

}
