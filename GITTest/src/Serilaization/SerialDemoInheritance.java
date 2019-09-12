package Serilaization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemoInheritance {
	
	public static void main(String[] args) throws Exception {
		
		DogChild d1 = new DogChild();
		d1.i=88;
		d1.j=99;
		System.out.println("Serial Starting but before values");
		System.out.println(d1.i+"...."+ d1.j);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserial strated");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DogChild d2 = (DogChild)ois.readObject();
		
		System.out.println(d2.i+"...."+ d2.j);
		
		
		
		
		
		String s ="{\r\n" + 
				"    \"data\": {\r\n" + 
				"        \"id\": 2,\r\n" + 
				"        \"email\": \"janet.weaver@reqres.in\",\r\n" + 
				"        \"first_name\": \"Janet\",\r\n" + 
				"        \"last_name\": \"Weaver\",\r\n" + 
				"        \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"\r\n" + 
				"    }\r\n" + 
				"}";
	}

}
