package ProgrammingPractice;

public class AlternateMarks {
	public static void main(String[]args) {
		AlternateMarks obj = new AlternateMarks();
		obj.test(43);
	
		
		
	}
	
	public void test(int num) {
		
		for(int i = 40;i<=100;i++) {
			if(num<30) {
				System.out.println("The grade of student is DD");
			}
			else {
				System.out.println("The grade of student is less");
			}
		}
		System.out.println(num);
		
	}

}
