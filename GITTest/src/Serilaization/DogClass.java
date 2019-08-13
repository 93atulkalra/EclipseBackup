package Serilaization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DogClass implements Serializable{
	
	 transient  int i=10;
	 transient  String u="abc";
	int j=20;
	
	private void  writeObject(ObjectOutputStream os) throws Exception
	{
	
	os.defaultWriteObject();
int ii = 10+i;
String uu =u;
	os.writeObject(uu);

	os.writeInt(ii);
	
	
	}

private void readObject(ObjectInputStream ls) throws Exception
{
	ls.defaultReadObject();
	
	

	String ff=(String) ls.readObject();
	u=ff;
	
	int f =ls.readInt();
	i=f-10;
	
	}


}
