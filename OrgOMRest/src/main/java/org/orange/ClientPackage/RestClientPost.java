package org.orange.ClientPackage;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.orang.api.data.Users;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClientPost {

	public static void main(String[] args) throws Exception {
		
		
		String url ="https://reqres.in/api/login";
		String entity="";
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(url);
		
		
		
	HashMap<String,String> headermap = new HashMap<String,String>();
	
	headermap.put("Content-Type","application/json");
	
	for(Entry<String,String> mp : headermap.entrySet())
	{

		httppost.addHeader(mp.getKey(),mp.getValue());
		System.out.println(mp.getKey()+mp.getValue());
		
	}
	
	System.out.println("in reponse");
	
	ObjectMapper mapper = new ObjectMapper();
	Users users = new Users("eve.holt@reqres.in","cityslicka");
	
mapper.writeValue(new File("C:\\Users\\WZJS1251\\eclipse-workspace\\OrgOMRest\\src\\main\\java\\org\\orang\\api\\data\\users.json"), users);
	
String request_payload = mapper.writeValueAsString(users);
System.out.println(request_payload);
	
httppost.setEntity(new StringEntity(request_payload));  // For Request Payload 	



CloseableHttpResponse htpresonse = httpclient.execute(httppost);
String response=  EntityUtils.toString(htpresonse.getEntity(),"UTF-8");

System.out.println(response);
int statuscode = htpresonse.getStatusLine().getStatusCode();
System.out.println(statuscode);
	


Users obj =mapper.readValue(response,Users.class);	
System.out.println(obj.getEmail());
	
	}
	
	}
