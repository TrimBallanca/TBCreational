package com.tbcreational.tools;

public class OutputBuilderDirector {

    OutputFileBuilder builder;
    public OutputBuilderDirector() {
    }
    public OutputBuilderDirector(String inFilename, String inDelimiter,
            String outFilename, String outDelimiter, Boolean tagTypeConversion) {

        builder.setInFilename(inFilename).
                setOutFilename(outFilename).
                setInDelimiter(inDelimiter).
                setOutDelimiter(outDelimiter).
                build();
    }
    public void setInputFile(String inFilename, String inDelimiter, Boolean tagTypeConversion) {
        
    }

    public void setOutputFile(String outFilename, String outDelimiter,
            Boolean tagTypeConversion) {
        
    }

}
