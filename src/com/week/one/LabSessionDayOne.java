package com.week.one; 

// name of package that class belongs

public class LabSessionDayOne { 
	
	// class Name, Class name should match exactly as file.
	// ClassName can not have spaces between.
	// ClassName should always start with capital case
	// Class has scope which start with { and ends }
    // MethodNameNmae should be always small letter and follow Naming convention.
	// white space and comment are not executable
	// we writhe codes inside main method
	// main method is entry point for running out codes
	// is used for single line comments.
	/*
	 * multiple line comments
	 */
	/**
	 * Method comments
	 * @param args
	 */
	// each statment of code should end with a ;
	// scope of methods
	// all primitive datatypes start with lower cases
	// non-primitive datatypes or reference variables starts with upper case
	// int a; --- String
	// java reserved keywords; we can't use them for variable names like: package,int, else,...
	// package name should be lowercase and can be separated by dots, you can't have space on it,
	
	public static void main(String[] args) {
		
		// syntax for variable
		// datatype NameOfVariable = Value;
		
	/* practice
	 * I want you to create list of variables about your class enrollment
	 * firstName, LastName, Schedule, Time, Number days you have class
	 * Campus Address, SalaryExpectations, Hours you study.
	 * 
	 */

		String firstName = " Shaiq ";
		String lastName = "Darwish ";
		String schedule = "Monday,Tuesday,Wednesday,Thursday";
		String time = "6-9 PST";
		int numberOfDays = 4;
		String campusAddress = "1010 Hurley way";
		double salary = 1.0;
		double hoursOfStudy = 3.5;
		
		/*
		 *  I want you to create a variable and return true if y0u graduated, false if not
		 */
		boolean isGraduated = false;
		
		/* I want to change address of campus from 1010 Hurly way to 6201 Lessburg Pike
		 * 
		 */
		campusAddress = "6201 Lessburg Pike";
	    /*
	     * if you create a variable once and define the date type 
	     * next time if you call that variable and want to update the value
	     * you don't need to write datatype but just variable name
	     */
		
	    /*
	     * JAVA IS CASE SENSITIVE -- MENAS Book is not equal book
	     */
		
		/*
		 * Write a code that calculate how much money you will make on first month of job
		 * once you start working at 150k salary and make sure you deduct 25% tax from
		 * monthly paycheck. make sure it is not hard coded so we can change salary amount 
		 * to any other number
		 */
		double netPayCheck;
		double annualSalary = 150000.00;
		double taxAmount = 0.25;
		double monthlySalary = annualSalary / 12;
		netPayCheck = monthlySalary= (monthlySalary*taxAmount);
		System.out.println(netPayCheck );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

		
		
	}

}
