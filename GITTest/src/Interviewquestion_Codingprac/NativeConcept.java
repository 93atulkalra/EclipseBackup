package Interviewquestion_Codingprac;

public class NativeConcept {
	 static 
	    { 
	        System.loadLibrary("Native library path"); 
	    } 
	    public native void m(); 
	} 
	class Test 
	{ 
	    public static void main(String[] args) 
	    { 
	    	NativeConcept n = new NativeConcept(); 
	        n.m(); 
	    } 
}
