package ProgrammingPractice;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value");
		int a = sc.nextInt();
		System.out.println("Value of a is" + " "+ a );
		System.out.println("Enter the Second value");
		int b = sc.nextInt();
		System.out.println("Value of b is" + " "+ b );
		System.out.println("Enter the Third value");
		int c = sc.nextInt();
		System.out.println("Value of c is" + " " + c );
           if(c>b) {
        	   System.out.println("c is the laregest number" + c);
        	   
           }
           else {
        	   
        	   System.out.println("c is smalest among 3");
           }
	}

}
