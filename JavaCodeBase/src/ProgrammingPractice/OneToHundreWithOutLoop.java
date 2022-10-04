package ProgrammingPractice;

public class OneToHundreWithOutLoop {
	
	public static void main (String[] args) {
		number(1);
		
		//Here we can use the recursive function to print the data 		
	}
	
	public static void number(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			number(num);
		}
		
		
	}

}
