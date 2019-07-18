package AutomationSrc;

public class StringPoolConcept {

	
	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b ="Hello";
		String c = new String("Hello");
		String d =a;
		
		if(a==d)  // Comapre a with b , a with c also
		System.out.println("true");
		
		else
			System.out.println("false");
		
		
	}
}
