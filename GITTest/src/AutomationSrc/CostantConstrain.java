package AutomationSrc;

public class CostantConstrain {

	
	void fun( final int x[])
	{
		
		final int y=20;
		System.out.println("In function");
		x[1]=20;
		x[2]=240;
		x[4]=60;
		
		int c[] = {1,2,3};
		int v[] = {4,5,6};
				v=c;
		
		
		for(int i =0;i<c.length;i++)
			{System.out.println(c[i]);
			
			System.out.println(v[i]);
			}
		
	}
	public static void main(String[] args) {
		
		
	final	int x =10;
	final	int xar[] = new int[5];
	
	CostantConstrain obj = new CostantConstrain();
	obj.fun(xar);
		
		
		
		
		
	}
	
}
