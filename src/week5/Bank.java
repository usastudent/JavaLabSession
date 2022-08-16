package week5;

public class Bank {

	public static void main(String[] args) {
		
		Customer customer1 =new Customer(123456);
		customer1.firstName = "Ahmad";
		
		
		
		Customer customer2 = new Customer(33499, "david", "Jakson");
//		customer2.deposit(5000);
//		customer2.deposit(9000);
//		customer2.deposit(11000);
//		customer2.deposit(0);
		
		
		Customer[] va = new Customer [5];
		va[0]= customer1;
		for (int i = 0; i < va.length; i++) {
			
		}
		
	}
}
		/* 
		 * practice
		 *  vending machine. we need an application to keep trak of the items in 
		 *  diffrent spots
		 */

