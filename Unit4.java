/**
 * 
 * @author Sabrina Mahjabin
 * @description This program will check if you are legal to drink alchohol
 * 
 **/

import java.util.Scanner;
public class Unit4 {
	public static void main(String[] args) {
		int age;
		String name;
		String option ="can't";
		
		Scanner in = new Scanner(System.in);
		System.out.println("This program will check if you are legal to drink alchohol");
		
		System.out.print("Enter your name: ");
		name = in.next();
		System.out.printf("Ok %s, Enter your age: ", name);
		age = in.nextInt();
		
		//logic
		if (age >= 21) {
			option ="can";
		}
		
		//output
		System.out.printf("You %s drink alchohol", option);
	}
}
