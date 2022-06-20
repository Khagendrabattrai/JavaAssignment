package assignment;


import java.util.Scanner;

public class Q45SecondWay {

	public static void main(String[] args) {
		int[] arr = new int[3];// 3 is size of an index (0 , 1 ,2 index)
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter number1:");
			int a = input.nextInt();
			System.out.println("Enter number2:");
			int b = input.nextInt();
			arr[3] = division(a, b);
			System.out.println(arr[2]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException abc) {
			System.out.println(abc);
			input.close();
		}
	}

	public static int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	
	}
}
