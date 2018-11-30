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
import com.travelport.refimpl.air.book.models.request.FlightSegment;
import com.travelport.refimpl.air.book.models.request.PassengerFlight;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "id",
    "productRef",
    "totalDuration",
    "Identifier",
    "Quantity",
    "FlightSegment",
    "PassengerFlight"
})
public class Product {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("productRef")
    private String productRef;
    @JsonProperty("totalDuration")
    private String totalDuration;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("FlightSegment")
    private List<FlightSegment> flightSegment = null;
    @JsonProperty("PassengerFlight")
    private List<PassengerFlight> passengerFlight = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param id
     * @param totalDuration
     * @param flightSegment
     * @param quantity
     * @param productRef
     * @param type
     * @param passengerFlight
     * @param identifier
     */
    public Product(String type, String id, String productRef, String totalDuration, Identifier identifier, Integer quantity, List<FlightSegment> flightSegment, List<PassengerFlight> passengerFlight) {
        super();
        this.type = type;
        this.id = id;
        this.productRef = productRef;
        this.totalDuration = totalDuration;
        this.identifier = identifier;
        this.quantity = quantity;
        this.flightSegment = flightSegment;
        this.passengerFlight = passengerFlight;
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

    @JsonProperty("productRef")
    public String getProductRef() {
        return productRef;
    }

    @JsonProperty("productRef")
    public void setProductRef(String productRef) {
        this.productRef = productRef;
    }

    @JsonProperty("totalDuration")
    public String getTotalDuration() {
        return totalDuration;
    }

    @JsonProperty("totalDuration")
    public void setTotalDuration(String totalDuration) {
        this.totalDuration = totalDuration;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("FlightSegment")
    public List<FlightSegment> getFlightSegment() {
        return flightSegment;
    }

    @JsonProperty("FlightSegment")
    public void setFlightSegment(List<FlightSegment> flightSegment) {
        this.flightSegment = flightSegment;
    }

    @JsonProperty("PassengerFlight")
    public List<PassengerFlight> getPassengerFlight() {
        return passengerFlight;
    }

    @JsonProperty("PassengerFlight")
    public void setPassengerFlight(List<PassengerFlight> passengerFlight) {
        this.passengerFlight = passengerFlight;
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
