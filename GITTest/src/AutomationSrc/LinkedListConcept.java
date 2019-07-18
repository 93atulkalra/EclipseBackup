package AutomationSrc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		ArrayList<String> arry= new ArrayList<String>();
		arry.add("Atul");
		arry.add("Niti");
		arry.add("hi");
		
		System.out.println(arry);
		
		arry.set(0, "Hi");
		arry.set(2, "Sys");
		
		System.out.println(arry);
		
	
	ListIterator<String> ll =null;
	ll=arry.listIterator();

	while(ll.hasNext())
	{
		System.out.println(ll.next());
	}
	
	while(ll.hasPrevious())
	{
		System.out.println(ll.previous());
	}
		
		
		
	}
}
