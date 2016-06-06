
package ru.minpor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о процедуре закупки ЗакА (закрытый аукцион)
 * 
 * <p>Java class for zfcs_purchaseProcedureZakAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProcedureZakAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
 *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *         &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
 *         &lt;element name="bidding" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureBiddingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseProcedureZakAType", namespace = "http://zakupki.gov.ru/oos/types/1", propOrder = {
    "collecting",
    "opening",
    "scoring",
    "bidding"
})
public class ZfcsPurchaseProcedureZakAType {

    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseProcedureCollectingType collecting;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseProcedureOpeningType opening;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseProcedureScoringType scoring;
    @XmlElement(namespace = "http://zakupki.gov.ru/oos/types/1", required = true)
    protected ZfcsPurchaseProcedureBiddingType bidding;

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

    /**
     * Gets the value of the bidding property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProcedureBiddingType }
     *     
     */
    public ZfcsPurchaseProcedureBiddingType getBidding() {
        return bidding;
    }

    /**
     * Sets the value of the bidding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProcedureBiddingType }
     *     
     */
    public void setBidding(ZfcsPurchaseProcedureBiddingType value) {
        this.bidding = value;
    }

}
