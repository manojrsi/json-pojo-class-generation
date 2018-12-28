
package com.example.cacheServer;

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
 * CacheServersResponse
 * <p>
 * The response against the CDN cache servers information udpated in UMDDF
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "status"
})
public class CacheServersResponse {

    /**
     * The status whether the UMDDF has been updated with provided CDN cache servers information or not
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("")
    private Boolean status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The status whether the UMDDF has been updated with provided CDN cache servers information or not
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    /**
     * The status whether the UMDDF has been updated with provided CDN cache servers information or not
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public CacheServersResponse withStatus(Boolean status) {
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

    public CacheServersResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CacheServersResponse) == false) {
            return false;
        }
        CacheServersResponse rhs = ((CacheServersResponse) other);
        return new EqualsBuilder().append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
