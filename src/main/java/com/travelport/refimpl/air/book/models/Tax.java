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
    "currencyCode",
    "taxCode",
    "reportingAuthority",
    "purpose",
    "description"
})
public class Tax {

    @JsonProperty("value")
    private Double value;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("reportingAuthority")
    private String reportingAuthority;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tax() {
    }

    /**
     * 
     * @param currencyCode
     * @param description
     * @param value
     * @param reportingAuthority
     * @param purpose
     * @param taxCode
     */
    public Tax(Double value, String currencyCode, String taxCode, String reportingAuthority, String purpose, String description) {
        super();
        this.value = value;
        this.currencyCode = currencyCode;
        this.taxCode = taxCode;
        this.reportingAuthority = reportingAuthority;
        this.purpose = purpose;
        this.description = description;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("taxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("reportingAuthority")
    public String getReportingAuthority() {
        return reportingAuthority;
    }

    @JsonProperty("reportingAuthority")
    public void setReportingAuthority(String reportingAuthority) {
        this.reportingAuthority = reportingAuthority;
    }

    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
