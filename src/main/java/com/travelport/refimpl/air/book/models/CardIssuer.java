
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
    "paymentCardIssuers",
    "paymentCardIssuersExtension",
    "issueNumber"
})
public class CardIssuer {

    @JsonProperty("value")
    private Object value;
    @JsonProperty("paymentCardIssuers")
    private String paymentCardIssuers;
    @JsonProperty("paymentCardIssuersExtension")
    private String paymentCardIssuersExtension;
    @JsonProperty("issueNumber")
    private Integer issueNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CardIssuer() {
    }

    /**
     * 
     * @param paymentCardIssuersExtension
     * @param issueNumber
     * @param value
     * @param paymentCardIssuers
     */
    public CardIssuer(Object value, String paymentCardIssuers, String paymentCardIssuersExtension, Integer issueNumber) {
        super();
        this.value = value;
        this.paymentCardIssuers = paymentCardIssuers;
        this.paymentCardIssuersExtension = paymentCardIssuersExtension;
        this.issueNumber = issueNumber;
    }

    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    @JsonProperty("paymentCardIssuers")
    public String getPaymentCardIssuers() {
        return paymentCardIssuers;
    }

    @JsonProperty("paymentCardIssuers")
    public void setPaymentCardIssuers(String paymentCardIssuers) {
        this.paymentCardIssuers = paymentCardIssuers;
    }

    @JsonProperty("paymentCardIssuersExtension")
    public String getPaymentCardIssuersExtension() {
        return paymentCardIssuersExtension;
    }

    @JsonProperty("paymentCardIssuersExtension")
    public void setPaymentCardIssuersExtension(String paymentCardIssuersExtension) {
        this.paymentCardIssuersExtension = paymentCardIssuersExtension;
    }

    @JsonProperty("issueNumber")
    public Integer getIssueNumber() {
        return issueNumber;
    }

    @JsonProperty("issueNumber")
    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
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
