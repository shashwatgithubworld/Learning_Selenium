package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomtomateSwiggy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.swiggy.com/");
		
		WebElement corporate = driver.findElement(By.xpath("//div[@class='Uccaw']/descendant::a[@href='https://www.swiggy.com/corporate/']"));
		corporate.click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		
		for(String id:allId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Swiggy"))
			{
				break;
			}
		}
		
		WebElement scrolltill = driver.findElement(By.xpath("//p[text()='© 2025 Swiggy Limited']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", scrolltill);
		Thread.sleep(2000);
		
		WebElement linkdIn = driver.findElement(By.xpath("//div[contains(@class,'elementor-element elementor-element-4229a69a')]/descendant::a[@href='https://www.linkedin.com/company/swiggy-in/']"));
		linkdIn.click();
		
		WebElement instagram = driver.findElement(By.xpath("//div[contains(@class,'elementor-element elementor-element-4229a69a')]/descendant::a[@href='https://www.instagram.com/swiggyindia/']"));
		instagram.click();
		 
		WebElement facebook = driver.findElement(By.xpath("//div[contains(@class,'elementor-element elementor-element-4229a69a')]/descendant::a[@href='https://www.facebook.com/swiggy.in/']"));	
		facebook.click();
		
		WebElement pintrest = driver.findElement(By.xpath("//div[contains(@class,'elementor-element elementor-element-4229a69a')]/descendant::a[@href=\"https://in.pinterest.com/swiggyindia/\"]"));
		pintrest.click();
		
		WebElement twitter = driver.findElement(By.xpath("//div[contains(@class,'elementor-element elementor-element-4229a69a')]/descendant::a[@href=\"https://x.com/Swiggy?mx=2\"]"));
		twitter.click();
		
		Set<String> maxId = driver.getWindowHandles();
		for(String id:maxId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Swiggy | Facebook"))
			{
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentId);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
