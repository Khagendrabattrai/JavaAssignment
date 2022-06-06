package assignment;

public class Q32 {
//⦁	Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

	public static void main(String[] args) {
		int n = 4;
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm = 0;
		System.out.print("The fibonaci series till nth term:");
		System.out.print(firstTerm + " ");
		System.out.print(secondTerm + " ");

		for (int i = 0; i <= n; i++) {

			nextTerm = firstTerm + secondTerm;
			System.out.print(nextTerm + "  ");
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			

		}

	}

}
