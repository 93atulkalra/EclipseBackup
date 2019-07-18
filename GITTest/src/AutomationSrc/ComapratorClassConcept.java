package AutomationSrc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComapratorClassConcept {

	public static void main(String[] args) {
		ArrayList<LaptopV2Comparator> lisVar = new ArrayList<LaptopV2Comparator>();
		LaptopV2Comparator l1 = new LaptopV2Comparator(10,50,"Dell");
		LaptopV2Comparator l2 = new LaptopV2Comparator(40,20,"HP");
		LaptopV2Comparator l3 = new LaptopV2Comparator(100,900,"Apple");
		
		lisVar.add(l1);
		lisVar.add(l2);
		lisVar.add(l3);
		Comparator<LaptopV2Comparator> com1 = new Comparator<LaptopV2Comparator>()
				{

					@Override
					public int compare(LaptopV2Comparator o1, LaptopV2Comparator o2) {
						// TODO Auto-generated method stub
						if (o1.price>o2.price)
						return 1;
						else if (o1.price<o2.price)
							return -1;
						return 0;
					}
			
				};
				
		
				Collections.sort(lisVar,com1);
		for (LaptopV2Comparator lap : lisVar )
			System.out.println("Sorted list ----> " + lap.ram + lap.price + lap.company  );

	}
	
}
