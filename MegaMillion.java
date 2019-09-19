/**
 * 
 * @author Sabrina Mahjabin
 * @description This program will check if you are legal to drink alchohol
 * 
 **/

import java.util.Random;
import java.util.Scanner;

public class MegaMillion {
		public static void main(String[] args) {
		Random randGen = new Random();
		int amountDollar;
		int costDollar;
		int betAmount; 
		int num1, num2, num3, num4, num5, num6;
		
		System.out.println(randGen.nextInt(60)+1);
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the amount of dollar: ");
		amountDollar = in.nextInt();
		
		System.out.print("Enter the amount to bet on: ");
		betAmount = in.nextInt();
		
		System.out.print("Enter six numbers: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		num5 = in.nextInt();
		num6 = in.nextInt();
		
		System.out.print("These are the random numbers: ");
		int rnum1 = randGen.nextInt(60)+1;
		int rnum2 = randGen.nextInt(60)+1;
		int rnum3 = randGen.nextInt(60)+1;
		int rnum4 = randGen.nextInt(60)+1;
		int rnum5 = randGen.nextInt(60)+1;
		int rnum6 = randGen.nextInt(60)+1;
		System.out.print(rnum1 + " " + rnum2 + " " + rnum3 + " " + rnum4 + " " + rnum5 + " " +rnum6);
		
		//logic
				if (num1 == rnum1 ) {
				System.out.println("match");
				}
				else if (num2 == rnum2 ) {
					System.out.println("match");
				}
				else if (num3 == rnum3 ) {
					System.out.println("match");
				}
				else if (num4 == rnum4 ) {
					System.out.println("match");
				}
				else if (num5 == rnum5 ) {
					System.out.println("match");
				}
				else if (num6 == rnum6 ) {
					System.out.println("match");
				}
				else {
					System.out.println("No match found");
				}
			
	}
}

//Declare variable to hold amount of dollar
//Declare variable for cost of ticket
//Prompt the user for the amount
//  of dollars to bet on
		
//store amount into amount of dollar
//   variable 
		
//Prompt the user to enter six numbers
//   create a variable for each value
		
//Randomly generate six numbers and compare