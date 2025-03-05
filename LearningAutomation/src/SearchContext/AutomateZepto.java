package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateZepto {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zepto.com/search?query=fruits");
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//a[@aria-label='Search for products']")).click();
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='flex-1 outline-none\']"));
		Thread.sleep(3000);
		searchBox.sendKeys("fruits", Keys.ENTER);
		Thread.sleep(3000);
		*/
		List<WebElement> itemName = driver.findElements(By.xpath("//h5[@class='font-subtitle text-lg tracking-wider line-clamp-2 !text-base !font-semibold !h-9 !tracking-normal px-1.5']"));
		Thread.sleep(3000);
		for(int i=0; i<itemName.size(); i++)
		{
			if(itemName.get(i).getText().equals("Passion Fruit"))
			{
				itemName.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
	}

}
