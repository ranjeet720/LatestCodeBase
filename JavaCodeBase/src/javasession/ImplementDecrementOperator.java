package javasession;

public class ImplementDecrementOperator {
	public static void main(String[]args) {
		
		//++ -- Increase the value 
		// -- Decrease the value 
		//Post-Increment Once 
		
		int a = 1;
		int b = a++;
		//Here what happened a value is 1 and the b will get the value of
		System.out.println(a);
		System.out.println(b);
		
		int g =-98;
		int h = g++;
		System.out.println(g);
		System.out.println(h);
		
		//Pre -Increment -- The value should be increased from the initialisation ;
		int c = 1;
		int d = ++c;
		System.out.println(c);
		System.out.println(d);
		
		int t = -99;
		int p = ++t;
		System.out.println(t);
		System.out.println(p);
		
		int k = 2;
		int l = k--;
		System.out.println(k);
		System.out.println(l);
		
		int u =2;
		System.out.println(u++);
		
		
		
		
	}

}
