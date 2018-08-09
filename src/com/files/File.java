package com.tbcreational.files;

/*
 * Prototype class for different file conversions 
 */
public class File {
	private String name; /* name of file */
	private String path; /* path to file */
	private String type; /* filetype (extension string) */
	private String delimiter; /* set this as the delimited (string allows for multicharacter delimiters) */
	private String tagstyle; /* use this field for tag-style conversions*/
	
	
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
