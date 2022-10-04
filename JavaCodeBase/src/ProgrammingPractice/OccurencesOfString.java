package ProgrammingPractice;

public class OccurencesOfString {
	
	public static void main(String[]args) {
		String str = "I Love India";
		occurence(str, 'I');
		
	}
	
	public static void occurence(String str , char value) {
		int count =0;
		for(char ch : str.toCharArray()){
			if(ch==value) {
				count++;
				
			}
			
			
		}
		System.out.println(count);
		
		
		
	}

}
