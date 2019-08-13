package AutomationSrc;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;


public class SetConcept {
	RobotClassConcecpt c = new RobotClassConcecpt();

		public static void main(String[] args) {
			SetConcept rt = new SetConcept();
			
	System.out.println(rt.c);
			TreeSet tr = new TreeSet();
			tr.add(10);
			tr.add(100);
			tr.add(100);
	
			
		//	tr.add("2100");
			System.out.println(tr);
		Iterator itr =	tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
			
			
		}
	}


