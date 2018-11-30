package com.travelport.refimpl.air.book.models.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.travelport.refimpl.air.book.models.Identifier;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"completionCode",
"approvalCode",
"avsResult",
"securityResult",
"Identifier",
"PaymentCardAuthorizationRef",
"PrimaryAccountNumber"
})
public class PaymentCardAuthorizationSummary {

@JsonProperty("id")
private String id;
@JsonProperty("completionCode")
private String completionCode;
@JsonProperty("approvalCode")
private String approvalCode;
@JsonProperty("avsResult")
private String avsResult;
@JsonProperty("securityResult")
private String securityResult;
@JsonProperty("Identifier")
private Identifier identifier;
@JsonProperty("PaymentCardAuthorizationRef")
private String paymentCardAuthorizationRef;
@JsonProperty("PrimaryAccountNumber")
private String primaryAccountNumber;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public PaymentCardAuthorizationSummary() {
}

/**
* 
* @param completionCode
* @param id
* @param avsResult
* @param securityResult
* @param primaryAccountNumber
* @param approvalCode
* @param paymentCardAuthorizationRef
* @param identifier
*/
public PaymentCardAuthorizationSummary(String id, String completionCode, String approvalCode, String avsResult, String securityResult, Identifier identifier, String paymentCardAuthorizationRef, String primaryAccountNumber) {
super();
this.id = id;
this.completionCode = completionCode;
this.approvalCode = approvalCode;
this.avsResult = avsResult;
this.securityResult = securityResult;
this.identifier = identifier;
this.paymentCardAuthorizationRef = paymentCardAuthorizationRef;
this.primaryAccountNumber = primaryAccountNumber;
}

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("completionCode")
public String getCompletionCode() {
return completionCode;
}

@JsonProperty("completionCode")
public void setCompletionCode(String completionCode) {
this.completionCode = completionCode;
}

@JsonProperty("approvalCode")
public String getApprovalCode() {
return approvalCode;
}

@JsonProperty("approvalCode")
public void setApprovalCode(String approvalCode) {
this.approvalCode = approvalCode;
}

@JsonProperty("avsResult")
public String getAvsResult() {
return avsResult;
}

@JsonProperty("avsResult")
public void setAvsResult(String avsResult) {
this.avsResult = avsResult;
}

@JsonProperty("securityResult")
public String getSecurityResult() {
return securityResult;
}

@JsonProperty("securityResult")
public void setSecurityResult(String securityResult) {
this.securityResult = securityResult;
}

@JsonProperty("Identifier")
public Identifier getIdentifier() {
return identifier;
}

@JsonProperty("Identifier")
public void setIdentifier(Identifier identifier) {
this.identifier = identifier;
}

@JsonProperty("PaymentCardAuthorizationRef")
public String getPaymentCardAuthorizationRef() {
return paymentCardAuthorizationRef;
}

@JsonProperty("PaymentCardAuthorizationRef")
public void setPaymentCardAuthorizationRef(String paymentCardAuthorizationRef) {
this.paymentCardAuthorizationRef = paymentCardAuthorizationRef;
}

@JsonProperty("PrimaryAccountNumber")
public String getPrimaryAccountNumber() {
return primaryAccountNumber;
}

@JsonProperty("PrimaryAccountNumber")
public void setPrimaryAccountNumber(String primaryAccountNumber) {
this.primaryAccountNumber = primaryAccountNumber;
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
