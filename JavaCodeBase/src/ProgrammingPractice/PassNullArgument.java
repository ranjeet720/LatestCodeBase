package ProgrammingPractice;

public class PassNullArgument {
	
	public static void main (String[]args) {
		//ranjeet(10);
		ranjeet ("Saini");
		ranjeet("Object Argument");
		
		
	

}
	
	//public static void ranjeet (int num) {
		
		//System.out.println(num);
	//}
	
	public static  void ranjeet(String s1) {
		System.out.println(s1);
		
	}
	
	public static void ranjeet(Object o) {
		System.out.println(o);
	}
	
	
	
}



