package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisisbleText {

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
		s_D.selectByVisibleText("26");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s_M = new Select(month);
		s_M.selectByVisibleText("Nov");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s_Y = new Select(year);
		s_Y.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("shashwat@12345");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
