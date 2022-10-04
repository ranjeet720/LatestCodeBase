package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class NewOne {
	
	public static void main(String[]args) {
		
		ArrayList<Object> employes = new ArrayList<Object>();
		employes.add("Ranjeet");
		employes.add('M');
		employes.add(26);
		employes.add("ranjeet.kumar@microfocus.com");
		
		
		for(int i=0;i<employes.size();i++) {
			System.out.println(employes.get(i));
			//In arrays we have length instead of size 
			
		}
		
		
		
	}

}
