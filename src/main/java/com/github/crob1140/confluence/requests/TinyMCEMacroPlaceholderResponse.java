package com.github.crob1140.confluence.requests;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "img")
public class TinyMCEMacroPlaceholderResponse {
	@XmlAttribute(name="class")
	private String htmlClass;
	@XmlAttribute
	private String src;
	@XmlAttribute(name="data-macro-name")
	private String dataMacroName;
	@XmlAttribute(name="data-macro-default-parameter")
	private String dataMacroDefaultParameter;
	@XmlAttribute(name="data-macro-schema-version")
	private String dataMacroSchemaVersion;
	public String getHtmlClass() {
		return htmlClass;
	}
	public void setHtmlClass(String htmlClass) {
		this.htmlClass = htmlClass;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDataMacroName() {
		return dataMacroName;
	}
	public void setDataMacroName(String dataMacroName) {
		this.dataMacroName = dataMacroName;
	}
	public String getDataMacroDefaultParameter() {
		return dataMacroDefaultParameter;
	}
	public void setDataMacroDefaultParameter(String dataMacroDefaultParameter) {
		this.dataMacroDefaultParameter = dataMacroDefaultParameter;
	}
	public String getDataMacroSchemaVersion() {
		return dataMacroSchemaVersion;
	}
	public void setDataMacroSchemaVersion(String dataMacroSchemaVersion) {
		this.dataMacroSchemaVersion = dataMacroSchemaVersion;
	}
}
