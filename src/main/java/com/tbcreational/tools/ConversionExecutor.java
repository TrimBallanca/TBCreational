package com.tbcreational.tools;

import java.io.File;

import com.tbcreational.converters.CSVToTabConverter;
import com.tbcreational.converters.Converter;
import com.tbcreational.converters.TabToCSVConverter;

public class ConversionExecutor {
	String inFilename, outFilename;
	ConversionType type;
	Converter converter;

	public ConversionExecutor(String inFilename, String outFilename, ConversionType type) {
		this.inFilename = inFilename;
		this.outFilename = outFilename;
		File inFile = new File(inFilename);
		File outFile = new File(outFilename);
		switch(type) {
			case CSVToTab:
				converter = new CSVToTabConverter(inFile, outFile);
				break;
			case TabToCSV:
				converter = new TabToCSVConverter(); //this would be modified to reverse the parameters of CSVToTab
				break;
		default:
			break;
				
		}
	}
	
	public boolean convert() {
		return converter.convert();
	}
}
