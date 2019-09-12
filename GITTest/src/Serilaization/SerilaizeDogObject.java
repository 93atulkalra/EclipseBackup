package Serilaization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class T2
{ int i=9;
	}


public class SerilaizeDogObject {

	public static void main(String[] args) throws Exception {
		
		T2 o = new T2();
		T2 o1 = o;
		
		System.out.println(o);

		System.out.println(o1);
		DogClass d1 = new DogClass();
		System.out.println(d1.i+"...."+d1.j+d1.u);
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DogClass d2 = (DogClass)ois.readObject();
		
		System.out.println(d2.i+"...."+d2.j+d2.u);
		
		System.out.println(d1);
		System.out.println(d2);
		
	}
}
