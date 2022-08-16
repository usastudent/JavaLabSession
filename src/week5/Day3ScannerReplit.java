package week5;

import java.util.Scanner;

public class Day3ScannerReplit {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Scanner
		// Inputs
		// Our inputs are String variables
		// CityName
		// "DC" --- list of strings
		// List should be stored in a string array , an array of String

		 // JDK this the package is used by developers
		// JRE -- an enviroment where the code is executed
		// JVM -- inside the JRE , to execute the code

		 Scanner s = new Scanner(System.in);
		String cityNames[] = new String[5];

		 System.out.println("Please enter city name");

		 for (int i = 0; i < cityNames.length; i++) {
		cityNames[i] = s.nextLine(); // the input of this method will be a String

		 }
		// 1. stored in i = 0
		// 2. stored in i = 1
		// 3. stored in i = 2
		// 4. stored in i = 3
		// 5. stored in i = 4
		// System.out.println(cityNames[0]);
		// System.out.println(cityNames[1]);
		// System.out.println(cityNames[2]);
		// System.out.println(cityNames[3]);
		// System.out.println(cityNames[4]);
		// only print those cityName that start with 'D' or 'd'
		// the first letter of the array XXX

		 // we have an array of string
		// inside the array we have individual strings Kabul
		// String is an array of characters
		for (int i = 0; i < cityNames.length; i++) {
		//
		if (cityNames[i].startsWith("D") || cityNames[i].charAt(0) == 'd') {
		System.out.println(cityNames[i]);
		}
		}


	}

}
