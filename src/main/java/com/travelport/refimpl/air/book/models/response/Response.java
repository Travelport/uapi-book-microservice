package com.travelport.refimpl.air.book.models.response;

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
    "ReservationResponse"
})
public class Response {

    @JsonProperty("ReservationResponse")
    private ReservationResponse reservationResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param reservationResponse
     */
    public Response(ReservationResponse reservationResponse) {
        super();
        this.reservationResponse = reservationResponse;
    }

    @JsonProperty("ReservationResponse")
    public ReservationResponse getReservationResponse() {
        return reservationResponse;
    }

    @JsonProperty("ReservationResponse")
    public void setReservationResponse(ReservationResponse reservationResponse) {
        this.reservationResponse = reservationResponse;
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
