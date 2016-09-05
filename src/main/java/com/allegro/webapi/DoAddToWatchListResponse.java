
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
 *         &lt;element name="watchListInfo" type="{https://webapi.allegro.pl/service.php}WatchListInfoStruct"/>
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
    "watchListInfo"
})
@XmlRootElement(name = "doAddToWatchListResponse")
public class DoAddToWatchListResponse {

    @XmlElement(required = true)
    protected WatchListInfoStruct watchListInfo;

    /**
     * Gets the value of the watchListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WatchListInfoStruct }
     *     
     */
    public WatchListInfoStruct getWatchListInfo() {
        return watchListInfo;
    }

    /**
     * Sets the value of the watchListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WatchListInfoStruct }
     *     
     */
    public void setWatchListInfo(WatchListInfoStruct value) {
        this.watchListInfo = value;
    }

}
