package day11assignment;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
//Write a program to calculate leap year.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = input.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Entered year is leap year .");
		} else {
			System.out.println("entered year is not leap year");
		}
		input.close();
	}
}
