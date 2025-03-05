package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("shashwat");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Singh");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s_D = new Select(day);
		s_D.selectByIndex(25);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s_M = new Select(month);
		s_M.selectByIndex(10);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s_Y = new Select(year);
		s_Y.selectByIndex(29);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("shashwat@12345");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		
	}

}
