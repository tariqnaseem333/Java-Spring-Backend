package stringClass;

public interface CustomerTester {

	public static void main(String[] args) {
		
//		Regular Customer
		Customer customer1 = new Customer();
//		Input Format Example:- Regular:Jack i.e., customerType:customerName
		customer1.findDiscountAndName("Regular:Jack");
		System.out.println("Hi " + customer1.getCustomerName() + "! " + customer1.getApplicableDiscount() + "% discount is applicable for you ");
		
//		Privileged Customer
		Customer customer2 = new Customer();
		customer2.findDiscountAndName("Privileged:Mary");
		System.out.println("Hi " + customer2.getCustomerName() + "! " + customer2.getApplicableDiscount() + "% discount is applicable for you ");
	
	}

}
