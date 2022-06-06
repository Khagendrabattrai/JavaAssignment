package assignment;

import java.util.Scanner;

public class QuestionNumber26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the factor of:");
		int a = input.nextInt();
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("The factor of" + a + "is:" + fact);
	}
	

}
