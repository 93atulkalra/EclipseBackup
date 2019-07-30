package Interviewquestion_Codingprac;

public class ArrayReaarangeSortUnsort {
	
//	public static void main(String[] args) {
//		
//		
//		int ar [] = {1,2,3,4,5};
//		 // 			op= 5,1,4,2,3
//		
//		int size = ar.length;
//		int i=0,j=0;
//		int ls = size-1;
//		int temp,p=0;
//		
//		for(i=size-1;i>0;i=i-2)
//		{
//			temp=ar[ls];
//			
//			for(j=i;j>=0;j--)
//					{
//		ar[j+1]=ar[j];
//			
//				
//			} // J ends
//						
//			ar[p] = temp;
//			p=p+2;
//		} // I loop end here
//		
//		
//		
//		for(int k=0;k<size;k++ )
//			System.out.println(ar[k]);
//	}
//	

	
	 public static void rearrange(int arr[], int n) 
	    { 
	        // initialize index of first minimum and first 
	        // maximum element 
	        int max_ele = arr[n - 1]; 
	        int min_ele = arr[0]; 
	        // traverse array elements 
	        for (int i = 0; i < n; i++) { 
	            // at even index : we have to put maximum element 
	            if (i % 2 == 0) { 
	                arr[i] = max_ele; 
	                max_ele -= 1; 
	            } 
	  
	            // at odd index : we have to put minimum element 
	            else { 
	                arr[i] = min_ele; 
	                min_ele += 1; 
	            } 
	        } 
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	    	
	
	    	int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9,10 }; 
	        int n = arr.length; 
	  
	        System.out.println("Original Array"); 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	  
	        rearrange(arr, n); 
	  
	        System.out.print("\nModified Array\n"); 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    }

		private static char[] tolower(String string) {
			// TODO Auto-generated method stub
			return null;
		} 
}
