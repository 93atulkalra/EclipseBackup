package Interviewquestion_Codingprac;

public class MilitaryTime12Hourclock {

	public static void main(String[] args) {
		
		
		String miltarytime = "01:35:20";String pr="";
		miltarytime=	miltarytime.replace(":", "");
		System.out.println(miltarytime);
		int hh = Integer.parseInt(miltarytime.substring(0,2));
		int mm = Integer.parseInt(miltarytime.substring(2,4));
		int ss = Integer.parseInt(miltarytime.substring(4,6));
		
		
		if (hh==12)
			 { hh=00; pr ="am";
			 
			 }
		
		if(hh>12)
		{	hh = hh -12;
			pr="pm";
		}
		
		
		else 
			pr ="am";
		
			
		System.out.println(hh+":"+mm+":"+ss+" "+pr);
		
		
		
		
		
		
	}
	
	
}
