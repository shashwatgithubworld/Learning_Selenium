package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpFacebookUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("//input[@type='text' and @name=\"firstname\"]"));
		firstName.sendKeys("Shashwat");
		
		Thread.sleep(3000);
		WebElement lastName = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		lastName.sendKeys("Singh");
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]"));
		day.sendKeys("26");
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[contains(@name,'birthday_month')]"));
		month.sendKeys("Nov");
		
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[contains(@name,'birthday_year')]"));
		year.sendKeys("1996");
		
		Thread.sleep(3000);
		WebElement male = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		male.click();
		
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
		email.sendKeys("shashwat123@gmail.com");
		
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]"));
		pass.sendKeys("shasha12345");
		
		Thread.sleep(3000);
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		submitButton.click();
		
		
		

	}

}
