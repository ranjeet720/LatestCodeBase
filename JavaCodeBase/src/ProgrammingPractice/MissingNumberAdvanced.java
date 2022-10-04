package ProgrammingPractice;

public class MissingNumberAdvanced {
	public static void main(String[] args) {
		
		
		int num[] = {1,2,3,5};
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum = sum + num[i];
			
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=0;j<5;j++) {
			sum1 = sum+j;
		}
		System.out.println(sum1);
		System.out.println("Missing Number Is" + (sum1-sum));
		
		
		
	}

}
