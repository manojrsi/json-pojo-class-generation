
package com.example.announcements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Announcement
 * <p>
 * Announcement Details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "fileUrl",
    "type",
    "digest",
    "digestAlgorithm",
    "name",
    "version",
    "blockSize",
    "bandwidth",
    "mcastAddress",
    "mcastPort",
    "mdcBandwidth",
    "announcement"
})
public class Announcement {

    /**
     * The file path for the broker document to be announced
     * 
     */
    @JsonProperty("fileUrl")
    @JsonPropertyDescription("")
    private String fileUrl;
    /**
     * The value denotes the type of (0 = broker document, 1 = Software) announcement
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("")
    private Announcement.Type type;
    /**
     * The byte array of the digest of a broker document
     * 
     */
    @JsonProperty("digest")
    @JsonPropertyDescription("")
    private List<Object> digest = new ArrayList<Object>();
    /**
     * The Algorithm to be used for the digest
     * 
     */
    @JsonProperty("digestAlgorithm")
    @JsonPropertyDescription("")
    private String digestAlgorithm;
    /**
     * The name of the announcement
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * The version number of the document to be announced
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("")
    private String version;
    /**
     * The block size in which the document is to be announced
     * 
     */
    @JsonProperty("blockSize")
    @JsonPropertyDescription("")
    private Integer blockSize;
    @JsonProperty("bandwidth")
    private Integer bandwidth;
    /**
     * The IP address to be used for the multicast of the broker document/software announcement
     * 
     */
    @JsonProperty("mcastAddress")
    @JsonPropertyDescription("")
    private String mcastAddress;
    /**
     * The port number to be used for the multicast of the broker document/ software announcement
     * 
     */
    @JsonProperty("mcastPort")
    @JsonPropertyDescription("")
    private Integer mcastPort;
    /**
     * The MDC bandwidth required for the broker document announcment to download
     * 
     */
    @JsonProperty("mdcBandwidth")
    @JsonPropertyDescription("")
    private Integer mdcBandwidth;
    /**
     * The boolean value denotes whether applicable for multicast or not
     * 
     */
    @JsonProperty("announcement")
    @JsonPropertyDescription("")
    private Boolean announcement;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The file path for the broker document to be announced
     * 
     * @return
     *     The fileUrl
     */
    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * The file path for the broker document to be announced
     * 
     * @param fileUrl
     *     The fileUrl
     */
    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Announcement withFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * The value denotes the type of (0 = broker document, 1 = Software) announcement
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Announcement.Type getType() {
        return type;
    }

    /**
     * The value denotes the type of (0 = broker document, 1 = Software) announcement
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Announcement.Type type) {
        this.type = type;
    }

    public Announcement withType(Announcement.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The byte array of the digest of a broker document
     * 
     * @return
     *     The digest
     */
    @JsonProperty("digest")
    public List<Object> getDigest() {
        return digest;
    }

    /**
     * The byte array of the digest of a broker document
     * 
     * @param digest
     *     The digest
     */
    @JsonProperty("digest")
    public void setDigest(List<Object> digest) {
        this.digest = digest;
    }

    public Announcement withDigest(List<Object> digest) {
        this.digest = digest;
        return this;
    }

