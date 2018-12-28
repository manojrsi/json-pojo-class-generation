
package com.example.get_group_definition_properties.response;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Name",
    "Parent",
    "Position",
    "Type",
    "DisplayName"
})
public class Property {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Parent")
    private String parent;
    @JsonProperty("Position")
    private String position;
    @JsonProperty("Type")
    private Property.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DisplayName")
    private String displayName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Property withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The parent
     */
    @JsonProperty("Parent")
    public String getParent() {
        return parent;
    }

    /**
     * 
     * @param parent
     *     The Parent
     */
    @JsonProperty("Parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    public Property withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * 
     * @return
     *     The position
     */
    @JsonProperty("Position")
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The Position
     */
    @JsonProperty("Position")
    public void setPosition(String position) {
        this.position = position;
    }

    public Property withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("Type")
    public Property.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(Property.Type type) {
        this.type = type;
    }

    public Property withType(Property.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The displayName
     */
    @JsonProperty("DisplayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * (Required)
     * 
     * @param displayName
     *     The DisplayName
     */
    @JsonProperty("DisplayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Property withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public Property withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(parent).append(position).append(type).append(displayName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Property) == false) {
            return false;
        }
        Property rhs = ((Property) other);
        return new EqualsBuilder().append(name, rhs.name).append(parent, rhs.parent).append(position, rhs.position).append(type, rhs.type).append(displayName, rhs.displayName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum Type {

        LIST("List"),
        TEXT("Text");
        private final String value;
        private final static Map<String, Property.Type> CONSTANTS = new HashMap<String, Property.Type>();

        static {
            for (Property.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Property.Type fromValue(String value) {
            Property.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
