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
    "code",
    "minorUnit",
    "currencySource",
    "approximateInd"
})
public class Amount {

    @JsonProperty("value")
    private Double value;
    @JsonProperty("code")
    private String code;
    @JsonProperty("minorUnit")
    private Integer minorUnit;
    @JsonProperty("currencySource")
    private String currencySource;
    @JsonProperty("approximateInd")
    private Boolean approximateInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Amount() {
    }

    /**
     * 
     * @param currencySource
     * @param minorUnit
     * @param value
     * @param code
     * @param approximateInd
     */
    public Amount(Double value, String code, Integer minorUnit, String currencySource, Boolean approximateInd) {
        super();
        this.value = value;
        this.code = code;
        this.minorUnit = minorUnit;
        this.currencySource = currencySource;
        this.approximateInd = approximateInd;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("minorUnit")
    public Integer getMinorUnit() {
        return minorUnit;
    }

    @JsonProperty("minorUnit")
    public void setMinorUnit(Integer minorUnit) {
        this.minorUnit = minorUnit;
    }

    @JsonProperty("currencySource")
    public String getCurrencySource() {
        return currencySource;
    }

    @JsonProperty("currencySource")
    public void setCurrencySource(String currencySource) {
        this.currencySource = currencySource;
    }

    @JsonProperty("approximateInd")
    public Boolean getApproximateInd() {
        return approximateInd;
    }

    @JsonProperty("approximateInd")
    public void setApproximateInd(Boolean approximateInd) {
        this.approximateInd = approximateInd;
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
