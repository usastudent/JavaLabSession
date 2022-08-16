package week6CustormerSystemExample;

public class Customer extends Person{

		//	Customer extends Person
		//	-   Person referredBy
		//	-   Employee supportAgent
		//	-   customerCategory
		//	-    totalPurchaseToDate
	
	
		private Person referredBy;
		private Employee supportAgent;
		private String customerCategory;
		private double totalPurchaseToDate;
		
		public Customer () {
			super();
			this.referredBy=new Person();
			this.supportAgent=new Employee();
			this.customerCategory="";
			this.totalPurchaseToDate=0;
		}
		
		public Customer (Person referredBy, Employee SupportAgent,
		String customerCategory,double totalPurchaseToDate) {
			
			this();
			this.referredBy= referredBy;
			this.supportAgent= supportAgent;
			this.customerCategory= customerCategory;
			this.totalPurchaseToDate = totalPurchaseToDate; 
			
		}
		public Person getReferredBy() {
			return referredBy;
		}
		public void setReferredBy(Person referredBy) {
			this.referredBy=referredBy;
		}
		public Employee getSupportAgent() {
			return supportAgent;
		}
		public void setsupportAgent(Employee supportAgent) {
			this.supportAgent=supportAgent;
		}
		public String getCustomerCategory() {
			return customerCategory;
		}
		public void setCustomerCategory(String customerCategory) {
			this.customerCategory=customerCategory;
		}
		public double gettotalPurchaseToDate() {
			return totalPurchaseToDate;
		}
		public void settotalPurchaseToDate(double totalPurchaseToDate) {
			this.totalPurchaseToDate=totalPurchaseToDate;
		}
		
		
		
		public String toString() {
			return"Customer [referredBy: "+ referredBy+", SupportAgent: "+supportAgent+
					"CustomerCategory: "+customerCategory+", totalPurchaseToDate: "+
					totalPurchaseToDate+"]";
		}
		
		
		
		
}
