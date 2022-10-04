package Inheritance;

public class MethodO {
	
	//Method Overloading States Where Method Name Is Same But Parameters Is Different
	
	
	public void fooddel(int phone,String password) {
		System.out.println("User having the Samsung number is " +phone + " " + "using an "  +password);
		
		
	
	}
	public void fooddel(int phone,int otp) {
		System.out.println("User having the Samsung number is " +phone + " " + "using an "  +otp);
	}
	public void fooddel(String username,String password) {
		System.out.println("User having the Samsung number is " +username + " " + "using an "  +password);
		
	}
	public void fooddel(String username,String passwod,int otp) {
		System.out.println("User having the Samsung number is " +username + " " + "using an "  +passwod + " " + "with an otp" +otp);
		
	}
	
	
	public static void main(String[]args) {
		MethodO test = new MethodO();
		test.fooddel(989674489, 223);
		System.out.println("*********First Method **********");
		test.fooddel(895063, "Master");
		System.out.println("*********Second Method **********");
		test.fooddel("Admin", "arst@dm1n");
		System.out.println("*********Third Method **********");
		test.fooddel("admin", "Welcome@dm1n", 2234);
		System.out.println("*********Exit Method **********");
		
	
	

}
}
