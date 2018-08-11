package com.tbcreational.tools;

public class ConversionBuilderDirector {

    ConversionExecutor executor;

	public ConversionBuilderDirector(String inFilename, String outFilename, ConversionType conversionType) {
		ConversionBuilder builder = new ConversionBuilder();
		executor = builder.setInFilename(inFilename)
						  .setOutFilename(outFilename)
						  .setTagType(conversionType)
						  .build();
	}
	
	public boolean convert()
	{
		return executor.convert();
	}
}
