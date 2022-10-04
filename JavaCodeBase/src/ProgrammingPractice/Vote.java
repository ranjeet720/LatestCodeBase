package ProgrammingPractice;

import java.util.Scanner;

public class Vote {
	int age ;
	public static void main(String[]args) {
		Vote des = new Vote();
         des.check();
	
	}
	
	public int  check() {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter the gender ");
		String gender = sc.next();
		System.out.println("Enter the age ");
		int store = sc.nextInt();
		if(store>18 && store<60 && gender.equals("f")) {
			System.out.println("Elgible For Voting");
		}
		else if(store>18 && store<60 && gender.equals("m")) {
			System.out.println("Elgible For Voting");
		}
		else if(gender.equals("others")) {
			System.out.println("Not Elgible For Voting");
			
		}

		else {	
		System.out.println(gender.equals("others") + " " + "Not Eligible For Voting");
		}
		
		return store;
	}

}
//17 <18 
//61<60