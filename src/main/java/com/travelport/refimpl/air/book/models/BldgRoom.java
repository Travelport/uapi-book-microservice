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
    "value",
    "buldingInd"
})
public class BldgRoom {

    @JsonProperty("value")
    private String value;
    @JsonProperty("buldingInd")
    private Boolean buldingInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BldgRoom() {
    }

    /**
     * 
     * @param value
     * @param buldingInd
     */
    public BldgRoom(String value, Boolean buldingInd) {
        super();
        this.value = value;
        this.buldingInd = buldingInd;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("buldingInd")
    public Boolean getBuldingInd() {
        return buldingInd;
    }

    @JsonProperty("buldingInd")
    public void setBuldingInd(Boolean buldingInd) {
        this.buldingInd = buldingInd;
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
