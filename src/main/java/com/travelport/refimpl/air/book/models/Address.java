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
    "role",
    "id",
    "BldgRoom",
    "Number",
    "Street",
    "AddressLine",
    "City",
    "County",
    "StateProv",
    "Country",
    "PostalCode"
})
public class Address {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("role")
    private String role;
    @JsonProperty("id")
    private String id;
    @JsonProperty("BldgRoom")
    private BldgRoom bldgRoom;
    @JsonProperty("Number")
    private Number number;
    @JsonProperty("Street")
    private String street;
    @JsonProperty("AddressLine")
    private List<String> addressLine = null;
    @JsonProperty("City")
    private String city;
    @JsonProperty("County")
    private String county;
    @JsonProperty("StateProv")
    private StateProv stateProv;
    @JsonProperty("Country")
    private Country country;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param stateProv
     * @param addressLine
     * @param id
     * @param postalCode
     * @param county
     * @param street
     * @param role
     * @param number
     * @param type
     * @param bldgRoom
     * @param country
     * @param city
     */
    public Address(String type, String role, String id, BldgRoom bldgRoom, Number number, String street, List<String> addressLine, String city, String county, StateProv stateProv, Country country, String postalCode) {
        super();
        this.type = type;
        this.role = role;
        this.id = id;
        this.bldgRoom = bldgRoom;
        this.number = number;
        this.street = street;
        this.addressLine = addressLine;
        this.city = city;
        this.county = county;
        this.stateProv = stateProv;
        this.country = country;
        this.postalCode = postalCode;
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("BldgRoom")
    public BldgRoom getBldgRoom() {
        return bldgRoom;
    }

    @JsonProperty("BldgRoom")
    public void setBldgRoom(BldgRoom bldgRoom) {
        this.bldgRoom = bldgRoom;
    }

    @JsonProperty("Number")
    public Number getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Number number) {
        this.number = number;
    }

    @JsonProperty("Street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("Street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("AddressLine")
    public List<String> getAddressLine() {
        return addressLine;
    }

    @JsonProperty("AddressLine")
    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("County")
    public String getCounty() {
        return county;
    }

    @JsonProperty("County")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("StateProv")
    public StateProv getStateProv() {
        return stateProv;
    }

    @JsonProperty("StateProv")
    public void setStateProv(StateProv stateProv) {
        this.stateProv = stateProv;
    }

    @JsonProperty("Country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
