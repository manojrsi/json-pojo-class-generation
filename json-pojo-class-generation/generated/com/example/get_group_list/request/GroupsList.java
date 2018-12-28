
package com.example.get_group_list.request;

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
    "GroupList"
})
public class GroupsList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GroupList")
    private List<GroupList> groupList = new ArrayList<GroupList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The groupList
     */
    @JsonProperty("GroupList")
    public List<GroupList> getGroupList() {
        return groupList;
    }

    /**
     * 
     * (Required)
     * 
     * @param groupList
     *     The GroupList
     */
    @JsonProperty("GroupList")
    public void setGroupList(List<GroupList> groupList) {
        this.groupList = groupList;
    }

    public GroupsList withGroupList(List<GroupList> groupList) {
        this.groupList = groupList;
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

    public GroupsList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupList).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupsList) == false) {
            return false;
        }
        GroupsList rhs = ((GroupsList) other);
        return new EqualsBuilder().append(groupList, rhs.groupList).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
