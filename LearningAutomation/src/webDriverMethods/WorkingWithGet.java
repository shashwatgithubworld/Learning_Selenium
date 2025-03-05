package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGet {

	public static void main(String[] args) {
		
		//To launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//To Launch the Application
		driver.get("https://paytm.com/");
		
		

	}

}
