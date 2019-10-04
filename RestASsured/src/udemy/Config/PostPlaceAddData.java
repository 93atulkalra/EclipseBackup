package udemy.Config;

public class PostPlaceAddData {
	
	public static String bodyPlace()
	{
	
		String bodyPlaceadd ="{\r\n" + 
				"    \"user\": {\r\n" + 
				"        \"firstName\": \"rohit\",\r\n" + 
				"        \"lastName\": \"Singh\",\r\n" + 
				"        \"displayName\": \"rohit Sharma Singh\",\r\n" + 
				"        \"mobile\": \"7777799999\",\r\n" + 
				"        \"dob\": \"11-01-2010\",\r\n" + 
				"        \"pincode\": \"20103078\"\r\n" + 
				"    },\r\n" + 
				"    \"userEnrollmentMetaData\": {\r\n" + 
				"        \"memberNumber\": \"PR200000000011388\",\r\n" + 
				"        \"dupUCMId\": \"PR200000000011388\"\r\n" + 
				"    }\r\n" + 
				"}";
		
		return bodyPlaceadd;
		
	}

}
