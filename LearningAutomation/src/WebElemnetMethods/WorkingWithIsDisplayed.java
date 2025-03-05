package WebElemnetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsDisplayed {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		System.out.println(logo.isDisplayed());
		
		if(logo.isDisplayed())
			System.out.println("logo is displayed");
		else
			System.out.println("Logo is not Displayed");
		
	}

}

