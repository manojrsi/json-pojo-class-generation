
package com.example.common;

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
    "NoOfTargetSubscribers",
    "NoOfTargetSTBs"
})
public class GroupEstimate {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("NoOfTargetSubscribers")
    private Integer noOfTargetSubscribers;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("NoOfTargetSTBs")
    private Integer noOfTargetSTBs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The noOfTargetSubscribers
     */
    @JsonProperty("NoOfTargetSubscribers")
    public Integer getNoOfTargetSubscribers() {
        return noOfTargetSubscribers;
    }

    /**
     * 
     * (Required)
     * 
     * @param noOfTargetSubscribers
     *     The NoOfTargetSubscribers
     */
    @JsonProperty("NoOfTargetSubscribers")
    public void setNoOfTargetSubscribers(Integer noOfTargetSubscribers) {
        this.noOfTargetSubscribers = noOfTargetSubscribers;
    }

    public GroupEstimate withNoOfTargetSubscribers(Integer noOfTargetSubscribers) {
        this.noOfTargetSubscribers = noOfTargetSubscribers;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The noOfTargetSTBs
     */
    @JsonProperty("NoOfTargetSTBs")
    public Integer getNoOfTargetSTBs() {
        return noOfTargetSTBs;
    }

    /**
     * 
     * (Required)
     * 
     * @param noOfTargetSTBs
     *     The NoOfTargetSTBs
     */
    @JsonProperty("NoOfTargetSTBs")
    public void setNoOfTargetSTBs(Integer noOfTargetSTBs) {
        this.noOfTargetSTBs = noOfTargetSTBs;
    }

    public GroupEstimate withNoOfTargetSTBs(Integer noOfTargetSTBs) {
        this.noOfTargetSTBs = noOfTargetSTBs;
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

    public GroupEstimate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(noOfTargetSubscribers).append(noOfTargetSTBs).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupEstimate) == false) {
            return false;
        }
        GroupEstimate rhs = ((GroupEstimate) other);
        return new EqualsBuilder().append(noOfTargetSubscribers, rhs.noOfTargetSubscribers).append(noOfTargetSTBs, rhs.noOfTargetSTBs).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
