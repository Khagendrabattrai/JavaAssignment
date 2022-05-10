package day9assignment;

import java.util.Scanner;

public class SwapWithoutTempQ11 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    System.out.println(" The  value ofx before Sweap:");
	    int x= input.nextInt();
	    System.out.println(" The value of y before sweap: ");
	    int y= input.nextInt();  
	    x=x+y;//1+2=3
	    y=x-y;//3-2=1
	    x=x-y;//3-1
	    System.out.println("The value of x after sweap:"+x);
	    System.out.println("The value of y after sweap:"+y);
	    input.close();
	}

}
