package HackerRank;
import java.util.Scanner;

public class IfElseCondition {
	
//	Given an integer, , perform the following conditional actions:
//
//		If n is odd, print Weird
//		If n is even and in the inclusive range of 2 to 5 , print Not Weird
//		If n is even and in the inclusive range of  6 to 20 , print Weird
//		If n is even and greater than 20 , print Not Weird
	
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.println("Enter the value");
	        int N = scanner.nextInt();
	         if(N%2!=0 || N%2==0 && N>=6 && N<=20){
	            System.out.println("Weird");
	        }
	        else{
	            System.out.println("Not Weird");
	        }
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	    }
	}
	


