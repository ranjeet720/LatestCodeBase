package javasession;

public class ConditionalStatmentCase {

	public static void main(String[]args) {
	
		//Maintain Browsers ,Monday to Sunday,
		//Print -- Its working Day 
		//Env -- Dev/QA/UAT/Production 
		// switch case with float and double 
		
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("the browser is chrome");
		}
		
		if(browser.equals("firefox")) {
			System.out.println("the browser is firefox");
		}
		
		if(browser.equals("safari")) {
			System.out.println("the browser is firefox");
		}
		
		if(browser.equals("opera")) {
			System.out.println("the browser is firefox");
		}
		else {
			System.out.println("the browser not listed");
		}
		
		
		switch (browser) {
		case "chrome":
			System.out.println("launch the browser chrome");
			
			break;
			
			//Switch wont work with float,boolean,double,long
			//int,short,byte will work -- 
			//char can be used for vowel testing 

		default:
			break;
		}
		
		
		
		
			
			
			
			
			
			
			
		}

}
