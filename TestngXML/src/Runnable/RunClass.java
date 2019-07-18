package Runnable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlList;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.beust.testng.TestNG;

public class RunClass {
	
	
	public static void main(String[] args) {



		List<String> listner= new ArrayList<String>();
		listner.add("Runnable.ListnersClass");
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Suite1");
		suite.setListeners(listner);

		XmlTest test = new XmlTest(suite);
		test.setName("test1");
		
			
		ArrayList<XmlClass> arryC = new ArrayList<XmlClass>();
	
		
	
		XmlClass xmlcl = new XmlClass("Testcases.TC");
		XmlClass xmlcl2 = new XmlClass("Testcases.TC2");
		arryC.add(xmlcl);
		arryC.add(xmlcl2);
		
		test.setXmlClasses(arryC);
		
		ArrayList<XmlTest> arryX = new ArrayList<XmlTest>();
		
		arryX.add(test);
		suite.setTests(arryX);
		
		ArrayList<XmlSuite> arryS = new ArrayList<XmlSuite>();
		arryS.add(suite);
		
		TestNG top = new TestNG();
		top.setXmlSuites(arryS);
		top.run();
		
		
		
		
		
	}

}
