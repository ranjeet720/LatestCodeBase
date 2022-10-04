package javasession;

import java.util.Arrays;

public class Company {
	
	
	public boolean GetEmployeeDevice(String EmployeeName) {
		System.out.println("Names should be from the engineering team");
		boolean flag = false;
		
		switch(EmployeeName) {
		case "Ranjeet":
			String name[] = {"MacBook","One-Plus","HeadSet","BluetoothHeadphone","Mouse","Keyboard"};
			System.out.println("Ranjeet Having these device " + Arrays.toString(name));
			flag =true;
			//break;
			
//		case "MacBook":
//		case "One-Plus":
//		case "System":
			//break;
		
		default:
			System.out.println("Check the value ");
			break;
		
		}
		return flag;
		
		
	}
	
	

	public static void main(String[] args) {
		Company gt = new Company();
		gt.GetEmployeeDevice("Ranjeet");
		
		
		//We have to right an function Give me the employee name and the devices given them 
		
	}

}
