package staticKeyword;

public class BillTester {
	
	    public static void main(String[] args) {

	        Bill bill1 = new Bill("DebitCard");
	        Bill bill2 = new Bill("PayPal");
	        Bill bill3 = new Bill("NetBanking");
	        Bill bill4 = new Bill("UPI");
	              
	        Bill[] bills = { bill1, bill2, bill3, bill4 };
	              
	        for (Bill bill : bills) {
	            System.out.println("Bill Details");
	            System.out.println("Bill Id: " + bill.getBillId());
	            System.out.println("Payment method: " + bill.getPaymentMode());
	            System.out.println();
	       }
	    }

}
