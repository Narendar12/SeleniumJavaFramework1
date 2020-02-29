package com.automation.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {
	
	public Properties getProperty() throws Exception
	{
	FileInputStream inputStream = null;
	Properties properties = new Properties();
	
	try	{
		properties.load(new FileInputStream("F:/eclipse-workspace/SelCucumberBDDFramework/src/test/resources/browser-config.properties"));
	} catch( Exception e){
		System.out.println("the exception is:" + e);
		e.getStackTrace();		
	}
	return properties;
	
	}
	
}
