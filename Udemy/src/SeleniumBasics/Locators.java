package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\1.PeopleinTech\\1.Selenuim\\Selenium Eclips Prj Files\\G _C_Reddy_Tuturial_Practice\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.facebook.com");
		
		
		System.out.println(driver.getTitle());//it will validate if your page title is correct
		
		
		String d=driver.getCurrentUrl();//validates you are landed on the correct url
		
		
		System.out.println(d);
		
		//enter the email ID in the edit box
		driver.findElement(By.id("email")).sendKeys("this is my first code");
		
		//enter the password in the edit box
		driver.findElement(By.name("pass")).sendKeys("12365488");
		
		//click on login button
		driver.findElement(By.linkText("Forgot account?")).click();
		
	}

}
