package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateMyntra {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://paytm.com/");
		
		WebElement ticket = driver.findElement(By.xpath("//li[text()='Ticket Booking']"));
		Actions a = new Actions(driver);
		a.moveToElement(ticket).perform();
		
		driver.findElement(By.xpath("//a[text()='Movie Tickets']")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		
		for(String id:allId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Movies - Online Movie Ticket Booking & Get Cashback/Offers at Paytm"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("noida");
		WebElement gNoida = driver.findElement(By.xpath("//div[text()='Greater Noida']/ancestor::div[@class='fullHeightScrollDweb DesktopMovieCitySelector_dropdown__PE__h']/descendant::div[text()='Greater Noida']"));
		gNoida.click();
		
		driver.findElement(By.xpath("//div[@class='PageBlockWidget_closeBtn__MdHIU']")).click();
		//System.out.println(allId.toString());
		
		Set<String> allIds = driver.getWindowHandles();
		//System.out.println(allIds.toString());
		
		for(String id:allIds)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("District by Zomato - Movies, Events, Dining, Sports, Concerts"))
			{
				break;
			}
		}
		 
		driver.findElement(By.xpath("//button[@aria-label='Close ad']")).click();
		WebElement bookNow = driver.findElement(By.xpath("//p[text()='April 5']/ancestor::div[@class='css-14g9pns']/descendant::p[text()='Book Now']"));
		bookNow.click();
		
		driver.switchTo().window(parentId);
		WebElement moRecharge = driver.findElement(By.xpath("//img[@alt='Mobile Recharge']"));
		//moRecharge.click();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", moRecharge);
		
	}

}
