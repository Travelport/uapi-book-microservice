package com.travelport.refimpl.air.book.models.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Offer;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Offer",
    "transactionId",
    "traceId",
    "Result",
    "Identifier",
    "NextSteps",
    "ReferenceList"
})
public class OfferResponse {

    @JsonProperty("Offer")
    private Offer offer;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("Result")
    private Result result;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("NextSteps")
    private NextSteps nextSteps;
    @JsonProperty("ReferenceList")
    private List<ReferenceList> referenceList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfferResponse() {
    }

    /**
     * 
     * @param result
     * @param transactionId
     * @param referenceList
     * @param traceId
     * @param offer
     * @param identifier
     * @param nextSteps
     */
    public OfferResponse(Offer offer, String transactionId, String traceId, Result result, Identifier identifier, NextSteps nextSteps, List<ReferenceList> referenceList) {
        super();
        this.offer = offer;
        this.transactionId = transactionId;
        this.traceId = traceId;
        this.result = result;
        this.identifier = identifier;
        this.nextSteps = nextSteps;
        this.referenceList = referenceList;
    }

    @JsonProperty("Offer")
    public Offer getOffer() {
        return offer;
    }

    @JsonProperty("Offer")
    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("traceId")
    public String getTraceId() {
        return traceId;
    }

    @JsonProperty("traceId")
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @JsonProperty("Result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("Result")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("NextSteps")
    public NextSteps getNextSteps() {
        return nextSteps;
    }

    @JsonProperty("NextSteps")
    public void setNextSteps(NextSteps nextSteps) {
        this.nextSteps = nextSteps;
    }

    @JsonProperty("ReferenceList")
    public List<ReferenceList> getReferenceList() {
        return referenceList;
    }

    @JsonProperty("ReferenceList")
    public void setReferenceList(List<ReferenceList> referenceList) {
        this.referenceList = referenceList;
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
