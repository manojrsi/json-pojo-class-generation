
package com.example.create_group.response;

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
    "Id",
    "Name",
    "Description",
    "GroupExpression",
    "Status",
    "LastUpdateUserId",
    "LastUpdateDateTime",
    "EstimatedMembers"
})
public class GroupDetail {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Id")
    private Integer id;
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
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LastUpdateUserId")
    private String lastUpdateUserId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LastUpdateDateTime")
    private String lastUpdateDateTime;
    @JsonProperty("EstimatedMembers")
    private Integer estimatedMembers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    public GroupDetail withId(Integer id) {
        this.id = id;
        return this;
    }

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

    public GroupDetail withName(String name) {
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

    public GroupDetail withDescription(String description) {
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

    public GroupDetail withGroupExpression(String groupExpression) {
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

    public GroupDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The lastUpdateUserId
     */
    @JsonProperty("LastUpdateUserId")
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * 
     * (Required)
     * 
     * @param lastUpdateUserId
     *     The LastUpdateUserId
     */
    @JsonProperty("LastUpdateUserId")
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public GroupDetail withLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The lastUpdateDateTime
     */
    @JsonProperty("LastUpdateDateTime")
    public String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param lastUpdateDateTime
     *     The LastUpdateDateTime
     */
    @JsonProperty("LastUpdateDateTime")
    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public GroupDetail withLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * 
     * @return
     *     The estimatedMembers
     */
    @JsonProperty("EstimatedMembers")
    public Integer getEstimatedMembers() {
        return estimatedMembers;
    }

    /**
     * 
     * @param estimatedMembers
     *     The EstimatedMembers
     */
    @JsonProperty("EstimatedMembers")
    public void setEstimatedMembers(Integer estimatedMembers) {
        this.estimatedMembers = estimatedMembers;
    }

    public GroupDetail withEstimatedMembers(Integer estimatedMembers) {
        this.estimatedMembers = estimatedMembers;
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

    public GroupDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(description).append(groupExpression).append(status).append(lastUpdateUserId).append(lastUpdateDateTime).append(estimatedMembers).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupDetail) == false) {
            return false;
        }
        GroupDetail rhs = ((GroupDetail) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(description, rhs.description).append(groupExpression, rhs.groupExpression).append(status, rhs.status).append(lastUpdateUserId, rhs.lastUpdateUserId).append(lastUpdateDateTime, rhs.lastUpdateDateTime).append(estimatedMembers, rhs.estimatedMembers).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
