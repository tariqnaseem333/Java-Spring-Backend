package com.tariq;

import org.junit.Assert;
import org.junit.Test;

public class BillPaymentTest {
	
		@Test
		public void validatePaymentOptionTestValid() {
			Bill bill = new Bill("PayPal");
			Assert.assertTrue(bill.validatePaymentOption());
		}

}
