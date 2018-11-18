package com.sindhu;

import java.util.Scanner;

public class BankTest {
	 public static void main(String[] args)
	  {   String name;
	      int accno;
	      String accname=null;
		  SavingAccount savingacc=new SavingAccount();
		  CurrentAccount currentacc=new CurrentAccount();
		  
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Welcome To HDFC Bank");
		  System.out.println("Enter your Name");
		  name=sc.next();
		  
		  System.out.println("Enter your Account Number");
		  accno=sc.nextInt();
		  
		  System.out.println("Account Balance is Checking.....");
		  System.out.println("Which Account Balance you would like to check?");
		  accname=sc.next();
		  if(accname.equals("SavingAccount"))
		  {  savingacc.fixedDeposit();
			 savingacc.totalCash(); 
		  }
		  if(accname.equals("Currentaccount"))
		  {   currentacc.creditCard();
			  currentacc.totalCash();
		  }
	  }
}
