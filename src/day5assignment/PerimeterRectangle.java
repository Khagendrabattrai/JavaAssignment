package day5assignment;

import java.util.Scanner;

public class PerimeterRectangle {

	public static void main(String[] args) {
//Write a program to find the parameter of a rectangle.
Scanner input= new Scanner(System.in);
System.out.println("Enter length:");
int length = input. nextInt ();
System.out.println("Enter breadth:");
int breadth= input.nextInt() ;
int perimeterOfRectangle = 2*(length+ breadth);
System.out.println("perimeter:"+perimeterOfRectangle);

input.close();
	}

}
