/**
*
*@ Sabrina Mahjabin
**/


import java.util.Scanner;
import java.io.StringWriter;
import java.io.PrintWriter;

public class Task {

	public static void main(String[] args) {
		int age = 25;
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.print("Sabrina Mahjabin");
		String name = sw.toString();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("My name is %s %nand I am %d years old.", name, age);	
	}
}
