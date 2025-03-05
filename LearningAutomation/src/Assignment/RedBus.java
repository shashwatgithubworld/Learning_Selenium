package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		WebElement trainTicket = driver.findElement(By.xpath("//span[text()='Train Tickets']"));
		trainTicket.click();
		
		Thread.sleep(3000);
		WebElement fromStation = driver.findElement(By.xpath("//div[contains(text(),'From')]"));
		fromStation.sendKeys("New Delhi");
		
		Thread.sleep(3000);
		WebElement toStation = driver.findElement(By.xpath("//div[text()='To']"));
		toStation.sendKeys("Buxar");

		driver.findElement(By.xpath("//button[text()='Search Trains']")).click();
	}

}
