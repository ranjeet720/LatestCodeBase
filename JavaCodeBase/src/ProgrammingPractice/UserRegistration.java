package ProgrammingPractice;

public class UserRegistration {
	String FirstName;
	String LastName;
	String Email;
	int Telephone;
	String Password;
	String PwdCfm;
	
		
public UserRegistration(String FirstName, String LastName, String Email, int Telephone, String Password,String PwdCfm) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Telephone = Telephone;
		this.Password = Password;
		this.PwdCfm = PwdCfm;
	}


public void UserReg(){
	System.out.println("Enter the First Name Of an User" + " " +FirstName );
	System.out.println("Enter the Last Name Of an User"+ " " +LastName);
	System.out.println("Enter the Last Name Of an User"+ " " +Email);
	System.out.println("Enter the Last Name Of an User" + " " +Telephone);
	System.out.println("Enter the Last Name Of an User" + " " +Password);
	System.out.println("Enter the Last Name Of an User" + " " +PwdCfm);
	
	
}



public static void main(String[] args){
	
	UserRegistration user = new UserRegistration("Ranjeet", "Saini", "ranjeet.saini@gmail.com", 89506, "arst@dm1n", "arst@dm1n");
			user.UserReg();
			
			System.out.println("************************");
			
			UserRegistration user2 = new UserRegistration("Ravi", "Saini", "ravi.saini@gmail.com", 89501, "arst@dm", "arst@dm");
			user2.UserReg();
			
			
	
}
}