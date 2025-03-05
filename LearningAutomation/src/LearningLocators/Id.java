package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Shashwatsinghraj93@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("ShasSingh@94");
		
		
	}

}
