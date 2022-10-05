package OOPS_EncapSulation;

public class loginPageCalling {
	
	public static void main(String[]args) {
	
	LoginPage lp = new LoginPage("admin", "arst@dm1n", "SecurityChamber");
	System.out.println(lp.getUsername());
	System.out.println(lp.getPassword());
	
	
	

}

}