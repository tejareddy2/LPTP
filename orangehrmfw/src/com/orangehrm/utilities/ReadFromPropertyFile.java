package com.orangehrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertyFile {
	
	private static Properties prop;

	public static void setUp() throws IOException{
		File file = new File("..\\orangehrmfw\\resources\\testdata\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
	}
	

	public static String readProperty(String key){
		return prop.getProperty(key);
		
	}

	
}
