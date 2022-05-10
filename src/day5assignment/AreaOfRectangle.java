package day5assignment;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
	//Write a program to find the area of a rectangle.
	Scanner input = new Scanner (System.in);
	System.out.print("Enter length:");
	int l= input. nextInt();
	System.out.print("Enter breadth:");
	int b = input .nextInt();
	int areaOfRectangle = l*b;
	System.out.print("Area of rectangle:"+areaOfRectangle);
	
	input.close();
	
		

	}

}
