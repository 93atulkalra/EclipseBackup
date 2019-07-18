package Org_Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

 class DataFromTestcaseRetieve_Parameterized {
	 
	 public String  postbody(String isbn, String aisle)
	 {
		String postValue="{\r\n" + 
				"\"name\":\"Learn Appium Automation with Java\",\r\n" + 
				"\"isbn\":\""+isbn+"\",\r\n" + 
				"\"aisle\":\""+aisle+"\",\r\n" + 
				"\"author\":\"John foe\"\r\n" + 
				"}\r\n" + 
				"" ;
		
		return postValue;
	 }
	
	@Test
	public void PostAddLibarary()
	{
			RestAssured.baseURI="http://216.10.245.166/Library/Addbook.php";
			RequestSpecification httprequest = RestAssured.given().headers("Content-Type","application/json");
			httprequest = httprequest.body(postbody("bcd","1234"));
			
			Response response=httprequest.request(Method.POST);
			
			System.out.println(response.getStatusCode());

			String res= response.getBody().asString();
			System.out.println(res);
		
		
	}
	
}
