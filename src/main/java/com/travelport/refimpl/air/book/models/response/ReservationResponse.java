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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Reservation", "transactionId", "traceId", "Result", "ReferenceList"
})
public class ReservationResponse {

    @JsonProperty("Reservation")
    private Reservation reservation;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("Result")
    private Result result;
    @JsonProperty("ReferenceList")
    private List<ReferenceList> referenceList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReservationResponse() {
    }

    /**
     * 
     * @param reservation
     * @param transactionId
     * @param referenceList
     * @param traceId
     * @param catalogOfferings
     */
    public ReservationResponse(Reservation reservation, String transactionId,
        String traceId, Result result, List<ReferenceList> referenceList) {
        super();
        this.reservation = reservation;
        this.transactionId = transactionId;
        this.traceId = traceId;
        this.result = result;
        this.referenceList = referenceList;
    }

    @JsonProperty("Reservation")
    public Reservation getReservation() {
        return reservation;
    }

    @JsonProperty("Reservation")
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
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
