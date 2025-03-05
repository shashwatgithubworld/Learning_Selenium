package TakesScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfFullWebPage {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		/*
		//Explicit type-casting
		TakesScreenshot t = (TakesScreenshot)driver;
		//use getScreenshot method
		File outputfile = t.getScreenshotAs(OutputType.FILE);
		//Create a new file 
		File dest = new File("./Screenshot/swiggy.png");	
		Files.copy(outputfile, dest);
		
		*/
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File output = t.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("./Screenshot/zomato.png");
		
		Files.copy(output, dest);
		
		
		
		
		
		
	}

}
