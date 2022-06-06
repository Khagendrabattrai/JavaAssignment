package assignment;

import java.util.Scanner;

public class Q24 {
	// 24. Write a program to print the table of given numbers.2

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Multiplication table of:");
		int a = input.nextInt();
		for (int number = 1; number <= 10; number++) {
			int c = a * number;
			System.out.println(a + "*" + number + "=" + c);
		}

	}
}
