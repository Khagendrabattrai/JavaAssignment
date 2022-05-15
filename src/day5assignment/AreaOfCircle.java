package day5assignment;

import java.util.Scanner;

public class AreaOfCircle extends PerimeterOfCircle {
/*write a program to find the area of circle:
write  a program to find the area of circle */
	
	public static void main(String[] args) {	
Scanner input = new Scanner(System.in);
System.out.println(" Enter radius:");
int r= input.nextInt();
double pi=  3.14 ;
double  areaOfCircle= pi*r*r;
System.out.println( "Area of Circle "+areaOfCircle);
input.close();

}
	

}