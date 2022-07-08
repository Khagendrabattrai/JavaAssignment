package assignment;

import java.util.Scanner;

public class Q44 {
//44.Write a program to find the duplicate word from a long string.
// yo code ma kehai problem xa
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the words : ");
		String a = input.nextLine();
		String b = a.toUpperCase();
		System.out.println(b);
		String[] word = b.split(" ");

		int count;
		int c = word.length;
		for (int i = 0; i < c; i++) {
			count = 1;
			for (int j = i + 1; j < c; j++) {
				if (word[i].equals(word[j])) {

					count++;
					word[j] = "0";
				}
			}

			if (word[i] != "0" && count > 1) {
				System.out.println("The dublicate word is :" + word[i]);}

			

		}

	}
}
