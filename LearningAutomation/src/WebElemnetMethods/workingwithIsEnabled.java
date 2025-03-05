package WebElemnetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithIsEnabled {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.name("email"));
		System.out.println(username.isEnabled());
		
		if(username.isEnabled())
			username.sendKeys("abcdefgh");
		else
			System.out.println("Username text feild is not Enable");

	}

}
