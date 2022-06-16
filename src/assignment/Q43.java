package assignment;

import java.util.Scanner;

public class Q43 {
//43.Write a program to find the duplicate letter in a word.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String a = input.nextLine();
		char[] arr = a.toCharArray();
			for (int i = 0; i < a.length(); i++) {
				for (int j = i + 1; j < a.length(); j++) {
					if (arr[i] == arr[j]) {
						System.out.print("The dublicate of letter  is " + a +arr[j] );
						
					}
				}
			}
		}
	
}
