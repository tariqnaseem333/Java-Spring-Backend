package inheritance;

public class Pizza {
	
//	Instance Variables
	int price;
	String size;
	int quantity;	
	
//	Constructor
	Pizza (String size, int quantity){
		this.size = size;
		this.quantity = quantity;
		
		if(this.size.equals("Regular"))
			this.price = 100;
		else if(this.size.equals("Medium"))
			this.price = 250;
		else
			this.price = 390;
	}	
	
	
}

