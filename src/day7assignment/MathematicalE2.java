package day7assignment;

import java.util.Scanner;

public class MathematicalE2 {

	public static void main(String[] args) {
		//write a for.................
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the measure of side a: ");
		int a = input.nextInt();
		System.out.print("Enter the measure of side b:");
		int b= input.nextInt();
		System.out.print("Enter the measure of side c:");
		int c= input.nextInt();
		System.out.print("Enter the semiperimeter of traingle s:");
		double s= (a +  b+ c)/2;
	    double area =   Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("area:"+area);
		input.close();
	}
	

}
