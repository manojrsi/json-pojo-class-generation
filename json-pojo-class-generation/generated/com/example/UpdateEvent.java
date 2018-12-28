
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
    "UpdateEvent"
})
public class UpdateEvent {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("UpdateEvent")
    private UpdateEvent_ updateEvent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The updateEvent
     */
    @JsonProperty("UpdateEvent")
    public UpdateEvent_ getUpdateEvent() {
        return updateEvent;
    }

    /**
     * 
     * (Required)
     * 
     * @param updateEvent
     *     The UpdateEvent
     */
    @JsonProperty("UpdateEvent")
    public void setUpdateEvent(UpdateEvent_ updateEvent) {
        this.updateEvent = updateEvent;
    }

    public UpdateEvent withUpdateEvent(UpdateEvent_ updateEvent) {
        this.updateEvent = updateEvent;
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

    public UpdateEvent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(updateEvent).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdateEvent) == false) {
            return false;
        }
        UpdateEvent rhs = ((UpdateEvent) other);
        return new EqualsBuilder().append(updateEvent, rhs.updateEvent).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
