package org.TestcaseAPI;

import org.BaseSetup.IntialiseBase;
import org.ExcelReading.readExcel;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class TC_Get_Location extends IntialiseBase {
	
	String PackageName="org.TestcaseAPI";
	String ClassName="TC_Get_Location";
	@Test
	public void TC1_Maps() throws Exception
	{
		String MethodName=PackageName+ClassName+"TC_Get_Location";
		
		readExcel obj = new readExcel();
		String filepath="C:\\Users\\WZJS1251\\eclipse\\jee-photon\\eclipse\\Assign.xlsx";
	    
		
		String sheetName="ParamSheets_Maps";
		obj.excelReadParamBody(filepath,sheetName);
		
		
		
		System.out.println("In test Method");
		 RestAssured.baseURI = prop_config.getProperty("HostName") +prop_config.getProperty("resources");
		 httpRequest = RestAssured.given().param("location", "-33.8670522,151.1957362")
		.param("radius","1500").param("key","AIzaSyAfr4j2bjtOvYlN9edsaCamvHAIgzRxF4k");
		  
		  	response = httpRequest.request(Method.GET);
			String responseBody = response.getBody().asString();
			System.out.println("Response Body is =>  " + responseBody);
		 actual_status_code=response.statusCode();
	System.out.println(response.getStatusLine());

		Assert.assertEquals(actual_status_code,Status_Code_200,"Status code is not matching");
	System.out.println("indivual headers");	
	
		responseHeaders = response.headers();

		for(Header header : responseHeaders)
		{
		System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		
		}	
		
		System.out.println(response.header("Server"));
		
		
	
	 //JsonPath jsonPathEvaluator = response.jsonPath();
	 
	JsonPath jpe = response.jsonPath();
	
String city=	jpe.get("results[0].id");
	
	 System.out.println(city);

				 
		
	}
	
	
}
