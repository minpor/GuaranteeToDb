
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Электронный документ, полученный из внешней системы
 * 
 * <p>Java class for zfcs_extPrintFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_extPrintFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="url">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="1024"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="signature">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                 &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fileType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormFileType"/>
 *         &lt;element name="controlPersonalSignature" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                 &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "zfcs_extPrintFormType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "content",
    "url",
    "signature",
    "fileType",
    "controlPersonalSignature"
})
public class ZfcsExtPrintFormType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected byte[] content;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected String url;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsExtPrintFormType.Signature signature;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPrintFormFileType fileType;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
    protected ZfcsExtPrintFormType.ControlPersonalSignature controlPersonalSignature;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType.Signature }
     *     
     */
    public ZfcsExtPrintFormType.Signature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType.Signature }
     *     
     */
    public void setSignature(ZfcsExtPrintFormType.Signature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormFileType }
     *     
     */
    public ZfcsPrintFormFileType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormFileType }
     *     
     */
    public void setFileType(ZfcsPrintFormFileType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the controlPersonalSignature property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType.ControlPersonalSignature }
     *     
     */
    public ZfcsExtPrintFormType.ControlPersonalSignature getControlPersonalSignature() {
        return controlPersonalSignature;
    }

    /**
     * Sets the value of the controlPersonalSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType.ControlPersonalSignature }
     *     
     */
    public void setControlPersonalSignature(ZfcsExtPrintFormType.ControlPersonalSignature value) {
        this.controlPersonalSignature = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *       &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ControlPersonalSignature {

        @XmlValue
        protected byte[] value;
        @XmlAttribute(name = "type")
        protected ZfcsSignatureType type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsSignatureType }
         *     
         */
        public ZfcsSignatureType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsSignatureType }
         *     
         */
        public void setType(ZfcsSignatureType value) {
            this.type = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *       &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Signature {

        @XmlValue
        protected byte[] value;
        @XmlAttribute(name = "type")
        protected ZfcsSignatureType type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsSignatureType }
         *     
         */
        public ZfcsSignatureType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsSignatureType }
         *     
         */
        public void setType(ZfcsSignatureType value) {
            this.type = value;
        }

    }

}
