
package com.allegro.webapi;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionsIdsArray" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
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
    "sessionId",
    "transactionsIdsArray"
})
@XmlRootElement(name = "DoGetPostBuyFormsDataForSellersRequest")
public class DoGetPostBuyFormsDataForSellersRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected ArrayOfLong transactionsIdsArray;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the transactionsIdsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getTransactionsIdsArray() {
        return transactionsIdsArray;
    }

    /**
     * Sets the value of the transactionsIdsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setTransactionsIdsArray(ArrayOfLong value) {
        this.transactionsIdsArray = value;
    }

}