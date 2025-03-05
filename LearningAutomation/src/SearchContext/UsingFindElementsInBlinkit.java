package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElementsInBlinkit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/s/?q=milk");
		
		
		List<WebElement> productDetails = driver.findElements(By.xpath("//div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']"));
		
		for(int i=0; i<productDetails.size(); i++)
		{
			System.out.println(productDetails.get(i).getText());
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
	}

}
