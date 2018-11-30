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
import com.travelport.refimpl.air.book.models.response.PaymentCardAuthorizationSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "id",
    "offerRef",
    "Identifier",
    "Product",
    "Price",
    "TermsAndConditionsFull",
    "PaymentCardAuthorizationSummary"
})
public class Offer {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("offerRef")
    private String offerRef;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("Product")
    private List<Product> product = null;
    @JsonProperty("Price")
    private Price price;
    @JsonProperty("TermsAndConditionsFull")
    private List<TermsAndConditionsFull> termsAndConditionsFull = null;
    @JsonProperty("PaymentCardAuthorizationSummary")
    private PaymentCardAuthorizationSummary paymentCardAuthorizationSummary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Offer() {
    }

    /**
     * 
     * @param product
     * @param id
     * @param price
     * @param offerRef
     * @param termsAndConditionsFull
     * @param type
     * @param identifier
     */
    public Offer(String type, String id, String offerRef, Identifier identifier, List<Product> product, Price price, List<TermsAndConditionsFull> termsAndConditionsFull, PaymentCardAuthorizationSummary paymentCardAuthorizationSummary) {
        super();
        this.type = type;
        this.id = id;
        this.offerRef = offerRef;
        this.identifier = identifier;
        this.product = product;
        this.price = price;
        this.termsAndConditionsFull = termsAndConditionsFull;
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

    @JsonProperty("Product")
    public List<Product> getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @JsonProperty("Price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("TermsAndConditionsFull")
    public List<TermsAndConditionsFull> getTermsAndConditionsFull() {
        return termsAndConditionsFull;
    }

    @JsonProperty("TermsAndConditionsFull")
    public void setTermsAndConditionsFull(List<TermsAndConditionsFull> termsAndConditionsFull) {
        this.termsAndConditionsFull = termsAndConditionsFull;
    }
    
    @JsonProperty("PaymentCardAuthorizationSummary")
    public PaymentCardAuthorizationSummary getPaymentCardAuthorizationSummary() {
    return paymentCardAuthorizationSummary;
    }

    @JsonProperty("PaymentCardAuthorizationSummary")
    public void setPaymentCardAuthorizationSummary(PaymentCardAuthorizationSummary paymentCardAuthorizationSummary) {
    this.paymentCardAuthorizationSummary = paymentCardAuthorizationSummary;
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
