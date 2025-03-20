package Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingControlToDiffWebApp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://paytm.com/");
		//Opening a new blank tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.phonepe.com/");

	}

}
