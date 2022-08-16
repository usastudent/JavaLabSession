package wwek8;

public class OverloadingPrctice {
	
	public int doAdding (int first, int second) {
		return  first+second;
	}
		 public double doAdding(double first, double second) {
			 return first+second;
		 }
		 
		 // double is a class,  converting from String to double
		 public double doAdding(String firstNumber, String secondNumber) {
			 double first = Double.parseDouble(firstNumber);
			 double second = Double.parseDouble(secondNumber);
			 return first=second;
			 
		 }
	}


