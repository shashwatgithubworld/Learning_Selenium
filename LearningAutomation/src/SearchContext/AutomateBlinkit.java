package SearchContext;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateBlinkit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blinkit.com/s/?q=vegitables");
		
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='Product__UpdatedTitle-sc-11dk8zk-9 hxWnoO']"));
		
		for(int i=0; i<productName.size(); i++)
		{
			if(productName.get(i).getText().equals("Lady Finger (Bhindi)"))
			{
				WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(productName.get(i)));
				productName.get(i).click();
			}
		}
		
	}

}
