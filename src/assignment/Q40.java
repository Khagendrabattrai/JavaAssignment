package assignment;

import java.util.Scanner;

public class Q40 {
//40. Write a program to check whether a given string is palindrome or not.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = input.next();
		StringBuilder sb = new StringBuilder(a);
		sb.reverse();
		System.out.println("The reverse of " + a + " is " + sb);
		if (a.equals(sb)) {
			System.out.println("The given string" + a + " is palindrome.");
		} else {
			System.out.println("The given string " + a + " is not palindrome.");
		}
	}

}
