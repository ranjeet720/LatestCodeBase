package ProgrammingPractice;

import java.util.ArrayList;
import java.util.List;

public class MethodProgram {
	public static void main(String[] args) {
		MethodProgram obj = new MethodProgram();
		obj.sum(20, 30);
		obj.Employees("Ananda", 55);
		obj.data("Avinash");
		
	}
	
	public boolean sum(int a,int b) {
		boolean flag = false;
		int sum = a+b;
		System.out.println("The total value of is " +  sum  +" ");
		System.out.println(flag);
		return flag;
		
		
		
	}
	
	public void Employees(String name , int age) {
	ArrayList<String> names = new ArrayList<String>();
	         names.add("Ranjeet");
	         names.add("Ravi");
	         names.add("Saini");
	         names.add("Subramanium");
	         names.add("Annada");
	         System.out.println(name    + " " +  "having the" +  " " + "age is  " + age  );
	         
		
		
	}
	
	public void data(String emp) {
		
	List<String> employee = new ArrayList<String>();
	employee.add("Avinash");
	employee.add("Raju");
	employee.add("Aditya");
	employee.add("Ramanujan");
	employee.add("Atharv");
	employee.add("Rajenndar");
	
	String str[] = employee.toArray(new String[0]);
	
	//Here we have to use ierating concept 
	
	for(int i =0;i<str.length;i++) {
		System.out.println(str[i]);
	
	
	}
	
	
	
	
			
	
		
		
		
		
	}

}
