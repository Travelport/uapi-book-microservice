package com.travelport.refimpl.air.book.models.request;

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
    "ReservationSummary"
})
public class Models {

    @JsonProperty("ReservationSummary")
    private ReservationSummary reservationSummary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Models() {
    }

    /**
     * 
     * @param reservationSummary
     */
    public Models(ReservationSummary reservationSummary) {
        super();
        this.reservationSummary = reservationSummary;
    }

    @JsonProperty("ReservationSummary")
    public ReservationSummary getReservationSummary() {
        return reservationSummary;
    }

    @JsonProperty("ReservationSummary")
    public void setReservationSummary(ReservationSummary reservationSummary) {
        this.reservationSummary = reservationSummary;
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
