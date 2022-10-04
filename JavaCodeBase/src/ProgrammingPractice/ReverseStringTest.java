package ProgrammingPractice;

public class ReverseStringTest {
	public static void main (String[]args) {
		
		String test = "Welcome To Bangalore";
		int len = test.length();
		System.out.println(len);
		
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+test.charAt(i);
		}
		
		System.out.println(rev);
		
		
		StringBuffer sf = new StringBuffer(test);
		System.out.println(sf.reverse());
		
		
		
		
	}

}
