package SynchronisationHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class AutomateMakeMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//li[@class='menu_Trains']")).click();
		
		driver.findElement(By.id("fromCity")).click();
		
		driver.findElement(By.xpath("//span[text()='Delhi']")).click();
		
		driver.findElement(By.xpath("//span[text()='Kolkata']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Mon Mar 10 2025']")).click();
		
		driver.findElement(By.xpath("//li[text()='All Class']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		// was getting org.openqa.selenium.StaleElementReferenceException so i used
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='chMmtLogo']")));
		
		WebElement logo = driver.findElement(By.xpath("//a[@class='chMmtLogo']"));
		File outputFile = logo.getScreenshotAs(OutputType.FILE);
		File src = new File("./Screenshot/MMTLogo1.png");
		Files.copy(outputFile, src);
		
		List<WebElement> trainName = driver.findElements(By.xpath("//p[@data-testid='train-name']"));
		
		for(int i=0; i<trainName.size(); i++)
		{
			//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfAllElements(trainName));
			System.out.println(trainName.get(i).getText());
		}
		

	}

}
