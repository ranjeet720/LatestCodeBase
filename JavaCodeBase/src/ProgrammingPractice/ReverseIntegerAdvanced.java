package ProgrammingPractice;

public class ReverseIntegerAdvanced {
	
	public static void main(String[]args) {
		
		int num = 989667;
		int rev = 0;
		
		while(num!=0) {
			
			 rev = rev * 10 + num%10;
			 num = num/10;
			
			
		}
		
		System.out.println("Reverse of an integer" + rev);
		
		
		
	}

}
