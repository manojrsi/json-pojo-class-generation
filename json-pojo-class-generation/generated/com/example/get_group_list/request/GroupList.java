
package com.example.get_group_list.request;

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
    "Id",
    "Name",
    "Status"
})
public class GroupList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    public GroupList withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The Name
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public GroupList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     * @param status
     *     The Status
     */
    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    public GroupList withStatus(String status) {
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

    public GroupList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(status).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupList) == false) {
            return false;
        }
        GroupList rhs = ((GroupList) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
