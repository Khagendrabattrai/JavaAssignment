package day5assignment;

import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
		//write a program to find perimeter of  triangle.
	Scanner input= new Scanner(System.in);
	System.out.println("Enter lenght of side a:");
	int a = input. nextInt();
	System.out .println("Enter the length of side b:");
	int b= input.nextInt();
	System.out.println("Enter the length of side c:");
	int c= input .nextInt();
	int perimeterOfTriangle= a+b+c;
	System.out.println("Perimeter of Triangle:"+perimeterOfTriangle);
	input.close();
	
	
	}

}
