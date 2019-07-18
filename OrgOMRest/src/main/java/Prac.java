import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

public class Prac {

	
	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();   
		
		
		HttpGet httpget = new HttpGet("https://restcountries.eu/rest/v2/name/India");
		 CloseableHttpResponse closres = httpclient.execute(httpget);
		 System.out.println("in get method");
		 
			int statuscode = closres.getStatusLine().getStatusCode();
			System.out.println(closres.getStatusLine().getStatusCode());
			 Assert.assertEquals(statuscode,200,"Status code was expected 200");
			 
			 String responseString = EntityUtils.toString(closres.getEntity(),"UTF-8");
			 
			 System.out.println(responseString);
			 
			 JSONObject Responsejson = new JSONObject(responseString);
	//		 int pageName = Responsejson.getInt("per_page");
		//	 int tot = Responsejson.getInt("total");
//String name = Responsejson.getString("name");
//System.out.println(name);
//System.out.println("Integre" );
//System.out.println(tot);
	//		System.out.println(pageName);
		//	 JSONArray arr = Responsejson.getJSONArray("data");
// This is my JSON Object Which have several entity
// I need help in reading per_page value which is 3 an integer data array values lets say 0th index last name
			 
			 System.out.println("----->");
			 System.out.println(Responsejson);
			 //for (int i = 0; i < arr.length(); i++)
			// {
			  //   String post_id = arr.getJSONObject(i).getString("last_name");
			    // System.out.println(post_id);
			  
			// }
			 // System.out.println("<-----");
		//	 Header hed[] = closres.getAllHeaders();
		//	 System.out.println(hed);

		/*	  HashMap<String,String> hasm = new HashMap();
			 
			 for (Header hedref : hed)
			 {
				 
				 hasm.put(hedref.getName(), hedref.getValue());

				 System.out.println(hedref.getName());
				 System.out.println(hedref.getValue());
			 }
			 
			 System.out.println(hasm);
			 
*/
			

			

	}
}


