package AutomationSrc;

public class Laptop_ComaprableConcept_list implements Comparable<Laptop_ComaprableConcept_list>  {

	int ram;
	int price;
	String company;
	
	Laptop_ComaprableConcept_list(int ram,int price,String company)
	{
		this.ram=ram;
		this.price=price;
		this.company=company;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int compareTo(Laptop_ComaprableConcept_list lap) {
		if(this.price>lap.price)
			return 1;
		else if(this.price<lap.price)
			return -1;
		return 0;
	}

	

}
