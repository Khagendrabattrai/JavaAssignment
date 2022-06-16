package assignment;

public class Q37 {
//36. ⦁	Write a function to find the second largest number in a given array.
	
	public int[]  number() {
		int[] arr = {  10,30,40,20};
		return arr;}
	public void number2(int[] arr) {
		int largestNumber = 0;
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestNumber) {
				secondLargest = largestNumber;
				largestNumber = arr[i];}

			else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
	System.out.println(secondLargest);

	}

	public static void main() {
		Q37 j = new Q37();
		int[]arr=  j.number();
		j.number2(arr);
	}
}
