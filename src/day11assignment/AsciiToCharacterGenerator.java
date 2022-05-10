package day11assignment;

import java.util.Scanner;

public class AsciiToCharacterGenerator {

	public static void main(String[] args) {
		// 20 Write a program that receives an ASCII code (between 0 – 128)
		// and display its character [example: 97 (input) ->a(output)].

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code between 0 to 128:");
		int ascii = input.nextInt();
		if (ascii >= 0 || ascii <= 128) {
			char asciiChar = (char) ascii;
			System.out.println("The character value of " + ascii + " is: " + asciiChar);
		} else {
			System.out.println("Invalid ASCII");
		}
		input.close();
	}
}
