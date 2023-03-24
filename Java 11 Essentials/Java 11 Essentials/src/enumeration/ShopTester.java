package enumeration;

public class ShopTester {

	public static void main(String[] args) {

		Shop shop=new Shop(20000.0,Category.COMPUTER);
		shop.checkDiscountApplicability(shop.getAmount(),shop.getType());

	}

}
