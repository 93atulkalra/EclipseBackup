package Serilaization;

import java.io.Serializable;

public class DogChild extends AnimalParent implements Serializable{
	
	
	int j=20;
	DogChild()
	{
		System.out.println("In dog consructr");
	}

}
