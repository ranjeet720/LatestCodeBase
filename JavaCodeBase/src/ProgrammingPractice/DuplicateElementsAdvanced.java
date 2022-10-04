package ProgrammingPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsAdvanced {
	
	public static void main(String[]args) {
		
		String Infra[] = {"Amazon","GCP","Amazon","Alibaba","GoogleCloud","GoogleCloud"};
		System.out.println(Infra.length);
		
		for(int i=0;i<Infra.length;i++) {
			for(int j=i+1;j<Infra.length;j++) {
				
				if(Infra[i].equals(Infra[j])) {
					System.out.println(Infra[i]);
				}
				
			}
			
		}
		
		Set <String> cloud = new HashSet<String>();
		for(String module:Infra) {
			if(cloud.add(module)==false) {
				System.out.println(module);
			}
		
		
			
		}
		
		
		Map<String,Integer> inframap = new HashMap<String,Integer>();
		for(String mod:Infra) {
			Integer count = inframap.get(mod);
			
			if(count==null) {
			inframap.put(mod, 1);
		}
		else {
			inframap.put(mod, ++count);
	
				
				
		}
		
		
			Set<Entry<String,Integer>> entryset = inframap.entrySet();
			for(Entry<String,Integer> entry : entryset) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey());
				}
			}
		
		
		
		
	}

}
}
