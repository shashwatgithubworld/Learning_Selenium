package WebElemnetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTagName {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		if(logo.getTagName().equals("img"))
			System.out.println("TagName is Matching");
		else
			System.out.println("TagName is not matching");

	}

}
