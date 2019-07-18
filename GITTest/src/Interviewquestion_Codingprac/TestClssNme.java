package Interviewquestion_Codingprac;

public class TestClssNme {
	 public static void main(String args[])  
	    { 
	        int intArray[] = new int[3]; 
	        byte byteArray[] = new byte[3]; 
	        short shortsArray[] = new short[3]; 
	        
	        TestClssNme nm = new TestClssNme();
	          
	        // array of Strings 
	        String[] strArray = new String[3]; 
	          
	        System.out.println(intArray.getClass()); 
	        System.out.println(intArray.getClass().getSuperclass()); 
	        System.out.println(byteArray.getClass()); 
	        System.out.println(shortsArray.getClass()); 
	        System.out.println(strArray.getClass());
	        
	        System.out.println(nm.getClass());
	    } 

}
