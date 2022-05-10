package day6assignment;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
//Write a program to convert Fahrenheit to Celsius.
Scanner input= new Scanner(System.in);
System.out.println("Enter Fahrenheit:");
int fahrenheit= input.nextInt();
int celcius= (fahrenheit -32) *5/9;
System.out.println("Celcius:"+celcius);

//Write a program to convert Celcius to Fahrenheit.
System.out.println("Enter Celcius:");
celcius= input.nextInt();
fahrenheit= (celcius*5/9)+32;
System.out.println("Fahrenheit:"+fahrenheit);
input.close();

	}

}
