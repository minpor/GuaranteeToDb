
package ru.minpor.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документах неустоек/пеней/штрафов
 * 
 * <p>Java class for zfcs_penalty.documentInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_penalty.documentInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="documentName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
@XmlType(name = "zfcs_penalty.documentInfoList", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "documentInfo"
})
public class ZfcsPenaltyDocumentInfoList {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected List<ZfcsPenaltyDocumentInfoList.DocumentInfo> documentInfo;

    /**
     * Gets the value of the documentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsPenaltyDocumentInfoList.DocumentInfo }
     * 
     * 
     */
    public List<ZfcsPenaltyDocumentInfoList.DocumentInfo> getDocumentInfo() {
        if (documentInfo == null) {
            documentInfo = new ArrayList<ZfcsPenaltyDocumentInfoList.DocumentInfo>();
        }
        return this.documentInfo;
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
     *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="documentName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "documentDate",
        "documentName"
    })
    public static class DocumentInfo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar documentDate;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected String documentName;

        /**
         * Gets the value of the documentDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDocumentDate() {
            return documentDate;
        }

        /**
         * Sets the value of the documentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDocumentDate(XMLGregorianCalendar value) {
            this.documentDate = value;
        }

        /**
         * Gets the value of the documentName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentName() {
            return documentName;
        }

        /**
         * Sets the value of the documentName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentName(String value) {
            this.documentName = value;
        }

    }

}
