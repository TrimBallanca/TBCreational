package com.tbcreational.tools;

import com.tbcreational.files.DelimiterFile;
import com.tbcreational.files.File;

public class OutputFileBuilder {
	String inFilename, outFilename, inDelimiter, outDelimiter;
	
    public void build(){
        
    }
    public OutputFileBuilder setInFilename(String inFilename) {
        this.inFilename = inFilename;
        return this;
    }
    public OutputFileBuilder setOutFilename(String outFilename) {
        this.outFilename = outFilename;
        return this;
    }
    public OutputFileBuilder setInDelimiter(String inDelimiter) {
        this.inDelimiter = inDelimiter;
        return this;
    }
    public OutputFileBuilder setOutDelimiter(String outDelimiter) {
        this.outDelimiter = outDelimiter;
        return this;
    }
}
