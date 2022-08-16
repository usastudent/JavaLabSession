package week6CustormerSystemExample;

public class Runner {

	public static void main(String[] args) {
		// Runner
		// Array of customers
		// Add customers to the array
		// go through the array and print the customer's information
		
		Contact c = new Contact ("2021231212", "mike@yahoo.com","723 m street");
		Employee emp = new Employee(95000,28500);
		Person person = new Person("Anna", "Davidson", 25,c);
		
		System.out.println(person.getAge());
		
		Customer[] customers = new Customer[5];
		customers[0]= new Customer();
		customers[1]= new Customer(person,emp ,"sales",5600);
		customers[2]= new Customer();
		customers[3]= new Customer();
		customers[4]= new Customer();
		
		System.out.println(person);

			for (int i = 0; i < customers.length; i++) {
				System.out.println(customers);
				
			}
	}
}



