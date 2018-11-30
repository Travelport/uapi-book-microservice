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
	"TotalTaxes",
	"Tax"
})
public class Taxes {

	@JsonProperty("@type")
	private String type;
	@JsonProperty("TotalTaxes")
	private Double totalTaxes;
	@JsonProperty("Tax")
	private List<Tax> tax = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	* No args constructor for use in serialization
	* 
	*/
	public Taxes() {
	}
	
	/**
	* 
	* @param tax
	* @param totalTaxes
	* @param type
	*/
	public Taxes(String type, Double totalTaxes, List<Tax> tax) {
		super();
		this.type = type;
		this.totalTaxes = totalTaxes;
		this.tax = tax;
	}
	
	@JsonProperty("@type")
	public String getType() {
		return type;
	}
	
	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("TotalTaxes")
	public Double getTotalTaxes() {
		return totalTaxes;
	}
	
	@JsonProperty("TotalTaxes")
	public void setTotalTaxes(Double totalTaxes) {
		this.totalTaxes = totalTaxes;
	}
	
	@JsonProperty("Tax")
	public List<Tax> getTax() {
		return tax;
	}
	
	@JsonProperty("Tax")
	public void setTax(List<Tax> tax) {
		this.tax = tax;
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