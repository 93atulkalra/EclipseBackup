package InnerClassConcept;

public class NonStaticInnerClas {

	int XOut =10;
	static int  YOut =20;
	
	class innerNstat
	{
		
		int Xin =90;
	int XOut =7886;
	
	innerNstat(){
		// Constructor are allword
	}
	
	//	static int Yin=70;  We cannot ahve any Static Memeber be it variablr or function
		 // That means Cannot have main also in this inner class
		
		void show()
		{
			System.out.println(Xin);
			System.out.println(XOut);
			System.out.println("hi");
			System.out.println(YOut);
			System.out.println(NonStaticInnerClas.this.XOut);
			
			
		}
		
			
	} 		// Inner class ends here
	
	public static void main(String[] args) {
		NonStaticInnerClas obj = new NonStaticInnerClas();
		System.out.println(obj.XOut); 
		NonStaticInnerClas.innerNstat ref = 	obj.	new innerNstat();
		
		ref.show();
		
		
		
	}
	
}
