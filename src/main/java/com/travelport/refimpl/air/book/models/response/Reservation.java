package com.travelport.refimpl.air.book.models.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.travelport.refimpl.air.book.models.Comments;
import com.travelport.refimpl.air.book.models.FormOfPayment;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Offer;
import com.travelport.refimpl.air.book.models.OfferLink;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.Receipt;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.refimpl.air.book.models.TravelerProduct;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "Comments",
    "FormOfPayment",
    "id",
    "Identifier",
    "Offer",
    "OfferLink",
    "Payment",
    "Receipt",
    "Traveler",
    "TravelerProduct"
})
public class Reservation {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("Comments")
    private Comments comments;
    @JsonProperty("FormOfPayment")
    private List<FormOfPayment> formOfPayment = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("Offer")
    private List<Offer> offer = null;
    @JsonProperty("OfferLink")
    private List<OfferLink> offerLink = null;
    @JsonProperty("Payment")
    private List<Payment> payment = null;
    @JsonProperty("Receipt")
    private List<Receipt> receipt = null;
    @JsonProperty("Traveler")
    private List<Traveler> traveler = null;
    @JsonProperty("TravelerProduct")
    private List<TravelerProduct> travelerProduct = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reservation() {
    }

    /**
     * 
     * @param comments
     * @param formOfPayment
     * @param id
     * @param identifier
     * @param offer
     * @param offerLink
     * @param payment
     * @param receipt
     * @param traveler
     * @param travelerProduct
     * @param type
     */
    public Reservation(List<FormOfPayment> formOfPayment, List<Payment> payment, List<Receipt> receipt, List<OfferLink> offerLink, Comments comments, String type, String id, Identifier identifier, List<Offer> offer, List<Traveler> traveler, List<TravelerProduct> travelerProduct) {
        super();
        this.formOfPayment = formOfPayment;
        this.payment = payment;
        this.receipt = receipt;
        this.offerLink = offerLink;
        this.comments = comments;
        this.type = type;
        this.id = id;
        this.identifier = identifier;
        this.offer = offer;
        this.traveler = traveler;
        this.travelerProduct = travelerProduct;
    }
    
    @JsonProperty("FormOfPayment")
    public List<FormOfPayment> getFormOfPayment() {
    return formOfPayment;
    }

    @JsonProperty("FormOfPayment")
    public void setFormOfPayment(List<FormOfPayment> formOfPayment) {
    this.formOfPayment = formOfPayment;
    }

    @JsonProperty("Payment")
    public List<Payment> getPayment() {
    return payment;
    }

    @JsonProperty("Payment")
    public void setPayment(List<Payment> payment) {
    this.payment = payment;
    }

    @JsonProperty("Receipt")
    public List<Receipt> getReceipt() {
    return receipt;
    }

    @JsonProperty("Receipt")
    public void setReceipt(List<Receipt> receipt) {
    this.receipt = receipt;
    }

    @JsonProperty("OfferLink")
    public List<OfferLink> getOfferLink() {
    return offerLink;
    }

    @JsonProperty("OfferLink")
    public void setOfferLink(List<OfferLink> offerLink) {
    this.offerLink = offerLink;
    }

    @JsonProperty("Comments")
    public Comments getComments() {
    return comments;
    }

    @JsonProperty("Comments")
    public void setComments(Comments comments) {
    this.comments = comments;
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

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("Offer")
    public List<Offer> getOffer() {
        return offer;
    }

    @JsonProperty("Offer")
    public void setOffer(List<Offer> offer) {
        this.offer = offer;
    }

    @JsonProperty("Traveler")
    public List<Traveler> getTraveler() {
        return traveler;
    }

    @JsonProperty("Traveler")
    public void setTraveler(List<Traveler> traveler) {
        this.traveler = traveler;
    }

    @JsonProperty("TravelerProduct")
    public List<TravelerProduct> getTravelerProduct() {
        return travelerProduct;
    }

    @JsonProperty("TravelerProduct")
    public void setTravelerProduct(List<TravelerProduct> travelerProduct) {
        this.travelerProduct = travelerProduct;
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
