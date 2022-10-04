package seleniumsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayRegistration extends SeleniumWebdriver {
	
	public static void main (String[]args) {
	
		SeleniumWebdriver OpenBrowser = new SeleniumWebdriver();
		EbayRegistration test = new EbayRegistration();
		OpenBrowser.browser();
		test.Registration();
		
		
		
	}
	
	public static void Registration () {
		WebDriver driver = new ChromeDriver();
		//driver.findElement(By.id("firstname")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Tom");
		
		
		
		
	
	
		
	}

}
