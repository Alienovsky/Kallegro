
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
 *         &lt;element name="itemDescription" type="{https://webapi.allegro.pl/service.php}ItemDescriptionStruct"/>
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
    "itemDescription"
})
@XmlRootElement(name = "doCheckItemDescriptionResponse")
public class DoCheckItemDescriptionResponse {

    @XmlElement(required = true)
    protected ItemDescriptionStruct itemDescription;

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDescriptionStruct }
     *     
     */
    public ItemDescriptionStruct getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDescriptionStruct }
     *     
     */
    public void setItemDescription(ItemDescriptionStruct value) {
        this.itemDescription = value;
    }

}
