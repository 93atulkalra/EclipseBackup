package org.orange.ClientPackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.qa.RestAPIBase.TestBaseClass;



public class RestClient  {

	
	public CloseableHttpResponse getCall(String url) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();   
		/* CloseableHttpClient is an abstract class
		 * public abstract class CloseableHttpClient implements HttpClient, Closeable {

		 * This interface represents only the most basic contract for HTTP request execution. 
		 * It imposes no restrictions or particular details on the request execution process and leaves the specifics 
		 * of state management, authentication and redirect handling up to individual implementations
		 * 
		
		 CLass HTTPClients 
		  public static CloseableHttpClient createSystem() {
		        return HttpClientBuilder.create().useSystemProperties().build();'
		        Creates CloseableHttpClient instance with default configuration.

		    }
		 */
		
		
		
		
		HttpGet httpget = new HttpGet(url);
		 CloseableHttpResponse closres = httpclient.execute(httpget);
		 System.out.println("in get method");
			
		 return closres;
	//		 org.apache.http.client.methods.CloseableHttpResponse
//		 Extended version of the HttpResponse interface that also extends Closeable.(inteface)
	 
		 // This statement throws 2 exceptions  IO Exception CLient Protocol Exception
		 	 
		 
		 // CloseableHttpResponse -> closres  ->  This reponse is having everthing , JSON response body , Headers
		 
		 
		
	}  // Get Methdo finishes
	
	public CloseableHttpResponse getCall(String url,HashMap<String,String> headermap) throws Exception {
		
		CloseableHttpClient httpclient = HttpClients.createDefault();   
		HttpGet httpget = new HttpGet(url);
		
		
		
		
		for(Entry<String,String> map: headermap.entrySet())
		{
			
			httpget.addHeader(map.getKey(),map.getValue());
		}
		
		
		
		
		
		CloseableHttpResponse closres = httpclient.execute(httpget);
		 System.out.println("in get method");
			
		 return closres;
		 
		
	}  // Get Methdo finishes
	
	
}
