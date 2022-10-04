package ProgrammingPractice;

public class Circumference {
	public static void main(String[]args) {
		Circumference count = new Circumference();
		double ran = count.circumference(5);
		System.out.println(ran);
		double man = count.area(4);
		System.out.println(man);
		
		count.area(3);
		
		
	}
	
	public double circumference(double r) {
		double cir = 2*3.14*r;
		return cir;
	
		
		
	}
	
	
	public double area(double s) {
		
		double are = 3.14*s*s;
//		System.out.println("The value of" + are );
		return are;
	}

}
