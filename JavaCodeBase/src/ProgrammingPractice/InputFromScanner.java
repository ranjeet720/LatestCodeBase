package ProgrammingPractice;

import java.util.Scanner;

public class InputFromScanner {
	public static void main(String[] args ) {
		
		int a;
		String b;
		short n;
		byte c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of integer");
		a= sc.nextInt();
		System.out.println(a);
		
		System.out.println("Enter the value of Stringer");
		b= sc.next();
		System.out.println(b);
		
		System.out.println("Enter the value for short");
		n = sc.nextShort();
		System.out.println(n);
		
		
		System.out.println("Enter the value of byte");
		c = sc.nextByte();
		System.out.println(c);
		
		
		
		
		
	}

}
