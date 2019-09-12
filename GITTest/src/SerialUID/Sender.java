package SerialUID;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {
	
	public static void main(String[] args) throws Exception 
	{
		DogClass d1 = new DogClass();
		
		FileOutputStream fos = new FileOutputStream("Abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serilaization Complte");
		
		
		
	}

}
