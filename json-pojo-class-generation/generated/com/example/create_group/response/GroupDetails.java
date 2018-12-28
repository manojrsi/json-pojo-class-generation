
package com.example.create_group.response;

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
    "GroupDetails"
})
public class GroupDetails {

    @JsonProperty("GroupDetails")
    private List<GroupDetail> groupDetails = new ArrayList<GroupDetail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The groupDetails
     */
    @JsonProperty("GroupDetails")
    public List<GroupDetail> getGroupDetails() {
        return groupDetails;
    }

    /**
     * 
     * @param groupDetails
     *     The GroupDetails
     */
    @JsonProperty("GroupDetails")
    public void setGroupDetails(List<GroupDetail> groupDetails) {
        this.groupDetails = groupDetails;
    }

    public GroupDetails withGroupDetails(List<GroupDetail> groupDetails) {
        this.groupDetails = groupDetails;
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

    public GroupDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupDetails) == false) {
            return false;
        }
        GroupDetails rhs = ((GroupDetails) other);
        return new EqualsBuilder().append(groupDetails, rhs.groupDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
