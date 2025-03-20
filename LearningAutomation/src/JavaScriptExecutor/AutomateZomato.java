package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateZomato {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.zomato.com/");
		WebElement scrollTill = driver.findElement(By.xpath("//span[text()='Share App Link']"));
		// perform explicit type-casting
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//j.executeScript("arguments[0].scrollIntoView(false)", scrollTill);
		j.executeScript("arguments[0].scrollIntoView(true)", scrollTill);
		

	}

}
