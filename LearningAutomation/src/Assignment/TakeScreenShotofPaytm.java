package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotofPaytm {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/");
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File outputFile = t.getScreenshotAs(OutputType.FILE);
		
		File desk = new File("./Screenshot/paytm.png");
		
		Files.copy(outputFile, desk);
		
		

	}

}
