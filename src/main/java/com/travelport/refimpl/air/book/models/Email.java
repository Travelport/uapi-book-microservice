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
    "id",
    "emailType",
    "comment",
    "preferredFormat",
    "shareMarketing",
    "shareSync",
    "optOutInd",
    "optInStatus",
    "optInDate",
    "optOutDate",
    "validInd",
    "provisionedInd"
})
public class Email {

    @JsonProperty("value")
    private String value;
    @JsonProperty("id")
    private String id;
    @JsonProperty("emailType")
    private String emailType;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("preferredFormat")
    private String preferredFormat;
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
    @JsonProperty("validInd")
    private Boolean validInd;
    @JsonProperty("provisionedInd")
    private Boolean provisionedInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Email() {
    }

    /**
     * 
     * @param id
     * @param emailType
     * @param shareSync
     * @param provisionedInd
     * @param optInStatus
     * @param value
     * @param optInDate
     * @param validInd
     * @param shareMarketing
     * @param comment
     * @param optOutDate
     * @param optOutInd
     * @param preferredFormat
     */
    public Email(String value, String id, String emailType, String comment, String preferredFormat, String shareMarketing, String shareSync, String optOutInd, String optInStatus, String optInDate, String optOutDate, Boolean validInd, Boolean provisionedInd) {
        super();
        this.value = value;
        this.id = id;
        this.emailType = emailType;
        this.comment = comment;
        this.preferredFormat = preferredFormat;
        this.shareMarketing = shareMarketing;
        this.shareSync = shareSync;
        this.optOutInd = optOutInd;
        this.optInStatus = optInStatus;
        this.optInDate = optInDate;
        this.optOutDate = optOutDate;
        this.validInd = validInd;
        this.provisionedInd = provisionedInd;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
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

    @JsonProperty("emailType")
    public String getEmailType() {
        return emailType;
    }

    @JsonProperty("emailType")
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("preferredFormat")
    public String getPreferredFormat() {
        return preferredFormat;
    }

    @JsonProperty("preferredFormat")
    public void setPreferredFormat(String preferredFormat) {
        this.preferredFormat = preferredFormat;
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

    @JsonProperty("validInd")
    public Boolean getValidInd() {
        return validInd;
    }

    @JsonProperty("validInd")
    public void setValidInd(Boolean validInd) {
        this.validInd = validInd;
    }

    @JsonProperty("provisionedInd")
    public Boolean getProvisionedInd() {
        return provisionedInd;
    }

    @JsonProperty("provisionedInd")
    public void setProvisionedInd(Boolean provisionedInd) {
        this.provisionedInd = provisionedInd;
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
