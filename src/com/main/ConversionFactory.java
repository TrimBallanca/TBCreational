package com.tbcreational.main;

public class ConversionFactory {

	private static final ConversionFactory instance = new ConversionFactory();
	private ConversionFactory()
	{}
	
	public static ConversionFactory getInstance()
	{
		return instance;
	}
}
