package com.travelport.refimpl.air.book.models.request;

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
import com.travelport.refimpl.air.book.models.FormOfPaymentCash;
import com.travelport.refimpl.air.book.models.FormOfPaymentPaymentCard;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Offer;
import com.travelport.refimpl.air.book.models.OfferLink;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.Receipt;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.refimpl.air.book.models.TravelerProduct;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "Identifier", "Offer", "Traveler", "TravelerProduct", "FormOfPayment",
    "FormOfPaymentCash", "FormOfPaymentPaymentCard", "Payment", "Receipt", "OfferLink", "Comments"})
public class ReservationSummary {

  @JsonProperty("id")
  private String id;
  @JsonProperty("Identifier")
  private Identifier identifier;
  @JsonProperty("Offer")
  private List<Offer> offer = null;
  @JsonProperty("Traveler")
  private List<Traveler> traveler = null;
  @JsonProperty("TravelerProduct")
  private List<TravelerProduct> travelerProduct = null;
  @JsonProperty("FormOfPayment")
  private List<FormOfPayment> formOfPayment = null;
  @JsonProperty("FormOfPaymentCash")
  private List<FormOfPaymentCash> formOfPaymentCash = null;
  @JsonProperty("FormOfPaymentPaymentCard")
  private FormOfPaymentPaymentCard formOfPaymentPaymentCard;
  @JsonProperty("Payment")
  private List<Payment> payment = null;
  @JsonProperty("Receipt")
  private List<Receipt> receipt = null;
  @JsonProperty("OfferLink")
  private List<OfferLink> offerLink = null;
  @JsonProperty("Comments")
  private Comments comments;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   * 
   */
  public ReservationSummary() {}

  /**
   * 
   * @param formOfPaymentPaymentCard
   * @param id
   * @param payment
   * @param offerLink
   * @param formOfPaymentCash
   * @param traveler
   * @param receipt
   * @param offer
   * @param formOfPayment
   * @param identifier
   * @param comments
   * @param travelerProduct
   */
  public ReservationSummary(String id, Identifier identifier, List<Offer> offer,
      List<Traveler> traveler, List<TravelerProduct> travelerProduct,
      List<FormOfPayment> formOfPayment, List<FormOfPaymentCash> formOfPaymentCash,
      FormOfPaymentPaymentCard formOfPaymentPaymentCard, List<Payment> payment,
      List<Receipt> receipt, List<OfferLink> offerLink, Comments comments) {
    super();
    this.id = id;
    this.identifier = identifier;
    this.offer = offer;
    this.traveler = traveler;
    this.travelerProduct = travelerProduct;
    this.formOfPayment = formOfPayment;
    this.formOfPaymentCash = formOfPaymentCash;
    this.formOfPaymentPaymentCard = formOfPaymentPaymentCard;
    this.payment = payment;
    this.receipt = receipt;
    this.offerLink = offerLink;
    this.comments = comments;
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

  @JsonProperty("FormOfPayment")
  public List<FormOfPayment> getFormOfPayment() {
    return formOfPayment;
  }

  @JsonProperty("FormOfPayment")
  public void setFormOfPayment(List<FormOfPayment> formOfPayment) {
    this.formOfPayment = formOfPayment;
  }

  @JsonProperty("FormOfPaymentCash")
  public List<FormOfPaymentCash> getFormOfPaymentCash() {
    return formOfPaymentCash;
  }

  @JsonProperty("FormOfPaymentCash")
  public void setFormOfPaymentCash(List<FormOfPaymentCash> formOfPaymentCash) {
    this.formOfPaymentCash = formOfPaymentCash;
  }

  @JsonProperty("FormOfPaymentPaymentCard")
  public FormOfPaymentPaymentCard getFormOfPaymentPaymentCard() {
    return formOfPaymentPaymentCard;
  }

  @JsonProperty("FormOfPaymentPaymentCard")
  public void setFormOfPaymentPaymentCard(FormOfPaymentPaymentCard formOfPaymentPaymentCard) {
    this.formOfPaymentPaymentCard = formOfPaymentPaymentCard;
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

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}
