package com.week.two;

public class MyCheckingAccount {

	public static void main(String[] args) {
		
		int accountNumber;
		double balance, deposit, withdraw, transfer;
		char currency = '$';

		// in java you can declare variable with same data type in same line.

		accountNumber = 123456789;
		balance = 500;
		
		System.out.println("Welcome to your account " + accountNumber + 
				" your Balance is " + currency + balance);
		deposit = 1000;
		balance +=deposit;  // balance = balance+deposit
		//i want you to deposit 1000 into this account and print balance in next line.
		System.out.println("your new balance is "+ currency+balance);
		// your landlord charged your account with 750 and your new balance is ? 
		// print balance after a withdraw
		withdraw = 750;
		balance -=withdraw;
		System.out.println("your new balance after withdraw "+ currency + balance);
		//your cousin calls you and ask for 400$ money so he can chill in Miami for weekend
		// while you working and learning. what will be balance after you transfer 400?
		transfer = -400;
		balance += transfer;
		System.out.println("your new Balance after transfer " +currency+balance);
		// i want you to change account number to number 100 and withdraw all amount.
		accountNumber = 100;
		balance -= balance;// 350-350
		System.out.println("your balance after changing accountNumber to"
		+accountNumber + " is " +currency+balance);
		

	}

}
