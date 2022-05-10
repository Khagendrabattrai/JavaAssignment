package day5assignment;

import java.util.Scanner;

public class VolumeOfCylinder {
	//Volume of cylinder=pi*r*r*h

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Enter radius of Cylinder:");
int r=input. nextInt();
System.out.println("Enter height of cylinder:");
int h= input.nextInt();
double PI= 3.14;
double volumeOfCylinder= PI*r*r*h;
System.out.println("Volume of cylinder:"+volumeOfCylinder);

input.close();
	}

}