package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingLoginOnDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Shashwat Singh");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("shashwat123@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("shasha123");
		
		driver.findElement(By.xpath("//button[(text()='Register')]")).click();
		
	

	}

}
