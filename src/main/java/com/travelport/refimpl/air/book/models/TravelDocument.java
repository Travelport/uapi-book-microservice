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
    "docNumber",
    "docType",
    "issueDate",
    "expireDate",
    "stateProvCode",
    "issueCountry",
    "birthDate",
    "birthCountry",
    "birthPlace",
    "residence",
    "Gender",
    "Nationality",
    "PersonName"
})
public class TravelDocument {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("docNumber")
    private String docNumber;
    @JsonProperty("docType")
    private String docType;
    @JsonProperty("issueDate")
    private String issueDate;
    @JsonProperty("expireDate")
    private String expireDate;
    @JsonProperty("stateProvCode")
    private String stateProvCode;
    @JsonProperty("issueCountry")
    private String issueCountry;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("birthCountry")
    private String birthCountry;
    @JsonProperty("birthPlace")
    private String birthPlace;
    @JsonProperty("residence")
    private String residence;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("Nationality")
    private String nationality;
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TravelDocument() {
    }

    /**
     * 
     * @param nationality
     * @param residence
     * @param docType
     * @param stateProvCode
     * @param birthCountry
     * @param expireDate
     * @param gender
     * @param birthDate
     * @param issueDate
     * @param issueCountry
     * @param docNumber
     * @param type
     * @param birthPlace
     * @param personName
     */
    public TravelDocument(String type, String docNumber, String docType, String issueDate, String expireDate, String stateProvCode, String issueCountry, String birthDate, String birthCountry, String birthPlace, String residence, String gender, String nationality, PersonName personName) {
        super();
        this.type = type;
        this.docNumber = docNumber;
        this.docType = docType;
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.stateProvCode = stateProvCode;
        this.issueCountry = issueCountry;
        this.birthDate = birthDate;
        this.birthCountry = birthCountry;
        this.birthPlace = birthPlace;
        this.residence = residence;
        this.gender = gender;
        this.nationality = nationality;
        this.personName = personName;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("docNumber")
    public String getDocNumber() {
        return docNumber;
    }

    @JsonProperty("docNumber")
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("issueDate")
    public String getIssueDate() {
        return issueDate;
    }

    @JsonProperty("issueDate")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @JsonProperty("expireDate")
    public String getExpireDate() {
        return expireDate;
    }

    @JsonProperty("expireDate")
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @JsonProperty("stateProvCode")
    public String getStateProvCode() {
        return stateProvCode;
    }

    @JsonProperty("stateProvCode")
    public void setStateProvCode(String stateProvCode) {
        this.stateProvCode = stateProvCode;
    }

    @JsonProperty("issueCountry")
    public String getIssueCountry() {
        return issueCountry;
    }

    @JsonProperty("issueCountry")
    public void setIssueCountry(String issueCountry) {
        this.issueCountry = issueCountry;
    }

    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("birthCountry")
    public String getBirthCountry() {
        return birthCountry;
    }

    @JsonProperty("birthCountry")
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    @JsonProperty("birthPlace")
    public String getBirthPlace() {
        return birthPlace;
    }

    @JsonProperty("birthPlace")
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @JsonProperty("residence")
    public String getResidence() {
        return residence;
    }

    @JsonProperty("residence")
    public void setResidence(String residence) {
        this.residence = residence;
    }

    @JsonProperty("Gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("Nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("Nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("PersonName")
    public PersonName getPersonName() {
        return personName;
    }

    @JsonProperty("PersonName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
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
