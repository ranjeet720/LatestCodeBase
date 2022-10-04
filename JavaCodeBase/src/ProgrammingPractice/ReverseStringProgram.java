package ProgrammingPractice;

public class ReverseStringProgram {
	
	//Write an program to reverse an string "Welcome To India"
	
	
	public static void main (String[] args) {
		
		String str = "Welcome To India";
		int len = str.length();
				System.out.println(len);
				
				String rev ="";
				
				
	
				for(int i=len-1;i>=0;i--){
					rev = rev + str.charAt(i);
					
				}
				
				System.out.println(rev);
				
				
				StringBuffer ran = new StringBuffer(str);
				System.out.println(ran.reverse());
				
				
				
	}
	

}
