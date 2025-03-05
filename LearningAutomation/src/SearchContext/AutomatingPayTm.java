package SearchContext;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AutomatingPayTm {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//span[text()='Trains']")).click();
		driver.findElement(By.id("sourceInput")).click();
		
		driver.findElement(By.xpath("//div[text()='Delhi- All Stations']")).click();
		
		driver.findElement(By.id("destinationInput")).click();
		driver.findElement(By.xpath("//div[text()='Secunderabad Jn']")).click();
		
		driver.findElement(By.xpath("//div[text()='Sun']")).click();
		driver.findElement(By.xpath("//div[text()='Search Trains']")).click();
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Paytm Logo']"));
		File outputFile = logo.getScreenshotAs(OutputType.FILE);
		File src = new File("./Screenshot/PayTmLogo.png");
		Files.copy(outputFile, src);
		
		List<WebElement> trainName = driver.findElements(By.xpath("//div[@class='k9j0o']"));
		
		for(int i=0; i<trainName.size(); i++)
		{
			System.out.println(trainName.get(i).getText());
		}
		
		
		
		
	}

}
