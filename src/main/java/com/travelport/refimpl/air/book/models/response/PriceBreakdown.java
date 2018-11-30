package com.travelport.refimpl.air.book.models.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.travelport.refimpl.air.book.models.Amount;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "quantity",
    "requestedPassengerType",
    "Amount"
})
public class PriceBreakdown {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("requestedPassengerType")
    private String requestedPassengerType;
    @JsonProperty("Amount")
    private AmountResponse amountResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceBreakdown() {
    }

    /**
     * 
     * @param amount
     * @param requestedPassengerType
     * @param quantity
     * @param type
     */
    public PriceBreakdown(String type, Integer quantity, String requestedPassengerType, AmountResponse amountResponse) {
        super();
        this.type = type;
        this.quantity = quantity;
        this.requestedPassengerType = requestedPassengerType;
        this.amountResponse = amountResponse;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("requestedPassengerType")
    public String getRequestedPassengerType() {
        return requestedPassengerType;
    }

    @JsonProperty("requestedPassengerType")
    public void setRequestedPassengerType(String requestedPassengerType) {
        this.requestedPassengerType = requestedPassengerType;
    }

    @JsonProperty("Amount")
    public AmountResponse getAmountResponse() {
        return amountResponse;
    }

    @JsonProperty("Amount")
    public void setAmountResponse(AmountResponse amountResponse) {
        this.amountResponse = amountResponse;
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
