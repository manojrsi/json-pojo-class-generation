
package com.example.cacheServer;

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
 * CacheServers
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "cacheServers"
})
public class CacheServers {

    /**
     * A list of addresses of cache servers
     * 
     */
    @JsonProperty("cacheServers")
    @JsonPropertyDescription("")
    private List<String> cacheServers = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A list of addresses of cache servers
     * 
     * @return
     *     The cacheServers
     */
    @JsonProperty("cacheServers")
    public List<String> getCacheServers() {
        return cacheServers;
    }

    /**
     * A list of addresses of cache servers
     * 
     * @param cacheServers
     *     The cacheServers
     */
    @JsonProperty("cacheServers")
    public void setCacheServers(List<String> cacheServers) {
        this.cacheServers = cacheServers;
    }

    public CacheServers withCacheServers(List<String> cacheServers) {
        this.cacheServers = cacheServers;
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

    public CacheServers withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cacheServers).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CacheServers) == false) {
            return false;
        }
        CacheServers rhs = ((CacheServers) other);
        return new EqualsBuilder().append(cacheServers, rhs.cacheServers).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
