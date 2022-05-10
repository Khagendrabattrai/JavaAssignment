package day5assignment;

import java.util.Scanner;

public class PerimeterOfCircle {
//Write a program to find the perimeter of circle:
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter radius:");
int radius= input.nextInt();
int areaOfCircle= 2*22/7*radius;
System.out.println("areaOfCircle:"+areaOfCircle);

input.close();
	}

}
