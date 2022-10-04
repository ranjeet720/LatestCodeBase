package javasession;

public class DoWhileConcept {
	public static void main(String []args) {
		
		
		int m=1;
		do {
			System.out.println(m);
			m++; //If we dont increase the value the it will print continuosly
			if(m==5) {
				break;
			}
		}
		while(true);
	
		
	}

}

