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
    "PaymentRef",
    "Identifier",
    "Amount",
    "FormOfPaymentIdentifier",
    "OfferIdentifier",
    "Fees",
    "Taxes"
})
public class Payment {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("PaymentRef")
    private String paymentRef;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("Amount")
    private Amount amount;
    @JsonProperty("FormOfPaymentIdentifier")
    private FormOfPaymentIdentifier formOfPaymentIdentifier;
    @JsonProperty("OfferIdentifier")
    private List<OfferIdentifier> offerIdentifier = null;
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("Taxes")
    private Taxes taxes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payment() {
    }

    /**
     * 
     * @param amount
     * @param id
     * @param paymentRef
     * @param fees
     * @param offerIdentifier
     * @param formOfPaymentIdentifier
     * @param type
     * @param identifier
     * @param taxes
     */
    public Payment(String type, String id, String paymentRef, Identifier identifier, Amount amount, FormOfPaymentIdentifier formOfPaymentIdentifier, List<OfferIdentifier> offerIdentifier, Fees fees, Taxes taxes) {
        super();
        this.type = type;
        this.id = id;
        this.paymentRef = paymentRef;
        this.identifier = identifier;
        this.amount = amount;
        this.formOfPaymentIdentifier = formOfPaymentIdentifier;
        this.offerIdentifier = offerIdentifier;
        this.fees = fees;
        this.taxes = taxes;
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

    @JsonProperty("PaymentRef")
    public String getPaymentRef() {
        return paymentRef;
    }

    @JsonProperty("PaymentRef")
    public void setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("Amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("FormOfPaymentIdentifier")
    public FormOfPaymentIdentifier getFormOfPaymentIdentifier() {
        return formOfPaymentIdentifier;
    }

    @JsonProperty("FormOfPaymentIdentifier")
    public void setFormOfPaymentIdentifier(FormOfPaymentIdentifier formOfPaymentIdentifier) {
        this.formOfPaymentIdentifier = formOfPaymentIdentifier;
    }

    @JsonProperty("OfferIdentifier")
    public List<OfferIdentifier> getOfferIdentifier() {
        return offerIdentifier;
    }

    @JsonProperty("OfferIdentifier")
    public void setOfferIdentifier(List<OfferIdentifier> offerIdentifier) {
        this.offerIdentifier = offerIdentifier;
    }

    @JsonProperty("Fees")
    public Fees getFees() {
        return fees;
    }

    @JsonProperty("Fees")
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    @JsonProperty("Taxes")
    public Taxes getTaxes() {
        return taxes;
    }

    @JsonProperty("Taxes")
    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
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
