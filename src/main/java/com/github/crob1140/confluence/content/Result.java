
package com.github.crob1140.confluence.content;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user",
    "title",
    "excerpt",
    "url",
    "entityType",
    "iconCssClass",
    "lastModified",
    "friendlyLastModified",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("user")
    private User user;
    @JsonProperty("title")
    private String title;
    @JsonProperty("excerpt")
    private String excerpt;
    @JsonProperty("url")
    private String url;
    @JsonProperty("entityType")
    private String entityType;
    @JsonProperty("iconCssClass")
    private String iconCssClass;
    @JsonProperty("lastModified")
    private String lastModified;
    @JsonProperty("friendlyLastModified")
    private String friendlyLastModified;
    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    public Result withUser(User user) {
        this.user = user;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Result withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("excerpt")
    public String getExcerpt() {
        return excerpt;
    }

    @JsonProperty("excerpt")
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Result withExcerpt(String excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Result withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Result withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("iconCssClass")
    public String getIconCssClass() {
        return iconCssClass;
    }

    @JsonProperty("iconCssClass")
    public void setIconCssClass(String iconCssClass) {
        this.iconCssClass = iconCssClass;
    }

    public Result withIconCssClass(String iconCssClass) {
        this.iconCssClass = iconCssClass;
        return this;
    }

    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Result withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    @JsonProperty("friendlyLastModified")
    public String getFriendlyLastModified() {
        return friendlyLastModified;
    }

    @JsonProperty("friendlyLastModified")
    public void setFriendlyLastModified(String friendlyLastModified) {
        this.friendlyLastModified = friendlyLastModified;
    }

    public Result withFriendlyLastModified(String friendlyLastModified) {
        this.friendlyLastModified = friendlyLastModified;
        return this;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Result withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
