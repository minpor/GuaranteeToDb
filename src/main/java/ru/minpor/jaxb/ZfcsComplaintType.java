
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация по жалобе
 * 
 * <p>Java class for zfcs_complaintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCommonInfoType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="indicted" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantType" minOccurs="0"/>
 *         &lt;element name="applicantNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantNewType" minOccurs="0"/>
 *         &lt;element name="object" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" minOccurs="0"/>
 *         &lt;element name="text" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *         &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
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
@XmlType(name = "zfcs_complaintType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "commonInfo",
    "indicted",
    "applicant",
    "applicantNew",
    "object",
    "text",
    "printForm",
    "extPrintForm",
    "attachments",
    "returnInfo"
})
public class ZfcsComplaintType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsComplaintType.CommonInfo commonInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected List<ZfcsComplaintSubjectType> indicted;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsApplicantType applicant;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsApplicantNewType applicantNew;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsComplaintObjectType object;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String text;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPrintFormType printForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsControlRegistersAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsComplaintReturnInfoType returnInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintType.CommonInfo }
     *     
     */
    public ZfcsComplaintType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsComplaintType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the indicted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsComplaintSubjectType }
     * 
     * 
     */
    public List<ZfcsComplaintSubjectType> getIndicted() {
        if (indicted == null) {
            indicted = new ArrayList<ZfcsComplaintSubjectType>();
        }
        return this.indicted;
    }

    /**
     * Gets the value of the applicant property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsApplicantType }
     *     
     */
    public ZfcsApplicantType getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsApplicantType }
     *     
     */
    public void setApplicant(ZfcsApplicantType value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the applicantNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsApplicantNewType }
     *     
     */
    public ZfcsApplicantNewType getApplicantNew() {
        return applicantNew;
    }

    /**
     * Sets the value of the applicantNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsApplicantNewType }
     *     
     */
    public void setApplicantNew(ZfcsApplicantNewType value) {
        this.applicantNew = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintObjectType }
     *     
     */
    public ZfcsComplaintObjectType getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintObjectType }
     *     
     */
    public void setObject(ZfcsComplaintObjectType value) {
        this.object = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public ZfcsControlRegistersAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the returnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintReturnInfoType }
     *     
     */
    public ZfcsComplaintReturnInfoType getReturnInfo() {
        return returnInfo;
    }

    /**
     * Sets the value of the returnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintReturnInfoType }
     *     
     */
    public void setReturnInfo(ZfcsComplaintReturnInfoType value) {
        this.returnInfo = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCommonInfoType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CommonInfo
        extends ZfcsComplaintCommonInfoType
    {


    }

}
