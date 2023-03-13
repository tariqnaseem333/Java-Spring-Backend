package com.tariq;

	
	public class Bill {
		private String paymentMode;
		// other variables and methods
		public Bill(String paymentMode) {
			this.paymentMode = paymentMode;
		}
		public boolean validatePaymentOption() {
			if (paymentMode.equals("Credit Card")
					|| paymentMode.equals("Debit Card")
					|| paymentMode.equals("PayPal")
					|| paymentMode.equals("Amazon Pay")
					|| paymentMode.equals("Google Pay")) {
				return true;
			}
			return false;
		}

}
