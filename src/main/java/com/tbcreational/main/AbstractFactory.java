package com.tbcreational.main;

import com.tbcreational.tools.ConversionBuilderDirector;
import com.tbcreational.tools.ConversionType;

public abstract class AbstractFactory {
	public abstract ConversionBuilderDirector getConverter(String inFilename, String outFilename, ConversionType conversionType);
}
