package XpathByAxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Descendant {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blinkit.com/s/?q=fruits");
		
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		
		WebElement addBtn = driver.findElement(By.xpath("//div[text()='Banana']/ancestor::div[@class='Product__UpdatedContentContainer-sc-11dk8zk-7 bekgjj']/descendant::div[text()='ADD']"));
		addBtn.click();
	}

}
