package org.JIRA;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Pathparam {
	
	
	public static void main(String[] args) {
		int id=2;
		RestAssured.baseURI="https://reqres.in/api/users/"+id;
		RequestSpecification htr = RestAssured.given();
		Response res = htr.request(Method.GET);
		String re = res.getBody().asString();
		
		System.out.println(re);
		
		
		
		
	}

}
