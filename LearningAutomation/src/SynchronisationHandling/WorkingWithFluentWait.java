package SynchronisationHandling;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithFluentWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='FASHION2WEAR ']")).click();

		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("543216");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		wait.pollingEvery(Duration.ofSeconds(2));
		
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofSeconds(2));
		w.ignoring(TimeoutException.class);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		
		
		
		driver.findElement(By.xpath("//button[@id='Check']")).click();

	}

}
