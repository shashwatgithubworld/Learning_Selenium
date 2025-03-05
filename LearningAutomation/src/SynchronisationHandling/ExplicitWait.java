package SynchronisationHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");

		driver.findElement(By.xpath("//span[text()='FASHION2WEAR ']")).click();

		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("123456");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		wait.pollingEvery(Duration.ofSeconds(2));

		driver.findElement(By.xpath("//button[@id='Check']")).click();
	}

}
