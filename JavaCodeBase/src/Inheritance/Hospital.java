package Inheritance;

public class Hospital {
	
	int phonenumber;
	String Doctor;
	boolean avail;
	char ward;
	long time;
	String treat;
	String medicine;
	
	public void availiablity(String doctor,int age) {
		System.out.println(doctor + " " + "Having an age of" + age +  "Availible to check the patients");
		
	}
	
	public void treatment() {
		Doctor = "Mr. Ranjeet Saini";
		ward = 'A';
		treat = "bones";
		System.out.println(Doctor + " " + "checking" + " " + " " + ward + "for" + " " + treat  );
		
	}
	
	public void prescription(String medicine,int age) {
		System.out.println("Patient Has given" + " " + medicine + " " + "with an age of " + age );
		
	}
	
	public static void main(String[] args) {
		Hospital check = new Hospital();
		check.availiablity("Dr.Ranjeet Saini",25);
		check.treatment();
		check.prescription("Combiflaim", 29);
		
		
		System.out.println("****************");
		
		
		Fortis  name = new Fortis();
		name.availiablity("Dr.Manjeet Saini", 53);
		name.prescription("Paracetamol", 39);
		
		System.out.println("****************");
		
		Appolo apo = new Appolo();
		apo.availiablity("Dr,Ravinder Saini", 29);
		apo.prescription("Lanzol30", 94);
		
		
		System.out.println("*****************");
		
		Max ma = new Max();
		ma.availiablity("Dr.Anand Saini", 35);
		ma.prescription("Dr.Naveen Brij", 49);
		
		
		
		
		
	}

}
