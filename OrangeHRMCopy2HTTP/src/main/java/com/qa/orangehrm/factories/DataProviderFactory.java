package com.qa.orangehrm.factories;

import com.qa.orangehrm.config.ConfigProvider;

public class DataProviderFactory {

	
	public static ExcelProvider getExcel()
	{
		ExcelProvider excel=new ExcelProvider();
		
		return excel;
	}
	
	public static ConfigProvider getConfig()
	{
		ConfigProvider config=new ConfigProvider();
		
		return config;
	}
	
	
}
