package Org_Rest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicTest {

	@Test
	 public void GetWeatherDetails()
	 {   
	 // Specify the base URL to the RESTful web service
		
	 RestAssured.baseURI = "https://maps.googleapis.com/maps/api/place/nearbysearch/json";
	 System.out.println("IN Getweather");
	
	 // Get the RequestSpecification of the request that you want to sent
	 // to the server. The server is specified by the BaseURI that we have
	 // specified in the above step.
 RequestSpecification httpRequest = RestAssured.given().param("location", "-33.8670522,151.1957362")
	.param("radius","1500").
	param("key","AIzaSyAfr4j2bjtOvYlN9edsaCamvHAIgzRxF4k");
 	 
	// Make a request to the server by specifying the method Type and the method URL.
			// This will return the Response from the server. Store the response in a variable.
	Response response = httpRequest.request(Method.GET);
	


			// Now let us print the body of the message to see what response
			// we have recieved from the server
	//System.out.println(response.getBody());
	//System.out.println(response.body().asString());
	//io.restassured.internal.RestAssuredResponseImpl@3243b914
		String responseBody = response.getBody().asString();
		//	System.out.println("Response Body is =>  " + responseBody);
		int status_code=response.statusCode();
	System.out.println(response.getStatusLine());
	//response.get
	//	Assert.assertEquals(status_code, 200,"Status code is not matching");
	System.out.println("indivual headers");	
	
	// System.out.println("Server value: " + serverType);
	
String hty = response.header("Content-Type");
System.out.println("Content-type ->>  " +hty);
		

//Content-type ->>  application/json; charset=UTF-8


Headers allHeaders = response.headers();
		
		
		Headers allHeadersv2 = response.getHeaders();
		for(Header header : allHeaders)
		{
		System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		
		}	
		
		System.out.println(response.header("Server"));
		
	//allhHeaders.getName();
		
		System.out.println("==== Reading response====");
		System.out.println(response.body().asString());
		String res= response.body().asString();
		
	System.out.println(res.contains("Hyderabad"));
	
	 //JsonPath jsonPathEvaluator = response.jsonPath();
	 
	JsonPath jpe = response.jsonPath();
	
String city=	jpe.get("City");
	
	 System.out.println(city);
}
}
