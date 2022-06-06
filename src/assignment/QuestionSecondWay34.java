package assignment;

import java.util.Scanner;

public class QuestionSecondWay34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of an array:");
		int a= input.nextInt();
		int[] arr = new int[a];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element of an  array:");
			arr[i] = input.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum of an array is:" + sum);
	}
}
