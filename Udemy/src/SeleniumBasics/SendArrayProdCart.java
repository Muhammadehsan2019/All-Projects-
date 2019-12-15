package SeleniumBasics;

import java.util.Arrays;
import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendArrayProdCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\1.PeopleinTech\\1.Selenuim\\Selenium Eclips Prj Files\\Automation_Aps_Code\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		int j = 0;

		// Expected
		// declare String array list
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot"};
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		//
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// Brocolli - 1 Kg
			// Brocolli, 1 Kg
			String[] name = products.get(i).getText().split("-");////INTERVIEW QUESTION
			String formattedName = name[0].trim();
			// format it to get the actual vegetable name
			// separate "-1 Kg" from "Brocolli -1 Kg"

			// Check wheter name you extracted is present in array or not.
			// Convert array into array list for easy search

			List itemsneedList = Arrays.asList(itemsNeeded);
			
			System.out.println(itemsneedList);

			if (itemsneedList.contains(formattedName)) {

				j++;

				// clcik on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();// INTERVIEW QUESTION: WE GET THE DYNAMIC XPATH FOR THE ELEMENTS 

				if (j ==itemsNeeded.length) {
					
					System.out.println(j);
					break;
				}
			}

		}

	}

}
