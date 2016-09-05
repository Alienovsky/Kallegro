
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
 *         &lt;element name="myBilling" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "myBilling"
})
@XmlRootElement(name = "doMyBillingResponse")
public class DoMyBillingResponse {

    @XmlElement(required = true)
    protected String myBilling;

    /**
     * Gets the value of the myBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyBilling() {
        return myBilling;
    }

    /**
     * Sets the value of the myBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyBilling(String value) {
        this.myBilling = value;
    }

}
