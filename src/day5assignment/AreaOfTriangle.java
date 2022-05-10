package day5assignment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
	 Scanner input  = new Scanner(System.in);
	 System.out.println("Enter base of Triangle:");
	 int b= input .nextInt();
	 System.out.println("Enter height of Traingle:");
	 int h = input. nextInt();
    int  areaOfTraingle= 1/2*b*h;
	System.out.println("Area of Traingle:"+areaOfTraingle);
    input.close();
	}

}
