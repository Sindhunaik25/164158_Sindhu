package com.sindhu.test;

import com.sindhu.bank.BankAccount;

public class TestBankAccount {
	public static void testBankAccountMethod() {
		BankAccount acc = new BankAccount();
		acc.setAccountHolderName("Sachin");

	}
	// main method is only for execution
public static void main(String[] args) {
	testBankAccountMethod();
}
}
