package Org_Rest;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.http.entity.ContentType;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestCode_GetRequest {
	Properties prop;
	
	
	@BeforeSuite
	public void propertyFileSetup() throws Exception
	{
		 prop = new Properties();
		 FileInputStream file = new FileInputStream("C:\\Users\\WZJS1251\\eclipse-workspace\\RestASsured\\src\\udemy\\Config\\config.properties");
		 prop.load(file);
		
	}
	
	
	@Test
public void Tc01_GetRequest()	throws Exception
 {
		
		RestAssured.baseURI = prop.getProperty("HostName")+"/"+prop.getProperty("Resourceurl_getplace");
		 		
	 RequestSpecification httpRequest = RestAssured.given().param("location", "-33.8670522,151.1957362")
		.param("radius","1500").
		param("key","AIzaSyAfr4j2bjtOvYlN9edsaCamvHAIgzRxF4k").log().all();
	 
		Response response = httpRequest.request(Method.GET);
		
		System.out.println(response.contentType());
		int status_code=response.statusCode();
		System.out.println("Status code of the request" +  status_code);
		
	//	System.out.println(response.getBody());
	
		//	System.out.println(response.body().asString());
		
	  String responseBody = response.getBody().asString();
			//System.out.println("Response Body is =>  " + responseBody);
			
		System.out.println(response.getStatusLine());
		
		
		
		
		
		//Assert.assertEquals(lat,33.5,"Not matching exoected");
		System.out.println("Headers as ==>>>");
		
		 System.out.print(response.header("Server"));
		 
		
//System.out.println(str);
		
		/*Headers allHeaders = response.headers();
		for(Header header : allHeaders)
		{
		System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		
		}
		*/
		 
String places;
			JsonPath jpe = response.jsonPath();
			 System.out.println("All the places are as follow");
			 int count = jpe.get("results.size()");
			 System.out.println(count);
			for(int i=0;i<count;i++)	
			 {
				places = jpe.get("results["+i+"].name");
				System.out.println((i+1)+ "place =>  "+ places);
			 }	
 
 }
}
