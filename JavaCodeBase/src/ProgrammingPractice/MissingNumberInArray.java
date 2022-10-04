package ProgrammingPractice;

public class MissingNumberInArray {
	
	public static void main(String[]args) {
		
		int s[] = {1,2,3,5};
		int sum=0;
		
		
		for(int i=0;i<s.length;i++){
			sum = sum + s[i];
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1;j<=5;j++) {
			sum1 = sum1+j;
		}
		
		System.out.println("Missing Number Of " + (sum1-sum));
		
		
		
		
		//Here the logic we can used that can be applied 
		
		
		
		
		
		
	}

}
