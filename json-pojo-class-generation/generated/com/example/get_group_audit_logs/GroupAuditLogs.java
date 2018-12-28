
package com.example.get_group_audit_logs;

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
    "AuditLogs"
})
public class GroupAuditLogs {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AuditLogs")
    private List<AuditLog> auditLogs = new ArrayList<AuditLog>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The auditLogs
     */
    @JsonProperty("AuditLogs")
    public List<AuditLog> getAuditLogs() {
        return auditLogs;
    }

    /**
     * 
     * (Required)
     * 
     * @param auditLogs
     *     The AuditLogs
     */
    @JsonProperty("AuditLogs")
    public void setAuditLogs(List<AuditLog> auditLogs) {
        this.auditLogs = auditLogs;
    }

    public GroupAuditLogs withAuditLogs(List<AuditLog> auditLogs) {
        this.auditLogs = auditLogs;
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

    public GroupAuditLogs withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(auditLogs).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupAuditLogs) == false) {
            return false;
        }
        GroupAuditLogs rhs = ((GroupAuditLogs) other);
        return new EqualsBuilder().append(auditLogs, rhs.auditLogs).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
