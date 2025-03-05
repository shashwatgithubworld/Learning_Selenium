package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElementsWithMyntra {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/jeans?rawQuery=jeans");
		
		List<WebElement> productDetails = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		
		for(int i=0; i< productDetails.size(); i++)
		{
			System.out.println(productDetails.get(i).getText());
			System.out.println("------------------------------------------------------");
		}
		
		

	}

}
