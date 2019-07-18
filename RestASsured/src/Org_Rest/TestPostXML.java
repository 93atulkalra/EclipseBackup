package Org_Rest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import udemy.Config.PostPlaceAddData;

public class TestPostXML {

	public static String GeneraFromResurce(String Path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(Path)));
		
		
	}
	
	@Test
	public void Test02XMLFromFile() throws IOException
	{
		
		RestAssured.baseURI = "http://216.10.245.166/maps/api/place/add/xml";
		RequestSpecification httpRequest = RestAssured.given().
				 queryParam("key","qaclick123");
		
		
String request = GeneraFromResurce("C:\\Users\\WZJS1251\\eclipse-workspace\\RestASsured\\src\\udemy\\Config\\PostDataXML.xml");
		 httpRequest = httpRequest.body(request);
		 Response response = httpRequest.request(Method.POST);
			System.out.println(response.contentType());
			int status_code=response.statusCode();
			System.out.println("Status code of the request" +  status_code);
			
			System.out.println(response.getBody());
			 String responseBody = response.getBody().asString();
					System.out.println("Response Body is =>  " + responseBody);
					
				System.out.println(response.getStatusLine());
			
				XmlPath xml = new XmlPath(responseBody);
				String place=xml.get("response.place_id");
				System.out.println(place);
				

		
		
		
		
	}
	
	
	
}
