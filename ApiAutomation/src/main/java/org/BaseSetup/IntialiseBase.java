package org.BaseSetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class IntialiseBase {
	
	 public RequestSpecification httpRequest;
	 public Response response;
	 public String responseBody;
  	 public static int Status_Code_200=200;
  	 public static int Status_Code_401=401;
  	 public static int Status_Code_201=201;
	 public int actual_status_code;
	 public Headers responseHeaders;
	 public Properties prop_config;
	 public File file;
	 public FileInputStream fileInputStream;
	 
	 @BeforeSuite
	 public void beforeSetup() throws IOException
	 	{
		 
		 System.out.println("In Before Suite Method");
		 prop_config = new Properties();
		 fileInputStream = new FileInputStream("C:\\Users\\WZJS1251\\eclipse-workspace\\ApiAutomation\\src\\main\\java\\org\\config\\Configurations.properties");
		 prop_config.load(fileInputStream);
		 prop_config.getProperty("HostName");
		 
		 
	 	}
	 
	 
	 
	
}
