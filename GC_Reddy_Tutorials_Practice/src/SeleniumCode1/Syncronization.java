package SeleniumCode1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Syncronization {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\1.PeopleinTech\\1.Selenuim\\Selenium Eclips Prj Files\\Automation_Aps_Code\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		

		// Expected
		// declare String array list
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot"};
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		addItems(driver,itemsNeeded);
		
		
		//show the cart that how many items are added
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		//click on proceed to checkout
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//enter the promotion code "rahulshettyacademy"
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		// click on apply for the promocode
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		// get the message for the promo code "Promo code applied successfull"
		
		//String expectedMessage = "Promo5 code applied successfully!";
		String expectedMessage = "Promo code applied successfully!";
		System.out.println("Expected Message: "+expectedMessage);

		System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		//print the size of the expected message
		System.out.println(expectedMessage.length());
		
		//print the char with the index 9
		System.out.println(expectedMessage.charAt(9));
		
		//print the charachters between 5-10 indexes
		System.out.println(expectedMessage.substring(5,10));
		//print the dataType of an element 
		System.out.println("Expected message Data Type : "+expectedMessage.getClass().getName());
		String actualPromoMessage = driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();

		System.out.println("Actual Message: "+actualPromoMessage);

		System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		
		//print the dataType of an element 
		System.out.println("ActualMessage Data Type:" +actualPromoMessage.getClass().getName());
		//compare the expected and actual message using assert.assert method
		
		try {
		Assert.assertEquals(actualPromoMessage, expectedMessage);
		
		}catch (AssertionError e) {
			System.out.println("Try-Catch Assertion****: Message comparison was not verified, THEY ARE NOT THE SAME");
			throw e;	
		}
		System.out.println("Try-Catch Assertion****:  Message comparison was successfully verified, THEY ARE THE SAME");

		System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		//comparing expected and actual using if statments
		Thread.sleep(5000);
		
		
		
if (actualPromoMessage==expectedMessage) {
//			
		System.out.println("If Statement***: Message comparison was successfully verified, THEY ARE THE SAME");
//			
		}else {
		System.out.println("If Statement***: Message comparison was not verified, THEY ARE NOT THE SAME ");					
	}
//	}

System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
//coparing values using the trenary operator 

String ComparedOutput=(actualPromoMessage==expectedMessage)	?"Message comparison was successfully verified, THEY ARE THE SAME"	:"Message comparison was not verified, THEY ARE NOT THE SAME";

System.out.println("Trenary Operator******"+ComparedOutput);



System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");




		driver.close();
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j= 0;

	
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