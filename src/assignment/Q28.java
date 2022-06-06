package assignment;

public class Q28 {
	// note : i am using while loop to solve this question.
	/*
	 * while (conditions) { //statements
	 * 
	 * update_expression(increment, decrement); }
	 */

	public static void main(String[] args) {
//28.	Write a Program to reverse the given number. //123 => 321
		int number = 123;
		int remainder = 0;
		int reverseNumber = 0;
		while (number > 0) {
			remainder = number % 10;
			System.out.println("The reverse number of" + number + "is:" + remainder);
			number = number / 10;
		}

	}
}
