package ProgrammingPractice;

public class LargestAndSmallestInArray {
	public static void main(String[]args){
		
		int numbers[]= {23,67,100,443,100};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>largest) {
				largest=numbers[i];
				
			}
		}
		
		for(int j=0;j<numbers.length;j++) {
			if(numbers[j]<smallest) {
				smallest=numbers[j];
			}
		}
		
		System.out.println("Here the largest number" + largest);
		System.out.println("Here the smallest " + smallest);
		
		
		
		
		
		
		
	}

}
