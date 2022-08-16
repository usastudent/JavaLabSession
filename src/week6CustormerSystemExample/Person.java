package week6CustormerSystemExample;

public class Person {
	
	/*
	 * -   First Name
				-   Last Name
				-   Age
				-   Contact is object of class contact
				-   Constructors
				-   Getters and Setters
				-   toString
	 */
	
		private String firstName;
		private String lastName;
		private int age;
		private Contact contact;
	
		public Person() {
			
			super();
			this.firstName="";
			this.lastName="";
			this.age=0;
			this.contact= new Contact();
		}	
		
		
		public Person(String firstName,String lastName,int age, Contact contact) {
		 
			this();
			this.firstName=firstName;
			this.lastName=lastName;
			this.age= age;
			this.contact= contact;
		}
		
		public String getFirsName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public int getAge() {
			return age;
		}
		public Contact getContact() {
			return contact;
		}
//		public Contact getContact(String phone, String name, String address) {
//			return contact;
//		}
		// need a getter for contact
		
		public void setFirstname(String firstName) {
			this.firstName = firstName;
		}
		
		public void setLatname(String lastName) {
			this.lastName = lastName;
		}
		 public void setAge(int age) {
			 this.age= age;
		 }
		 public void setContact(Contact contact) {
			 this.contact=contact;
		 }
//		 public void setContact(String phone, String email, String address) {
//			 this.contact= new Contact(phone, email, address);
//		 }
		  // setter of contact
		 
		public String toString() {
			 return"Person [firstName: "+ firstName+", lastname: "+lastName+
					 ", age: "+age+", contact: "+contact+"]";
				// contact	
		}

}
