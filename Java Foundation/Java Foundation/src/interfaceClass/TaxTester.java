package interfaceClass;

public class TaxTester {
	
	public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1004","PayPal");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(65.0)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Japan");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(335.0)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
	}

}
