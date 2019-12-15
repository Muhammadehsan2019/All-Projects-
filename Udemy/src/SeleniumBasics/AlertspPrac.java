package SeleniumBasics;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertspPrac {

	// WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String text = "Zuhoor";

		System.setProperty("webdriver.chrome.driver",
				"E:\\1.PeopleinTech\\1.Selenuim\\Selenium Eclips Prj Files\\Automation_Aps_Code\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		// enter your name in webEdit box
		driver.findElement(By.id("name")).sendKeys(text);

		Thread.sleep(2000);
		// click on alert
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		// print the alert on console

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(2000);
		// respond to the alert with OK
		driver.switchTo().alert().accept();
		//
		driver.findElement(By.id("confirmbtn")).click();

		driver.switchTo().alert().getText();
		// respond to alert with Cancel

		driver.switchTo().alert().dismiss();

	}

}
