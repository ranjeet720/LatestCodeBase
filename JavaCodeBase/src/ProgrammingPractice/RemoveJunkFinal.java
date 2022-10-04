package ProgrammingPractice;

public class RemoveJunkFinal {
	public static void main(String[] args) {
		
		String test = "Lets Start The Coding *&&^&^%$%^^&";
		 test = test.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(test);
		
		
	}

}
