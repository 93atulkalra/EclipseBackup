package AutomationSrc;

 interface my
{
	void  base();
	}
 
 class Testparent{
	 static  void method () {
			System.out.println("in test parednt");
		}
		
	 
 }

 public class Testbase extends Testparent {
	static void method () {
		System.out.println("in test chil");
	}
	
	
	public void def()
	{
		System.out.println("in def");
	}
	
	public static void main(String[] args) {

		Testparent pr = new Testbase();
		pr.method();
		
	}
	
}

