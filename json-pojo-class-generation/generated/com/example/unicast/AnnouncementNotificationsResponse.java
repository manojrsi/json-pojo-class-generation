
package com.example.unicast;

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


/**
 * Announcement Notification Responses
 * <p>
 * The status informations returned from MMDDF application
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "responses"
})
public class AnnouncementNotificationsResponse {

    @JsonProperty("responses")
    private List<Object> responses = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The responses
     */
    @JsonProperty("responses")
    public List<Object> getResponses() {
        return responses;
    }

    /**
     * 
     * @param responses
     *     The responses
     */
    @JsonProperty("responses")
    public void setResponses(List<Object> responses) {
        this.responses = responses;
    }

    public AnnouncementNotificationsResponse withResponses(List<Object> responses) {
        this.responses = responses;
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

    public AnnouncementNotificationsResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responses).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnnouncementNotificationsResponse) == false) {
            return false;
        }
        AnnouncementNotificationsResponse rhs = ((AnnouncementNotificationsResponse) other);
        return new EqualsBuilder().append(responses, rhs.responses).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
