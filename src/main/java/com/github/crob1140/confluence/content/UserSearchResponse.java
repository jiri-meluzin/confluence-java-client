
package com.github.crob1140.confluence.content;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "results",
    "start",
    "limit",
    "size",
    "totalSize",
    "cqlQuery",
    "searchDuration",
    "_links"
})
@Generated("jsonschema2pojo")
public class UserSearchResponse {

    @JsonProperty("results")
    private List<Result> results = null;
    @JsonProperty("start")
    private int start;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("size")
    private int size;
    @JsonProperty("totalSize")
    private int totalSize;
    @JsonProperty("cqlQuery")
    private String cqlQuery;
    @JsonProperty("searchDuration")
    private int searchDuration;
    @JsonProperty("_links")
    private Links__1 links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public UserSearchResponse withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    @JsonProperty("start")
    public int getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(int start) {
        this.start = start;
    }

    public UserSearchResponse withStart(int start) {
        this.start = start;
        return this;
    }

    @JsonProperty("limit")
    public int getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public UserSearchResponse withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(int size) {
        this.size = size;
    }

    public UserSearchResponse withSize(int size) {
        this.size = size;
        return this;
    }

    @JsonProperty("totalSize")
    public int getTotalSize() {
        return totalSize;
    }

    @JsonProperty("totalSize")
    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public UserSearchResponse withTotalSize(int totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    @JsonProperty("cqlQuery")
    public String getCqlQuery() {
        return cqlQuery;
    }

    @JsonProperty("cqlQuery")
    public void setCqlQuery(String cqlQuery) {
        this.cqlQuery = cqlQuery;
    }

    public UserSearchResponse withCqlQuery(String cqlQuery) {
        this.cqlQuery = cqlQuery;
        return this;
    }

    @JsonProperty("searchDuration")
    public int getSearchDuration() {
        return searchDuration;
    }

    @JsonProperty("searchDuration")
    public void setSearchDuration(int searchDuration) {
        this.searchDuration = searchDuration;
    }

    public UserSearchResponse withSearchDuration(int searchDuration) {
        this.searchDuration = searchDuration;
        return this;
    }

    @JsonProperty("_links")
    public Links__1 getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links__1 links) {
        this.links = links;
    }

    public UserSearchResponse withLinks(Links__1 links) {
        this.links = links;
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

    public UserSearchResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
