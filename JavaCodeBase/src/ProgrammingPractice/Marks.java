package ProgrammingPractice;

import java.util.Scanner;


public class Marks {
	public static void main(String[]args) {
		Marks obj = new Marks();
		obj.numbers();
		
		
	}
	
	public boolean numbers() {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks For The Student");
		int score = sc.nextInt();
		
			if (score<=100 && score>=91) {
				System.out.println("They Are Topper With An AA  grade");
			}
			else if (score<=90 && score>=81) {
				System.out.println("They Are Topper With An AB grade");
			}
			else if (score<=80 && score>=71) {
				System.out.println("They Are Topper With An BB  grade");
			}
			else if (score<=70 && score>=61) {
				System.out.println("They Are Topper With An BC  grade");
			}
			else if (score<=60 && score>=51) {
				System.out.println("They Are Topper With An CD  grade");
			}
			else if (score<=50 && score>=41) {
				System.out.println("They Are Topper With An DD  grade");
			}
			
			else {
				System.out.println("Below 40 Are Failed Ones ");
			}
			sc.close();
			

	   return flag;         
	}
	
}
	
	
	

