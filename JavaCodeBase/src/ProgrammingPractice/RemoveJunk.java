package ProgrammingPractice;

public class RemoveJunk {
	public static void main(String[]args) {
		
		String str = "This is the best way to utilise *&%^$%^^&";
		
		//Here we can use the logic in which Regex expression can be used
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	
		
		
	}

}
