package AutomationSrc;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;


public class SetConcept {


		public static void main(String[] args) {
			TreeSet tr = new TreeSet();
			tr.add(10);
			tr.add(100);
			tr.add(100);
	
			
			tr.add("2100");
			System.out.println(tr);
		Iterator itr =	tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
			
			
		}
	}


