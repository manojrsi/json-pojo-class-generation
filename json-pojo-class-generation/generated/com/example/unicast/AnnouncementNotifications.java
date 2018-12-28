
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
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AnnouncementNotifications
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "announcements"
})
public class AnnouncementNotifications {

    /**
     * List of details of announcements
     * 
     */
    @JsonProperty("announcements")
    @JsonPropertyDescription("")
    private List<Object> announcements = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * List of details of announcements
     * 
     * @return
     *     The announcements
     */
    @JsonProperty("announcements")
    public List<Object> getAnnouncements() {
        return announcements;
    }

    /**
     * List of details of announcements
     * 
     * @param announcements
     *     The announcements
     */
    @JsonProperty("announcements")
    public void setAnnouncements(List<Object> announcements) {
        this.announcements = announcements;
    }

    public AnnouncementNotifications withAnnouncements(List<Object> announcements) {
        this.announcements = announcements;
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

    public AnnouncementNotifications withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(announcements).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnnouncementNotifications) == false) {
            return false;
        }
        AnnouncementNotifications rhs = ((AnnouncementNotifications) other);
        return new EqualsBuilder().append(announcements, rhs.announcements).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
