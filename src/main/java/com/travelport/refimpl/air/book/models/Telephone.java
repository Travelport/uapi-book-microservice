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
    "@type",
    "role",
    "countryAccessCode",
    "areaCityCode",
    "phoneNumber",
    "extension",
    "id",
    "cityCode"
})
public class Telephone {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("role")
    private String role;
    @JsonProperty("countryAccessCode")
    private String countryAccessCode;
    @JsonProperty("areaCityCode")
    private String areaCityCode;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("extension")
    private String extension;
    @JsonProperty("id")
    private String id;
    @JsonProperty("cityCode")
    private String cityCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Telephone() {
    }

    /**
     * 
     * @param id
     * @param extension
     * @param countryAccessCode
     * @param phoneNumber
     * @param cityCode
     * @param role
     * @param areaCityCode
     * @param type
     */
    public Telephone(String type, String role, String countryAccessCode, String areaCityCode, String phoneNumber, String extension, String id, String cityCode) {
        super();
        this.type = type;
        this.role = role;
        this.countryAccessCode = countryAccessCode;
        this.areaCityCode = areaCityCode;
        this.phoneNumber = phoneNumber;
        this.extension = extension;
        this.id = id;
        this.cityCode = cityCode;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("countryAccessCode")
    public String getCountryAccessCode() {
        return countryAccessCode;
    }

    @JsonProperty("countryAccessCode")
    public void setCountryAccessCode(String countryAccessCode) {
        this.countryAccessCode = countryAccessCode;
    }

    @JsonProperty("areaCityCode")
    public String getAreaCityCode() {
        return areaCityCode;
    }

    @JsonProperty("areaCityCode")
    public void setAreaCityCode(String areaCityCode) {
        this.areaCityCode = areaCityCode;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("cityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("cityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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
