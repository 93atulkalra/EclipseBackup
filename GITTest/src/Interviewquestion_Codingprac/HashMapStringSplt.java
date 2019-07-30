package Interviewquestion_Codingprac;

import java.util.HashMap;

public class HashMapStringSplt {
public static void main(String[] args) {
	
	HashMap<String, String> out = new HashMap<String, String>();
	
	String input ="H/101,F/202,G/303,L/404";
	
	for(String sp:input.split(","))
	{
		
		String str[] = sp.split("/");
		out.put(str[0], str[1]);
		
	}
	
	
System.out.println(out);	
	
}
}
