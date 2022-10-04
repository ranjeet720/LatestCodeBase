package ProgrammingPractice;

public class AdvanceLargestAndSilent {
	public static void main(String[]args) {
		
		int numbers[] = {34,100,98,87,89};
		int largest = 0;
		int smallest =0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
		}
		
		for(int j=0;j<numbers.length;j++) {
			if(numbers[j]<smallest) {
				smallest = numbers[j];
			}
		}
		
		System.out.println("Largest Number Is"+ largest);
		System.out.println("Smallest Number Is" + smallest);
		
		
			
			
		}

}
