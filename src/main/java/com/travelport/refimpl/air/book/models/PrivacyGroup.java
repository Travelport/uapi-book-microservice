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
@JsonPropertyOrder({"value", "id", "shareMarketing", "shareSync", "optOutInd", "optInStatus",
    "optInDate", "optOutDate"})
public class PrivacyGroup {

  @JsonProperty("value")
  private Object value;
  @JsonProperty("id")
  private String id;
  @JsonProperty("shareMarketing")
  private String shareMarketing;
  @JsonProperty("shareSync")
  private String shareSync;
  @JsonProperty("optOutInd")
  private String optOutInd;
  @JsonProperty("optInStatus")
  private String optInStatus;
  @JsonProperty("optInDate")
  private String optInDate;
  @JsonProperty("optOutDate")
  private String optOutDate;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   * 
   */
  public PrivacyGroup() {}

  /**
   * 
   * @param id
   * @param shareSync
   * @param optInStatus
   * @param value
   * @param optInDate
   * @param shareMarketing
   * @param optOutDate
   * @param optOutInd
   */
  public PrivacyGroup(Object value, String id, String shareMarketing, String shareSync,
      String optOutInd, String optInStatus, String optInDate, String optOutDate) {
    super();
    this.value = value;
    this.id = id;
    this.shareMarketing = shareMarketing;
    this.shareSync = shareSync;
    this.optOutInd = optOutInd;
    this.optInStatus = optInStatus;
    this.optInDate = optInDate;
    this.optOutDate = optOutDate;
  }

  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(Object value) {
    this.value = value;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("shareMarketing")
  public String getShareMarketing() {
    return shareMarketing;
  }

  @JsonProperty("shareMarketing")
  public void setShareMarketing(String shareMarketing) {
    this.shareMarketing = shareMarketing;
  }

  @JsonProperty("shareSync")
  public String getShareSync() {
    return shareSync;
  }

  @JsonProperty("shareSync")
  public void setShareSync(String shareSync) {
    this.shareSync = shareSync;
  }

  @JsonProperty("optOutInd")
  public String getOptOutInd() {
    return optOutInd;
  }

  @JsonProperty("optOutInd")
  public void setOptOutInd(String optOutInd) {
    this.optOutInd = optOutInd;
  }

  @JsonProperty("optInStatus")
  public String getOptInStatus() {
    return optInStatus;
  }

  @JsonProperty("optInStatus")
  public void setOptInStatus(String optInStatus) {
    this.optInStatus = optInStatus;
  }

  @JsonProperty("optInDate")
  public String getOptInDate() {
    return optInDate;
  }

  @JsonProperty("optInDate")
  public void setOptInDate(String optInDate) {
    this.optInDate = optInDate;
  }

  @JsonProperty("optOutDate")
  public String getOptOutDate() {
    return optOutDate;
  }

  @JsonProperty("optOutDate")
  public void setOptOutDate(String optOutDate) {
    this.optOutDate = optOutDate;
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
