package com.tbcreational.tools;

public class ConversionBuilder {
	String inFilename, outFilename, inDelimiter, outDelimiter;
	boolean tagTypeConversion=false;
	public ConversionBuilder setInFilename(String inFilename2) {
		inFilename = inFilename2;
		return this;
	}
	public ConversionBuilder setInDelimter(String inDelimiter2) {
		inDelimiter = inDelimiter2;
		return this;
	}
	public ConversionBuilder setOutFilename(String outFilename2) {
		outFilename = outFilename;
		return this;
	}
	public ConversionBuilder setOutDelimiter(String outDelimiter2) {
		outDelimiter = outDelimiter2;
		return this;
	}
	
	public ConversionExecutor build() {
		return 
	}
	
}
