package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInArray {
	public static void main(String[] args) {

		ArrayList<String> cloud = new ArrayList<String>();
		cloud.add("Amazon");
		cloud.add("GCP");
		cloud.add("Alibaba");
		cloud.add("Azure");
		cloud.add("Netflix");

		ArrayList<String> usedby = new ArrayList<String>();
		usedby.add("Ranjeet");
		usedby.add("Ravi");
		usedby.add("Ramjan");
		usedby.add("Ranghatt");
		usedby.add("Ranshyam");

		// cloud.addAll(usedby);
		// System.out.println(cloud);

		// cloud.clear();
		// System.out.println(cloud);
		System.out.println(cloud.contains("Alibaba")); // It will returns the true value

		ArrayList<String> listby = new ArrayList<String>(Arrays.asList("Ranjeet", "Ravi", "Saini", "Manipur"));
		System.out.println(listby);
		int i = listby.lastIndexOf("Ravi");
		System.out.println(i);
		listby.remove(1);
		System.out.println(listby);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%3==0); //Here in Lambda we can not use the same variable 
		System.out.println(numbers);
		
		// As as an output it will print only the even numbers 
		
		
	}
}
