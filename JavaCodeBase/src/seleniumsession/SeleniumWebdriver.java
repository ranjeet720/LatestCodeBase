package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebdriver {
	
	public static void main(String[] args) {
		
		SeleniumWebdriver launch = new SeleniumWebdriver();
		launch.browser();

		
	}
		
			
		
	public static void browser() {
	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fe%2Frow%2Ficbt-apac-d-new%3Fnorover%3D1%26mkevt%3D1%26mkrid%3D21582-161783-924173-2%26mkcid%3D2%26keyword%3Debay%2520sale%26crlp%3D619232746031_%26MT_ID%3D%26geo_id%3D%26rlsatarget%3Dkwd-296723409344%26adpos%3D%26device%3Dc%26loc%3D1007766%26poi%3D%26abcId%3D%26cmpgn%3D17379475398%26sitelnk%3D%26gclid%3DCj0KCQjwjvaYBhDlARIsAO8PkE3KOjBZ1s9CfbtQ9C14hQvWYvcDpENcf2cyyl2_nx1p5ne_3keR2joaAiV5EALw_wcB");
	String title = driver.getTitle(); // get the  title 
	System.out.println(title);
	
	//Validation point 
	if(title.equals("Google")) { //Here we have use String Manipulation using equals method String comparison
		System.out.println("The title is correct");
	}
		else 
			System.out.println("The title is not correct");
		
		
	
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.quit();
	
	
	}
}
		

