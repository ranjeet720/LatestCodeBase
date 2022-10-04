package ProgrammingPractice;

public class ReverseInteger {
	public static void main(String[]args) {
		
		int num = 987654;
		int rev = 0;
		
		while(num!=0){
			
			//Logic to be used here that it can multiply with the 
			
			rev = rev*10 + num%10; //456789
			num = num/10;//98765
			
			
			
			
		}
		
		System.out.println("Reverse Of An Integer" + rev);
		
		
	}

}
