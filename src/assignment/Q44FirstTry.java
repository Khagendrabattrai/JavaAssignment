package assignment;

import java.util.Scanner;

public class Q44FirstTry {
		//44.Write a program to find the duplicate word from a long string.

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("please enter the sentense: ");
			String a = input.nextLine();
			String b = a.toUpperCase();
			// System.out.println(b);
			String[] word = b.split(" ");
			// for (String w2 : words2) {
			// System.out.println(w2);
			int c = word.length;
			for (int i = 1; i < c; i++) {
				for (int j = i + 1; j < c; j++) {
					if (word[i].equals(word[j])) {
						System.out.println("The dublicate word is :" + word[i]);
					}
					if (!word[i].equals(word[j])) {
						System.out.println("You dont have any dublicate word");
					}
				}

			}

		}
	
	}


