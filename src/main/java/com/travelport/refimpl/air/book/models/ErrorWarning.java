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
"StatusCode",
"Message",
"NameValuePair"
})
public class ErrorWarning {

@JsonProperty("@type")
private String type;
@JsonProperty("StatusCode")
private Integer statusCode;
@JsonProperty("Message")
private String message;
@JsonProperty("NameValuePair")
private List<NameValuePair> nameValuePair = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public ErrorWarning() {
}

/**
* 
* @param message
* @param statusCode
* @param type
* @param nameValuePair
*/
public ErrorWarning(String type, Integer statusCode, String message, List<NameValuePair> nameValuePair) {
super();
this.type = type;
this.statusCode = statusCode;
this.message = message;
this.nameValuePair = nameValuePair;
}

@JsonProperty("@type")
public String getType() {
return type;
}

@JsonProperty("@type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("StatusCode")
public Integer getStatusCode() {
return statusCode;
}

@JsonProperty("StatusCode")
public void setStatusCode(Integer statusCode) {
this.statusCode = statusCode;
}

@JsonProperty("Message")
public String getMessage() {
return message;
}

@JsonProperty("Message")
public void setMessage(String message) {
this.message = message;
}

@JsonProperty("NameValuePair")
public List<NameValuePair> getNameValuePair() {
return nameValuePair;
}

@JsonProperty("NameValuePair")
public void setNameValuePair(List<NameValuePair> nameValuePair) {
this.nameValuePair = nameValuePair;
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

