package com.tbcreational.converters;

import java.io.File;

public abstract class Converter implements Cloneable {
	File fileToConvert;
	File outputFile;
	String inPattern;
	String outPattern;


	public void setInfile(File fileToConvert2) {
		this.fileToConvert = fileToConvert2;
	}
	public void setOutputFile(File outputFile2) {
		this.outputFile = outputFile2;
	}


	public void setInPattern(String inPattern) {
		this.inPattern = inPattern;
	}


	public void setOutPattern(String outPattern) {
		this.outPattern = outPattern;
	}
	
	public abstract boolean convert();
	
	
	public Converter clone() throws CloneNotSupportedException {
		return (Converter)super.clone();
	}
}
