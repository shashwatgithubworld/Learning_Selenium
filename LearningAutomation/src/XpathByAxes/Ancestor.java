package XpathByAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ancestor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://blinkit.com/s/?q=milk");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();

		Thread.sleep(5000);
		WebElement addButton = driver.findElement(By.xpath(
				"//div[text()='Amul Taaza Toned Fresh Milk']/ancestor::div[@class='Product__UpdatedDetailContainer-sc-11dk8zk-5 oMGUD']/descendant::div[text()='ADD']"));
		addButton.click();

	}
}
