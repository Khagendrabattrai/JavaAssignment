package assignment;

public class Q25 {

	public static void main(String[] args) {
//25.	Write a Program to sum 1 to nth natural numbers.
		int n = 10;
		int sum = 0;
		for (int a = 1; a <= n; a++) {
			sum = sum + a;
		}
		System.out.println(sum);
	}
}
