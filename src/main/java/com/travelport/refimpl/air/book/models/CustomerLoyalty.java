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
    "priority",
    "programId",
    "programName",
    "programExtension",
    "supplierType",
    "supplier",
    "level",
    "loyaltyLevelATPCO",
    "tier",
    "status",
    "validatedInd"
})
public class CustomerLoyalty {

    @JsonProperty("value")
    private String value;
    @JsonProperty("id")
    private String id;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("programId")
    private String programId;
    @JsonProperty("programName")
    private String programName;
    @JsonProperty("programExtension")
    private String programExtension;
    @JsonProperty("supplierType")
    private String supplierType;
    @JsonProperty("supplier")
    private String supplier;
    @JsonProperty("level")
    private String level;
    @JsonProperty("loyaltyLevelATPCO")
    private String loyaltyLevelATPCO;
    @JsonProperty("tier")
    private Integer tier;
    @JsonProperty("status")
    private String status;
    @JsonProperty("validatedInd")
    private Boolean validatedInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomerLoyalty() {
    }

    /**
     * 
     * @param supplierType
     * @param id
     * @param validatedInd
     * @param level
     * @param programId
     * @param status
     * @param priority
     * @param programExtension
     * @param value
     * @param tier
     * @param loyaltyLevelATPCO
     * @param supplier
     * @param programName
     */
    public CustomerLoyalty(String value, String id, Integer priority, String programId, String programName, String programExtension, String supplierType, String supplier, String level, String loyaltyLevelATPCO, Integer tier, String status, Boolean validatedInd) {
        super();
        this.value = value;
        this.id = id;
        this.priority = priority;
        this.programId = programId;
        this.programName = programName;
        this.programExtension = programExtension;
        this.supplierType = supplierType;
        this.supplier = supplier;
        this.level = level;
        this.loyaltyLevelATPCO = loyaltyLevelATPCO;
        this.tier = tier;
        this.status = status;
        this.validatedInd = validatedInd;
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

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("programId")
    public String getProgramId() {
        return programId;
    }

    @JsonProperty("programId")
    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @JsonProperty("programName")
    public String getProgramName() {
        return programName;
    }

    @JsonProperty("programName")
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @JsonProperty("programExtension")
    public String getProgramExtension() {
        return programExtension;
    }

    @JsonProperty("programExtension")
    public void setProgramExtension(String programExtension) {
        this.programExtension = programExtension;
    }

    @JsonProperty("supplierType")
    public String getSupplierType() {
        return supplierType;
    }

    @JsonProperty("supplierType")
    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    @JsonProperty("supplier")
    public String getSupplier() {
        return supplier;
    }

    @JsonProperty("supplier")
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("loyaltyLevelATPCO")
    public String getLoyaltyLevelATPCO() {
        return loyaltyLevelATPCO;
    }

    @JsonProperty("loyaltyLevelATPCO")
    public void setLoyaltyLevelATPCO(String loyaltyLevelATPCO) {
        this.loyaltyLevelATPCO = loyaltyLevelATPCO;
    }

    @JsonProperty("tier")
    public Integer getTier() {
        return tier;
    }

    @JsonProperty("tier")
    public void setTier(Integer tier) {
        this.tier = tier;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("validatedInd")
    public Boolean getValidatedInd() {
        return validatedInd;
    }

    @JsonProperty("validatedInd")
    public void setValidatedInd(Boolean validatedInd) {
        this.validatedInd = validatedInd;
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
