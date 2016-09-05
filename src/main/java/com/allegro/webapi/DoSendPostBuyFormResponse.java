
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
 *         &lt;element name="postBuyForm" type="{https://webapi.allegro.pl/service.php}PostBuyFormStruct"/>
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
    "postBuyForm"
})
@XmlRootElement(name = "doSendPostBuyFormResponse")
public class DoSendPostBuyFormResponse {

    @XmlElement(required = true)
    protected PostBuyFormStruct postBuyForm;

    /**
     * Gets the value of the postBuyForm property.
     * 
     * @return
     *     possible object is
     *     {@link PostBuyFormStruct }
     *     
     */
    public PostBuyFormStruct getPostBuyForm() {
        return postBuyForm;
    }

    /**
     * Sets the value of the postBuyForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBuyFormStruct }
     *     
     */
    public void setPostBuyForm(PostBuyFormStruct value) {
        this.postBuyForm = value;
    }

}
