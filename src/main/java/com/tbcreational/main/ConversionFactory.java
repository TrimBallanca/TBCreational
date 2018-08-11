package com.tbcreational.main;

import com.tbcreational.tools.ConversionBuilderDirector;
import com.tbcreational.tools.ConversionType;

public class ConversionFactory {

	//enforce singleton pattern
	private static final ConversionFactory instance = new ConversionFactory();
	private ConversionFactory()
	{}
	
	public static ConversionFactory getInstance()
	{
		return instance;
	}

	public boolean convert(String inFilename, String outFilename, ConversionType conversionType) {
		
		ConversionBuilderDirector director = new ConversionBuilderDirector(
				inFilename, outFilename, conversionType);
		//pass the conversion information to the builder director
		//builder director will use the builder pattern to create a conversion executor
		
		//execute the conversion
		return director.convert();
		
	}
}
