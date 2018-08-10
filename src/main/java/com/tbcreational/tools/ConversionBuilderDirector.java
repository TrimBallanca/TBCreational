package com.tbcreational.tools;

public class ConversionBuilderDirector {

    ConversionBuilder builder;
    public ConversionBuilderDirector(String inFilename, String inDelimiter, 
    		String outFilename, String outDelimiter) {
    	//use conversion builder to create ConversionExecutor object
    	builder.setInFilename(inFilename);
    	builder.setInDelimter(inDelimiter);
    	builder.setOutFilename(outFilename);
    	builder.setOutDelimiter(outDelimiter);
    	
    }

}
