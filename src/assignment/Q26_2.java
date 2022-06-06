package assignment;

import java.util.Scanner;

public class Q26_2 {
	public int factorial() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the factrioal of:");
		int a = input.nextInt();
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}

		return fact;

	}

	public static void main(String[] args) {
		Q26_2 obj = new Q26_2();
		int calculatedFactrioal = obj.factorial();
		System.out.println(calculatedFactrioal);
	}
}
