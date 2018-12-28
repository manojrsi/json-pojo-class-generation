
package com.example.get_group_definition_properties.response;

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
    "Property"
})
public class GroupProperties {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Property")
    private List<Property> property = new ArrayList<Property>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The property
     */
    @JsonProperty("Property")
    public List<Property> getProperty() {
        return property;
    }

    /**
     * 
     * (Required)
     * 
     * @param property
     *     The Property
     */
    @JsonProperty("Property")
    public void setProperty(List<Property> property) {
        this.property = property;
    }

    public GroupProperties withProperty(List<Property> property) {
        this.property = property;
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

    public GroupProperties withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(property).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupProperties) == false) {
            return false;
        }
        GroupProperties rhs = ((GroupProperties) other);
        return new EqualsBuilder().append(property, rhs.property).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
