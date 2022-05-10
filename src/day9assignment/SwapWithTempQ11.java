package day9assignment;

import java.util.Scanner;

public class SwapWithTempQ11 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    System.out.println(" The  value ofx before Sweap:");
	    int x= input.nextInt();
	    System.out.println(" The value of y before sweap: ");
	    int y= input.nextInt(); 
	    int temp= x;/*x=1, y= 2 ,temp= 1 
	    x= y ;       now, x=2 ,y=1*/
	    y = temp ;
	   System.out.println(" Value of x after sweap:"+ x); 
	   System.out.println("Value of y after sweap:"+y);
	   input .close ();

	   	
	}

}
