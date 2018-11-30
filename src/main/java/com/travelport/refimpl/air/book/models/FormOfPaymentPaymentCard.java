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
@JsonPropertyOrder({"id", "FormOfPaymentRef", "Identifier", "PaymentCard", "Payment", "Receipt",
    "OfferLink", "Comments"})
public class FormOfPaymentPaymentCard {

  @JsonProperty("id")
  private String id;
  @JsonProperty("FormOfPaymentRef")
  private String formOfPaymentRef;
  @JsonProperty("Identifier")
  private Identifier identifier;
  @JsonProperty("PaymentCard")
  private PaymentCard paymentCard;
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
  public FormOfPaymentPaymentCard() {}

  /**
   * 
   * @param id
   * @param paymentCard
   * @param payment
   * @param offerLink
   * @param receipt
   * @param formOfPaymentRef
   * @param identifier
   * @param comments
   */
  public FormOfPaymentPaymentCard(String id, String formOfPaymentRef, Identifier identifier,
      PaymentCard paymentCard, List<Payment> payment, List<Receipt> receipt,
      List<OfferLink> offerLink, Comments comments) {
    super();
    this.id = id;
    this.formOfPaymentRef = formOfPaymentRef;
    this.identifier = identifier;
    this.paymentCard = paymentCard;
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

  @JsonProperty("FormOfPaymentRef")
  public String getFormOfPaymentRef() {
    return formOfPaymentRef;
  }

  @JsonProperty("FormOfPaymentRef")
  public void setFormOfPaymentRef(String formOfPaymentRef) {
    this.formOfPaymentRef = formOfPaymentRef;
  }

  @JsonProperty("Identifier")
  public Identifier getIdentifier() {
    return identifier;
  }

  @JsonProperty("Identifier")
  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  @JsonProperty("PaymentCard")
  public PaymentCard getPaymentCard() {
    return paymentCard;
  }

  @JsonProperty("PaymentCard")
  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
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
