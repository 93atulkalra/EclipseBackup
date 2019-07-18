package org.Twitter;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Basics_Test {
String Consumer_Key="6pu1kJiEPz2Wutx0bScMCg9iY";
String Consumer_Secret="EzBVt75GcXXdMvwA3GtWpSVCDutUNKQkksXKlzh249s4PvIBZV";
String Access_Token="1129999547906703360-vQQYa5PDpX9Vnpzaah3NRuC0EFI1Xt";
String Token_Secret="X2M3iTSiQIHfBWWx58PNyoUqzNImMyjh2EWhDPS3KjR2E";
	
	
	
@Test
public void AuthPost()
{
		RestAssured.baseURI="https://api.twitter.com/1.1/statuses/home_timeline.json";
		RequestSpecification htprq = RestAssured.given().auth().oauth(Consumer_Key,Consumer_Secret,Access_Token,Token_Secret);
		
		Response respn= htprq.request(Method.GET);
		String resBody= respn.getBody().asString();
		System.out.println(resBody);
		int status=respn.statusCode();
		
		JsonPath js = new JsonPath(resBody);
	ArrayList<String> tweets = new  ArrayList<String>();
	tweets=	js.get("text");
	System.out.println(tweets);
	
		
		
		
		
		
	
	
	
}

							}
