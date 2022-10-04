package ProgrammingPractice;

public class ReverseString {
public static void main(String[]args) {
	
	
	//Program IS About reversing of string it means when there is name availible we need to proceed 
	
	String s ="Ranjeet";
	String rev = "";
	int len = s.length();
	System.out.println(len);
	
	for(int i=len-1;i>=0;i--){
		rev = rev + s.charAt(i);
	}
	
	
	System.out.println(rev);
	
	
	StringBuffer obj = new StringBuffer(s);
	System.out.println(obj.reverse());
	
}
}
