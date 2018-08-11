package com.tbcreational.tools;

public class ConversionBuilder {
	String inFilename, outFilename;
	ConversionType type;
	
	public ConversionBuilder() {
	}
	public ConversionBuilder setInFilename(String inFilename2) {
		inFilename = inFilename2;
		return this;
	}
	public ConversionBuilder setOutFilename(String outFilename2) {
		outFilename = outFilename2;
		return this;
	}
	public ConversionBuilder setTagType(ConversionType type2) {
		type = type2;
		return this;
	}
	
	public ConversionExecutor build() {
		return new ConversionExecutor(inFilename, outFilename, type);
	}
}
