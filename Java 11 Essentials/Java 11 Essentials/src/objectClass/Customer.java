package objectClass;

public class Customer {
	
//	Instance Variables
	 private int customerId;
	 private String name;
	 private String phone;
	 
//	 Constructor
	 public Customer(int id, String name, String phone) {
		 this.customerId = id;
		 this.name = name;
		 this.phone = phone;
	 }
	 
//	 Methods
	 public String toString() {
		return "Customer-" + this.name + " with ID-" + this.customerId;
	 }
	 
	 public boolean equals( Object obj ) {
		 Customer customer = ( Customer )obj;
		 if( this.name.equals( customer.name ) && this.customerId == customer.customerId ) {
			 return true;
		 }
		 return false;
	 }
	 
	 public int hashCode() {
		 Integer id = this.customerId;
		 return 1 + this.name.hashCode() + id.hashCode();
	 }

	}
