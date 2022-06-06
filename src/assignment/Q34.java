package assignment;

public class Q34 {
//34.⦁	Write a Program to accept 5 values in an array and display their sum.
	public static void main(String[] args) {
int[] arr= {3,4,5,6,7};
int sum= 0;
for (int i=0; i<5;i++) {
	sum= sum+ arr[i]; //here arr[i]=3 in first case.
	
}
System.out.println( "The sum of an array is:"+sum);
	}

}
