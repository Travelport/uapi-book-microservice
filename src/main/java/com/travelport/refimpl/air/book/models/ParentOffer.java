package com.travelport.refimpl.air.book.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "OfferRef",
    "ProductRef"
})
public class ParentOffer {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("OfferRef")
    private String offerRef;
    @JsonProperty("ProductRef")
    private String productRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ParentOffer() {
    }

    /**
     * 
     * @param offerRef
     * @param productRef
     * @param type
     */
    public ParentOffer(String type, String offerRef, String productRef) {
        super();
        this.type = type;
        this.offerRef = offerRef;
        this.productRef = productRef;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("OfferRef")
    public String getOfferRef() {
        return offerRef;
    }

    @JsonProperty("OfferRef")
    public void setOfferRef(String offerRef) {
        this.offerRef = offerRef;
    }

    @JsonProperty("ProductRef")
    public String getProductRef() {
        return productRef;
    }

    @JsonProperty("ProductRef")
    public void setProductRef(String productRef) {
        this.productRef = productRef;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
