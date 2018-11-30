
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
    "id",
    "FormOfPaymentRef",
    "cashInd",
    "Identifier"
})
public class FormOfPaymentCash {

    @JsonProperty("id")
    private String id;
    @JsonProperty("FormOfPaymentRef")
    private String formOfPaymentRef;
    @JsonProperty("cashInd")
    private Boolean cashInd;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FormOfPaymentCash() {
    }

    /**
     * 
     * @param id
     * @param cashInd
     * @param formOfPaymentRef
     * @param identifier
     */
    public FormOfPaymentCash(String id, String formOfPaymentRef, Boolean cashInd, Identifier identifier) {
        super();
        this.id = id;
        this.formOfPaymentRef = formOfPaymentRef;
        this.cashInd = cashInd;
        this.identifier = identifier;
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

    @JsonProperty("cashInd")
    public Boolean getCashInd() {
        return cashInd;
    }

    @JsonProperty("cashInd")
    public void setCashInd(Boolean cashInd) {
        this.cashInd = cashInd;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
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
