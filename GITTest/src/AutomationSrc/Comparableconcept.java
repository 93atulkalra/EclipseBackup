package AutomationSrc;

import java.util.ArrayList;
import java.util.Collections;

public class Comparableconcept {

	public static void main(String[] args) {
		
	
	ArrayList<Laptop_ComaprableConcept_list> lisVar = new ArrayList<Laptop_ComaprableConcept_list>();
	Laptop_ComaprableConcept_list l1 = new Laptop_ComaprableConcept_list(10,50,"Dell");
	Laptop_ComaprableConcept_list l2 = new Laptop_ComaprableConcept_list(40,20,"HP");
	Laptop_ComaprableConcept_list l3 = new Laptop_ComaprableConcept_list(100,900,"Apple");
	
	lisVar.add(l1);
	lisVar.add(l2);
	lisVar.add(l3);
	Collections.sort(lisVar);
	for (Laptop_ComaprableConcept_list lap : lisVar )
	System.out.println("Sorted list ----> " + lap.ram + lap.price + lap.company  );

	
	
}
}