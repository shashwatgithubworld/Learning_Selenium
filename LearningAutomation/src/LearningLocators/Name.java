package LearningLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("9529606644");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("MainHunDon");
		driver.quit();
	}

}
