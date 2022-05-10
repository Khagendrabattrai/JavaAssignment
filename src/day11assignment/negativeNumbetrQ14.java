package day11assignment;

import java.util.Scanner;

public class negativeNumbetrQ14 {

	public static void main(String[] args) {
		/*
		 * 15. Write a program to print the number entered by the user only if the
		 * number entered is negative.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a   number:");
		int number = input.nextInt();
		if (number < 0) {
			System.out.println(" Entered negative number is " + number);
		}

	}

}
