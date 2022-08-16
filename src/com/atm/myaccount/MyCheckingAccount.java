package com.atm.myaccount;

public class MyCheckingAccount {

	public static void main(String[] args) {
		int accountNumber;
		double balance,deposit,withdraw,transfer;
		char currency = '$';
//		double balance;
//		double deposit;
//		double withdraw;
		//double transfer;
		// in java you can declare variable with same data type in same line.
		// double balance,deposit,withdraw;transfer
		
		accountNumber = 123456789;
		balance = 500;
		System.out.println("Welcome you account"+ accountNumber+" your Balance is"+
		currency + balance);
		deposit = 1000;
		balance +=deposit;
		System.out.println(balance);
		withdraw = 750;
		balance -=withdraw;
		System.out.println("balance after withdraw"+currency+ balance);
		
		  transfer = 400;
		  balance -= transfer;
		  System.out.println("your new balance after transfer"+currency+balance);
		  
		  accountNumber = 100;
		  balance-=balance;
		  System.out.println("your balance after changing accountName to "
		  +currency+balance);
		  
		  
		
		
		
		
		
		
		
		
		
		
		
	}

}
