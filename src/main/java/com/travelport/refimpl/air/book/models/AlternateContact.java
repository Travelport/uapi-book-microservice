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
    "id",
    "contactType",
    "relation",
    "emergencyInd",
    "defaultInd",
    "PersonName",
    "Address",
    "Telephone",
    "Email"
})
public class AlternateContact {

    @JsonProperty("id")
    private String id;
    @JsonProperty("contactType")
    private String contactType;
    @JsonProperty("relation")
    private String relation;
    @JsonProperty("emergencyInd")
    private Boolean emergencyInd;
    @JsonProperty("defaultInd")
    private Boolean defaultInd;
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("Address")
    private List<Address> address = null;
    @JsonProperty("Telephone")
    private List<Telephone> telephone = null;
    @JsonProperty("Email")
    private List<Email> email = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AlternateContact() {
    }

    /**
     * 
     * @param emergencyInd
     * @param id
     * @param email
     * @param address
     * @param relation
     * @param contactType
     * @param telephone
     * @param personName
     * @param defaultInd
     */
    public AlternateContact(String id, String contactType, String relation, Boolean emergencyInd, Boolean defaultInd, PersonName personName, List<Address> address, List<Telephone> telephone, List<Email> email) {
        super();
        this.id = id;
        this.contactType = contactType;
        this.relation = relation;
        this.emergencyInd = emergencyInd;
        this.defaultInd = defaultInd;
        this.personName = personName;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("contactType")
    public String getContactType() {
        return contactType;
    }

    @JsonProperty("contactType")
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @JsonProperty("relation")
    public String getRelation() {
        return relation;
    }

    @JsonProperty("relation")
    public void setRelation(String relation) {
        this.relation = relation;
    }

    @JsonProperty("emergencyInd")
    public Boolean getEmergencyInd() {
        return emergencyInd;
    }

    @JsonProperty("emergencyInd")
    public void setEmergencyInd(Boolean emergencyInd) {
        this.emergencyInd = emergencyInd;
    }

    @JsonProperty("defaultInd")
    public Boolean getDefaultInd() {
        return defaultInd;
    }

    @JsonProperty("defaultInd")
    public void setDefaultInd(Boolean defaultInd) {
        this.defaultInd = defaultInd;
    }

    @JsonProperty("PersonName")
    public PersonName getPersonName() {
        return personName;
    }

    @JsonProperty("PersonName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    @JsonProperty("Address")
    public List<Address> getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @JsonProperty("Telephone")
    public List<Telephone> getTelephone() {
        return telephone;
    }

    @JsonProperty("Telephone")
    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("Email")
    public List<Email> getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(List<Email> email) {
        this.email = email;
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
