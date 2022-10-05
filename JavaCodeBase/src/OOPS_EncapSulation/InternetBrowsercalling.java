package OOPS_EncapSulation;

public class InternetBrowsercalling {
	
	
	public static void main(String[]args) {
		
		InternetBrowser Br = new InternetBrowser("Chrome", "Alphaversion", "Nimbs");
		System.out.println(Br.getName());
		System.out.println(Br.getPlugin());
		System.out.println(Br.getVersion());
		
		
		System.out.println("**********");
		Br.setName("Morzilla FireFox");
		Br.setPlugin("Beta");
		Br.setVersion("Neeta");
		
		
		System.out.println(Br.getName());
		System.out.println(Br.getPlugin());
		System.out.println(Br.getVersion());
		
		
	}

}
