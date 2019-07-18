package AutomationSrc;

public class ArryConcept {

	
	
	public static void main(String[] args) {
		
		
		
		int x[][]= new int[3][];
		
		x[0]= new int[5];
		x[1] = new int [7];
		x[2]= new int [4];
		
		
		System.out.println(x.length);
		
		System.out.println(x[1].length);
	
		
		try {
			int xd =10/0;
		}
		
		
		catch(Exception e)
		{
			System.out.println("in cathc");
			
	
		}
		
		finally {
			
			
			System.out.println("in final blocl");
		}
		

		
		
		
		
		
	}
}
