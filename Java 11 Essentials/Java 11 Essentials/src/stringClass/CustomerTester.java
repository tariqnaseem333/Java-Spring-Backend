package stringClass;

public interface CustomerTester {

	public static void main(String[] args) {
		Customer customer1 = new Customer();  //regular
		Customer customer2 = new Customer(); //privileged
		
		customer1.findDiscountAndName("Regular:Jack");
		customer2.findDiscountAndName("Privileged:Mary");
		
		System.out.println(" Hi " + customer1.getCustomerName() + "! " +  customer1.getApplicableDiscount() +"% discount is applicable for you");
		System.out.println(" Hi " + customer2.getCustomerName() + "! " +  customer2.getApplicableDiscount() +"% discount is applicable for you");

	}

}
