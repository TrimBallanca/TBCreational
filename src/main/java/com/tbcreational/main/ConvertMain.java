package com.tbcreational.main;

import com.tbcreational.tools.ConversionType;

public class ConvertMain {

	public static void main(String[] args)
	{
		String inFilename = "C:/Users/trim/test.txt"; //set this to the source file
		String outFilename = "C:/Users/trim/test_converted.txt"; //set this to the output file
		//ensure read/write privileges are correct on both the source and output files
		ConversionType conversionType = ConversionType.CSVToTab;
		
		ConversionFactory factory = ConversionFactory.getInstance();
		
		
		//Here, the factory will create all the supporting builder and prototypical clone
		//to perform the conversion
		
		
		
		//Weird design choice here to have everything done through the factory and to also have
		//it be a singleton, but the requirements state as such
		
		if(factory.convert(inFilename, outFilename, conversionType)) {
			System.out.println("Conversion successful!");
		}
		else {
			System.out.println("Conversion failed! :(");
		}

	}
}
