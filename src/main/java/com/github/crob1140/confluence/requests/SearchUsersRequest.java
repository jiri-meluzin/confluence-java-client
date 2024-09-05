package com.github.crob1140.confluence.requests;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.github.crob1140.confluence.content.UserSearchResponse;

import jakarta.ws.rs.HttpMethod;

/**
 * This class represents a request to get content from the Confluence Cloud server.
 */
public class SearchUsersRequest extends ConfluenceRequest {

  private final Integer limit;
  private final Integer start;
  private final String username;
  
  private SearchUsersRequest(Builder builder) {
    limit = builder.limit;
    start = builder.start;
    username = builder.username;
  }

  /**
   * This method returns the path of the request relative to the Confluence wiki root.
   *
   * @return The path of the request relative to the Confluence wiki root.
   */
  @Override
  public String getRelativePath() {
    return "rest/api/search";
  }

  /**
   * This method returns the HTTP method used by this request.
   */
  @Override
  public String getMethod() {
    return HttpMethod.GET;
  }

  /**
   * This method returns the query parameters for this request.
   *
   * @return The query parameters for this request.
   */
  @Override
  public Map<String, String> getQueryParams() {
    Map<String, String> queryParams = new HashMap<>();

    if (this.limit != null) {
      queryParams.put("limit", Integer.toString(this.limit));
    }

   
    if (this.start != null) {
      queryParams.put("start", Integer.toString(this.start));
    }

    if (this.username != null) {
      queryParams.put("cql", "user=\""+this.username+"\"");
    }

    return queryParams;
  }

  /**
   * This method returns the entity that is sent in the body of the request.
   *
   * @return The entity that is sent in the body of the request.
   */
  @Override
  public Optional<Object> getBodyEntity() {
    return Optional.empty();
  }

  /**
   * This method returns the class of the object in the body of the response for this request.
   *
   * @return The class of the object in the body of response for this request.
   */
  @Override
  public Class<?> getReturnType() {
    return UserSearchResponse.class;
  }

  /**
   * This class can be used to construct an instance of {@link SearchUsersRequest}.
   */
  public static final class Builder {

    private Integer limit;
    private Integer start;
    private String username;

    /**
     * This method sets the maximum number of results for the request.
     *
     * @param limit the maximum number of results
     * @return This instance, for the purposes of method chaining.
     */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

   

    /**
     * This method sets the pagination start position for the request.
     *
     * @param start the pagination start position
     * @return This instance, for the purposes of method chaining.
     */
    public Builder setStartPosition(Integer start) {
      this.start = start;
      return this;
    }

    

   
    /**
     * This method sets the type of content to return. Only content with the given type will be
     * returned as results.
     *
     * @param username the type of results
     * @return This instance, for the purposes of method chaining.
     */
    public Builder setUsername(String username) {
      this.username = username;
      return this;
    }

   

    /**
     * This method creates an instance of {@link SearchUsersRequest} using the values that were set
     * on this instance.
     *
     * @return A new instance of {@link SearchUsersRequest} with the values set on this instance.
     */
    public SearchUsersRequest build() throws IllegalStateException {
      if (this.limit != null && this.limit <= 0) {
        throw new IllegalStateException("The limit must be a positive number");
      }

      if (this.start != null && this.start < 0) {
        throw new IllegalStateException("The start position must be a non-negative number");
      }

      return new SearchUsersRequest(this);
    }
  }
}
