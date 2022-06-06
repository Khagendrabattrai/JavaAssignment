package assignment;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// 22.Write a program to create the equivalent of a four-function calculator.
		// The program to enter two integer’s numbers and an operator.
		// It then carries out the specified arithmetic operator operation:
		// addition, subtraction, multiplication or division of the two numbers.
		// Finally, it displays the result.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator:");
		char operator = input.next().charAt(0);
		int a = 0, b = 0;
		if (operator == '+' || operator == '-' || operator == '*' || operator == '|') {
			System.out.println("Enter number a:");
			a = input.nextInt();
			System.out.println("Enter number b:");
			b = input.nextInt();

		}

		switch (operator) {
		case '+':

			int addition = a + b;
			System.out.println("sum of a and b is:" + addition);

			break;
		case '-':
			int subtraction = a - b;
			System.out.println("Difference of a and b is :" + subtraction);

			break;
		case '*':
			int multiplication = a * b;
			System.out.println("The product of a and b is:" + multiplication);
			break;
		case '/':
			int division = a / b;
			System.out.println("The quotient when we divide a by b is :" + division);
			;
			break;

		default:
			System.out.println("wrong selection");
		}
	}
}
