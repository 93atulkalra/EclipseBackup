package AutomationSrc;

 class Singleton {
	
	String str;
	private static Singleton Singleton_ref=null;
	
	public static Singleton getInstance()
	{
		if(Singleton_ref==null)
			Singleton_ref = new Singleton();
		
		return Singleton_ref;
	
	}
	
	 private Singleton()
	{
		System.out.println("In Single Constructor");
		str ="HI, thERe";
	}
	 
	
	public static void main(String[] args) {
		
		Singleton x=	Singleton.getInstance();
		Singleton y=	Singleton.getInstance();
		Singleton z=	Singleton.getInstance();
		
		x.str=x.str.toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
