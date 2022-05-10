package day9assignment;

import java.util.Scanner;

public class GoodFormatQ14 {

	public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter name:");
 String name= input . next();
 System.out.println("Enter age:");
 int age= input.nextInt();
 System.out.println("Enter nationality:");
 String nationality= input.next();
 System.out.println("name:"+name);
 System.out.println("age:"+age);
 System.out.println("nationality:"+nationality);
 input.close();
	}

}
