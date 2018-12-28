
package com.example.activate_group;

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
    "GroupId"
})
public class GroupIdList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GroupId")
    private List<Integer> groupId = new ArrayList<Integer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The groupId
     */
    @JsonProperty("GroupId")
    public List<Integer> getGroupId() {
        return groupId;
    }

    /**
     * 
     * (Required)
     * 
     * @param groupId
     *     The GroupId
     */
    @JsonProperty("GroupId")
    public void setGroupId(List<Integer> groupId) {
        this.groupId = groupId;
    }

    public GroupIdList withGroupId(List<Integer> groupId) {
        this.groupId = groupId;
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

    public GroupIdList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupIdList) == false) {
            return false;
        }
        GroupIdList rhs = ((GroupIdList) other);
        return new EqualsBuilder().append(groupId, rhs.groupId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
