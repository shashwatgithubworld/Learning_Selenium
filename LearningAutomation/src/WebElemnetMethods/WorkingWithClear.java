package WebElemnetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClear {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		Thread.sleep(3000);
		un.sendKeys("shashwat123");
		Thread.sleep(3000);
		un.clear();
		Thread.sleep(3000);
		un.sendKeys("Rajendra123");

	}

}
