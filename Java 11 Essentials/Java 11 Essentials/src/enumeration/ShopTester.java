package enumeration;

public class ShopTester {

	public static void main(String[] args) {
		
 		Shop shop = new Shop(60000.0,Category.DESKTOP);
 		shop.checkDiscountApplicability(shop.getAmount(),shop.getType());
	
	}

}
