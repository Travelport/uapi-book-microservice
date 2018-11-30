package com.travelport.refimpl.air.book.models.request;

import java.util.HashMap;
import java.util.List;
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
    "@type",
    "id",
    "BrandRef",
    "name",
    "tier",
    "Identifier",
    "BrandAttribute"
})
public class Brand {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("BrandRef")
    private String brandRef;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tier")
    private Integer tier;
    @JsonProperty("Identifier")
    private Identifier identifier;
    @JsonProperty("BrandAttribute")
    private List<BrandAttribute> brandAttribute = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Brand() {
    }

    /**
     * 
     * @param id
     * @param brandRef
     * @param brandAttribute
     * @param name
     * @param tier
     * @param type
     * @param identifier
     */
    public Brand(String type, String id, String brandRef, String name, Integer tier, Identifier identifier, List<BrandAttribute> brandAttribute) {
        super();
        this.type = type;
        this.id = id;
        this.brandRef = brandRef;
        this.name = name;
        this.tier = tier;
        this.identifier = identifier;
        this.brandAttribute = brandAttribute;
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

    @JsonProperty("BrandRef")
    public String getBrandRef() {
        return brandRef;
    }

    @JsonProperty("BrandRef")
    public void setBrandRef(String brandRef) {
        this.brandRef = brandRef;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tier")
    public Integer getTier() {
        return tier;
    }

    @JsonProperty("tier")
    public void setTier(Integer tier) {
        this.tier = tier;
    }

    @JsonProperty("Identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    @JsonProperty("Identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("BrandAttribute")
    public List<BrandAttribute> getBrandAttribute() {
        return brandAttribute;
    }

    @JsonProperty("BrandAttribute")
    public void setBrandAttribute(List<BrandAttribute> brandAttribute) {
        this.brandAttribute = brandAttribute;
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
