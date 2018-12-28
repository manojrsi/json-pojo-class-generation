
package com.example.get_associated_applications.response;

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
    "AssociatedApplication"
})
public class GroupAssociatedApplications {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AssociatedApplication")
    private List<String> associatedApplication = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The associatedApplication
     */
    @JsonProperty("AssociatedApplication")
    public List<String> getAssociatedApplication() {
        return associatedApplication;
    }

    /**
     * 
     * (Required)
     * 
     * @param associatedApplication
     *     The AssociatedApplication
     */
    @JsonProperty("AssociatedApplication")
    public void setAssociatedApplication(List<String> associatedApplication) {
        this.associatedApplication = associatedApplication;
    }

    public GroupAssociatedApplications withAssociatedApplication(List<String> associatedApplication) {
        this.associatedApplication = associatedApplication;
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

    public GroupAssociatedApplications withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(associatedApplication).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupAssociatedApplications) == false) {
            return false;
        }
        GroupAssociatedApplications rhs = ((GroupAssociatedApplications) other);
        return new EqualsBuilder().append(associatedApplication, rhs.associatedApplication).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
