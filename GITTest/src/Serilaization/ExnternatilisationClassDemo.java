package Serilaization;

import java.io.*;
public class ExnternatilisationClassDemo  implements Externalizable
{
	
	
	  int  i;
	   int j;
	   String s;
	
	ExnternatilisationClassDemo(int i,int j , String s)
	{
		System.out.println("IN Paramter Contructor");
		this.i=i;
		this.j=j;
		this.s=s;
				
	}

	public ExnternatilisationClassDemo()
	{
		System.out.println("This is No Default Constrcutor");
		
	}
		
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	s =(String)in.readObject();
	i = in.readInt();
		 
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
	
		out.writeObject(s);
		out.writeInt(i);
	}
	
	public static void main(String[] args)  throws Exception{
	
		ExnternatilisationClassDemo obj1  = new ExnternatilisationClassDemo(10,20,"Abcs");
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		System.out.println("Before Values are " + obj1.i+"  "+ obj1.j+"  "+ obj1.s);
		System.out.println("Deserial strated");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
			ExnternatilisationClassDemo obj2 =(ExnternatilisationClassDemo)ois.readObject();
			
			System.out.println("Values are " + obj2.i+"  "+ obj2.j+"  "+ obj2.s);
			
			
	
	
		
		
	}
	
	
	
	
	

}
