package weekThree;

import java.util.Scanner;

public class CalculatorPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your firstNumber");
		double numberOne = scanner.nextDouble();
		System.out.println("please choose from operators + - / * % ^");
		char operator = scanner.next().charAt(0);
		System.out.println("please enter your second number");
		double numberTwo = scanner.nextDouble();

		 double result = 0;

		 if (operator == '+') {
		result = Math.addExact((int) (numberOne), (int) numberTwo);
		// result = numberOne + numberTwo;
		System.out.println(result);
		} else if (operator == '-') {
		result = Math.subtractExact((int) (numberOne), (int) numberTwo);
		// result = numberOne - NumberTwo
		System.out.println(result);
		} else if (operator == '/') {
		result = Math.floorDiv((int) (numberOne), (int) numberTwo);
		System.out.println(result);
		} else if (operator == '*') {
		result = Math.multiplyExact((int) (numberOne), (int) numberTwo);
		System.out.println(result);
		} else if (operator == '^') {
		result = Math.pow(numberOne, numberTwo);
		System.out.println(result);
		} else if (operator == '%') {
		result = Math.IEEEremainder(numberOne, numberTwo);
		// result = a%b 20/3 2
		System.out.println(result);
		} else
		System.out.println("you selected wrong operator");
		
		

	}

//	 every time you need to a+b = c
	
}
