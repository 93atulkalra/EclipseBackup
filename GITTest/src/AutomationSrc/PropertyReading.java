package AutomationSrc;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class PropertyReading {
public static void main(String[] args) {
	
	System.out.println("In readPropertyFile method");
	 Properties prop = new Properties();
	 InputStream input;
	 HashMap<String, String> propvals = new HashMap<String, String>();
	 try {
		 input = PropertyReading.class.getResourceAsStream("./Login.properties");
	
		 prop.load(input); 
	 Set<String> propertyNames = prop.stringPropertyNames();
	 for (String Property : propertyNames)
	 {
	System.out.println(Property + ":" + prop.getProperty(Property));
	// propvals.put(Property, prop.getProperty(Property));
	propvals.put(Property, prop.getProperty(Property));
	 }
	 System.out.println("HashMap generated::" + propvals);
	 }
	 //System.out.println();
	 
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	
	 /*
	  Parameters:name - name of the desired resource
	  Returns:A InputStream object or null if no resource with this name is foundThrows:NullPointerException - If name is null
	  
	  Finds a resource with a given name. 
	  The rules for searching resources associated with a given class are implemented by the defining class loader of the class. 
	  This method delegates to this object's class loader. 
	  If this object was loaded by the bootstrap class loader, the method delegates to ClassLoader.getSystemResourceAsStream(java.lang.String). 
	  */
	 	 


}

}
