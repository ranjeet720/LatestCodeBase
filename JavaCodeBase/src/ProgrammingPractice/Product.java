package ProgrammingPractice;

import java.util.Scanner;

public class Product {
	
	public static void main(String[]args) {
    Product obj = new Product();
      obj.Subject();
	
	}
	
	public void Subject() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number");
	int a =sc.nextInt();
	System.out.println("The value of a is " +a);
	System.out.println("Enter the Second Number");
	int b = sc.nextInt();
	System.out.println("The value of b is " +b);
	int sum = a+b;
	System.out.println("The sum of a+b is " +sum);
	String product = Integer.toString(sum) ;
	System.out.println(product);
	
	
	
	
	


	
		
		
	}

}
