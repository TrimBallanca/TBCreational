package com.tbcreational.files;

public class File {
	private String name;
	private String path;
	private String type;
	private String delimiter;
	private String tagstyle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDelimiter() {
		return delimiter;
	}
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	public String getTagstyle() {
		return tagstyle;
	}
	public void setTagstyle(String tagstyle) {
		this.tagstyle = tagstyle;
	}
}
