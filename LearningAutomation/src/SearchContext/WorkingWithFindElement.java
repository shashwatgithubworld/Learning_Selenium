package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		WebElement iphone13 = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)']"));
		System.out.println(iphone13.getText());
	}
}
