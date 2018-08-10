package com.tbcreational.files;

/*
 * Prototype class for different file conversions 
 */
public class FileConversionObj implements Cloneable{
	private String name; /* name of file */
	private String path; /* path to file */
	private String delimiter; /* set this as the delimited (string allows for multicharacter delimiters) */
	private boolean tagstyle; /* use this field for tag-style conversions*/
	
	
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
	public String getDelimiter() {
		return delimiter;
	}
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	public boolean getTagstyle() {
		return tagstyle;
	}
	public void setTagstyle(boolean tagstyle) {
		this.tagstyle = tagstyle;
	}
	
	@Override
	public FileConversionObj clone() {
		try {
			return (FileConversionObj) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			//clone didn't work
			return this;
		}
	}
}
