package com.tbcreational.main;

import com.tbcreational.tools.OutputBuilderDirector;


public class ConvertMain {
	/*

Due 8/9/18

Your job is to use creational patterns to solve a common problem - file conversion.

Your design should be as abstract as possible, but include at least ONE concrete implementation.

What that means - your design should be set up such that we could accomodate ANY file conversion that we wish, but you only need to implement
a single file conversion.

What is an appropriate file conversion?

Some delimited file to a file of another delimiter.

Convert XML to HTML

Convert common Python 2.7 functionality to Python 3

To do this you will design a system using creational patterns.

You should use a Factory to control the parts of the conversion.

You should use a builder to perform the conversion.

You should use a prototype to set up a way to perform multiple conversions - that is if I am converting to CSV, what is the best way
to switch to convert to tab delimited?

You should use a Singleton to control the instantiation of the Factory that will produce your environment.

You will submit the following:

1) An Object diagram that outlines how your system works and how the pieces coordinate with each other
2) A zip file containing your programmed code as well as a driver of some sort to prove that it works (make sure you have appropriate input).
3) A small paragraph about the design choices you made and the challenges.

Please submit your assignment to lynne9@students.rowan.edu


ConversionFactory - singleton factory that produces builder objects and prototypical objects for conversion
OutputBuilder - builder


*/

	public static void main(String[] args)
	{
		System.out.println("Testing the package");
		String inFilename = "C:/test.txt";
		String inDelimiter = ",";
		String outFilename = "C:/output.txt";
		String outDelimiter = ";";
		Boolean tagTypeConversion = false; //used to handle conversions of tags
		                                   //builders must be updated to include passing of this parameter

		ConversionFactory factory = ConversionFactory.getInstance();
		
		OutputBuilderDirector director = factory.getFileBuilderDirector(inFilename, inDelimiter,
		        outFilename, outDelimiter, tagTypeConversion);
		
		
		
		//director.performConversion();
		
		

	}
}
