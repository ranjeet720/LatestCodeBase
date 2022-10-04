package javasession;

public class EmployeeConcept {
	

		// class vars:
		String name;
		int age;
		double salary;
		boolean isPerm;

		public static void main(String[] args) {

			// create the object: new keyword
			EmployeeConcept e = new EmployeeConcept();
			e.name = "Vijay";
			e.age = 25;
			e.salary = 12.33;
			e.isPerm = true;
			
			System.out.println(e);

			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.salary);
			System.out.println(e.isPerm);
			
			EmployeeConcept e1 = new EmployeeConcept();
			e1.name = "Peter";
			System.out.println(e1.name);//Peter
			System.out.println(e1.age);
			System.out.println(e1.salary);
			System.out.println(e1.isPerm);
			
			//No ref
			new Employee().name = "Tom";//no ref object
			new Employee().age = 30;
			
			//null ref object:
			EmployeeConcept e3 = new EmployeeConcept();
			e3 = null;
//			e3.name = "Naveen";//NPE
//			System.out.println(e3.name);
			
			EmployeeConcept e4 = null;
			System.out.println(e4.name);
			

		}

	}


