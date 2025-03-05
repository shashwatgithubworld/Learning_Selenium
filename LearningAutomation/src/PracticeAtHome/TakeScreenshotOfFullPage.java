package PracticeAtHome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotOfFullPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://india.dexian.com/");
		
		/*
		TakesScreenshot t =(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/dexian.png");
		
		Files.copy(src, dest);
		*/
		
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'https://india.dexian.com/wp-content/themes/dexian/images/dexian-logo.svg')]"));
		File logofile = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/dexianlogo.png");
		Files.copy(logofile, dest);

	}

}
