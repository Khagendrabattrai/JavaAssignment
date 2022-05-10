package day5assignment;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal:");
		int principal = input.nextInt();
		System.out.println("Enter time:");
		int time = input.nextInt();
		System.out.println("Enter rate:");
		int rate = input.nextInt();
		int simpleIntrest = principal * time * rate / 100;
		System.out.println("simple intrest:" + simpleIntrest);
input.close();
	}

}
