package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitleOfSwiggy {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/restaurants");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Order Food Online from India's Best Food Delivery Service | Swiggy";
		
		if(actualTitle.equals(expectedTitle))
			System.out.println("Yeh! We found the right Title.");
		else
			System.out.println("Nah! We found the wrong Title.");

	}

}
