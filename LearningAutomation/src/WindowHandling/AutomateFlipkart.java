package WindowHandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("redmi phones", Keys.ENTER);

		List<WebElement> allPhones = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

		int count = 0;
		for (WebElement phones : allPhones) {
			String str = phones.getText();
			if (str.equals("REDMI A3X (Ocean Green, 64 GB)")) {
				phones.click();
				count++;
			}
		}
		if (count == 0)
			System.out.println("Product is not visible");

		String parentId = driver.getWindowHandle();
		System.out.println(parentId.toString());
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId.toString());
		
		for (String id : allId) {
			driver.switchTo().window(id);
			if (driver.getTitle().equals("REDMI A3X ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com"))
			{
				break;
			}
		}

		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[@href='https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect']")).click();
		
		
		
		

	}

}
