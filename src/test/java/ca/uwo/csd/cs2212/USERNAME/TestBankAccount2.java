package ca.uwo.csd.cs2212.USERNAME;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount2 {
	@Test
	public void testDebitWithSufficientFunds() {
		BankAccount2 account = new BankAccount2(10);
		double amount = account.debit(5);
		Assert.assertEquals(5.0, amount);
	}
	
	public void testDebitWithInsufficientFunds() {
		BankAccount2 account = new BankAccount2(10);
		double amount = account.debit(11);
		Assert.assertEquals(10.0, amount);
	}
}
