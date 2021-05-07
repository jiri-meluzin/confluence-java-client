package com.github.crob1140.confluence.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.github.crob1140.confluence.content.PageConfiguration;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageConfigurationResponse {
	@JsonProperty
	private PageConfiguration pageNumbering;
	@JsonProperty
	private PageConfiguration spaceNumbering;
	private PageConfigurationResponse() {}
	public PageConfiguration getPageNumbering() {
		return pageNumbering;
	}
	public PageConfiguration getSpaceNumbering() {
		return spaceNumbering;
	}
}
