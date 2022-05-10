package day11assignment;

import java.util.Scanner;

public class LargrstNumber {

	public static void main(String[] args) {
		// Write a program to display the largest number from given three values.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1 = input.nextInt();
		System.out.println("Enter second number:");
		int number2 = input.nextInt();
		System.out.println("Enter third number");
		int number3 = input.nextInt();
		if (number1 > number2 && number1 > number3) {// number1 is greater
			System.out.println("The greatest number is :" + number1);
		} else if (number2 > number1 && number2 > number3) {// number2 is greater
			System.out.println("The greatest number is:" + number2);
		} else {
			System.out.println("The greatest number is :" + number3);// number 3 is greater
		}
		input.close();
	}
}
