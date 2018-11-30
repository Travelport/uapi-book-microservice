package com.travelport.refimpl.air.book.models.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.travelport.refimpl.air.book.models.Fees;
import com.travelport.refimpl.air.book.models.Taxes;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"@type",
	"currencySource",
	"currencyCode",
	"approximateInd",
	"Base",
	"Taxes",
	"Fees",
	"Total"
})
public class AmountResponse {
	@JsonProperty("@type")
	private String type;
	@JsonProperty("currencySource")
	private String currencySource;
	@JsonProperty("currencyCode")
	private String currencyCode;
	@JsonProperty("approximateInd")
	private Boolean approximateInd;
	@JsonProperty("Base")
	private Double base;
	@JsonProperty("Taxes")
	private Taxes taxes;
	@JsonProperty("Fees")
	private Fees fees;
	@JsonProperty("Total")
	private Double total;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	* No args constructor for use in serialization
	* 
	*/
	public AmountResponse() {
	}

	/**
	* 
	* @param total
	* @param currencySource
	* @param currencyCode
	* @param base
	* @param fees
	* @param type
	* @param taxes
	* @param approximateInd
	*/
	public AmountResponse(String type, String currencySource, String currencyCode, Boolean approximateInd, Double base, Taxes taxes, Fees fees, Double total) {
	super();
	this.type = type;
	this.currencySource = currencySource;
	this.currencyCode = currencyCode;
	this.approximateInd = approximateInd;
	this.base = base;
	this.taxes = taxes;
	this.fees = fees;
	this.total = total;
	}

	@JsonProperty("@type")
	public String getType() {
	return type;
	}

	@JsonProperty("@type")
	public void setType(String type) {
	this.type = type;
	}

	@JsonProperty("currencySource")
	public String getCurrencySource() {
	return currencySource;
	}

	@JsonProperty("currencySource")
	public void setCurrencySource(String currencySource) {
	this.currencySource = currencySource;
	}

	@JsonProperty("currencyCode")
	public String getCurrencyCode() {
	return currencyCode;
	}

	@JsonProperty("currencyCode")
	public void setCurrencyCode(String currencyCode) {
	this.currencyCode = currencyCode;
	}

	@JsonProperty("approximateInd")
	public Boolean getApproximateInd() {
	return approximateInd;
	}

	@JsonProperty("approximateInd")
	public void setApproximateInd(Boolean approximateInd) {
	this.approximateInd = approximateInd;
	}

	@JsonProperty("Base")
	public Double getBase() {
	return base;
	}

	@JsonProperty("Base")
	public void setBase(Double base) {
	this.base = base;
	}

	@JsonProperty("Taxes")
	public Taxes getTaxes() {
	return taxes;
	}

	@JsonProperty("Taxes")
	public void setTaxes(Taxes taxes) {
	this.taxes = taxes;
	}

	@JsonProperty("Fees")
	public Fees getFees() {
	return fees;
	}

	@JsonProperty("Fees")
	public void setFees(Fees fees) {
	this.fees = fees;
	}

	@JsonProperty("Total")
	public Double getTotal() {
	return total;
	}

	@JsonProperty("Total")
	public void setTotal(Double total) {
	this.total = total;
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