    /**
     * The Algorithm to be used for the digest
     * 
     * @return
     *     The digestAlgorithm
     */
    @JsonProperty("digestAlgorithm")
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    /**
     * The Algorithm to be used for the digest
     * 
     * @param digestAlgorithm
     *     The digestAlgorithm
     */
    @JsonProperty("digestAlgorithm")
    public void setDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }

    public Announcement withDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
        return this;
    }

    /**
     * The name of the announcement
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the announcement
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Announcement withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The version number of the document to be announced
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * The version number of the document to be announced
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Announcement withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * The block size in which the document is to be announced
     * 
     * @return
     *     The blockSize
     */
    @JsonProperty("blockSize")
    public Integer getBlockSize() {
        return blockSize;
    }

    /**
     * The block size in which the document is to be announced
     * 
     * @param blockSize
     *     The blockSize
     */
    @JsonProperty("blockSize")
    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    public Announcement withBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
        return this;
    }

    /**
     * 
     * @return
     *     The bandwidth
     */
    @JsonProperty("bandwidth")
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * 
     * @param bandwidth
     *     The bandwidth
     */
    @JsonProperty("bandwidth")
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Announcement withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * The IP address to be used for the multicast of the broker document/software announcement
     * 
     * @return
     *     The mcastAddress
     */
    @JsonProperty("mcastAddress")
    public String getMcastAddress() {
        return mcastAddress;
    }

    /**
     * The IP address to be used for the multicast of the broker document/software announcement
     * 
     * @param mcastAddress
     *     The mcastAddress
     */
    @JsonProperty("mcastAddress")
    public void setMcastAddress(String mcastAddress) {
        this.mcastAddress = mcastAddress;
    }

    public Announcement withMcastAddress(String mcastAddress) {
        this.mcastAddress = mcastAddress;
        return this;
    }

    /**
     * The port number to be used for the multicast of the broker document/ software announcement
     * 
     * @return
     *     The mcastPort
     */
    @JsonProperty("mcastPort")
    public Integer getMcastPort() {
        return mcastPort;
    }

    /**
     * The port number to be used for the multicast of the broker document/ software announcement
     * 
     * @param mcastPort
     *     The mcastPort
     */
    @JsonProperty("mcastPort")
    public void setMcastPort(Integer mcastPort) {
        this.mcastPort = mcastPort;
    }

    public Announcement withMcastPort(Integer mcastPort) {
        this.mcastPort = mcastPort;
        return this;
    }

    /**
     * The MDC bandwidth required for the broker document announcment to download
     * 
     * @return
     *     The mdcBandwidth
     */
    @JsonProperty("mdcBandwidth")
    public Integer getMdcBandwidth() {
        return mdcBandwidth;
    }

    /**
     * The MDC bandwidth required for the broker document announcment to download
     * 
     * @param mdcBandwidth
     *     The mdcBandwidth
     */
    @JsonProperty("mdcBandwidth")
    public void setMdcBandwidth(Integer mdcBandwidth) {
        this.mdcBandwidth = mdcBandwidth;
    }

    public Announcement withMdcBandwidth(Integer mdcBandwidth) {
        this.mdcBandwidth = mdcBandwidth;
        return this;
    }

    /**
     * The boolean value denotes whether applicable for multicast or not
     * 
     * @return
     *     The announcement
     */
    @JsonProperty("announcement")
    public Boolean getAnnouncement() {
        return announcement;
    }

    /**
     * The boolean value denotes whether applicable for multicast or not
     * 
     * @param announcement
     *     The announcement
     */
    @JsonProperty("announcement")
    public void setAnnouncement(Boolean announcement) {
        this.announcement = announcement;
    }

    public Announcement withAnnouncement(Boolean announcement) {
        this.announcement = announcement;
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

    public Announcement withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fileUrl).append(type).append(digest).append(digestAlgorithm).append(name).append(version).append(blockSize).append(bandwidth).append(mcastAddress).append(mcastPort).append(mdcBandwidth).append(announcement).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Announcement) == false) {
            return false;
        }
        Announcement rhs = ((Announcement) other);
        return new EqualsBuilder().append(fileUrl, rhs.fileUrl).append(type, rhs.type).append(digest, rhs.digest).append(digestAlgorithm, rhs.digestAlgorithm).append(name, rhs.name).append(version, rhs.version).append(blockSize, rhs.blockSize).append(bandwidth, rhs.bandwidth).append(mcastAddress, rhs.mcastAddress).append(mcastPort, rhs.mcastPort).append(mdcBandwidth, rhs.mdcBandwidth).append(announcement, rhs.announcement).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public enum Type {

        _0(0),
        _1(1);
        private final Integer value;
        private final static Map<Integer, Announcement.Type> CONSTANTS = new HashMap<Integer, Announcement.Type>();

        static {
            for (Announcement.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer value() {
            return this.value;
        }

        @JsonCreator
        public static Announcement.Type fromValue(Integer value) {
            Announcement.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
