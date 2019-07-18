	import java.io.IOException;

	import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
	import org.apache.http.client.methods.HttpGet;
	import org.apache.http.impl.client.CloseableHttpClient;
	import org.apache.http.impl.client.HttpClients;
	import org.apache.http.util.EntityUtils;
	import org.json.JSONArray;
	import org.json.JSONObject;
	import org.testng.Assert;

public class PracSession3 {
	
public static void main(String[] args) throws Exception {
	

		CloseableHttpClient httpclient = HttpClients.createDefault();   
		
		
		HttpGet httpget = new HttpGet("https://restcountries.eu/rest/v2/name/India");
		 CloseableHttpResponse closres = httpclient.execute(httpget);
		 System.out.println("in get method");
		 
			int statuscode = closres.getStatusLine().getStatusCode();
			System.out.println(closres.getStatusLine().getStatusCode());
			 Assert.assertEquals(statuscode,200,"Status code was expected 200");
			 
			 String responseString = EntityUtils.toString(closres.getEntity(),"UTF-8");
			 
			 //System.out.println(responseString);
			 
	
	
	JSONArray arryj =  new  JSONArray(responseString);
	//System.out.println(arryj);
	
	
	JSONObject objjs2 = arryj.getJSONObject(1);
	System.out.println(objjs2.getString("alpha2Code"));
	

	System.out.println("->" + objjs2);
/*
	//JSONArray arryj = objjs2.getJSONArray("docs");

	JSONObject jobj2 =  arryj.getJSONObject(2);
	System.out.println("Aggaya smajh" + jobj2.getString("id"));

	System.out.println();

	System.out.println(objjs);


	System.out.println("->>");
	System.out.println(objjs2);

*/
		
		}

	}

