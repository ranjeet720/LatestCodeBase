package ProgrammingPractice;

import java.util.Scanner;

public class FarenhiteToCelcius {
	
	 float temperature;
	 int temp;
	 Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	FarenhiteToCelcius obj = new FarenhiteToCelcius();
	obj.f2c();
	obj.c2f();

		
	}
	
	
	public void f2c() {
		System.out.println("Enter Temperature of Body in F2C");
		temperature = sc.nextFloat();
		temperature = ((temperature -32)*5)/9;
		
		System.out.println("Farenhite To celcius" + temperature);
		
	}
	
	public void c2f() {
		System.out.println("Enter Temperature of Body in C2F");
		temp=sc.nextInt();
		temp=((temp*9/5))+32;
		
		System.out.println("Celcious To Farenhite" + temp);
	}
		
		
		
		//30 degree 
		
		
	}


