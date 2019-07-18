package AutomationSrc;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

		
public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht1 = new Hashtable<Integer,String>();
		Hashtable<Integer,String> ht2 = new Hashtable<Integer,String>();
		ht1.put(1,"one");
		ht1.put(3,"two");
		ht1.put(2,"one");
		
		ht2 = (Hashtable<Integer,String>)ht1.clone();
		
		System.out.println(ht1);
		System.out.println(ht1.hashCode());
		System.out.println(ht2);
		System.out.println(ht2.hashCode());
		
		Hashtable<Integer,String> ht3 = new Hashtable<Integer,String>();
		ht3.put(1,"one");
		ht3.put(2,"one");
		ht3.put(3,"two");
		System.out.println(ht3);
		System.out.println(ht3.hashCode());
		
		if(ht1.equals(ht2))
			System.out.println("Equals");
		else 
			System.out.println("Not Equals");

	
	
	}
		
		
		
	}


