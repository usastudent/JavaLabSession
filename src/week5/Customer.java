package week5;

public class Customer {

		// variable
		String firstName;
		String lastName;
		int accountNumber;
		double balance;
		
	// paramaterized  Customer
		
		public Customer (int accountNumber ) {  // object should give accountNumber to be created
			firstName="";
			String lastName="";
			 accountNumber=accountNumber;
			 balance=0;
		}
		
		public Customer (int accNumber, String fn, String ln ) {
			 accountNumber= accNumber;
			 firstName = fn;
			 lastName = ln;
			 balance =0;
		}
		 public boolean deposit (double amount) {
			 
			 if ( amount > 10000) {
				 balance += amount;
				 System.out.println("Amount more than max limit. report ot the IRS");
				 return true;
			 }else if 
			 
			  (amount <=0) {
				 System.out.println("can not deposit zoer or negative amount");
				 return false;
			 }else
				 
			 balance = balance + amount; // balance += amount
			 System.out.println("amount added");
			 return true; 
		 }
		 
}
