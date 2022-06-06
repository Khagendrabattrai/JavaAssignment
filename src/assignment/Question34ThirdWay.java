package assignment;

import java.util.Scanner;

public class Question34ThirdWay {

	public static void main(String[] args) {
		int[] arr = new int[6];
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element of an  array:");
			arr[i] = input.nextInt();
			sum = sum + arr[i];
		}
	}

}
