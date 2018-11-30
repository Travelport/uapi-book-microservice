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
    "id",
    "TravelerRef",
    "OfferRef",
    "ProductRef",
    "ConfirmationStatusEnum"
})
public class TravelerProduct {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("TravelerRef")
    private String travelerRef;
    @JsonProperty("OfferRef")
    private String offerRef;
    @JsonProperty("ProductRef")
    private String productRef;
    @JsonProperty("ConfirmationStatusEnum")
    private String confirmationStatusEnum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TravelerProduct() {
    }

    /**
     * 
     * @param id
     * @param travelerRef
     * @param offerRef
     * @param productRef
     * @param type
     * @param confirmationStatusEnum
     */
    public TravelerProduct(String type, String id, String travelerRef, String offerRef, String productRef, String confirmationStatusEnum) {
        super();
        this.type = type;
        this.id = id;
        this.travelerRef = travelerRef;
        this.offerRef = offerRef;
        this.productRef = productRef;
        this.confirmationStatusEnum = confirmationStatusEnum;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("TravelerRef")
    public String getTravelerRef() {
        return travelerRef;
    }

    @JsonProperty("TravelerRef")
    public void setTravelerRef(String travelerRef) {
        this.travelerRef = travelerRef;
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

    @JsonProperty("ConfirmationStatusEnum")
    public String getConfirmationStatusEnum() {
        return confirmationStatusEnum;
    }

    @JsonProperty("ConfirmationStatusEnum")
    public void setConfirmationStatusEnum(String confirmationStatusEnum) {
        this.confirmationStatusEnum = confirmationStatusEnum;
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
