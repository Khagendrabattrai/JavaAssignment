package assignment;

import java.util.Scanner;

//41.Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh
public class Q41SecondWay {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = input.nextLine();// Wehenever we need to take the strings including spaces ....
		name = " " + name; // we take nextLine() method.F
		int las = name.lastIndexOf(' ');

		System.out.println(name);
		System.out.println(las);
		for (int i = 0; i < las; i++) {
			if (name.charAt(i) == ' ') {
				System.out.print(name.charAt(i + 1) + ".");
			}

		}
		System.out.println(name.substring(las + 1));
	}
}
