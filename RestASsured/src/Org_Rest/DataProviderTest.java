package Org_Rest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataProviderTest {
	
	
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
	

	public String DeleteBodyProvide(String Input)
	{
		String bodyString = "{\r\n" + 
				"\"ID\" : \""+Input+"\"\r\n" + 
				"}\r\n" + 
				"";
	
	
		return bodyString;
	
	}
	@DataProvider(name = "DataSet")
	public Object[][] provideDataset()
	{
		Object objArray[][] = {{"Set11isbn","Set11aisle"},{"Set22isbn","Set22aisle"},{"Set33isbn","Set33aisle"}};
		
		return objArray;
		
	} 
	
	@Test(dependsOnMethods="AddLibraryDataParameter",dataProvider="DataSet")
	public void deleteData(String isbn,String aisle)
	{
		System.out.println("In delete");
	//	System.out.println(isbn+aisle);
		RestAssured.baseURI="http://216.10.245.166/Library/DeleteBook.php";
		RequestSpecification httrep = RestAssured.given().header("Content-Type","application/json");
		System.out.println(isbn.concat(aisle));
		httrep= httrep.body(isbn.concat(aisle));
		
		
		Response reps = httrep.request(Method.POST);
		
		int status = reps.getStatusCode();
	System.out.println(status);
		String responseS= reps.getBody().asString();
		System.out.println(responseS);
		
	}
	
	
	@Test(dataProvider="DataSet")
	public void AddLibraryDataParameter(String isbn, String aisle)
	
	{
		
		RestAssured.baseURI= "http://216.10.245.166/Library/Addbook.php";
		RequestSpecification httprequest = RestAssured.given().header("Content-Type","application/json");
		httprequest = httprequest.body(postbody(isbn,aisle));
		
		Response res = httprequest.request(Method.POST);
		
		String Response = res.getBody().asString();
				System.out.println(Response);
		
		
		
		
	}

}
