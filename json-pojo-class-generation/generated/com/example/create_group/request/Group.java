
package com.example.create_group.request;

import java.util.HashMap;
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
    "Description",
    "GroupExpression",
    "Status"
})
public class Group {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GroupExpression")
    private String groupExpression;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Status")
    private String status;
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

    public Group withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Group withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The groupExpression
     */
    @JsonProperty("GroupExpression")
    public String getGroupExpression() {
        return groupExpression;
    }

    /**
     * 
     * (Required)
     * 
     * @param groupExpression
     *     The GroupExpression
     */
    @JsonProperty("GroupExpression")
    public void setGroupExpression(String groupExpression) {
        this.groupExpression = groupExpression;
    }

    public Group withGroupExpression(String groupExpression) {
        this.groupExpression = groupExpression;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     * @param status
     *     The Status
     */
    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Group withStatus(String status) {
        this.status = status;
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

    public Group withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(groupExpression).append(status).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group) == false) {
            return false;
        }
        Group rhs = ((Group) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(groupExpression, rhs.groupExpression).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
