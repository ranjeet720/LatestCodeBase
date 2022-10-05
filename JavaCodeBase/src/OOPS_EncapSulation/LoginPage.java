package OOPS_EncapSulation;

public class LoginPage {
	
	private String username;
	private String password;
	public String role;
	
	
	public LoginPage(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
