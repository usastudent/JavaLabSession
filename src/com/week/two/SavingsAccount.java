package com.week.two;

public class SavingsAccount {

	public static void main(String[] args) {
		
		// declaration
				double deposit ,balance, interestRate, interestEarned;
				int accountNumber,time;
				String accountNickName;
				// initialization
				deposit =5000;
				interestRate = 0.03;
				time = 3;
				interestEarned =deposit*interestRate*time++;
				balance = deposit +interestEarned;
				System.out.println("your account earned " + interestEarned + " in interest");
				System.out.println("your balance is " + balance);
				System.out.println("======================================");
				interestEarned =deposit*interestRate*time;
				System.out.println(interestEarned);
				balance = deposit +interestEarned;
				System.out.println(balance);
				// Simple interest = principal X interest rate X time
				// 5000 deposit
				//3 years duration time
				//0.03 % 
				// i want you to calculate interest earned and balance after 3 years.
				// can you guys calculate what will be balance in 4th year with out changing 
				// value of time from 3 to 4 in hard coding.
				// Assign a nickname to this account as "My Super Saving Account"
				// then print only Account in next line 
				// and also tell me what is the index of first character S in account NickName
				// then grab My word from nickname and combine them with Account and
				// result to nickname should be My Account
				accountNickName = "My Super Saving Account";
				String accountPart = accountNickName.substring(accountNickName.indexOf("Account"));
				System.out.println("Account NickName is  " +accountNickName);
				System.out.println("Account is " +accountPart);
				System.out.println(accountNickName.indexOf('S'));
				String myPart = accountNickName.substring(0,2);
				System.out.println(myPart);
				System.out.println(myPart.concat(" ").concat(accountPart)); // .concat method or + 
				System.out.println(myPart+" "+accountPart);
				
				
				

	}

}
