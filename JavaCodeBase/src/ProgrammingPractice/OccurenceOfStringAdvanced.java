package ProgrammingPractice;

public class OccurenceOfStringAdvanced {
	public static void main(String[]args) {
		
		String str = "My Native Is Rohtak";
		occurence(str,'a');
		occurence(str,'N');
		occurence(str,'I');
		occurence(str,'s');
		occurence(str,'R');
		occurence(str,'r');
		occurence(str,'k');
		occurence(str,'v');
		occurence(str,'e');
		occurence(str,'m');
		occurence(str,'y');
	}
	
	public static void occurence(String str , char val) {
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch==val) {
				count++;
			}
		}
		
		System.out.println(val + ":" + count);
		
	}
	

}
