package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement registerBtn = driver.findElement(By.cssSelector("a[href='/register']"));
		registerBtn.click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		WebElement firstName = driver.findElement(By.cssSelector("input[id='FirstName']"));
		firstName.sendKeys("Shashwat");
		
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.cssSelector("input[name='LastName']"));
		lastName.sendKeys("singh");
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.cssSelector("input[name='Email']"));
		email.sendKeys("shashwat1223@gmail.com");
		
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.cssSelector("input[id='Password']"));
		pass.sendKeys("shasha123");
		
		Thread.sleep(2000);
		WebElement cnfrmPass = driver.findElement(By.cssSelector("input[id='ConfirmPassword']"));
		cnfrmPass.sendKeys("shasha123");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
