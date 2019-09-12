package org.JIRA;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveAuthProvider;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import udemy.Config.PostPlaceAddData;

public class CreateIssue {
	
	FileInputStream fileinput;
static Properties prop;


	@BeforeClass
	public void prerequisites() throws IOException
	{
		 fileinput= new FileInputStream("C:\\Users\\WZJS1251\\eclipse-workspace\\RestASsured\\src\\org\\JIRA\\Config_jira.properties");
		 prop = new Properties();
		prop.load(fileinput);
		
	}
	
	public static String getBodyJira()
	{
		ArrayList lis = new ArrayList();
		lis.add("user1");
		lis.add("pass");
		
		
	String	 body = "{\r\n" + 
				"   \"username\" : \""+prop.getProperty("Username")+"\",\r\n" + 
				"   \"password\" : \""+prop.getProperty("Password")+"\"\r\n" + 
				"}";
	
		
		return body;
	}
	
	public static String getBodyIssueCreate()
	{
	String	 body =		 "{" +
"\"fields\": {"+
		"\"project\": {"+
			"\"key\": \"RES\""+
		"},"+
		"\"summary\": \"Creating a new Bug sumamry via auo\","+
		"\"description\": \"Create a new bug descrip via auii\","+
		"\"issuetype\": {"+
			"\"name\": \"Bug\""+
		"}"+
	"}"+
"}";
		
		return body;
	}
	
	public static String getCommentBody()
	{
		String body ="{"+
			    "\"body\": \"Automation comment\","+
			   "\"visibility\": {"+
			        "\"type\": \"role\","+
			        "\"value\": \"Administrators\""+
			    "}"+
			"}";
		
		return body;
	}
	
	public static String GeneraFromResurce(String Path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(Path)));
		
		
	}
	
	@Test
	public void readHederAndPost() throws Exception
	{
		
			RestAssured.baseURI=prop.getProperty("BaseUrl")+prop.getProperty("Resource");

		RequestSpecification htpreq = RestAssured.given().headers("Content-Type","application/json");
			//System.out.println(getBodyJira());
			htpreq = htpreq.body(getBodyJira());
			Response response =  htpreq.request(Method.POST);
			String responseasString = response.getBody().asString();
			System.out.println(responseasString);
			
			
		JsonPath arry = response.jsonPath();
		
			String sessionid=arry.get("session.name");
			sessionid = sessionid.concat("=").concat(arry.get("session.value"));
			System.out.println(sessionid);
			
			
			
		RestAssured.baseURI=prop.getProperty("BaseUrl")+prop.getProperty("Resource_Createissue");
		
		HashMap header = new HashMap();
		header.put("Content-Type","application/json");
		header.put("Cookie",sessionid);

			RequestSpecification htpreq2 = RestAssured.given().
					header("Content-Type","application/json").header("Cookie",sessionid);
			 
			 //String request = GeneraFromResurce("C:\\Users\\WZJS1251\\eclipse-workspace\\RestASsured\\src\\udemy\\Config\\BodyJson.json");
			 
			String request=getBodyIssueCreate();
			System.out.println(request);
			 htpreq2 = htpreq2.body(request);
				 Response response2 =  htpreq2.request(Method.POST);
				
				 responseasString = response2.getBody().asString();
				System.out.println(responseasString);
				
				
				
				
				RestAssured.baseURI="http://localhost:8080/rest/api/2/issue/10011/comment";
				
				RequestSpecification htpr3 = RestAssured.given().headers("Content-Type","application/json").header("Cookie",sessionid);
				htpr3 = htpr3.body(getCommentBody());
				response = htpr3.request(Method.POST);
				responseasString = response.getBody().asString();
				System.out.println(responseasString);
				
				
RestAssured.baseURI="http://localhost:8080/rest/api/2/issue/10011/comment";
				
				RequestSpecification htpr4 = RestAssured.given().headers("Content-Type","application/json").header("Cookie",sessionid);
				htpr4 = htpr4.body(getCommentBody());
				response = htpr4.request(Method.POST);
				responseasString = response.getBody().asString();
				System.out.println(responseasString);
				
				
				
				
				
				
						
						
				
				
	
	}

}
