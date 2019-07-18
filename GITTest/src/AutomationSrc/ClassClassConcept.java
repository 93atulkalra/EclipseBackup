package AutomationSrc;

public class ClassClassConcept {

	
	protected int x=10;
	public ClassClassConcept()
	{
		System.out.println("this is private cons");
	}
	
	
	
	public static void main(String[] args) throws Exception 
	
	{
			 Class cna = String.class;
	 cna.newInstance();
			
		Class c = Class.forName("java.util.Date");
		System.out.println(c.getName());
	//	c.getMethod(name, parameterTypes)
		
		
	
		Child ch = new Child(); 
		
		ClassClassConcept cy = new ClassClassConcept();
		
		cy.x =cy.x+10;
		
		
		
}
}