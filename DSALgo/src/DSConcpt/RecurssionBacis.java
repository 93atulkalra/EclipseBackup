package DSConcpt;



public class RecurssionBacis {

	int recurssionmethod(int n)
			{
		
		if(n<1)
			return n;
		
		else 
				{
			recurssionmethod(n-1);
			System.out.println("Hello"+ n);
			return n;
				}
			}
	
	
	public static void main(String[] args) {
		RecurssionBacis obj = new RecurssionBacis();
		System.out.println(obj.recurssionmethod(3));
		
		
	}

}
