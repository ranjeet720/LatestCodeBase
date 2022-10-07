package OOPS_EncapsulationAdvannced;

public class EmployeeCalling {
	
	
	public static void main(String[]args) {
		
		
		Employee e = new Employee("Ranjeet Saini", 27,34567,true,"m");
		
		e.getName();
		e.getAge();
		e.getSalary();
		e.isActive();
		e.getGender();
		
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
		System.out.println(e.getGender());
		System.out.println(e.isActive());
		
		System.out.println("******************");
		
		e.setName("Ravi");
		e.setActive(false);
		e.setAge(32);
		e.setSalary(4432);
		e.setGender("m");
		
		
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
		System.out.println(e.getGender());
		System.out.println(e.isActive());
		
		
		
		
	}

}
