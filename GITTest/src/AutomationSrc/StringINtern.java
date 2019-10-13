package AutomationSrc;

public class StringINtern {

	public static void main(String[] args) {
		
	
	String s1 = "Hello";
	String s2 = s1.intern();
	System.out.println(s1==s2);
	
}
}
