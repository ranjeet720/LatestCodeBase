package ProgrammingPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateElementsInArray {
	public static void main(String[]args) {
		
		
		String name[] = {"Ranjeet","Java","Mohit","Saini","Monika","Saini"};
		System.out.println(name.length);
		
		
		//Lets implement the first logic here using ON2 
		
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])){
					System.out.println(name[i]);
					
					
				}
				
				
				
				
			}
		}
		
		
		Set <String> object = new HashSet<String>();
		for(String namestore:name){
			if(object.add(namestore)== false) {
				System.out.println(namestore);
				
				
			}
		}
		
		
		Map <String,Integer> storemap = new HashMap<String,Integer>();
		for(String namestores:name) {
		 Integer count = storemap.get(namestores);
		 if(count==null) {
			 storemap.put(namestores, 1);
			 
			 
		 }
		 else {
			 storemap.put(namestores, ++count);
		 }
		}
		
		Set<Entry<String,Integer>> entryset = storemap.entrySet();
		for(Entry<String,Integer> entry:entryset) {
			if(entry.getValue()>1) {
				
				System.out.println("Duplicate Element Of an Array" + entry.getKey());
			}
			
			
		}
		
		
		
		
		
	}

}
