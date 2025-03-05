package WebElemnetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement checkbox = driver.findElement(By.id("RememberMe"));
		
		checkbox.click();
		if(checkbox.isSelected())
			System.out.println("It is already Selected");
		else
			checkbox.click();

	}

}
