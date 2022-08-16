package weekThree;

public class SwitchPractice {

	public static void main(String[] args) {
		
		/*
		 * Switch statement supports byte,int,short, char, String switch(varibale to
		 * test){ case data type: block of the code break; case data type: block of the
		 * code break; default: break;
		 */

		//public static void main(String[] args) {

			// Data Type of String
			String className = "hybrid";
	
			switch (className) {
			case "online":
				int a = 10;
				int b = 20;
				int c = a + b;
				System.out.println(c);
				break;
			case "inPerson":
				// block of code to execute
				System.out.println("this is inside in person case");
				break;
			default:
				System.out.println("non of above case");
			}
			
			// Data type of byte
//			byte input = 2; // -128 to 127
//			
//			switch(input) {
//			case 1:
//				input++;
//				System.out.println(input);
//				break;
//			case 2:
//				input += 10;
//				System.out.println(input);
//				break;
//			default:
//				System.out.println("not any case");
//			}
			
			// Switch statement with Char data Type
//			
//			char vowels ='a'; // a,e.i.o.u
//			
//			switch(vowels) {
//			case 'a':
//				System.out.println("this is character A");
//				break;
//			case 'e':
//				System.out.println("this is character E");
//				break;
//			case 'i':
//				System.out.println("this is character I");
//				break;
//			case 'o':
//				System.out.println("this is character O");
//				break;
//			case 'u':
//				System.out.println("this is character U");
//				break;
//				default:
//					System.out.println("the character is not vowel");
//			}
	//	

	}

}
