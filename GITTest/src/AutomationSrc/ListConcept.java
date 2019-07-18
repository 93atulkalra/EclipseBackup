package AutomationSrc;

import java.util.*;

public class ListConcept {
	public static void main(String[] args) {
		ArrayList listap2= new ArrayList();
		listap2.add("Bye");
		listap2.add("GoodBYe");
		listap2.add(1);
		listap2.add("1");
		ArrayList <String> listap= new ArrayList<String>();
		
		listap.add("hi");
		listap.add("hello");
		listap.addAll(listap2);
		
		
		for(int i =0;i<listap.size();i++)
			
		System.out.println(listap.get(i));
		
		
		
	}

}
