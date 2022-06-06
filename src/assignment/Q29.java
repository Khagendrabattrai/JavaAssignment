package assignment;

import java.util.Scanner;

public class Q29 {
	// 29. Write a Program to sum each digit of given number as well as product.
	// 456 =>4*5*6 and 4+5+6

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = input.nextInt();
		int sum = 0;
		int remainder = 0;
		int product = 1;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			sum = sum + remainder;
			product = product * remainder;
		}

		System.out.println("The sum of each digits of given the  number is:" + sum);
		System.out.println("The product of the given number is:" + product);
	}

}
