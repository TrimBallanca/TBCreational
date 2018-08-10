package com.tbcreational.main;

import com.tbcreational.tools.ConversionBuilderDirector;

public class ConversionFactory {

	//enforce singleton pattern
	private static final ConversionFactory instance = new ConversionFactory();
	private ConversionFactory()
	{}
	
	public static ConversionFactory getInstance()
	{
		return instance;
	}
	public void createConversion(String inFilename, String inDelimiter,
			String outFilename, String outDelimiter) {
		
		ConversionBuilderDirector directory = new ConversionBuilderDirector(
				inFilename, inDelimiter, outFilename, outDelimiter);
		//pass the conversion information to the builder director
		//builder director will use the builder pattern to create a conversion executor
	}
}
