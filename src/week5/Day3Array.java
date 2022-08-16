package week5;

public class Day3Array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// break and continue
		// 57 keywords , name variables as keywords
		// for , if , int
		// loops break keyword
		// loop will run until the condition becomes false
		// for (initialation, condition, loop update){
		// loop statement --
		// i<5
		// break -- if we want to stop the loop before teh condition
		// become false
		// }

		 for (int i = 1; i < 11; i++) {
		if (i > 5) {
		break;
		}
		System.out.println(i);
		}
		System.out.println("-----------");
		// i want to skip print (4)
		for (int i = 1; i < 11; i++) {
		if (i == 4) {
		continue;
		}
		System.out.println(i);

		 }

		 // to print from a to z
		// ASCI charts - American Standard Code For Information Interchange
		// 'a' = 97
		// a - n
		for (char c = 'a'; c <= 'z'; c++) {
		System.out.print(c + " ");
		if (c == 'n') {
		break;
		}
		}

		 // a - z but skip n
		System.out.println("---- continue keyword --- ");
		for (char c = 'a'; c <= 'z'; c++) {
		if (c == 'n') {
		continue;
		}
		System.out.print(c + " ");

		 }

		 // we want to print a -z (loop statement)
		// starting point: c = 'a'
		// condition i <='z'
		// what

		 System.out.println("\nwhile loop starts here ");
		// char c = 'a';
		//
		// while (c <= 'z') {
		// System.out.print(c);
		// if (c == 'n') {
		// continue;
		// }

		// c++;
		// }

		 char i = 'a';

		 while (i <= 'z') {

		 if (i == 'n') {

		 continue;

		 }

		 System.out.println(i);

		 i++;

		 }


	}

}
