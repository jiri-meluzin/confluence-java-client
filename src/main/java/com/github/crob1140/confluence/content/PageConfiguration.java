package com.github.crob1140.confluence.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageConfiguration {


    @JsonProperty
	private boolean isEnabled;
    @JsonProperty
	private boolean overrideSpaceNumbering;
    @JsonProperty
	private String numberFormatField;
    @JsonProperty
	private String startingNumberField;
    @JsonProperty
	private String startingHeadingField;
    @JsonProperty
	private String skipHeadingField;
    @JsonProperty
	private String customFormatFieldH1;
    @JsonProperty
	private String customFormatFieldH2;
    @JsonProperty
	private String customFormatFieldH3;
    @JsonProperty
	private String customFormatFieldH4;
    @JsonProperty
	private String customFormatFieldH5;
    @JsonProperty
	private String customFormatFieldH6;
    private PageConfiguration() {}
	private PageConfiguration(Builder builder) {
		this.isEnabled = builder.isEnabled;
		this.overrideSpaceNumbering = builder.overrideSpaceNumbering;
		this.numberFormatField = builder.numberFormatField;
		this.startingHeadingField = builder.startingHeadingField;
		this.startingNumberField = builder.startingNumberField;
		this.skipHeadingField = builder.skipHeadingField;
		this.customFormatFieldH1 = builder.customFormatFieldH1;
		this.customFormatFieldH2 = builder.customFormatFieldH2;
		this.customFormatFieldH3 = builder.customFormatFieldH3;
		this.customFormatFieldH4 = builder.customFormatFieldH4;
		this.customFormatFieldH5 = builder.customFormatFieldH5;
		this.customFormatFieldH6 = builder.customFormatFieldH6;
	}
	@JsonProperty("isEnabled")
	public boolean isEnabled() {
		return isEnabled;
	}
	public boolean isOverrideSpaceNumbering() {
		return overrideSpaceNumbering;
	}
	public String getNumberFormatField() {
		return numberFormatField;
	}
	public String getStartingNumberField() {
		return startingNumberField;
	}
	public String getStartingHeadingField() {
		return startingHeadingField;
	}
	public String getSkipHeadingField() {
		return skipHeadingField;
	}
	public String getCustomFormatFieldH1() {
		return customFormatFieldH1;
	}
	public String getCustomFormatFieldH2() {
		return customFormatFieldH2;
	}
	public String getCustomFormatFieldH3() {
		return customFormatFieldH3;
	}
	public String getCustomFormatFieldH4() {
		return customFormatFieldH4;
	}
	public String getCustomFormatFieldH5() {
		return customFormatFieldH5;
	}
	public String getCustomFormatFieldH6() {
		return customFormatFieldH6;
	}
	public static class Builder {

		private boolean isEnabled;
		private boolean overrideSpaceNumbering;
		private String numberFormatField;
		private String startingNumberField;
		private String startingHeadingField;
		private String skipHeadingField;
		private String customFormatFieldH1;
		private String customFormatFieldH2;
		private String customFormatFieldH3;
		private String customFormatFieldH4;
		private String customFormatFieldH5;
		private String customFormatFieldH6;
		public Builder setEnabled(boolean isEnabled) {
			this.isEnabled = isEnabled;
			return this;
		}
		public Builder setOverrideSpaceNumbering(boolean overrideSpaceNumbering) {
			this.overrideSpaceNumbering = overrideSpaceNumbering;
			return this;
		}
		public Builder setNumberFormatField(String numberFormatField) {
			this.numberFormatField = numberFormatField;
			return this;
		}
		public Builder setStartingNumberField(String startingNumberField) {
			this.startingNumberField = startingNumberField;
			return this;
		}
		public Builder setStartingHeadingField(String startingHeadingField) {
			this.startingHeadingField = startingHeadingField;
			return this;
		}
		public Builder setSkipHeadingField(String skipHeadingField) {
			this.skipHeadingField = skipHeadingField;
			return this;
		}
		public Builder setCustomFormatFieldH1(String customFormatFieldH1) {
			this.customFormatFieldH1 = customFormatFieldH1;
			return this;
		}
		public Builder setCustomFormatFieldH2(String customFormatFieldH2) {
			this.customFormatFieldH2 = customFormatFieldH2;
			return this;
		}
		public Builder setCustomFormatFieldH3(String customFormatFieldH3) {
			this.customFormatFieldH3 = customFormatFieldH3;
			return this;
		}
		public Builder setCustomFormatFieldH4(String customFormatFieldH4) {
			this.customFormatFieldH4 = customFormatFieldH4;
			return this;
		}
		public Builder setCustomFormatFieldH5(String customFormatFieldH5) {
			this.customFormatFieldH5 = customFormatFieldH5;
			return this;
		}
		public Builder setCustomFormatFieldH6(String customFormatFieldH6) {
			this.customFormatFieldH6 = customFormatFieldH6;
			return this;
		}
		public PageConfiguration build() {
			return new PageConfiguration(this);
		}
		
	}
}
