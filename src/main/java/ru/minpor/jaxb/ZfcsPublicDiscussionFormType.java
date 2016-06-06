
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
 * Анкета обязательного общественного обсуждения крупной закупки
 * 
 * <p>Java class for zfcs_publicDiscussionFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="publicDiscussionNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="formNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFormNumberType"/>
 *         &lt;element name="author">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionLargePurchaseStagesEnum"/>
 *         &lt;element name="publicDiscussionFacets">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publicDiscussionFacet" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFacetRef">
 *                           &lt;sequence>
 *                             &lt;element name="publicDiscussionQuestion" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
 *                                     &lt;sequence>
 *                                       &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *                                       &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
 *         &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPurchaseInfoType" minOccurs="0"/>
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
@XmlType(name = "zfcs_publicDiscussionFormType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "externalId",
    "id",
    "publicDiscussionNum",
    "versionNumber",
    "docPublishDate",
    "formNumber",
    "author",
    "phase",
    "publicDiscussionFacets",
    "purchase"
})
public class ZfcsPublicDiscussionFormType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String externalId;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected Long id;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String publicDiscussionNum;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String versionNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected String formNumber;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPublicDiscussionFormType.Author author;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPublicDiscussionLargePurchaseStagesEnum phase;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPublicDiscussionFormType.PublicDiscussionFacets publicDiscussionFacets;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsPublicDiscussionPurchaseInfoType purchase;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

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
     * Gets the value of the publicDiscussionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicDiscussionNum() {
        return publicDiscussionNum;
    }

    /**
     * Sets the value of the publicDiscussionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDiscussionNum(String value) {
        this.publicDiscussionNum = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the docPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPublishDate() {
        return docPublishDate;
    }

    /**
     * Sets the value of the docPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPublishDate(XMLGregorianCalendar value) {
        this.docPublishDate = value;
    }

    /**
     * Gets the value of the formNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNumber() {
        return formNumber;
    }

    /**
     * Sets the value of the formNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNumber(String value) {
        this.formNumber = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionFormType.Author }
     *     
     */
    public ZfcsPublicDiscussionFormType.Author getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionFormType.Author }
     *     
     */
    public void setAuthor(ZfcsPublicDiscussionFormType.Author value) {
        this.author = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionLargePurchaseStagesEnum }
     *     
     */
    public ZfcsPublicDiscussionLargePurchaseStagesEnum getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionLargePurchaseStagesEnum }
     *     
     */
    public void setPhase(ZfcsPublicDiscussionLargePurchaseStagesEnum value) {
        this.phase = value;
    }

    /**
     * Gets the value of the publicDiscussionFacets property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets }
     *     
     */
    public ZfcsPublicDiscussionFormType.PublicDiscussionFacets getPublicDiscussionFacets() {
        return publicDiscussionFacets;
    }

    /**
     * Sets the value of the publicDiscussionFacets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets }
     *     
     */
    public void setPublicDiscussionFacets(ZfcsPublicDiscussionFormType.PublicDiscussionFacets value) {
        this.publicDiscussionFacets = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPurchaseInfoType }
     *     
     */
    public ZfcsPublicDiscussionPurchaseInfoType getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPurchaseInfoType }
     *     
     */
    public void setPurchase(ZfcsPublicDiscussionPurchaseInfoType value) {
        this.purchase = value;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
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
        "name",
        "eMail"
    })
    public static class Author {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String name;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected String eMail;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
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
     *         &lt;element name="publicDiscussionFacet" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFacetRef">
     *                 &lt;sequence>
     *                   &lt;element name="publicDiscussionQuestion" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
     *                           &lt;sequence>
     *                             &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
     *                             &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
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
        "publicDiscussionFacet"
    })
    public static class PublicDiscussionFacets {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet> publicDiscussionFacet;

        /**
         * Gets the value of the publicDiscussionFacet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publicDiscussionFacet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublicDiscussionFacet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet }
         * 
         * 
         */
        public List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet> getPublicDiscussionFacet() {
            if (publicDiscussionFacet == null) {
                publicDiscussionFacet = new ArrayList<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet>();
            }
            return this.publicDiscussionFacet;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFacetRef">
         *       &lt;sequence>
         *         &lt;element name="publicDiscussionQuestion" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
         *                 &lt;sequence>
         *                   &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
         *                   &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "publicDiscussionQuestion"
        })
        public static class PublicDiscussionFacet
            extends ZfcsPublicDiscussionFacetRef
        {

            @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
            protected List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion> publicDiscussionQuestion;

            /**
             * Gets the value of the publicDiscussionQuestion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the publicDiscussionQuestion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPublicDiscussionQuestion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion }
             * 
             * 
             */
            public List<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion> getPublicDiscussionQuestion() {
                if (publicDiscussionQuestion == null) {
                    publicDiscussionQuestion = new ArrayList<ZfcsPublicDiscussionFormType.PublicDiscussionFacets.PublicDiscussionFacet.PublicDiscussionQuestion>();
                }
                return this.publicDiscussionQuestion;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionQuestionRef">
             *       &lt;sequence>
             *         &lt;element name="userAnswer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
             *         &lt;element name="userComment" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
                "userAnswer",
                "userComment"
            })
            public static class PublicDiscussionQuestion
                extends ZfcsPublicDiscussionQuestionRef
            {

                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
                protected String userAnswer;
                @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
                protected String userComment;

                /**
                 * Gets the value of the userAnswer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUserAnswer() {
                    return userAnswer;
                }

                /**
                 * Sets the value of the userAnswer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUserAnswer(String value) {
                    this.userAnswer = value;
                }

                /**
                 * Gets the value of the userComment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUserComment() {
                    return userComment;
                }

                /**
                 * Sets the value of the userComment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUserComment(String value) {
                    this.userComment = value;
                }

            }

        }

    }

}
