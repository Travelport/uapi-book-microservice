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
    "id",
    "offerRef",
    "Identifier"
})
public class OfferIdentifier {

    @JsonProperty("id")
    private String id;
    @JsonProperty("offerRef")
    private String offerRef;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfferIdentifier() {
    }

    /**
     * 
     * @param id
     * @param offerRef
     * @param identifier
     */
    public OfferIdentifier(String id, String offerRef, Identifier identifier) {
        super();
        this.id = id;
        this.offerRef = offerRef;
        this.identifier = identifier;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("offerRef")
    public String getOfferRef() {
        return offerRef;
    }

    @JsonProperty("offerRef")
    public void setOfferRef(String offerRef) {
        this.offerRef = offerRef;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
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
