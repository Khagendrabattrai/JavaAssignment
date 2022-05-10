package day5assignment;

import java.util.Scanner;

public class AreaOfCircle extends PerimeterOfCircle {

	public static void main(String[] args) {
//write a program to find the area of circle:	
Scanner input = new Scanner(System.in);
System.out.println(" Enter radius:");
int r= input.nextInt();
double pi=  3.14 ;
double  areaOfCircle= pi*r*r;
System.out.println( "Area of Circle "+areaOfCircle);
input.close();

}
	

}