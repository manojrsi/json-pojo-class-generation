
package com.example;

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
    "TriggerType",
    "MACAddress",
    "TriggerInfo"
})
public class UpdateEvent_ {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TriggerType")
    private String triggerType;
    @JsonProperty("MACAddress")
    private String mACAddress;
    @JsonProperty("TriggerInfo")
    private String triggerInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The triggerType
     */
    @JsonProperty("TriggerType")
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * 
     * (Required)
     * 
     * @param triggerType
     *     The TriggerType
     */
    @JsonProperty("TriggerType")
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public UpdateEvent_ withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 
     * @return
     *     The mACAddress
     */
    @JsonProperty("MACAddress")
    public String getMACAddress() {
        return mACAddress;
    }

    /**
     * 
     * @param mACAddress
     *     The MACAddress
     */
    @JsonProperty("MACAddress")
    public void setMACAddress(String mACAddress) {
        this.mACAddress = mACAddress;
    }

    public UpdateEvent_ withMACAddress(String mACAddress) {
        this.mACAddress = mACAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The triggerInfo
     */
    @JsonProperty("TriggerInfo")
    public String getTriggerInfo() {
        return triggerInfo;
    }

    /**
     * 
     * @param triggerInfo
     *     The TriggerInfo
     */
    @JsonProperty("TriggerInfo")
    public void setTriggerInfo(String triggerInfo) {
        this.triggerInfo = triggerInfo;
    }

    public UpdateEvent_ withTriggerInfo(String triggerInfo) {
        this.triggerInfo = triggerInfo;
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

    public UpdateEvent_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(triggerType).append(mACAddress).append(triggerInfo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdateEvent_) == false) {
            return false;
        }
        UpdateEvent_ rhs = ((UpdateEvent_) other);
        return new EqualsBuilder().append(triggerType, rhs.triggerType).append(mACAddress, rhs.mACAddress).append(triggerInfo, rhs.triggerInfo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
