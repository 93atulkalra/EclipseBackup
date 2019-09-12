package Serilaization;

import java.io.Serializable;

public class DogChild  implements Serializable{
	
	
	int j=20;
	static int i=90;
	final int k =89;
	static transient int y =12;
	final transient int r =77;
	transient int yy=33;
	
	DogChild()
	{
		System.out.println("In dog consructr");
	}

}
