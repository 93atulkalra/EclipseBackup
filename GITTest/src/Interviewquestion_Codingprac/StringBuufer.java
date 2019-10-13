package Interviewquestion_Codingprac;

import java.util.ArrayList;
import java.util.HashMap;

public class StringBuufer {
	
	public static void main(String[] args) {
		
		StringBuffer sv = new StringBuffer("ABC");
		StringBuffer sv2 = new StringBuffer("ABC");
		if(sv.equals(sv2))
			System.out.println("Equal");

		else System.out.println("Not");
		
		
	
	HashMap<String,ArrayList> hs = new HashMap<String,ArrayList>();
	
	ArrayList ls = new ArrayList();
ls.add(1);
ls.add("one");
	
	hs.put("1",ls);
	
	StringBuffer s = new StringBuffer(6);
	System.out.println(s.capacity());
	
	
	
	}
}
