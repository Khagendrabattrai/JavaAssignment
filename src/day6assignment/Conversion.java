package day6assignment;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		/*	Write a program that converts pounds into kg. 
		The program prompts the user to enter a number of pounds, 
		converts it to kg and displays the result [1 pound is 0.454 kg]*/
  Scanner input = new Scanner (System.in);	
  System.out.print("Enter pound:");
  int pound =input. nextInt(); 
  float kilogram= pound * 0.454f;
  System.out.println("Kilogram:"+kilogram);
  input. close();
 
  
	}

}
