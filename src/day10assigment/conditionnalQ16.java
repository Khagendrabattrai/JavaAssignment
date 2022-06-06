package day10assigment;

import java.util.Scanner;

public class conditionnalQ16 {

	public static void main(String[] args) {
		// 16.Write a program to relate two integers entered by the user using = =or >
		// or < sign
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int integerFirst = input.nextInt();
		System.out.println("Enter the second integer:");
		int integerSecond = input.nextInt();
		if (integerFirst == integerSecond) {
			System.out.println("First integer is equal to Second integer.");

		} else if (integerFirst > integerSecond) {
			System.out.println("First integer is greater than second integer. ");
		} else if (integerFirst < integerSecond) {
			System.out.println("Second integer is greater tha first.");
		}
	}
}
