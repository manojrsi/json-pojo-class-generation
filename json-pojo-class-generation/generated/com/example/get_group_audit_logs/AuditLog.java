
package com.example.get_group_audit_logs;

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
    "Action",
    "Id",
    "Name",
    "Description",
    "GroupExpression",
    "Status",
    "LastUpdateUserId",
    "LastUpdateDateTime"
})
public class AuditLog {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Action")
    private String action;
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
    /**
     * 
     * (Required)
     * 
     */
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The action
     */
    @JsonProperty("Action")
    public String getAction() {
        return action;
    }

    /**
     * 
     * (Required)
     * 
     * @param action
     *     The Action
     */
    @JsonProperty("Action")
    public void setAction(String action) {
        this.action = action;
    }

    public AuditLog withAction(String action) {
        this.action = action;
        return this;
    }

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

    public AuditLog withId(Integer id) {
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

    public AuditLog withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
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
     * (Required)
     * 
     * @param description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AuditLog withDescription(String description) {
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

    public AuditLog withGroupExpression(String groupExpression) {
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

    public AuditLog withStatus(String status) {
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

    public AuditLog withLastUpdateUserId(String lastUpdateUserId) {
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

    public AuditLog withLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
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

    public AuditLog withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(action).append(id).append(name).append(description).append(groupExpression).append(status).append(lastUpdateUserId).append(lastUpdateDateTime).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuditLog) == false) {
            return false;
        }
        AuditLog rhs = ((AuditLog) other);
        return new EqualsBuilder().append(action, rhs.action).append(id, rhs.id).append(name, rhs.name).append(description, rhs.description).append(groupExpression, rhs.groupExpression).append(status, rhs.status).append(lastUpdateUserId, rhs.lastUpdateUserId).append(lastUpdateDateTime, rhs.lastUpdateDateTime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
