package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(100, 200));
		driver.get("https://paytm.com/");
		driver.quit();

	}

}
