package assignment;

import java.util.Scanner;

//26.	Write a program to print the factorial number of given numbers.
public class Q26 {
	public void factorial() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the factrioal of:");
		int a = input.nextInt();
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Q26 obj = new Q26();
		obj.factorial();
	}

}
