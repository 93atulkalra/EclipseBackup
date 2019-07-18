package Org.orange.API_TestCases;

import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.orange.ClientPackage.RestClient;
import org.qa.RestAPIBase.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases extends TestBaseClass {

	String url;
	RestClient restcall;
	

	@BeforeMethod
	public void beforeMethodF()
	{	
		System.out.println("In before Method");
		url = prop.getProperty("URL");
		
		// Here you do URI = URl + Service URL
		restcall = new RestClient();
		
	}
	
	
	@Test
	public void tc1() throws Exception
	{
		
		System.out.println("In TC 1");
		System.out.println("In Test Method" + url );
		CloseableHttpResponse closres= 	restcall.getCall(url);

		int statuscode = closres.getStatusLine().getStatusCode();
		System.out.println(closres.getStatusLine().getStatusCode());
		 Assert.assertEquals(statuscode,RESPONSE_STATUS_CODE,"Status code was expected 200");
		 
		 String responseString = EntityUtils.toString(closres.getEntity(),"UTF-8");
		 
		 System.out.println(responseString);
		 // public final class EntityUtils        
		 //private static String toString()  
		 
		 //UTF-8 is a compromise character encoding that can be as compact as ASCII (if the file is just plain English text) 
		 //but can also contain any unicode characters (with some increase in file size). 
		 //UTF stands for Unicode Transformation Format. The '8' means it uses 8-bit blocks to represent a character.
		 // 		 StatusLine org.apache.http.HttpResponse.getStatusLine()


		// Obtains the status line of this response. The status line can be set using one of the setStatusLine methods
		 //, or it can be initialized in a constructor.
		 //..Returns:the status line, or null if not yet set
		 //		 org.apache.http.StatusLine


// The first line of a Response message is the Status-Line, consisting of the protocol version followed by a numeric status code
		 //and its associated textual phrase

		 
		 JSONObject Responsejson = new JSONObject(responseString);
		
		 
		 System.out.println("----->");
		 System.out.println(Responsejson);
		 System.out.println("<-----");
		 Header hed[] = closres.getAllHeaders();
		 System.out.println(hed);

		 
		 //Header is  an interface Represents an HTTP header field.		 //The HTTP header fields follow the same generic format as that given in Section 3.1 of RFC 822.		 //Each header field consists of a name followed by a colon (":") and the field value. Field names are case-insensitive.		// The field value MAY be preceded by any amount of LWS, though a single SP is preferred. 		  //    message-header = field-name ":" [ field-value ] 		    //  field-name     = token 		      //field-value    = *( field-content | LWS )		      //field-content  = <the OCTETs making up the field-value		        //               and consisting of either *TEXT or combinations		          //             of token, separators, and quoted-string>
		 
		 
		  HashMap<String,String> hasm = new HashMap();
		 
		 for (Header hedref : hed)
		 {
			 
			 hasm.put(hedref.getName(), hedref.getValue());
			 
		 }
		 
		 System.out.println(hasm);
		 

		
	}
	
	
	
}
