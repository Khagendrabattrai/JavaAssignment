package day11assignment;

import java.util.Scanner;

public class IdentifyingTraingle {

	public static void main(String[] args) {
		/*
		 * 21. Write a Program to accept three sides of a triangle and display which
		 * kind of triangle is formed.
		 */
		/*
		 * Equilateral: Having all sides equal. Isosceles: Having two equal sides.
		 * Scalene triangle: Having no sides equal.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of side A:");
		int a = input.nextInt();
		System.out.println("Enter the length of side B:");
		int b = input.nextInt();
		System.out.println("Enter the lengthh of side C:");
		int c = input.nextInt();
		if (a == b && b == c) {
			System.out.println("The traingle is Equilater traingle.");
		} else if (a == b || b == c || a == c) {
			System.out.println("The traingle is Isosceles traingle. ");
		} else {
			System.out.println("The traingle is Scalene traingle.");
		}
		input.close();
	}

}
