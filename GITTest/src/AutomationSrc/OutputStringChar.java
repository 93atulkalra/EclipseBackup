package AutomationSrc;

import java.lang.reflect.Array;

public class OutputStringChar {
	
	public String toString()
	{
		return "Test";
	}
	
	public static void main(String[] args) {
		
		
		char[] str = {'i','n','c','l','y','t'};
		
		System.out.println(str.toString());
	
		String s = new String("abc");
		System.out.println(s);
		System.out.println(s.toString());
		
		char ch ='a';
		//System.out.println(ch.toString());
		// Runtime Error cannot invoke toString on  primitve datatypes
		
		OutputStringChar cv = new OutputStringChar();
		System.out.println(cv);
		
	
	

	
	
	}

}
