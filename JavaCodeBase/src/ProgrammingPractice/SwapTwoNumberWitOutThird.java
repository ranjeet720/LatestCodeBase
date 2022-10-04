package ProgrammingPractice;

import java.util.Scanner;

public class SwapTwoNumberWitOutThird {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		System.out.println("Enter the value of y");
			y=sc.nextInt();
			
			x = x+y;
			System.out.println("Value of data" + x);
			y= x-y ;
			System.out.println("Value of data" +y);
			x = x -y;
			System.out.println("Value of data" +x);
			
			
			sc.close();
				
		
		
	}

}
