package Interviewquestion_Codingprac;

import java.util.Scanner;
import java.util.TreeMap;

import org.apache.http.impl.client.SystemDefaultCredentialsProvider;

import AutomationSrc.*;

public class StringBuilderStringConcept  {
 
	
	public static String Mask(String ccard)
	{
		String x ="XXXX-XXXX-XXXX-";
		
		StringBuilder strb = new StringBuilder(ccard);
	//	strb.substring(15,19);
		
		return x+strb.substring(15,19);
	}
	public static void main(String[] args) {
		
		
		System.out.println(Mask("1234-5678-9999-6666"));

	}
}
