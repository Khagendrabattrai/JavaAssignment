package assignment;

import java.util.Scanner;

public class Q45 {
//45.	Write a program to trap the exception handling to trap the divided by... 
//	zero and out of index value in array.

	public static void main(String[] args) {
		int arr[] = new int [3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  first number:");
		int a = input.nextInt();
		System.out.println("Enter the second number:");
		int b = input.nextInt();
		try { arr[3]  =  a / b;
		System.out.println("The quotient is:"+ arr[3]);}
	catch (ArithmeticException |ArrayIndexOutOfBoundsException c) {
		System.out.println(c);
		input.close();
	
	}
		
}
}
