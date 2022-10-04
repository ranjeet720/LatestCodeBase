package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class RegistrationNewUser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fe%2Frow%2Ficbt-apac-d-new%3Fnorover%3D1%26mkevt%3D1%26mkrid%3D21582-161783-924173-2%26mkcid%3D2%26keyword%3Debay%2520sale%26crlp%3D619232746031_%26MT_ID%3D%26geo_id%3D%26rlsatarget%3Dkwd-296723409344%26adpos%3D%26device%3Dc%26loc%3D1007766%26poi%3D%26abcId%3D%26cmpgn%3D17379475398%26sitelnk%3D%26gclid%3DCj0KCQjwjvaYBhDlARIsAO8PkE3KOjBZ1s9CfbtQ9C14hQvWYvcDpENcf2cyyl2_nx1p5ne_3keR2joaAiV5EALw_wcB");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ravina");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sainina");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ravi.sainiai@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Saini@432314");
		driver.findElement(By.cssSelector("#EMAIL_REG_FORM_SUBMIT")).getText();
		System.out.println("Registration Succeded");
		
		
		
		
		
		
		
		
	}
}