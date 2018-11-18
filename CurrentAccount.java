package com.sindhu;

public class CurrentAccount extends Bank {
	void creditCard() {
		int Balance = 25000;
		System.out.println("Your Credit Card initial Balance:" + Balance);

	}

	void totalCash() {
		int WithdrawAmount = 5000;
		int totalBalance = 20000;
		System.out.println("your total Balance in CurrentAccount is :"
				+ totalBalance);

	}

}
