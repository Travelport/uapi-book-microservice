
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
    "encryptionKey",
    "encryptionKeyMethod",
    "encryptionMethod",
    "encryptedValue",
    "mask",
    "token",
    "tokenProviderID",
    "authenticationMethod",
    "PlainText",
    "ErrorWarning"
})
public class CardNumber {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("encryptionKey")
    private String encryptionKey;
    @JsonProperty("encryptionKeyMethod")
    private String encryptionKeyMethod;
    @JsonProperty("encryptionMethod")
    private String encryptionMethod;
    @JsonProperty("encryptedValue")
    private String encryptedValue;
    @JsonProperty("mask")
    private String mask;
    @JsonProperty("token")
    private String token;
    @JsonProperty("tokenProviderID")
    private String tokenProviderID;
    @JsonProperty("authenticationMethod")
    private String authenticationMethod;
    @JsonProperty("PlainText")
    private String plainText;
    @JsonProperty("ErrorWarning")
    private ErrorWarning errorWarning;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CardNumber() {
    }

    /**
     * 
     * @param encryptionKey
     * @param encryptionMethod
     * @param authenticationMethod
     * @param token
     * @param tokenProviderID
     * @param encryptionKeyMethod
     * @param mask
     * @param encryptedValue
     * @param errorWarning
     * @param type
     * @param plainText
     */
    public CardNumber(String type, String encryptionKey, String encryptionKeyMethod, String encryptionMethod, String encryptedValue, String mask, String token, String tokenProviderID, String authenticationMethod, String plainText, ErrorWarning errorWarning) {
        super();
        this.type = type;
        this.encryptionKey = encryptionKey;
        this.encryptionKeyMethod = encryptionKeyMethod;
        this.encryptionMethod = encryptionMethod;
        this.encryptedValue = encryptedValue;
        this.mask = mask;
        this.token = token;
        this.tokenProviderID = tokenProviderID;
        this.authenticationMethod = authenticationMethod;
        this.plainText = plainText;
        this.errorWarning = errorWarning;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("encryptionKey")
    public String getEncryptionKey() {
        return encryptionKey;
    }

    @JsonProperty("encryptionKey")
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    @JsonProperty("encryptionKeyMethod")
    public String getEncryptionKeyMethod() {
        return encryptionKeyMethod;
    }

    @JsonProperty("encryptionKeyMethod")
    public void setEncryptionKeyMethod(String encryptionKeyMethod) {
        this.encryptionKeyMethod = encryptionKeyMethod;
    }

    @JsonProperty("encryptionMethod")
    public String getEncryptionMethod() {
        return encryptionMethod;
    }

    @JsonProperty("encryptionMethod")
    public void setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    @JsonProperty("encryptedValue")
    public String getEncryptedValue() {
        return encryptedValue;
    }

    @JsonProperty("encryptedValue")
    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    @JsonProperty("mask")
    public String getMask() {
        return mask;
    }

    @JsonProperty("mask")
    public void setMask(String mask) {
        this.mask = mask;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("tokenProviderID")
    public String getTokenProviderID() {
        return tokenProviderID;
    }

    @JsonProperty("tokenProviderID")
    public void setTokenProviderID(String tokenProviderID) {
        this.tokenProviderID = tokenProviderID;
    }

    @JsonProperty("authenticationMethod")
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    @JsonProperty("authenticationMethod")
    public void setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    @JsonProperty("PlainText")
    public String getPlainText() {
        return plainText;
    }

    @JsonProperty("PlainText")
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    @JsonProperty("ErrorWarning")
    public ErrorWarning getErrorWarning() {
        return errorWarning;
    }

    @JsonProperty("ErrorWarning")
    public void setErrorWarning(ErrorWarning errorWarning) {
        this.errorWarning = errorWarning;
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
