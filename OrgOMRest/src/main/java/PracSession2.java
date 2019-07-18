import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

public class PracSession2 {
	
	
	public static void main(String[] args) throws Exception {
		
	
//http://api.plos.org/search?q=title:"Drosophila" AND body:"RNA"&fl=id,abstract
	
	CloseableHttpClient httpclient = HttpClients.createDefault();   
	
	
	HttpGet httpget = new HttpGet("http://api.plos.org/search?q=title:%22Drosophila%22%20and%20body:%22RNA%22&fl=id,abstract");
	 CloseableHttpResponse closres = httpclient.execute(httpget);
	 System.out.println("in get method");
	 
		int statuscode = closres.getStatusLine().getStatusCode();
		System.out.println(closres.getStatusLine().getStatusCode());
		 Assert.assertEquals(statuscode,200,"Status code was expected 200");
		 
		 String responseString = EntityUtils.toString(closres.getEntity(),"UTF-8");
		 
	
JSONObject objjs = new JSONObject(responseString);
JSONObject objjs2 = objjs.getJSONObject("response");

System.out.println(objjs2.getInt("numFound"));

JSONArray arryj = objjs2.getJSONArray("docs");

JSONObject jobj2 =  arryj.getJSONObject(2);
System.out.println("Aggaya smajh" + jobj2.getString("id"));

System.out.println();

System.out.println(objjs);


System.out.println("->>");
System.out.println(objjs2);


	
	
	
	}

}