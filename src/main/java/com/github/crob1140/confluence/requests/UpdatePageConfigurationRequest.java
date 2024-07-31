package com.github.crob1140.confluence.requests;

import com.github.crob1140.confluence.content.ContentStatus;
import com.github.crob1140.confluence.content.PageConfiguration;
import com.github.crob1140.confluence.content.SortDirection;
import com.github.crob1140.confluence.content.StandardContentType;
import com.github.crob1140.confluence.content.expand.ExpandedContentProperties;

import jakarta.ws.rs.HttpMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * This class represents a request to get content from the Confluence Cloud server.
 */
public class UpdatePageConfigurationRequest extends ConfluenceRequest {
	

  private final String pageId;
  private final PageConfiguration pageConfiguration;
  private UpdatePageConfigurationRequest(Builder builder) {
	  this.pageId = builder.pageId;
	  this.pageConfiguration = builder.pageConfiguration;
  }

  /**
   * This method returns the path of the request relative to the Confluence wiki root.
   *
   * @return The path of the request relative to the Confluence wiki root.
   */
  @Override
  public String getRelativePath() {
    return "rest/numberedheadings/1.0/page-configuration/"+pageId;
  }

  /**
   * This method returns the HTTP method used by this request.
   */
  @Override
  public String getMethod() {
    return HttpMethod.PUT;
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
    return Optional.of(pageConfiguration);
  }

  /**
   * This method returns the class of the object in the body of the response for this request.
   *
   * @return The class of the object in the body of response for this request.
   */
  @Override
  public Class<?> getReturnType() {
    return PageConfiguration.class;
  }

  /**
   * This class can be used to construct an instance of {@link UpdatePageConfigurationRequest}.
   */
  public static final class Builder {

    private String pageId;
    private PageConfiguration pageConfiguration;
    public Builder setPageConfiguration(PageConfiguration pageConfiguration) {
		this.pageConfiguration = pageConfiguration;
		return this;
	}
    public Builder setPageId(String pageId) {
		this.pageId = pageId;
		return this;
	}
    public UpdatePageConfigurationRequest build() {
    	if (pageId == null) throw new IllegalArgumentException("PageId must not be null");
    	if (pageConfiguration == null) throw new IllegalArgumentException("PageConfiguration must not be null");
    	return new UpdatePageConfigurationRequest(this);
    }
  }
}
