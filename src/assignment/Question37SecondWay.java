package assignment;

public class Question37SecondWay {

	public static void main(String[] args) {
			int largestNumber = 0;
			int secondLargest = 0;

			int[] arr = {  10,30,40,20};
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > largestNumber) {
					secondLargest = largestNumber;
					largestNumber = arr[i];
					
				}

				else if (arr[i] > secondLargest) {
					secondLargest = arr[i];
				}
			}
		System.out.println( "The second largest number is:"+secondLargest);
		}
	}


