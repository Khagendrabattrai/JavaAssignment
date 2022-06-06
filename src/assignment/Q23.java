package assignment;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
// 23.	 Write a Program to input the number of (1...7) 
//and translate to its equivalent name of the day of the week.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day:");
		int day = input.nextInt();
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wedesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");

		}

	}

}
