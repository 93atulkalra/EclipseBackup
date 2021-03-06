package Org_Rest;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import udemy.Config.PostPlaceAddData;

public class TestCode_PostRequest {

	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://10.2.4.119:8080/iocl/v2/registerUser";
 		 RequestSpecification httpRequest = RestAssured.given().
				 queryParam("phone","7777799999").queryParam("userAction", "confirm");
				 		
		 // param method would iilegal state exception  java.lang.IllegalStateException:
		 //You can either send form parameters OR body content in POST, not both!
		 httpRequest = httpRequest.body(PostPlaceAddData.bodyPlace());
		 
		 Response response = httpRequest.request(Method.POST);
			int status_code=response.statusCode();
			System.out.println("Status code of the request" +  status_code);
			
			 String responseBody = response.getBody().asString();
				boolean flag;
					if(status_code==200)
						flag=true;
					else flag = false;
					Assert.assertTrue(flag);
					
				System.out.println(response.getStatusLine());
				
				JsonPath jpe = response.jsonPath();
   String status = (jpe.get("status"));
				String scope= jpe.get("scope");
			String place = jpe.get("place_id");
				
				System.out.println("Status "   +  status);
				System.out.println("Scope "   +  scope);
				System.out.println("PLace "   +  place);
				

				RestAssured.baseURI = "http://216.10.245.166/maps/api/place/delete/json";
				httpRequest =null;
				httpRequest = RestAssured.given().
						 queryParam("key","qaclick123");
				httpRequest = httpRequest.body("{\r\n" + 
						"    \"place_id\":\""+place+"\" \r\n" + 
						"}");
				response=null;
				  response = httpRequest.request(Method.DELETE);
					System.out.println(response.contentType());
				System.out.println("Status code of the request" +  status_code);
				
				System.out.println(response.getBody());
				  responseBody = response.getBody().asString();
						System.out.println("Response Body is =>  " + responseBody);
						
					System.out.println(response.getStatusLine());
			
				
				
	}
}
