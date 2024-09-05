package com.github.crob1140.confluence.content;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Permissions {

	@JsonProperty
	private String viewPermissionsUsers;
	@JsonProperty
	private String viewPermissionsGroups;
	@JsonProperty
	private String editPermissionsGroups;
	@JsonProperty
	private String editPermissionsUsers;
	@SuppressWarnings("unused")
	private Permissions() {
	}
	public Permissions(Builder builder) {
		this.viewPermissionsUsers = builder.viewPermissionsUsers;
		this.viewPermissionsGroups = builder.viewPermissionsGroups;
		this.editPermissionsGroups = builder.editPermissionsGroups;
		this.editPermissionsUsers = builder.editPermissionsUsers;
	}
	public String getViewPermissionsUsers() {
		return viewPermissionsUsers;
	}
	public String getViewPermissionsGroups() {
		return viewPermissionsGroups;
	}
	public String getEditPermissionsGroups() {
		return editPermissionsGroups;
	}
	public String getEditPermissionsUsers() {
		return editPermissionsUsers;
	}
	public static class Builder {
		private String viewPermissionsUsers;
		private String viewPermissionsGroups;
		private String editPermissionsGroups;
		private String editPermissionsUsers;
		
		public Builder setViewPermissionsUsers(String viewPermissionsUsers) {
			this.viewPermissionsUsers = viewPermissionsUsers;
			return this;
		}

		public Builder setViewPermissionsGroups(String viewPermissionsGroups) {
			this.viewPermissionsGroups = viewPermissionsGroups;
			return this;
		}

		public Builder setEditPermissionsGroups(String editPermissionsGroups) {
			this.editPermissionsGroups = editPermissionsGroups;
			return this;
		}

		public Builder setEditPermissionsUsers(String editPermissionsUsers) {
			this.editPermissionsUsers = editPermissionsUsers;
			return this;
		}

		public Permissions build() {
			return new Permissions(this);
		}
		
	}
	

}
