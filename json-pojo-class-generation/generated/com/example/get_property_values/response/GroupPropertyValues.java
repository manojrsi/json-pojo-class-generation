
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
    "PropertyValues"
})
public class GroupPropertyValues {

    @JsonProperty("PropertyValues")
    private List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The propertyValues
     */
    @JsonProperty("PropertyValues")
    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * 
     * @param propertyValues
     *     The PropertyValues
     */
    @JsonProperty("PropertyValues")
    public void setPropertyValues(List<PropertyValue> propertyValues) {
        this.propertyValues = propertyValues;
    }

    public GroupPropertyValues withPropertyValues(List<PropertyValue> propertyValues) {
        this.propertyValues = propertyValues;
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

    public GroupPropertyValues withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(propertyValues).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupPropertyValues) == false) {
            return false;
        }
        GroupPropertyValues rhs = ((GroupPropertyValues) other);
        return new EqualsBuilder().append(propertyValues, rhs.propertyValues).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
