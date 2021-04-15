package com.github.crob1140.confluence.content;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TinyMCEContent {

	@JsonProperty
	private String atlToken;
	@JsonProperty
	private String confRev;
	@JsonProperty
	private String editMode;
	@JsonProperty
	private String editorContent;
	@JsonProperty
	private Integer pageVersion;
	@JsonProperty
	private Permissions permissions;
	@JsonProperty
	private String syncRev;
	@JsonProperty
	private String syncRevSource;
	@JsonProperty
	private String title;
@SuppressWarnings("unused")
private TinyMCEContent() {
}
	public TinyMCEContent(Builder builder) {
		this.atlToken = builder.atlToken;
		this.confRev = builder.confRev;
		this.editMode = builder.editMode;
		this.editorContent = builder.editorContent;
		this.pageVersion = builder.pageVersion;
		this.permissions = builder.permissions;
		this.syncRev = builder.syncRev;
		this.syncRevSource = builder.syncRevSource;
		this.title = title;
	}

	public String getAtlToken() {
		return atlToken;
	}

	public String getConfRev() {
		return confRev;
	}

	public String getEditMode() {
		return editMode;
	}

	public String getEditorContent() {
		return editorContent;
	}

	public Integer getPageVersion() {
		return pageVersion;
	}

	public Permissions getPermissions() {
		return permissions;
	}

	public String getSyncRev() {
		return syncRev;
	}

	public String getSyncRevSource() {
		return syncRevSource;
	}

	public String getTitle() {
		return title;
	}

	public static class Builder {

		private String atlToken;
		private String confRev;
		private String editMode;
		private String editorContent;
		private Integer pageVersion;
		private Permissions permissions;
		private String syncRev;
		private String syncRevSource;
		private String title;

		public Builder setAtlToken(String atlToken) {
			this.atlToken = atlToken;
			return this;
		}

		public Builder setConfRev(String confRev) {
			this.confRev = confRev;
			return this;
		}

		public Builder setEditMode(String editMode) {
			this.editMode = editMode;
			return this;
		}

		public Builder setEditorContent(String editorContent) {
			this.editorContent = editorContent;
			return this;
		}

		public Builder setPageVersion(Integer pageVersion) {
			this.pageVersion = pageVersion;
			return this;
		}

		public Builder setPermissions(Permissions permissions) {
			this.permissions = permissions;
			return this;
		}

		public Builder setSyncRev(String syncRev) {
			this.syncRev = syncRev;
			return this;
		}

		public Builder setSyncRevSource(String syncRevSource) {
			this.syncRevSource = syncRevSource;
			return this;
		}
		
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}

		public TinyMCEContent build() {
			return new TinyMCEContent(this);
		}
	}

}
