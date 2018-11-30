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
    "ParentOffer"
})
public class OfferLink {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("OfferRef")
    private String offerRef;
    @JsonProperty("ParentOffer")
    private ParentOffer parentOffer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfferLink() {
    }

    /**
     * 
     * @param offerRef
     * @param parentOffer
     * @param type
     */
    public OfferLink(String type, String offerRef, ParentOffer parentOffer) {
        super();
        this.type = type;
        this.offerRef = offerRef;
        this.parentOffer = parentOffer;
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

    @JsonProperty("ParentOffer")
    public ParentOffer getParentOffer() {
        return parentOffer;
    }

    @JsonProperty("ParentOffer")
    public void setParentOffer(ParentOffer parentOffer) {
        this.parentOffer = parentOffer;
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
