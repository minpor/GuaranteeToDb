
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Извещение о проведении OK-ОУ (конкурс с ограниченным участием);
 * 
 * внесение изменений
 * 
 * <p>Java class for zfcs_notificationOKOUType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationOKOUType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNotificationType">
 *       &lt;sequence>
 *         &lt;element name="purchaseDocumentation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_releasePurchaseDocumentationType"/>
 *         &lt;element name="procedureInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOKOUType"/>
 *         &lt;element name="lots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lot" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_lotOKType">
 *                           &lt;sequence>
 *                             &lt;element name="noPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationModificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_notificationOKOUType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "purchaseDocumentation",
    "procedureInfo",
    "lots",
    "attachments",
    "modification"
})
public class ZfcsNotificationOKOUType
    extends ZfcsPurchaseNotificationType
{

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsReleasePurchaseDocumentationType purchaseDocumentation;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseProcedureOKOUType procedureInfo;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsNotificationOKOUType.Lots lots;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsAttachmentListType attachments;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
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
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKOUType }
     *     
     */
    public ZfcsPurchaseProcedureOKOUType getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKOUType }
     *     
     */
    public void setProcedureInfo(ZfcsPurchaseProcedureOKOUType value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationOKOUType.Lots }
     *     
     */
    public ZfcsNotificationOKOUType.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationOKOUType.Lots }
     *     
     */
    public void setLots(ZfcsNotificationOKOUType.Lots value) {
        this.lots = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lot" maxOccurs="unbounded">
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
        "lot"
    })
    public static class Lots {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsNotificationOKOUType.Lots.Lot> lot;

        /**
         * Gets the value of the lot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNotificationOKOUType.Lots.Lot }
         * 
         * 
         */
        public List<ZfcsNotificationOKOUType.Lots.Lot> getLot() {
            if (lot == null) {
                lot = new ArrayList<ZfcsNotificationOKOUType.Lots.Lot>();
            }
            return this.lot;
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

}
