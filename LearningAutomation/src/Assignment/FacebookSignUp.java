package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("//input[@aria-label='First name' and @ name='firstname']"));
		firstName.sendKeys("Shashwat");
		
		Thread.sleep(3000);
		WebElement surName = driver.findElement(By.xpath("//input[contains(@aria-label,'Surname')]"));
		surName.sendKeys("kumar");
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]"));
		Select day1 = new Select(day);
		day1.selectByIndex(25);
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		Select month1 = new Select(month);
		month1.selectByValue("11");
		
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year' and @id='year']"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1996");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		Thread.sleep(2000);
		WebElement mobNo = driver.findElement(By.xpath("//input[@name='reg_email__' and @data-type='text']"));
		mobNo.sendKeys("9876543210");
		
		Thread.sleep(2000);
		WebElement newPassword = driver.findElement(By.xpath("//input[contains(@data-type,'password')]"));
		newPassword.sendKeys("shashwat@12345");
		
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
		submitButton.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
