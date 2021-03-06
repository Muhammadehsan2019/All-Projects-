package org.automation.testingworld.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public static Object fetchPropertyValue(String key) throws IOException {
		//open the config.properties file in the Config folder
		FileInputStream file = new FileInputStream("./Config/config.properties");

		//properties class
	Properties property = new Properties();
	//load the file
	property.load(file);
	return property.get(key);

	}

	
	
	public static String fetchLocatorValue(String key) throws IOException {
		//open the config.properties file in the Config folder
		FileInputStream file = new FileInputStream("./Config/Elements.properties");

		//properties class
	Properties property = new Properties();
	//load the file
	property.load(file);
	
	//return it as a string
	return property.get(key).toString();

	}
	
}
