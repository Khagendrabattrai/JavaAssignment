package day7assignment;

import java.util.Scanner;

public class MathematicalE {

	public static void main(String[] args) {
	/*Write a Program for the following MathematicalE Function.
	S=u*t+1\2a*t*t
	Here,

s is the distance

u is the initial velocity

a is the acceleration

t is the time*/
		 Scanner input= new Scanner(System.in);
		System.out.print("Enter initial velocity(u):");
		int u= input. nextInt();
		System.out.print("Enter acceleration(a):");
		int a= input.nextInt();
        System.out.print("Enter time(t):");
        int t= input.nextInt();
        int s=u*t+1/2* a*t*t;
        System.out.print("Distance covered(s):"+s);
        input.close();
       
	}
}
