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
@JsonPropertyOrder({"@type", "id", "effectiveDate", "expireDate", "approvalCode", "secureInd",
    "PrivacyGroup", "CardType", "CardCode", "CardBrand", "CardIssuer", "CardHolderName",
    "CardNumber", "SeriesCode", "MagneticStripe"})
public class PaymentCard {

  @JsonProperty("@type")
  private String type;
  @JsonProperty("id")
  private String id;
  @JsonProperty("effectiveDate")
  private String effectiveDate;
  @JsonProperty("expireDate")
  private String expireDate;
  @JsonProperty("approvalCode")
  private String approvalCode;
  @JsonProperty("secureInd")
  private Boolean secureInd;
  @JsonProperty("PrivacyGroup")
  private PrivacyGroup privacyGroup;
  @JsonProperty("CardType")
  private String cardType;
  @JsonProperty("CardCode")
  private String cardCode;
  @JsonProperty("CardBrand")
  private CardBrand cardBrand;
  @JsonProperty("CardIssuer")
  private CardIssuer cardIssuer;
  @JsonProperty("CardHolderName")
  private String cardHolderName;
  @JsonProperty("CardNumber")
  private CardNumber cardNumber;
  @JsonProperty("SeriesCode")
  private SeriesCode seriesCode;
  @JsonProperty("MagneticStripe")
  private List<MagneticStripe> magneticStripe = null;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   * 
   */
  public PaymentCard() {}

  /**
   * 
   * @param privacyGroup
   * @param cardHolderName
   * @param approvalCode
   * @param type
   * @param cardType
   * @param cardCode
   * @param cardBrand
   * @param id
   * @param expireDate
   * @param secureInd
   * @param cardIssuer
   * @param seriesCode
   * @param effectiveDate
   * @param magneticStripe
   * @param cardNumber
   */
  public PaymentCard(String type, String id, String effectiveDate, String expireDate,
      String approvalCode, Boolean secureInd, PrivacyGroup privacyGroup, String cardType,
      String cardCode, CardBrand cardBrand, CardIssuer cardIssuer, String cardHolderName,
      CardNumber cardNumber, SeriesCode seriesCode, List<MagneticStripe> magneticStripe) {
    super();
    this.type = type;
    this.id = id;
    this.effectiveDate = effectiveDate;
    this.expireDate = expireDate;
    this.approvalCode = approvalCode;
    this.secureInd = secureInd;
    this.privacyGroup = privacyGroup;
    this.cardType = cardType;
    this.cardCode = cardCode;
    this.cardBrand = cardBrand;
    this.cardIssuer = cardIssuer;
    this.cardHolderName = cardHolderName;
    this.cardNumber = cardNumber;
    this.seriesCode = seriesCode;
    this.magneticStripe = magneticStripe;
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

  @JsonProperty("effectiveDate")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  @JsonProperty("effectiveDate")
  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  @JsonProperty("expireDate")
  public String getExpireDate() {
    return expireDate;
  }

  @JsonProperty("expireDate")
  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  @JsonProperty("approvalCode")
  public String getApprovalCode() {
    return approvalCode;
  }

  @JsonProperty("approvalCode")
  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  @JsonProperty("secureInd")
  public Boolean getSecureInd() {
    return secureInd;
  }

  @JsonProperty("secureInd")
  public void setSecureInd(Boolean secureInd) {
    this.secureInd = secureInd;
  }

  @JsonProperty("PrivacyGroup")
  public PrivacyGroup getPrivacyGroup() {
    return privacyGroup;
  }

  @JsonProperty("PrivacyGroup")
  public void setPrivacyGroup(PrivacyGroup privacyGroup) {
    this.privacyGroup = privacyGroup;
  }

  @JsonProperty("CardType")
  public String getCardType() {
    return cardType;
  }

  @JsonProperty("CardType")
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  @JsonProperty("CardCode")
  public String getCardCode() {
    return cardCode;
  }

  @JsonProperty("CardCode")
  public void setCardCode(String cardCode) {
    this.cardCode = cardCode;
  }

  @JsonProperty("CardBrand")
  public CardBrand getCardBrand() {
    return cardBrand;
  }

  @JsonProperty("CardBrand")
  public void setCardBrand(CardBrand cardBrand) {
    this.cardBrand = cardBrand;
  }

  @JsonProperty("CardIssuer")
  public CardIssuer getCardIssuer() {
    return cardIssuer;
  }

  @JsonProperty("CardIssuer")
  public void setCardIssuer(CardIssuer cardIssuer) {
    this.cardIssuer = cardIssuer;
  }

  @JsonProperty("CardHolderName")
  public String getCardHolderName() {
    return cardHolderName;
  }

  @JsonProperty("CardHolderName")
  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  @JsonProperty("CardNumber")
  public CardNumber getCardNumber() {
    return cardNumber;
  }

  @JsonProperty("CardNumber")
  public void setCardNumber(CardNumber cardNumber) {
    this.cardNumber = cardNumber;
  }

  @JsonProperty("SeriesCode")
  public SeriesCode getSeriesCode() {
    return seriesCode;
  }

  @JsonProperty("SeriesCode")
  public void setSeriesCode(SeriesCode seriesCode) {
    this.seriesCode = seriesCode;
  }

  @JsonProperty("MagneticStripe")
  public List<MagneticStripe> getMagneticStripe() {
    return magneticStripe;
  }

  @JsonProperty("MagneticStripe")
  public void setMagneticStripe(List<MagneticStripe> magneticStripe) {
    this.magneticStripe = magneticStripe;
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
