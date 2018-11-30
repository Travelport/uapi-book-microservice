package com.travelport.refimpl.air.book.models;

import java.util.HashMap;
import java.util.List;
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
    "termsAndConditionsRef",
    "Identifier",
    "ExpiryDate",
    "TextBlock"
})
public class TermsAndConditionsFull {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("termsAndConditionsRef")
    private String termsAndConditionsRef;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("ExpiryDate")
    private String expiryDate;
    @JsonProperty("TextBlock")
    private List<TextBlock> textBlock = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TermsAndConditionsFull() {
    }

    /**
     * 
     * @param id
     * @param textBlock
     * @param expiryDate
     * @param termsAndConditionsRef
     * @param type
     * @param identifier
     */
    public TermsAndConditionsFull(String type, String id, String termsAndConditionsRef, Identifier identifier, String expiryDate, List<TextBlock> textBlock) {
        super();
        this.type = type;
        this.id = id;
        this.termsAndConditionsRef = termsAndConditionsRef;
        this.identifier = identifier;
        this.expiryDate = expiryDate;
        this.textBlock = textBlock;
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

    @JsonProperty("termsAndConditionsRef")
    public String getTermsAndConditionsRef() {
        return termsAndConditionsRef;
    }

    @JsonProperty("termsAndConditionsRef")
    public void setTermsAndConditionsRef(String termsAndConditionsRef) {
        this.termsAndConditionsRef = termsAndConditionsRef;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("ExpiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("ExpiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("TextBlock")
    public List<TextBlock> getTextBlock() {
        return textBlock;
    }

    @JsonProperty("TextBlock")
    public void setTextBlock(List<TextBlock> textBlock) {
        this.textBlock = textBlock;
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
