package Serilaization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SimpleSerial {

	
	public static void main(String[] args)  throws Exception
	{
		
		DogChild d1 = new DogChild();
		
		FileOutputStream fos = new FileOutputStream("Abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		System.out.println(d1);
		FileInputStream fis = new FileInputStream("Abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DogChild d2 =	(DogChild)ois.readObject();

		
		System.out.println(d2);
		System.out.println(".."+ d2.i+ d2.j+d2.k+d2.r+d2.k+d2.y+d2.yy);
		
		
		
	}
}
