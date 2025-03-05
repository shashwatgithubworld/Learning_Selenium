package TakesScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfPerticulerWebElement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.swiggy.com/restaurants");

		WebElement biryani = driver.findElement(By.xpath("//img[@alt='restaurants curated for biryani']"));

		// use getScreenshot method
		File outputfile = biryani.getScreenshotAs(OutputType.FILE);
		// Create a new file
		File dest = new File("./Screenshot/biryani.png");
		Files.copy(outputfile, dest);

		/*
		 * Assignment got to flipkart take the screenshot of full webpage take
		 * perticular screenshot of slide
		 * 
		 */
	}

}
