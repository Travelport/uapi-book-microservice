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
    "id",
    "TravelerRef",
    "dob",
    "gender",
    "passengerTypeCode",
    "nationality",
    "accompaniedByInfantInd",
    "Identifier",
    "PersonName",
    "Address",
    "Telephone",
    "Email",
    "CustomerLoyalty",
    "AlternateContact",
    "TravelDocument",
    "Comments"
})
public class Traveler {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("TravelerRef")
    private String travelerRef;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("passengerTypeCode")
    private String passengerTypeCode;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("accompaniedByInfantInd")
    private Boolean accompaniedByInfantInd;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("Address")
    private List<Address> address = null;
    @JsonProperty("Telephone")
    private List<Telephone> telephone = null;
    @JsonProperty("Email")
    private List<Email> email = null;
    @JsonProperty("CustomerLoyalty")
    private List<CustomerLoyalty> customerLoyalty = null;
    @JsonProperty("AlternateContact")
    private List<AlternateContact> alternateContact = null;
    @JsonProperty("TravelDocument")
    private List<TravelDocument> travelDocument = null;
    @JsonProperty("Comments")
    private Comments comments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Traveler() {
    }

    /**
     * 
     * @param travelerRef
     * @param accompaniedByInfantInd
     * @param passengerTypeCode
     * @param customerLoyalty
     * @param travelDocument
     * @param type
     * @param personName
     * @param id
     * @param alternateContact
     * @param nationality
     * @param email
     * @param address
     * @param dob
     * @param gender
     * @param identifier
     * @param telephone
     * @param comments
     */
    public Traveler(String type, String id, String travelerRef, String dob, String gender, String passengerTypeCode, String nationality, Boolean accompaniedByInfantInd, Identifier identifier, PersonName personName, List<Address> address, List<Telephone> telephone, List<Email> email, List<CustomerLoyalty> customerLoyalty, List<AlternateContact> alternateContact, List<TravelDocument> travelDocument, Comments comments) {
        super();
        this.type = type;
        this.id = id;
        this.travelerRef = travelerRef;
        this.dob = dob;
        this.gender = gender;
        this.passengerTypeCode = passengerTypeCode;
        this.nationality = nationality;
        this.accompaniedByInfantInd = accompaniedByInfantInd;
        this.identifier = identifier;
        this.personName = personName;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.customerLoyalty = customerLoyalty;
        this.alternateContact = alternateContact;
        this.travelDocument = travelDocument;
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

    @JsonProperty("TravelerRef")
    public String getTravelerRef() {
        return travelerRef;
    }

    @JsonProperty("TravelerRef")
    public void setTravelerRef(String travelerRef) {
        this.travelerRef = travelerRef;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("passengerTypeCode")
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    @JsonProperty("passengerTypeCode")
    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("accompaniedByInfantInd")
    public Boolean getAccompaniedByInfantInd() {
        return accompaniedByInfantInd;
    }

    @JsonProperty("accompaniedByInfantInd")
    public void setAccompaniedByInfantInd(Boolean accompaniedByInfantInd) {
        this.accompaniedByInfantInd = accompaniedByInfantInd;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
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

    @JsonProperty("CustomerLoyalty")
    public List<CustomerLoyalty> getCustomerLoyalty() {
        return customerLoyalty;
    }

    @JsonProperty("CustomerLoyalty")
    public void setCustomerLoyalty(List<CustomerLoyalty> customerLoyalty) {
        this.customerLoyalty = customerLoyalty;
    }

    @JsonProperty("AlternateContact")
    public List<AlternateContact> getAlternateContact() {
        return alternateContact;
    }

    @JsonProperty("AlternateContact")
    public void setAlternateContact(List<AlternateContact> alternateContact) {
        this.alternateContact = alternateContact;
    }

    @JsonProperty("TravelDocument")
    public List<TravelDocument> getTravelDocument() {
        return travelDocument;
    }

    @JsonProperty("TravelDocument")
    public void setTravelDocument(List<TravelDocument> travelDocument) {
        this.travelDocument = travelDocument;
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
