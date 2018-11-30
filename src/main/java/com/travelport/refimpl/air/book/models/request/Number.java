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
    "value",
    "streetNmbrSuffix",
    "streetDirection",
    "ruralRouteNmbr",
    "po_Box"
})
public class Number {

    @JsonProperty("value")
    private String value;
    @JsonProperty("streetNmbrSuffix")
    private String streetNmbrSuffix;
    @JsonProperty("streetDirection")
    private String streetDirection;
    @JsonProperty("ruralRouteNmbr")
    private String ruralRouteNmbr;
    @JsonProperty("po_Box")
    private String poBox;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Number() {
    }

    /**
     * 
     * @param poBox
     * @param streetDirection
     * @param value
     * @param streetNmbrSuffix
     * @param ruralRouteNmbr
     */
    public Number(String value, String streetNmbrSuffix, String streetDirection, String ruralRouteNmbr, String poBox) {
        super();
        this.value = value;
        this.streetNmbrSuffix = streetNmbrSuffix;
        this.streetDirection = streetDirection;
        this.ruralRouteNmbr = ruralRouteNmbr;
        this.poBox = poBox;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("streetNmbrSuffix")
    public String getStreetNmbrSuffix() {
        return streetNmbrSuffix;
    }

    @JsonProperty("streetNmbrSuffix")
    public void setStreetNmbrSuffix(String streetNmbrSuffix) {
        this.streetNmbrSuffix = streetNmbrSuffix;
    }

    @JsonProperty("streetDirection")
    public String getStreetDirection() {
        return streetDirection;
    }

    @JsonProperty("streetDirection")
    public void setStreetDirection(String streetDirection) {
        this.streetDirection = streetDirection;
    }

    @JsonProperty("ruralRouteNmbr")
    public String getRuralRouteNmbr() {
        return ruralRouteNmbr;
    }

    @JsonProperty("ruralRouteNmbr")
    public void setRuralRouteNmbr(String ruralRouteNmbr) {
        this.ruralRouteNmbr = ruralRouteNmbr;
    }

    @JsonProperty("po_Box")
    public String getPoBox() {
        return poBox;
    }

    @JsonProperty("po_Box")
    public void setPoBox(String poBox) {
        this.poBox = poBox;
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
