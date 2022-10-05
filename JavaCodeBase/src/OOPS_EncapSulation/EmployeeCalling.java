package OOPS_EncapSulation;

public class EmployeeCalling {
	
	public static void main(String[]args) {
		Employee e = new Employee();//Here you no need to pass any argument becaise its an object of an class not an constructor
		e.setEmpName("Ranjeet Kumar");
		e.setEmailId("ranjeet.kumar@microfocus.com");
		e.setEmpid(22934);
		
		System.out.println(e.getEmailId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpid());
		
		
		
		
		
		
		
		
		
		
		
	}

}
