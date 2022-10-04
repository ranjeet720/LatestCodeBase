package ProgrammingPractice;

import java.util.Scanner;

public class Even {
	public static void main(String[]args) {
		Even obj = new Even();
		obj.check();
	
		
	}
	
	
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Value");
		int num = sc.nextInt();
		
		if(num%2==0) {
			 System.out.println("The value is an Even and the condition certify ");
			
		}
		else {
			System.out.println("The value as Is  Odd Break the condition exit");
		}
		
	       sc.close();
	       
	}

}
