
package com.example.get_property_values.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Name",
    "Values"
})
public class PropertyValue {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Values")
    private List<String> values = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The Name
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public PropertyValue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The values
     */
    @JsonProperty("Values")
    public List<String> getValues() {
        return values;
    }

    /**
     * 
     * (Required)
     * 
     * @param values
     *     The Values
     */
    @JsonProperty("Values")
    public void setValues(List<String> values) {
        this.values = values;
    }

    public PropertyValue withValues(List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PropertyValue withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(values).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PropertyValue) == false) {
            return false;
        }
        PropertyValue rhs = ((PropertyValue) other);
        return new EqualsBuilder().append(name, rhs.name).append(values, rhs.values).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
