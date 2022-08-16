package week6CustormerSystemExample;

public class Contact extends Person {
	
		/*
		 * 	Contact
				-   Phone
				-   Email 
				-   Address
				-   Constructors
				-   Getters and Setters
				-   toString
		 * 
		 */
	
		private String phone;
		private String email;
		private String address;
		
		
		
		public Contact() {
			super();
			this.phone="";
			this.email="";
			this.address="";
		}
		
		public Contact (String phone, String email, String address){
			
			this.phone=phone;
			this.email=email;
			this.address=address;
		}
		
		public String getPhone () {
			return phone;
		}
		public String getEmail() {
			return email;
		}
		public String getAddress() {
			return address;
		}
		
		public void setPhone(String phone) {
			this.phone=phone;
			
		}
		public void setEmail(String email) {
			this.email=email;
		}
		public void setAddress (String address) {
			this.address=address;
		}
		
		String toStrin() {
		//	2021231234
//			String strPhone = phone +"";
//			String tempPhone="";
//			if (strPhone.length()==10) { 
//				// we can format the number 2021231234=> (202)123-1234
//				tempPhone = "("+strPhone.substring(0,3)+")"+
//				strPhone.substring(3,6) + "-"+
//				strPhone.substring(6);
//				}else {
//					tempPhone=strPhone;
//				}
			
			
			
			
		 return"Contact [phone: "+ phone+", Email: "+email+", Address: "+address+"]";
       }
}
