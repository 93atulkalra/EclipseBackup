package org.qa.RestAPIBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

public class TestBaseClass {
	
	public static int RESPONSE_STATUS_CODE=200;
	
	public  Properties prop;
	
	@BeforeSuite
	public void setup() throws Exception {
	
		 prop = new Properties();
		 FileInputStream inp = new FileInputStream("C:\\Users\\WZJS1251\\eclipse-workspace\\OrgOMRest\\src\\main\\java\\org\\qa\\Config\\Config.properties");
		 prop.load(inp);
	System.out.println(prop.getProperty("URL"));
	} // Constructor ends
	
	
	
}
