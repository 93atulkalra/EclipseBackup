package lOGG;

public class PRAConuNIQUE {

	
	public static void main(String[] args) {
		
		int counter[] = new int[256];
		int y=0;
		
		String inp ="Geeks";
	
	    
	    for(int u=0;u<256;u++)
	    	counter[u]=0;
	    
		for (int i=0;i<inp.length();i++)
		{
		 y = (int)(inp.charAt(i));
			System.out.println(y);
			
			counter[y]++;
			
		}

		 for(int q=0;q<256;q++)
		 {
			 if(counter[q]==1)
				 	System.out.println((char)q);
		 }
		
		
	}
}
