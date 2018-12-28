
package com.example.unicast;

import java.util.HashMap;
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
 * Announcement Response
 * <p>
 * The status information returned from MMDDF application
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "mcastAddress",
    "mcastPort",
    "status"
})
public class AnnouncementResponse {

    /**
     * The name of the announcement which is be announced by MMDDF
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * The IP address used for the multicast of the broker document/software announcement
     * 
     */
    @JsonProperty("mcastAddress")
    @JsonPropertyDescription("")
    private String mcastAddress;
    /**
     * The port number used for the multicast of the broker document/ software announcement
     * 
     */
    @JsonProperty("mcastPort")
    @JsonPropertyDescription("")
    private Integer mcastPort;
    /**
     * The boolean value denotes the status of the given announcement returned from MMDDF
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Boolean status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The name of the announcement which is be announced by MMDDF
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the announcement which is be announced by MMDDF
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public AnnouncementResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The IP address used for the multicast of the broker document/software announcement
     * 
     * @return
     *     The mcastAddress
     */
    @JsonProperty("mcastAddress")
    public String getMcastAddress() {
        return mcastAddress;
    }

    /**
     * The IP address used for the multicast of the broker document/software announcement
     * 
     * @param mcastAddress
     *     The mcastAddress
     */
    @JsonProperty("mcastAddress")
    public void setMcastAddress(String mcastAddress) {
        this.mcastAddress = mcastAddress;
    }

    public AnnouncementResponse withMcastAddress(String mcastAddress) {
        this.mcastAddress = mcastAddress;
        return this;
    }

    /**
     * The port number used for the multicast of the broker document/ software announcement
     * 
     * @return
     *     The mcastPort
     */
    @JsonProperty("mcastPort")
    public Integer getMcastPort() {
        return mcastPort;
    }

    /**
     * The port number used for the multicast of the broker document/ software announcement
     * 
     * @param mcastPort
     *     The mcastPort
     */
    @JsonProperty("mcastPort")
    public void setMcastPort(Integer mcastPort) {
        this.mcastPort = mcastPort;
    }

    public AnnouncementResponse withMcastPort(Integer mcastPort) {
        this.mcastPort = mcastPort;
        return this;
    }

    /**
     * The boolean value denotes the status of the given announcement returned from MMDDF
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    /**
     * The boolean value denotes the status of the given announcement returned from MMDDF
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public AnnouncementResponse withStatus(Boolean status) {
        this.status = status;
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

    public AnnouncementResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(mcastAddress).append(mcastPort).append(status).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnnouncementResponse) == false) {
            return false;
        }
        AnnouncementResponse rhs = ((AnnouncementResponse) other);
        return new EqualsBuilder().append(name, rhs.name).append(mcastAddress, rhs.mcastAddress).append(mcastPort, rhs.mcastPort).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
