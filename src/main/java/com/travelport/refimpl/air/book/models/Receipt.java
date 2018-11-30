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
    "dateTime",
    "ReceiptRef",
    "Identifier",
    "OfferIdentifier"
})
public class Receipt {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("ReceiptRef")
    private String receiptRef;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("OfferIdentifier")
    private OfferIdentifier offerIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Receipt() {
    }

    /**
     * 
     * @param id
     * @param dateTime
     * @param offerIdentifier
     * @param type
     * @param identifier
     * @param receiptRef
     */
    public Receipt(String type, String id, String dateTime, String receiptRef, Identifier identifier, OfferIdentifier offerIdentifier) {
        super();
        this.type = type;
        this.id = id;
        this.dateTime = dateTime;
        this.receiptRef = receiptRef;
        this.identifier = identifier;
        this.offerIdentifier = offerIdentifier;
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

    @JsonProperty("dateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("dateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("ReceiptRef")
    public String getReceiptRef() {
        return receiptRef;
    }

    @JsonProperty("ReceiptRef")
    public void setReceiptRef(String receiptRef) {
        this.receiptRef = receiptRef;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("OfferIdentifier")
    public OfferIdentifier getOfferIdentifier() {
        return offerIdentifier;
    }

    @JsonProperty("OfferIdentifier")
    public void setOfferIdentifier(OfferIdentifier offerIdentifier) {
        this.offerIdentifier = offerIdentifier;
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
