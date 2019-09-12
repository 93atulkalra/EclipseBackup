package SerialUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Reciever {
	
	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fin = new FileInputStream("Abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		DogClass d2 = (DogClass)ois.readObject();
		System.out.println(d2.i + "..." + d2.j);
		System.out.println("Deserliazation Complete");
	}

}
