
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Внесение изменений в извещение в части лота 
 * 
 * <p>Java class for zfcs_notificationLotChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationLotChangeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNotificationType">
 *       &lt;sequence>
 *         &lt;element name="purchaseDocumentation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_releasePurchaseDocumentationType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="procedureOKInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOKType" minOccurs="0"/>
 *           &lt;element name="procedureOKOUInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOKOUType" minOccurs="0"/>
 *           &lt;element name="procedureOKDInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOKDType" minOccurs="0"/>
 *           &lt;element name="procedureZakKInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOKType" minOccurs="0"/>
 *           &lt;element name="procedureZakKOUInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOKOUType" minOccurs="0"/>
 *           &lt;element name="procedureZakKDInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOKDType" minOccurs="0"/>
 *           &lt;element name="procedureZakAInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureZakAType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="lot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_lotOKType">
 *                 &lt;sequence>
 *                   &lt;element name="noPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationModificationType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_notificationLotChangeType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "purchaseDocumentation",
    "procedureOKInfo",
    "procedureOKOUInfo",
    "procedureOKDInfo",
    "procedureZakKInfo",
    "procedureZakKOUInfo",
    "procedureZakKDInfo",
    "procedureZakAInfo",
    "lot",
    "attachments",
    "modification"
})
public class ZfcsNotificationLotChangeType
    extends ZfcsPurchaseNotificationType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsReleasePurchaseDocumentationType purchaseDocumentation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseProcedureOKType procedureOKInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseProcedureOKOUType procedureOKOUInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseProcedureOKDType procedureOKDInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseProcedureOKType procedureZakKInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseProcedureOKOUType procedureZakKOUInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseProcedureOKDType procedureZakKDInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPurchaseProcedureZakAType procedureZakAInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNotificationLotChangeType.Lot lot;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNotificationModificationType modification;

    /**
     * Gets the value of the purchaseDocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsReleasePurchaseDocumentationType }
     *     
     */
    public ZfcsReleasePurchaseDocumentationType getPurchaseDocumentation() {
        return purchaseDocumentation;
    }

    /**
     * Sets the value of the purchaseDocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsReleasePurchaseDocumentationType }
     *     
     */
    public void setPurchaseDocumentation(ZfcsReleasePurchaseDocumentationType value) {
        this.purchaseDocumentation = value;
    }

    /**
     * Gets the value of the procedureOKInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKType }
     *     
     */
    public ZfcsPurchaseProcedureOKType getProcedureOKInfo() {
        return procedureOKInfo;
    }

    /**
     * Sets the value of the procedureOKInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKType }
     *     
     */
    public void setProcedureOKInfo(ZfcsPurchaseProcedureOKType value) {
        this.procedureOKInfo = value;
    }

    /**
     * Gets the value of the procedureOKOUInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKOUType }
     *     
     */
    public ZfcsPurchaseProcedureOKOUType getProcedureOKOUInfo() {
        return procedureOKOUInfo;
    }

    /**
     * Sets the value of the procedureOKOUInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKOUType }
     *     
     */
    public void setProcedureOKOUInfo(ZfcsPurchaseProcedureOKOUType value) {
        this.procedureOKOUInfo = value;
    }

    /**
     * Gets the value of the procedureOKDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKDType }
     *     
     */
    public ZfcsPurchaseProcedureOKDType getProcedureOKDInfo() {
        return procedureOKDInfo;
    }

    /**
     * Sets the value of the procedureOKDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKDType }
     *     
     */
    public void setProcedureOKDInfo(ZfcsPurchaseProcedureOKDType value) {
        this.procedureOKDInfo = value;
    }

    /**
     * Gets the value of the procedureZakKInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKType }
     *     
     */
    public ZfcsPurchaseProcedureOKType getProcedureZakKInfo() {
        return procedureZakKInfo;
    }

    /**
     * Sets the value of the procedureZakKInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKType }
     *     
     */
    public void setProcedureZakKInfo(ZfcsPurchaseProcedureOKType value) {
        this.procedureZakKInfo = value;
    }

    /**
     * Gets the value of the procedureZakKOUInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKOUType }
     *     
     */
    public ZfcsPurchaseProcedureOKOUType getProcedureZakKOUInfo() {
        return procedureZakKOUInfo;
    }

    /**
     * Sets the value of the procedureZakKOUInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKOUType }
     *     
     */
    public void setProcedureZakKOUInfo(ZfcsPurchaseProcedureOKOUType value) {
        this.procedureZakKOUInfo = value;
    }

    /**
     * Gets the value of the procedureZakKDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKDType }
     *     
     */
    public ZfcsPurchaseProcedureOKDType getProcedureZakKDInfo() {
        return procedureZakKDInfo;
    }

    /**
     * Sets the value of the procedureZakKDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKDType }
     *     
     */
    public void setProcedureZakKDInfo(ZfcsPurchaseProcedureOKDType value) {
        this.procedureZakKDInfo = value;
    }

    /**
     * Gets the value of the procedureZakAInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureZakAType }
     *     
     */
    public ZfcsPurchaseProcedureZakAType getProcedureZakAInfo() {
        return procedureZakAInfo;
    }

    /**
     * Sets the value of the procedureZakAInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureZakAType }
     *     
     */
    public void setProcedureZakAInfo(ZfcsPurchaseProcedureZakAType value) {
        this.procedureZakAInfo = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationLotChangeType.Lot }
     *     
     */
    public ZfcsNotificationLotChangeType.Lot getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationLotChangeType.Lot }
     *     
     */
    public void setLot(ZfcsNotificationLotChangeType.Lot value) {
        this.lot = value;
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
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationModificationType }
     *     
     */
    public ZfcsNotificationModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationModificationType }
     *     
     */
    public void setModification(ZfcsNotificationModificationType value) {
        this.modification = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_lotOKType">
     *       &lt;sequence>
     *         &lt;element name="noPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "noPublicDiscussion"
    })
    public static class Lot
        extends ZfcsLotOKType
    {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected Boolean noPublicDiscussion;

        /**
         * Gets the value of the noPublicDiscussion property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoPublicDiscussion() {
            return noPublicDiscussion;
        }

        /**
         * Sets the value of the noPublicDiscussion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoPublicDiscussion(Boolean value) {
            this.noPublicDiscussion = value;
        }

    }

}
