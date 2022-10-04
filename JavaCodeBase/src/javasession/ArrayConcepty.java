package javasession;

import java.util.Arrays;

public class ArrayConcepty {
	public static void main(String[] args) {
		
		//int i[] = {10,20,30,40};
		int i [] = new int[4];
		 i[0] = 10;
		 i[1] = 30;
		 i[2] = 40;
		 i[3] = 50;
		 
		
		System.out.println(i[0]);	
		System.out.println(Arrays.toString(i));
		
		int len = i.length;
		System.out.println(len);
		System.out.println("***************");
		for(int j=0;j<=len-1;j++) {
			System.out.println(i[j]);
			if(i[j]==30) {
				System.out.println("Hello 30");
				//break;
			}
		}
		
		
		
		//for each loop 
		
		System.out.println("Print The For Each Loops");
		
		int sum [] = {32,45,98,21};
		
		for(int v:sum) {
			if(v==sum[3]) {
				System.out.println("Good Marks");
			}
				
			System.out.println(v);
		}
		
		//Array Literals 
		
		
		
	}

}
