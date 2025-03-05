package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.className("_6luy"));
		userName.sendKeys("9529606644");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.className("_9npi"));
		pass.sendKeys("MainHunDon");
		
		WebElement loginButton = driver.findElement(By.className("_6lth "));
		loginButton.click();
		

	}

}
