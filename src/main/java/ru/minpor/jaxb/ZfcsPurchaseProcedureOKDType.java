
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о процедуре закупки ОК-Д (двухэтапный конкурс)
 * 
 * <p>Java class for zfcs_purchaseProcedureOKDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProcedureOKDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stageOne">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
 *                   &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *                   &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringPlaceType"/>
 *                   &lt;element name="prequalification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedurePrequalificationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stageTwo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
 *                   &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *                   &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
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
@XmlType(name = "zfcs_purchaseProcedureOKDType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "stageOne",
    "stageTwo"
})
public class ZfcsPurchaseProcedureOKDType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseProcedureOKDType.StageOne stageOne;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseProcedureOKDType.StageTwo stageTwo;

    /**
     * Gets the value of the stageOne property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKDType.StageOne }
     *     
     */
    public ZfcsPurchaseProcedureOKDType.StageOne getStageOne() {
        return stageOne;
    }

    /**
     * Sets the value of the stageOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKDType.StageOne }
     *     
     */
    public void setStageOne(ZfcsPurchaseProcedureOKDType.StageOne value) {
        this.stageOne = value;
    }

    /**
     * Gets the value of the stageTwo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureOKDType.StageTwo }
     *     
     */
    public ZfcsPurchaseProcedureOKDType.StageTwo getStageTwo() {
        return stageTwo;
    }

    /**
     * Sets the value of the stageTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureOKDType.StageTwo }
     *     
     */
    public void setStageTwo(ZfcsPurchaseProcedureOKDType.StageTwo value) {
        this.stageTwo = value;
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
     *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
     *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
     *         &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringPlaceType"/>
     *         &lt;element name="prequalification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedurePrequalificationType" minOccurs="0"/>
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
        "collecting",
        "opening",
        "scoring",
        "prequalification"
    })
    public static class StageOne {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureCollectingType collecting;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureOpeningType opening;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureScoringPlaceType scoring;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1")
        protected ZfcsPurchaseProcedurePrequalificationType prequalification;

        /**
         * Gets the value of the collecting property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureCollectingType }
         *     
         */
        public ZfcsPurchaseProcedureCollectingType getCollecting() {
            return collecting;
        }

        /**
         * Sets the value of the collecting property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureCollectingType }
         *     
         */
        public void setCollecting(ZfcsPurchaseProcedureCollectingType value) {
            this.collecting = value;
        }

        /**
         * Gets the value of the opening property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public ZfcsPurchaseProcedureOpeningType getOpening() {
            return opening;
        }

        /**
         * Sets the value of the opening property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public void setOpening(ZfcsPurchaseProcedureOpeningType value) {
            this.opening = value;
        }

        /**
         * Gets the value of the scoring property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureScoringPlaceType }
         *     
         */
        public ZfcsPurchaseProcedureScoringPlaceType getScoring() {
            return scoring;
        }

        /**
         * Sets the value of the scoring property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureScoringPlaceType }
         *     
         */
        public void setScoring(ZfcsPurchaseProcedureScoringPlaceType value) {
            this.scoring = value;
        }

        /**
         * Gets the value of the prequalification property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedurePrequalificationType }
         *     
         */
        public ZfcsPurchaseProcedurePrequalificationType getPrequalification() {
            return prequalification;
        }

        /**
         * Sets the value of the prequalification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedurePrequalificationType }
         *     
         */
        public void setPrequalification(ZfcsPurchaseProcedurePrequalificationType value) {
            this.prequalification = value;
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
     *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
     *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
     *         &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
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
        "collecting",
        "opening",
        "scoring"
    })
    public static class StageTwo {

        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureCollectingType collecting;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureOpeningType opening;
        @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
        protected ZfcsPurchaseProcedureScoringType scoring;

        /**
         * Gets the value of the collecting property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureCollectingType }
         *     
         */
        public ZfcsPurchaseProcedureCollectingType getCollecting() {
            return collecting;
        }

        /**
         * Sets the value of the collecting property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureCollectingType }
         *     
         */
        public void setCollecting(ZfcsPurchaseProcedureCollectingType value) {
            this.collecting = value;
        }

        /**
         * Gets the value of the opening property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public ZfcsPurchaseProcedureOpeningType getOpening() {
            return opening;
        }

        /**
         * Sets the value of the opening property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureOpeningType }
         *     
         */
        public void setOpening(ZfcsPurchaseProcedureOpeningType value) {
            this.opening = value;
        }

        /**
         * Gets the value of the scoring property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureScoringType }
         *     
         */
        public ZfcsPurchaseProcedureScoringType getScoring() {
            return scoring;
        }

        /**
         * Sets the value of the scoring property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureScoringType }
         *     
         */
        public void setScoring(ZfcsPurchaseProcedureScoringType value) {
            this.scoring = value;
        }

    }

}
