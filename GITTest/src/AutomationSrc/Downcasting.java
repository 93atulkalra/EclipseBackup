package AutomationSrc;

//package AutomationSrc;

class pagjrent {
	
	void asbc()
	{
		System.out.println("in abc");
	}
}

public class Downcasting extends pagjrent{
	void asbc()
	{
		System.out.println("in down");
	}
	
	void rtt()
	{
		System.out.println("in down rtt");
	}
	
	public static void main(String[] args) {
		

		
		
		pagjrent d1 = new Downcasting();
		
		
		d1.asbc();
		  Downcasting d2 = (Downcasting)new pagjrent();    
		//  d2.rtt();
		
		
		
	} 
	
}
