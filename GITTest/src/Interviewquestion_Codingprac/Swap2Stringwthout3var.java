package Interviewquestion_Codingprac;

import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

public class Swap2Stringwthout3var {

	
	public static void main(String[] args) {
		
		String firstVar="Atul";
		String secondVar="Kalra";
		int l1,l2;
		System.out.println("First String => " + firstVar);
		System.out.println("Second String => " + secondVar);
		l1 = firstVar.length();			l2 = secondVar.length();
		firstVar = firstVar.concat(secondVar);
		//AtulKalra
		secondVar=firstVar.substring(0, l1);
		firstVar=firstVar.substring(l1);
		System.out.println("After Swap");
		System.out.println("First String => " + firstVar);
		System.out.println("Second String => " + secondVar);
		
		
	}
	
}
