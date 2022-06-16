package assignment;

import java.util.Scanner;

public class QuestionNumber28 {
//28.	Write a Program to reverse the given number. //123 => 321

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		int number = input.nextInt();
		int remainder = 0;
		int reverseNumber = 0;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			reverseNumber = (reverseNumber * 10) + remainder;
		}
		System.out.println("The reverse of above number is:" + reverseNumber);// why 0 is printed here
	}
}