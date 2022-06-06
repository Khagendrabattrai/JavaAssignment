package assignment;

import java.util.Scanner;

public class Q27 {
//27.Write a program that prompts the user to enter the number of students 
//and each student’s name and score. Finally display the student with the highest score.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String highestScoreName ="";
		double highestScore = 0;
		System.out.println("Enter the  number of students appeared for the exam:");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {

			System.out.println("Enter the name of the student:");
			String name = input.next();
			System.out.println("Enter the marks scored by " + name + ":");
			double score = input.nextDouble();
			
			if (score > highestScore) {

				highestScore = score;
				highestScoreName = name;

			}
		}

		System.out.println(" Name of the Student with the highest score: " + highestScoreName);
	}
}
