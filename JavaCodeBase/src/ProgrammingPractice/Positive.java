package ProgrammingPractice;

import java.util.Scanner;

public class Positive {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second value");
		int b = sc.nextInt();
		if(a>0) {
			System.out.print("a is positive number" + a);
			
		}
		else {
			System.out.println("b is negative number" + b);
		}
	}

}
