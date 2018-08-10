package com.tbcreational.main;

import com.tbcreational.tools.OutputBuilderDirector;

public class ConversionFactory {

	private static final ConversionFactory instance = new ConversionFactory();
	private ConversionFactory()
	{}
	
	public static ConversionFactory getInstance()
	{
		return instance;
	}

    public OutputBuilderDirector getFileBuilderDirector(
            String inFilename, String inDelimiter, String outFilename,
            String outDelimiter, Boolean tagTypeConversion) {
        OutputBuilderDirector director = new OutputBuilderDirector();
        
        director.setInputFile(inFilename, inDelimiter,tagTypeConversion);
        director.setOutputFile(outFilename, outDelimiter,tagTypeConversion);
        return director;
    }
}
