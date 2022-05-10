package day11assignment;

import java.util.Scanner;

public class OddEvenQ18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = input.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		input.close();
	}
}
