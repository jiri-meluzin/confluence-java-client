package com.github.crob1140.confluence.requests;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.ws.rs.HttpMethod;
import jakarta.ws.rs.core.MediaType;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class TinyMCEMacroPlaceholderRequest extends ConfluenceRequest {
	private Request request = new Request();
	@JsonInclude(Include.NON_NULL)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Request {
		@JsonProperty
		private String contentId;
		@JsonProperty
		private MacroInfo macro = new MacroInfo();
		public String getContentId() {
			return contentId;
		}
		public void setContentId(String contentId) {
			this.contentId = contentId;
		}
		public MacroInfo getMacro() {
			return macro;
		}
		public void setMacro(MacroInfo macro) {
			this.macro = macro;
		}
		public static class MacroInfo {
			@JsonProperty
			private String body;
			@JsonProperty
			private String defaultParameterValue;
			@JsonProperty
			private String name;
			@JsonProperty
			private Map<String, Object> params;
			public String getBody() {
				return body;
			}
			public void setBody(String body) {
				this.body = body;
			}
			public String getDefaultParameterValue() {
				return defaultParameterValue;
			}
			public void setDefaultParameterValue(String defaultParameterValue) {
				this.defaultParameterValue = defaultParameterValue;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Map<String, Object> getParams() {
				return params;
			}
			public void setParams(Map<String, Object> params) {
				this.params = params;
			}
		}
	}
	public Request getRequest() {
		return request;
	}
	@Override
	public String getRelativePath() {
		// TODO Auto-generated method stub
		return "/rest/tinymce/1/macro/placeholder";
	}
	@Override
	public String getMethod() {
		return HttpMethod.POST;
	}
	@Override
	public Map<String, String> getQueryParams() {
	    Map<String, String> queryParams = new HashMap<>();

	    return queryParams;
	}
	@Override
	public MediaType getContentType() {
		return MediaType.APPLICATION_JSON_TYPE;
	}
	@Override
	public MediaType getAcceptedResponseType() {
		return MediaType.TEXT_PLAIN_TYPE;
	}
	@Override
	public Optional<Object> getBodyEntity() {
		return Optional.of(this.request);
	}
	@Override
	public Class<?> getReturnType() {
		return TinyMCEMacroPlaceholderResponse.class;
	}
}
