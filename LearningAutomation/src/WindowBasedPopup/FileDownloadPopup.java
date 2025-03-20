package WindowBasedPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadPopup extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
			
		setUp("chrome", 20, "https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		WebElement tillElement = driver.findElement(By.xpath("//p[contains(text(),'Here you can find')]"));
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tillElement);
		
		WebElement release = driver.findElement(By.xpath("//a[text()='releases']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(release));
		release.click();
		

	}

}
