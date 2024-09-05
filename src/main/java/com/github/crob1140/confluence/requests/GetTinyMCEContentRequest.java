package com.github.crob1140.confluence.requests;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.github.crob1140.confluence.content.TinyMCEContent;

import jakarta.ws.rs.HttpMethod;
import jakarta.ws.rs.core.MediaType;

/**
 * This class represents a request to get content from the Confluence Cloud server.
 */
public class GetTinyMCEContentRequest extends ConfluenceRequest {

  // Query params
  private final String id;

  private GetTinyMCEContentRequest(Builder builder) {
    id = builder.id;
  }

  @Override
	public MediaType getContentType() {
		return MediaType.TEXT_PLAIN_TYPE;
	}
  /**
   * This method returns the path of the request relative to the Confluence wiki root.
   *
   * @return The path of the request relative to the Confluence wiki root.
   */
  @Override
  public String getRelativePath() {
    return "rest/tinymce/1/content/"+id+".json";
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
    return TinyMCEContent.class;
  }

  /**
   * This class can be used to construct an instance of {@link GetTinyMCEContentRequest}.
   */
  public static final class Builder {

    private String id;
    
    public Builder setId(String id) {
		this.id = id;
		return this;
	}

    public GetTinyMCEContentRequest build() throws IllegalStateException {
      if (this.id == null || this.id.trim().length() == 0) {
        throw new IllegalStateException("The ID must be a non-empty string");
      }
      return new GetTinyMCEContentRequest(this);
    }
  }
}
