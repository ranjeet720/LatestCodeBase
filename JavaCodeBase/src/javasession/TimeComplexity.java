package javasession;

import java.util.Arrays;

public class TimeComplexity {
	public static void main (String[]args) {
		
		//This is used as an new keyword Object creation
		
		Object empdata[] = new Object[5];
	     int len = empdata.length; 
	     System.out.println(len);
	   
	     
	     empdata[0] = "Ranjeet";
	     empdata[1] = 'A';
	     empdata[2] = 'M';
	     empdata[3] =  25;
	     empdata[4] = "Saini";
	     
	     
	     System.out.println(Arrays.toString(empdata));
	     System.out.println("*************");
	     
	     //This concept is called as an Object Literals
	     
	     Object userinfo[] = {"Ranjeet",27,'M',false};
	     System.out.println(userinfo.length);
	     System.out.println(Arrays.toString(userinfo));
	     
	    
	     }
	     
		
		
		
		
		
		
		
		
		
		
		
		

	
		
		
		
		
		
	}


