package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en-gb.facebook.com/reg/");
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		for(int i=0;i<31;i++ )
		{
			s.selectByIndex(i);
		}

	}

}
