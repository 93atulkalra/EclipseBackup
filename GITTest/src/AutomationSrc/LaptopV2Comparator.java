package AutomationSrc;

import java.util.Comparator;

public class LaptopV2Comparator   {

	int ram;
	int price;
	String company;
	
	LaptopV2Comparator(int ram,int price,String company)
	{
		this.ram=ram;
		this.price=price;
		this.company=company;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<LaptopV2Comparator> com = new  Comparator<LaptopV2Comparator>() {

			@Override
			public int compare(LaptopV2Comparator arg0, LaptopV2Comparator arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		

	}


	

}
