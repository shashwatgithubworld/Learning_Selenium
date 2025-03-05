package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotOfFlipkart {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File outputFile = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/flipkartHomepag.png");
		Files.copy(outputFile, dest);
		
		
		WebElement banner = driver.findElement(By.xpath("//div[@class='_2tczCl']/descendant::img[@src='https://rukminim2.flixcart.com/fk-p-flap/1620/270/image/7f3cde58a30f6024.jpg?q=20'][1]"));
		banner.click();

	}

}
