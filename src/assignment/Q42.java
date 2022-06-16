package assignment;

import java.util.Scanner;

public class Q42 {
 //42.	Write a program to reverse the string.
	
public  Q42() {
	
	Scanner input= new Scanner(System.in);
	System.out.println("Enter any string:");
	String a=  input.nextLine();	  
	StringBuffer sb= new StringBuffer(a);
	sb.reverse();
	System.out.println("The reverse of string" +a+ " is "+sb);
}
	public static void main(String[] args) {
		
		Q42 n= new Q42();
		
		
		  
		
		

	}

}
