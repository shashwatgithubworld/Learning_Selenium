package LearningXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerLink = driver.findElement(By.xpath("//a[@href='/register' and @class='ico-register']"));
		registerLink.click();
		

	}

}
